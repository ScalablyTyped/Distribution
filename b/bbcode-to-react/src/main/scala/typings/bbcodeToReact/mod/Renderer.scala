package typings.bbcodeToReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic building block for Tag class and Parser class.
  * An optional interface can be provided for constructing the class
  * The class is NOT exported from the library.
  */
@js.native
trait Renderer[optionType] extends js.Object {
  
  /**
    * Injecting incoming context to class and return the input function
    * @param context An array storing objects with type "optionType"
    * @param func: A function to be returned
    * @returns A function returning a string array
    */
  def context(context: optionType, func: js.Function0[js.Array[String]]): js.Function0[js.Array[String]] = js.native
  
  /**
    * An array storing objects with type "optionType"
    */
  var contexts: js.Array[optionType] = js.native
  
  /**
    * Process incoming value by regexp and return the output
    * @param value Input to be processed
    * @returns A processed string
    */
  def cosmeticReplace(value: String): String = js.native
  
  /**
    * Process incoming value by regexp and return the output
    * @param value Input to be processed
    * @returns A processed string
    */
  def escape(value: String): String = js.native
  
  /**
    * Process incoming value by regexp and return the output
    * @param value Input to be processed
    * @returns A processed string
    */
  def linkify(value: String): String = js.native
  
  /**
    * An object storing some essential flags and params,
    * with default value { linkify: false }
    */
  var options: optionType = js.native
  
  /**
    * Process incoming value by regexp and return the output
    * @param value Input to be processed
    * @returns A processed string
    */
  def strip(value: String): String = js.native
}
object Renderer {
  
  @scala.inline
  def apply[optionType](
    context: (optionType, js.Function0[js.Array[String]]) => js.Function0[js.Array[String]],
    contexts: js.Array[optionType],
    cosmeticReplace: String => String,
    escape: String => String,
    linkify: String => String,
    options: optionType,
    strip: String => String
  ): Renderer[optionType] = {
    val __obj = js.Dynamic.literal(context = js.Any.fromFunction2(context), contexts = contexts.asInstanceOf[js.Any], cosmeticReplace = js.Any.fromFunction1(cosmeticReplace), escape = js.Any.fromFunction1(escape), linkify = js.Any.fromFunction1(linkify), options = options.asInstanceOf[js.Any], strip = js.Any.fromFunction1(strip))
    __obj.asInstanceOf[Renderer[optionType]]
  }
  
  @scala.inline
  implicit class RendererOps[Self <: Renderer[_], optionType] (val x: Self with Renderer[optionType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: (optionType, js.Function0[js.Array[String]]) => js.Function0[js.Array[String]]): Self = this.set("context", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContextsVarargs(value: optionType*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[optionType]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosmeticReplace(value: String => String): Self = this.set("cosmeticReplace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEscape(value: String => String): Self = this.set("escape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinkify(value: String => String): Self = this.set("linkify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: optionType): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrip(value: String => String): Self = this.set("strip", js.Any.fromFunction1(value))
  }
}

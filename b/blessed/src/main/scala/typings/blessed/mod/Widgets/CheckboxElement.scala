package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A checkbox which can be used in a form element.
  */
@JSImport("blessed", "Widgets.CheckboxElement")
@js.native
open class CheckboxElement () extends InputElement {
  def this(options: CheckboxOptions) = this()
  
  /**
    * check the element.
    */
  def check(): Unit = js.native
  
  /**
    * whether the element is checked or not.
    */
  var checked: Boolean = js.native
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_CheckboxElement: CheckboxOptions = js.native
  
  /**
    * the text next to the checkbox (do not use setcontent, use `check.text = ''`).
    */
  var text: String = js.native
  
  /**
    * uncheck the element.
    */
  def uncheck(): Unit = js.native
  
  /**
    * same as `checked`.
    */
  var value: Boolean = js.native
}

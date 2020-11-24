package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOptions
  extends RadioMixinOptions
     with /* index */ StringDictionary[js.Any] {
  
  /**
    * Initialize is called immediately after the Object has been instantiated,
    * and is invoked with the same arguments that the constructor received.
    */
  var initialize: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], Unit]] = js.native
}
object ObjectOptions {
  
  @scala.inline
  def apply(): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptions]
  }
  
  @scala.inline
  implicit class ObjectOptionsOps[Self <: ObjectOptions] (val x: Self) extends AnyVal {
    
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
    def setInitialize(value: /* options */ js.UndefOr[ObjectOptions] => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
  }
}

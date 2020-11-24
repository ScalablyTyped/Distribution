package typings.contentfulManagement.commonTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultElements[TPlainObject /* <: js.Object */] extends js.Object {
  
  def toPlainObject(): TPlainObject = js.native
}
object DefaultElements {
  
  @scala.inline
  def apply[TPlainObject /* <: js.Object */](toPlainObject: () => TPlainObject): DefaultElements[TPlainObject] = {
    val __obj = js.Dynamic.literal(toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[DefaultElements[TPlainObject]]
  }
  
  @scala.inline
  implicit class DefaultElementsOps[Self <: DefaultElements[_], TPlainObject /* <: js.Object */] (val x: Self with DefaultElements[TPlainObject]) extends AnyVal {
    
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
    def setToPlainObject(value: () => TPlainObject): Self = this.set("toPlainObject", js.Any.fromFunction0(value))
  }
}

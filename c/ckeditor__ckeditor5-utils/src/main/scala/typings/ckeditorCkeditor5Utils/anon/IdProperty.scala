package typings.ckeditorCkeditor5Utils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdProperty[T] extends js.Object {
  
  var idProperty: js.UndefOr[/* keyof T */ String] = js.native
}
object IdProperty {
  
  @scala.inline
  def apply[T](): IdProperty[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdProperty[T]]
  }
  
  @scala.inline
  implicit class IdPropertyOps[Self <: IdProperty[_], T] (val x: Self with IdProperty[T]) extends AnyVal {
    
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
    def setIdProperty(value: /* keyof T */ String): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdProperty: Self = this.set("idProperty", js.undefined)
  }
}

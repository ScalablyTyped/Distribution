package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentFirst extends js.Object {
  
  var includeSelf: js.UndefOr[Boolean] = js.native
  
  var parentFirst: js.UndefOr[Boolean] = js.native
}
object ParentFirst {
  
  @scala.inline
  def apply(): ParentFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentFirst]
  }
  
  @scala.inline
  implicit class ParentFirstOps[Self <: ParentFirst] (val x: Self) extends AnyVal {
    
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
    def setIncludeSelf(value: Boolean): Self = this.set("includeSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSelf: Self = this.set("includeSelf", js.undefined)
    
    @scala.inline
    def setParentFirst(value: Boolean): Self = this.set("parentFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFirst: Self = this.set("parentFirst", js.undefined)
  }
}

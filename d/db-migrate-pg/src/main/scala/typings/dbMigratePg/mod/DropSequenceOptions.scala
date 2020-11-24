package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropSequenceOptions extends js.Object {
  
  var cascade: js.UndefOr[Boolean] = js.native
  
  var ifExists: js.UndefOr[Boolean] = js.native
  
  var restrict: js.UndefOr[Boolean] = js.native
}
object DropSequenceOptions {
  
  @scala.inline
  def apply(): DropSequenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropSequenceOptions]
  }
  
  @scala.inline
  implicit class DropSequenceOptionsOps[Self <: DropSequenceOptions] (val x: Self) extends AnyVal {
    
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setIfExists(value: Boolean): Self = this.set("ifExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfExists: Self = this.set("ifExists", js.undefined)
    
    @scala.inline
    def setRestrict(value: Boolean): Self = this.set("restrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrict: Self = this.set("restrict", js.undefined)
  }
}

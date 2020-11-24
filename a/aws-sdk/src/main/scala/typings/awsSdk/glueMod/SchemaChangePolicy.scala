package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaChangePolicy extends js.Object {
  
  /**
    * The deletion behavior when the crawler finds a deleted object.
    */
  var DeleteBehavior: js.UndefOr[typings.awsSdk.glueMod.DeleteBehavior] = js.native
  
  /**
    * The update behavior when the crawler finds a changed schema.
    */
  var UpdateBehavior: js.UndefOr[typings.awsSdk.glueMod.UpdateBehavior] = js.native
}
object SchemaChangePolicy {
  
  @scala.inline
  def apply(): SchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangePolicy]
  }
  
  @scala.inline
  implicit class SchemaChangePolicyOps[Self <: SchemaChangePolicy] (val x: Self) extends AnyVal {
    
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
    def setDeleteBehavior(value: DeleteBehavior): Self = this.set("DeleteBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteBehavior: Self = this.set("DeleteBehavior", js.undefined)
    
    @scala.inline
    def setUpdateBehavior(value: UpdateBehavior): Self = this.set("UpdateBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateBehavior: Self = this.set("UpdateBehavior", js.undefined)
  }
}

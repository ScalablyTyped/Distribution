package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnershipControlsRule extends js.Object {
  
  var ObjectOwnership: typings.awsSdk.s3Mod.ObjectOwnership = js.native
}
object OwnershipControlsRule {
  
  @scala.inline
  def apply(ObjectOwnership: ObjectOwnership): OwnershipControlsRule = {
    val __obj = js.Dynamic.literal(ObjectOwnership = ObjectOwnership.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipControlsRule]
  }
  
  @scala.inline
  implicit class OwnershipControlsRuleOps[Self <: OwnershipControlsRule] (val x: Self) extends AnyVal {
    
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
    def setObjectOwnership(value: ObjectOwnership): Self = this.set("ObjectOwnership", value.asInstanceOf[js.Any])
  }
}

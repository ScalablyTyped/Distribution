package typings.awsSdkClientS3Browser.typesTargetGrantMod

import typings.awsSdkClientS3Browser.typesGranteeMod.UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledTargetGrant extends TargetGrant {
  
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee_UnmarshalledTargetGrant: js.UndefOr[UnmarshalledGrantee] = js.native
}
object UnmarshalledTargetGrant {
  
  @scala.inline
  def apply(): UnmarshalledTargetGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTargetGrant]
  }
  
  @scala.inline
  implicit class UnmarshalledTargetGrantOps[Self <: UnmarshalledTargetGrant] (val x: Self) extends AnyVal {
    
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
    def setGrantee(value: UnmarshalledGrantee): Self = this.set("Grantee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantee: Self = this.set("Grantee", js.undefined)
  }
}

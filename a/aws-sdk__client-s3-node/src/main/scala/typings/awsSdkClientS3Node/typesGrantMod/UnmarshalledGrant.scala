package typings.awsSdkClientS3Node.typesGrantMod

import typings.awsSdkClientS3Node.typesGranteeMod.UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledGrant extends Grant {
  
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee_UnmarshalledGrant: js.UndefOr[UnmarshalledGrantee] = js.native
}
object UnmarshalledGrant {
  
  @scala.inline
  def apply(): UnmarshalledGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGrant]
  }
  
  @scala.inline
  implicit class UnmarshalledGrantOps[Self <: UnmarshalledGrant] (val x: Self) extends AnyVal {
    
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

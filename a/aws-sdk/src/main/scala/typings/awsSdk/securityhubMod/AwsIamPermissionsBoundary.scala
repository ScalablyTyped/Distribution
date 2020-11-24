package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamPermissionsBoundary extends js.Object {
  
  /**
    * The ARN of the policy used to set the permissions boundary.
    */
  var PermissionsBoundaryArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The usage type for the permissions boundary.
    */
  var PermissionsBoundaryType: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamPermissionsBoundary {
  
  @scala.inline
  def apply(): AwsIamPermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamPermissionsBoundary]
  }
  
  @scala.inline
  implicit class AwsIamPermissionsBoundaryOps[Self <: AwsIamPermissionsBoundary] (val x: Self) extends AnyVal {
    
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
    def setPermissionsBoundaryArn(value: NonEmptyString): Self = this.set("PermissionsBoundaryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundaryArn: Self = this.set("PermissionsBoundaryArn", js.undefined)
    
    @scala.inline
    def setPermissionsBoundaryType(value: NonEmptyString): Self = this.set("PermissionsBoundaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundaryType: Self = this.set("PermissionsBoundaryType", js.undefined)
  }
}

package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamPolicyVersion extends js.Object {
  
  /**
    * Indicates when the version was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the version is the default version.
    */
  var IsDefaultVersion: js.UndefOr[Boolean] = js.native
  
  /**
    * The identifier of the policy version.
    */
  var VersionId: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamPolicyVersion {
  
  @scala.inline
  def apply(): AwsIamPolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamPolicyVersion]
  }
  
  @scala.inline
  implicit class AwsIamPolicyVersionOps[Self <: AwsIamPolicyVersion] (val x: Self) extends AnyVal {
    
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
    def setCreateDate(value: NonEmptyString): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setIsDefaultVersion(value: Boolean): Self = this.set("IsDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultVersion: Self = this.set("IsDefaultVersion", js.undefined)
    
    @scala.inline
    def setVersionId(value: NonEmptyString): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}

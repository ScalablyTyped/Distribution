package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamAccessKeySessionContextAttributes extends js.Object {
  
  /**
    * Indicates when the session was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreationDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether the session used multi-factor authentication (MFA).
    */
  var MfaAuthenticated: js.UndefOr[Boolean] = js.native
}
object AwsIamAccessKeySessionContextAttributes {
  
  @scala.inline
  def apply(): AwsIamAccessKeySessionContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeySessionContextAttributes]
  }
  
  @scala.inline
  implicit class AwsIamAccessKeySessionContextAttributesOps[Self <: AwsIamAccessKeySessionContextAttributes] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: NonEmptyString): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setMfaAuthenticated(value: Boolean): Self = this.set("MfaAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMfaAuthenticated: Self = this.set("MfaAuthenticated", js.undefined)
  }
}

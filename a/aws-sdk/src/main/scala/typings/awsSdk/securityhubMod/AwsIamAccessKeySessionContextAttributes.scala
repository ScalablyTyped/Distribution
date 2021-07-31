package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamAccessKeySessionContextAttributes extends StObject {
  
  /**
    * Indicates when the session was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreationDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the session used multi-factor authentication (MFA).
    */
  var MfaAuthenticated: js.UndefOr[Boolean] = js.undefined
}
object AwsIamAccessKeySessionContextAttributes {
  
  @scala.inline
  def apply(): AwsIamAccessKeySessionContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeySessionContextAttributes]
  }
  
  @scala.inline
  implicit class AwsIamAccessKeySessionContextAttributesMutableBuilder[Self <: AwsIamAccessKeySessionContextAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: NonEmptyString): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setMfaAuthenticated(value: Boolean): Self = StObject.set(x, "MfaAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfaAuthenticatedUndefined: Self = StObject.set(x, "MfaAuthenticated", js.undefined)
  }
}

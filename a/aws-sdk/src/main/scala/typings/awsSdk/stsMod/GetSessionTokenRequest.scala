package typings.awsSdk.stsMod

import typings.awsSdk.temporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionTokenRequest
  extends StObject
     with TemporaryCredentialsOptions {
  
  /**
    * The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions for AWS account owners are restricted to a maximum of 3,600 seconds (one hour). If the duration is longer than one hour, the session for AWS account owners defaults to one hour.
    */
  var DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined
  
  /**
    * The identification number of the MFA device that is associated with the IAM user who is making the GetSessionToken call. Specify this value if the IAM user has a policy that requires MFA authentication. The value is either the serial number for a hardware device (such as GAHT12345678) or an Amazon Resource Name (ARN) for a virtual device (such as arn:aws:iam::123456789012:mfa/user). You can find the device for an IAM user by going to the AWS Management Console and viewing the user's security credentials.  The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@:/-
    */
  var SerialNumber: js.UndefOr[serialNumberType] = js.undefined
  
  /**
    * The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA code, specify this value. If MFA authentication is required, the user must provide a code when requesting a set of temporary security credentials. A user who fails to provide the code receives an "access denied" response when requesting resources that require MFA authentication. The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
    */
  var TokenCode: js.UndefOr[tokenCodeType] = js.undefined
}
object GetSessionTokenRequest {
  
  inline def apply(): GetSessionTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionTokenRequest]
  }
  
  extension [Self <: GetSessionTokenRequest](x: Self) {
    
    inline def setDurationSeconds(value: durationSecondsType): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setTokenCode(value: tokenCodeType): Self = StObject.set(x, "TokenCode", value.asInstanceOf[js.Any])
    
    inline def setTokenCodeUndefined: Self = StObject.set(x, "TokenCode", js.undefined)
  }
}

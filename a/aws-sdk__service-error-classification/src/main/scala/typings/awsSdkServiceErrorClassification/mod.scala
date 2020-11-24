package typings.awsSdkServiceErrorClassification

import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/service-error-classification", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isClockSkewError(error: SdkError): Boolean = js.native
  
  def isRetryableByTrait(error: SdkError): Boolean = js.native
  
  def isThrottlingError(error: SdkError): Boolean = js.native
  
  def isTransientError(error: SdkError): Boolean = js.native
}

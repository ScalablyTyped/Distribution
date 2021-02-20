package typings.awsSdkServiceErrorClassification

import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/service-error-classification", "isClockSkewError")
  @js.native
  def isClockSkewError(error: SdkError): Boolean = js.native
  
  @JSImport("@aws-sdk/service-error-classification", "isRetryableByTrait")
  @js.native
  def isRetryableByTrait(error: SdkError): Boolean = js.native
  
  @JSImport("@aws-sdk/service-error-classification", "isThrottlingError")
  @js.native
  def isThrottlingError(error: SdkError): Boolean = js.native
  
  @JSImport("@aws-sdk/service-error-classification", "isTransientError")
  @js.native
  def isTransientError(error: SdkError): Boolean = js.native
}

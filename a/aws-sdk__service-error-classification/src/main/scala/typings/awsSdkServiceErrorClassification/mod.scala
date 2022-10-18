package typings.awsSdkServiceErrorClassification

import typings.awsSdkTypes.distTypesShapesMod.SdkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/service-error-classification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClockSkewError(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClockSkewError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRetryableByTrait(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRetryableByTrait")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThrottlingError(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThrottlingError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTransientError(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransientError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

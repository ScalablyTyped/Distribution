package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeIncorr
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "IncorrectTrustAnchorException")
@js.native
open class IncorrectTrustAnchorException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIncorr) = this()
  
  @JSName("$fault")
  val $fault_IncorrectTrustAnchorException: client = js.native
  
  @JSName("name")
  val name_IncorrectTrustAnchorException: typings.awsSdkClientKms.awsSdkClientKmsStrings.IncorrectTrustAnchorException = js.native
}

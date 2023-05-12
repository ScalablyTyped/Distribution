package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeIncorr
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "IncorrectKeyException")
@js.native
open class IncorrectKeyException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIncorr) = this()
  
  @JSName("$fault")
  val $fault_IncorrectKeyException: client = js.native
  
  @JSName("name")
  val name_IncorrectKeyException: typings.awsSdkClientKms.awsSdkClientKmsStrings.IncorrectKeyException = js.native
}

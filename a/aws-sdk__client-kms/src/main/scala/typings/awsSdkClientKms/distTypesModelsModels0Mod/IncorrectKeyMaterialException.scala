package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeIncorr
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "IncorrectKeyMaterialException")
@js.native
open class IncorrectKeyMaterialException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIncorr) = this()
  
  @JSName("$fault")
  val $fault_IncorrectKeyMaterialException: client = js.native
  
  @JSName("name")
  val name_IncorrectKeyMaterialException: typings.awsSdkClientKms.awsSdkClientKmsStrings.IncorrectKeyMaterialException = js.native
}

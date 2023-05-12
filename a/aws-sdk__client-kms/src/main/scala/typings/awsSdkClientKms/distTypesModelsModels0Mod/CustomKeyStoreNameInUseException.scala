package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeCustom
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "CustomKeyStoreNameInUseException")
@js.native
open class CustomKeyStoreNameInUseException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeCustom) = this()
  
  @JSName("$fault")
  val $fault_CustomKeyStoreNameInUseException: client = js.native
  
  @JSName("name")
  val name_CustomKeyStoreNameInUseException: typings.awsSdkClientKms.awsSdkClientKmsStrings.CustomKeyStoreNameInUseException = js.native
}

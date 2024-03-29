package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeKMSInv
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "KMSInvalidMacException")
@js.native
open class KMSInvalidMacException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeKMSInv) = this()
  
  @JSName("$fault")
  val $fault_KMSInvalidMacException: client = js.native
  
  @JSName("name")
  val name_KMSInvalidMacException: typings.awsSdkClientKms.awsSdkClientKmsStrings.KMSInvalidMacException = js.native
}

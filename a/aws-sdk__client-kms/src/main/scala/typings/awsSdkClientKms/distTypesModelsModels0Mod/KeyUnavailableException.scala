package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeKeyUna
import typings.awsSdkClientKms.awsSdkClientKmsStrings.server
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "KeyUnavailableException")
@js.native
open class KeyUnavailableException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeKeyUna) = this()
  
  @JSName("$fault")
  val $fault_KeyUnavailableException: server = js.native
  
  @JSName("name")
  val name_KeyUnavailableException: typings.awsSdkClientKms.awsSdkClientKmsStrings.KeyUnavailableException = js.native
}

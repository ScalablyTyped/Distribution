package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeUnsupp
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "UnsupportedOperationException")
@js.native
open class UnsupportedOperationException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeUnsupp) = this()
  
  @JSName("$fault")
  val $fault_UnsupportedOperationException: client = js.native
  
  @JSName("name")
  val name_UnsupportedOperationException: typings.awsSdkClientKms.awsSdkClientKmsStrings.UnsupportedOperationException = js.native
}

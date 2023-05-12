package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "InvalidMarkerException")
@js.native
open class InvalidMarkerException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeInvali) = this()
  
  @JSName("$fault")
  val $fault_InvalidMarkerException: client = js.native
  
  @JSName("name")
  val name_InvalidMarkerException: typings.awsSdkClientKms.awsSdkClientKmsStrings.InvalidMarkerException = js.native
}

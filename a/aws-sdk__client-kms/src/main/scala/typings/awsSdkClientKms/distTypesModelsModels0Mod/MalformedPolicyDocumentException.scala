package typings.awsSdkClientKms.distTypesModelsModels0Mod

import typings.awsSdkClientKms.anon.ExceptionOptionTypeMalfor
import typings.awsSdkClientKms.awsSdkClientKmsStrings.client
import typings.awsSdkClientKms.distTypesModelsKmsserviceexceptionMod.KMSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/models/models_0", "MalformedPolicyDocumentException")
@js.native
open class MalformedPolicyDocumentException protected () extends KMSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeMalfor) = this()
  
  @JSName("$fault")
  val $fault_MalformedPolicyDocumentException: client = js.native
  
  @JSName("name")
  val name_MalformedPolicyDocumentException: typings.awsSdkClientKms.awsSdkClientKmsStrings.MalformedPolicyDocumentException = js.native
}

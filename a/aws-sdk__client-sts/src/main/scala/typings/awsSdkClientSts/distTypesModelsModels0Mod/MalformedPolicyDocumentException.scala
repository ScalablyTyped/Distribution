package typings.awsSdkClientSts.distTypesModelsModels0Mod

import typings.awsSdkClientSts.anon.ExceptionOptionTypeMalfor
import typings.awsSdkClientSts.awsSdkClientStsStrings.client
import typings.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sts/dist-types/models/models_0", "MalformedPolicyDocumentException")
@js.native
open class MalformedPolicyDocumentException protected () extends STSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeMalfor) = this()
  
  @JSName("$fault")
  val $fault_MalformedPolicyDocumentException: client = js.native
  
  @JSName("name")
  val name_MalformedPolicyDocumentException: typings.awsSdkClientSts.awsSdkClientStsStrings.MalformedPolicyDocumentException = js.native
}

package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeUnsupp
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "UnsupportedOperation")
@js.native
open class UnsupportedOperation protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeUnsupp) = this()
  
  @JSName("$fault")
  val $fault_UnsupportedOperation: client = js.native
  
  @JSName("name")
  val name_UnsupportedOperation: typings.awsSdkClientSqs.awsSdkClientSqsStrings.UnsupportedOperation = js.native
}

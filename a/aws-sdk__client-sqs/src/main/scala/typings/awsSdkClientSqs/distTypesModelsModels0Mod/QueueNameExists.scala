package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeQueueN
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "QueueNameExists")
@js.native
open class QueueNameExists protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeQueueN) = this()
  
  @JSName("$fault")
  val $fault_QueueNameExists: client = js.native
  
  @JSName("name")
  val name_QueueNameExists: typings.awsSdkClientSqs.awsSdkClientSqsStrings.QueueNameExists = js.native
}

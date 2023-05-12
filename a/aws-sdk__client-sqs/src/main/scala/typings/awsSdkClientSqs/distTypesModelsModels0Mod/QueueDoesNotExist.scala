package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeQueueD
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "QueueDoesNotExist")
@js.native
open class QueueDoesNotExist protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeQueueD) = this()
  
  @JSName("$fault")
  val $fault_QueueDoesNotExist: client = js.native
  
  @JSName("name")
  val name_QueueDoesNotExist: typings.awsSdkClientSqs.awsSdkClientSqsStrings.QueueDoesNotExist = js.native
}

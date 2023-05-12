package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeBatchR
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "BatchRequestTooLong")
@js.native
open class BatchRequestTooLong protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeBatchR) = this()
  
  @JSName("$fault")
  val $fault_BatchRequestTooLong: client = js.native
  
  @JSName("name")
  val name_BatchRequestTooLong: typings.awsSdkClientSqs.awsSdkClientSqsStrings.BatchRequestTooLong = js.native
}

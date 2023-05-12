package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeBatchE
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "BatchEntryIdsNotDistinct")
@js.native
open class BatchEntryIdsNotDistinct protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeBatchE) = this()
  
  @JSName("$fault")
  val $fault_BatchEntryIdsNotDistinct: client = js.native
  
  @JSName("name")
  val name_BatchEntryIdsNotDistinct: typings.awsSdkClientSqs.awsSdkClientSqsStrings.BatchEntryIdsNotDistinct = js.native
}

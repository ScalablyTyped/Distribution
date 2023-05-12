package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "InvalidBatchEntryId")
@js.native
open class InvalidBatchEntryId protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeInvali) = this()
  
  @JSName("$fault")
  val $fault_InvalidBatchEntryId: client = js.native
  
  @JSName("name")
  val name_InvalidBatchEntryId: typings.awsSdkClientSqs.awsSdkClientSqsStrings.InvalidBatchEntryId = js.native
}

package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeTooMan
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "TooManyEntriesInBatchRequest")
@js.native
open class TooManyEntriesInBatchRequest protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTooMan) = this()
  
  @JSName("$fault")
  val $fault_TooManyEntriesInBatchRequest: client = js.native
  
  @JSName("name")
  val name_TooManyEntriesInBatchRequest: typings.awsSdkClientSqs.awsSdkClientSqsStrings.TooManyEntriesInBatchRequest = js.native
}

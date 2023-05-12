package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypePurgeQ
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "PurgeQueueInProgress")
@js.native
open class PurgeQueueInProgress protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypePurgeQ) = this()
  
  @JSName("$fault")
  val $fault_PurgeQueueInProgress: client = js.native
  
  @JSName("name")
  val name_PurgeQueueInProgress: typings.awsSdkClientSqs.awsSdkClientSqsStrings.PurgeQueueInProgress = js.native
}

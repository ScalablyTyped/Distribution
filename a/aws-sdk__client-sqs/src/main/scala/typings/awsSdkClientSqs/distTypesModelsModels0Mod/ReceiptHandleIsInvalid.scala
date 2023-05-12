package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeReceip
import typings.awsSdkClientSqs.awsSdkClientSqsStrings.client
import typings.awsSdkClientSqs.distTypesModelsSqsserviceexceptionMod.SQSServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs/dist-types/models/models_0", "ReceiptHandleIsInvalid")
@js.native
open class ReceiptHandleIsInvalid protected () extends SQSServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeReceip) = this()
  
  @JSName("$fault")
  val $fault_ReceiptHandleIsInvalid: client = js.native
  
  @JSName("name")
  val name_ReceiptHandleIsInvalid: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ReceiptHandleIsInvalid = js.native
}

package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeTransaCancellationReasons
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "TransactionCanceledException")
@js.native
open class TransactionCanceledException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTransaCancellationReasons) = this()
  
  @JSName("$fault")
  val $fault_TransactionCanceledException: client = js.native
  
  /**
    * <p>A list of cancellation reasons.</p>
    */
  var CancellationReasons: js.UndefOr[js.Array[CancellationReason]] = js.native
  
  var Message: js.UndefOr[String] = js.native
  
  @JSName("name")
  val name_TransactionCanceledException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.TransactionCanceledException = js.native
}

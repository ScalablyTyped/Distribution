package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeTransaMessage
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "TransactionInProgressException")
@js.native
open class TransactionInProgressException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTransaMessage) = this()
  
  @JSName("$fault")
  val $fault_TransactionInProgressException: client = js.native
  
  var Message: js.UndefOr[String] = js.native
  
  @JSName("name")
  val name_TransactionInProgressException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.TransactionInProgressException = js.native
}

package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeTransa
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "TransactionConflictException")
@js.native
open class TransactionConflictException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTransa) = this()
  
  @JSName("$fault")
  val $fault_TransactionConflictException: client = js.native
  
  @JSName("name")
  val name_TransactionConflictException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.TransactionConflictException = js.native
}

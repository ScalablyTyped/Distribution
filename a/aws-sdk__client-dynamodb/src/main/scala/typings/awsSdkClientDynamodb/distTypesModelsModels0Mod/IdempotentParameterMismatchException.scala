package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeIdempo
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "IdempotentParameterMismatchException")
@js.native
open class IdempotentParameterMismatchException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIdempo) = this()
  
  @JSName("$fault")
  val $fault_IdempotentParameterMismatchException: client = js.native
  
  var Message: js.UndefOr[String] = js.native
  
  @JSName("name")
  val name_IdempotentParameterMismatchException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.IdempotentParameterMismatchException = js.native
}

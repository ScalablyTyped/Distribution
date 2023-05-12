package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeCondit
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ConditionalCheckFailedException")
@js.native
open class ConditionalCheckFailedException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeCondit) = this()
  
  @JSName("$fault")
  val $fault_ConditionalCheckFailedException: client = js.native
  
  @JSName("name")
  val name_ConditionalCheckFailedException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ConditionalCheckFailedException = js.native
}

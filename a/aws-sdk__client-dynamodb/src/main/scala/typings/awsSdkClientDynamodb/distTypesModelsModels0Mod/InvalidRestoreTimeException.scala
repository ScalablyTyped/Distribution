package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeInvaliMessage
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "InvalidRestoreTimeException")
@js.native
open class InvalidRestoreTimeException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeInvaliMessage) = this()
  
  @JSName("$fault")
  val $fault_InvalidRestoreTimeException: client = js.native
  
  @JSName("name")
  val name_InvalidRestoreTimeException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.InvalidRestoreTimeException = js.native
}

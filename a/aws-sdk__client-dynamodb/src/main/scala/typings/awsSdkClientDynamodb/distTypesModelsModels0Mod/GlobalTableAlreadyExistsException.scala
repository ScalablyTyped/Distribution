package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeGlobal
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "GlobalTableAlreadyExistsException")
@js.native
open class GlobalTableAlreadyExistsException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeGlobal) = this()
  
  @JSName("$fault")
  val $fault_GlobalTableAlreadyExistsException: client = js.native
  
  @JSName("name")
  val name_GlobalTableAlreadyExistsException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.GlobalTableAlreadyExistsException = js.native
}

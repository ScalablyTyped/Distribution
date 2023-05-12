package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeReques
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "RequestLimitExceeded")
@js.native
open class RequestLimitExceeded protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeReques) = this()
  
  @JSName("$fault")
  val $fault_RequestLimitExceeded: client = js.native
  
  @JSName("name")
  val name_RequestLimitExceeded: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.RequestLimitExceeded = js.native
}

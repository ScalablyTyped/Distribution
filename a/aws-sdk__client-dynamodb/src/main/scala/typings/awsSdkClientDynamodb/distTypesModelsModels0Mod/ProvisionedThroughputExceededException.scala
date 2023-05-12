package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeProvis
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ProvisionedThroughputExceededException")
@js.native
open class ProvisionedThroughputExceededException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeProvis) = this()
  
  @JSName("$fault")
  val $fault_ProvisionedThroughputExceededException: client = js.native
  
  @JSName("name")
  val name_ProvisionedThroughputExceededException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ProvisionedThroughputExceededException = js.native
}

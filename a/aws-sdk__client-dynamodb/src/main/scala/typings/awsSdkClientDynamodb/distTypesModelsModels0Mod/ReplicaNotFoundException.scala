package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeReplic
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ReplicaNotFoundException")
@js.native
open class ReplicaNotFoundException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeReplic) = this()
  
  @JSName("$fault")
  val $fault_ReplicaNotFoundException: client = js.native
  
  @JSName("name")
  val name_ReplicaNotFoundException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ReplicaNotFoundException = js.native
}

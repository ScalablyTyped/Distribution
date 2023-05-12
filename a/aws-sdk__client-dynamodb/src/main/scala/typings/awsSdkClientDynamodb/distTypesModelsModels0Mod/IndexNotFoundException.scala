package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeIndexN
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "IndexNotFoundException")
@js.native
open class IndexNotFoundException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIndexN) = this()
  
  @JSName("$fault")
  val $fault_IndexNotFoundException: client = js.native
  
  @JSName("name")
  val name_IndexNotFoundException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.IndexNotFoundException = js.native
}

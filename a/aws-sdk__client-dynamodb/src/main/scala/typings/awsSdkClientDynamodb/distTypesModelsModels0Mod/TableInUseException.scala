package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeTableI
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "TableInUseException")
@js.native
open class TableInUseException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTableI) = this()
  
  @JSName("$fault")
  val $fault_TableInUseException: client = js.native
  
  @JSName("name")
  val name_TableInUseException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.TableInUseException = js.native
}

package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeTableA
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "TableAlreadyExistsException")
@js.native
open class TableAlreadyExistsException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeTableA) = this()
  
  @JSName("$fault")
  val $fault_TableAlreadyExistsException: client = js.native
  
  @JSName("name")
  val name_TableAlreadyExistsException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.TableAlreadyExistsException = js.native
}

package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeImport
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ImportNotFoundException")
@js.native
open class ImportNotFoundException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeImport) = this()
  
  @JSName("$fault")
  val $fault_ImportNotFoundException: client = js.native
  
  @JSName("name")
  val name_ImportNotFoundException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ImportNotFoundException = js.native
}

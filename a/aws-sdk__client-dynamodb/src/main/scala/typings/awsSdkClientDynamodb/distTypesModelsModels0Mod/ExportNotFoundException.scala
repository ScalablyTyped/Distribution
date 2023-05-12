package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeExport
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ExportNotFoundException")
@js.native
open class ExportNotFoundException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeExport) = this()
  
  @JSName("$fault")
  val $fault_ExportNotFoundException: client = js.native
  
  @JSName("name")
  val name_ExportNotFoundException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ExportNotFoundException = js.native
}

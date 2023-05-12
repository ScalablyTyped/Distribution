package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeInvaliMessage
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "InvalidExportTimeException")
@js.native
open class InvalidExportTimeException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeInvaliMessage) = this()
  
  @JSName("$fault")
  val $fault_InvalidExportTimeException: client = js.native
  
  @JSName("name")
  val name_InvalidExportTimeException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.InvalidExportTimeException = js.native
}

package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeBackup
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "BackupNotFoundException")
@js.native
open class BackupNotFoundException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeBackup) = this()
  
  @JSName("$fault")
  val $fault_BackupNotFoundException: client = js.native
  
  @JSName("name")
  val name_BackupNotFoundException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.BackupNotFoundException = js.native
}

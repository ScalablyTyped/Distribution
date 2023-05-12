package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeBackup
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "BackupInUseException")
@js.native
open class BackupInUseException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeBackup) = this()
  
  @JSName("$fault")
  val $fault_BackupInUseException: client = js.native
  
  @JSName("name")
  val name_BackupInUseException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.BackupInUseException = js.native
}

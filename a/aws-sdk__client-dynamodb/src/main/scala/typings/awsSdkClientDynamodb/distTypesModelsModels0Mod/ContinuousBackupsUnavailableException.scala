package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeContin
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ContinuousBackupsUnavailableException")
@js.native
open class ContinuousBackupsUnavailableException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeContin) = this()
  
  @JSName("$fault")
  val $fault_ContinuousBackupsUnavailableException: client = js.native
  
  @JSName("name")
  val name_ContinuousBackupsUnavailableException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ContinuousBackupsUnavailableException = js.native
}

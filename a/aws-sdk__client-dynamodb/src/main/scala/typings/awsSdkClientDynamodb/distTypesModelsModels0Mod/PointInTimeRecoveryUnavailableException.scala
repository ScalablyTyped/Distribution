package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypePointI
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "PointInTimeRecoveryUnavailableException")
@js.native
open class PointInTimeRecoveryUnavailableException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypePointI) = this()
  
  @JSName("$fault")
  val $fault_PointInTimeRecoveryUnavailableException: client = js.native
  
  @JSName("name")
  val name_PointInTimeRecoveryUnavailableException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.PointInTimeRecoveryUnavailableException = js.native
}

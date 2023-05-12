package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeItemCo
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ItemCollectionSizeLimitExceededException")
@js.native
open class ItemCollectionSizeLimitExceededException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeItemCo) = this()
  
  @JSName("$fault")
  val $fault_ItemCollectionSizeLimitExceededException: client = js.native
  
  @JSName("name")
  val name_ItemCollectionSizeLimitExceededException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ItemCollectionSizeLimitExceededException = js.native
}

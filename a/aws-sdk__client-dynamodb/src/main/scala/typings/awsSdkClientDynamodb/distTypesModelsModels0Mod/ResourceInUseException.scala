package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeResour
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ResourceInUseException")
@js.native
open class ResourceInUseException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeResour) = this()
  
  @JSName("$fault")
  val $fault_ResourceInUseException: client = js.native
  
  @JSName("name")
  val name_ResourceInUseException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ResourceInUseException = js.native
}

package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.awsSdkClientDynamodb.anon.ExceptionOptionTypeResour
import typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.client
import typings.awsSdkClientDynamodb.distTypesModelsDynamoDBServiceExceptionMod.DynamoDBServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "ResourceNotFoundException")
@js.native
open class ResourceNotFoundException protected () extends DynamoDBServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeResour) = this()
  
  @JSName("$fault")
  val $fault_ResourceNotFoundException: client = js.native
  
  @JSName("name")
  val name_ResourceNotFoundException: typings.awsSdkClientDynamodb.awsSdkClientDynamodbStrings.ResourceNotFoundException = js.native
}

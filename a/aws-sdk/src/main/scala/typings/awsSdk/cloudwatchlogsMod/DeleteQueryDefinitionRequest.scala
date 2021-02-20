package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueryDefinitionRequest extends StObject {
  
  /**
    * The ID of the query definition that you want to delete. You can use DescribeQueryDefinitions to retrieve the IDs of your saved query definitions.
    */
  var queryDefinitionId: QueryId = js.native
}
object DeleteQueryDefinitionRequest {
  
  @scala.inline
  def apply(queryDefinitionId: QueryId): DeleteQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(queryDefinitionId = queryDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteQueryDefinitionRequestMutableBuilder[Self <: DeleteQueryDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryDefinitionId(value: QueryId): Self = StObject.set(x, "queryDefinitionId", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutQueryDefinitionResponse extends StObject {
  
  /**
    * The ID of the query definition.
    */
  var queryDefinitionId: js.UndefOr[QueryId] = js.native
}
object PutQueryDefinitionResponse {
  
  @scala.inline
  def apply(): PutQueryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutQueryDefinitionResponse]
  }
  
  @scala.inline
  implicit class PutQueryDefinitionResponseMutableBuilder[Self <: PutQueryDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryDefinitionId(value: QueryId): Self = StObject.set(x, "queryDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryDefinitionIdUndefined: Self = StObject.set(x, "queryDefinitionId", js.undefined)
  }
}

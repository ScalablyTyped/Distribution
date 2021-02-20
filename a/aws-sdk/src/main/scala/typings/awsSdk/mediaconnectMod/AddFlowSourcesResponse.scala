package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFlowSourcesResponse extends StObject {
  
  /**
    * The ARN of the flow that these sources were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  
  /**
    * The details of the newly added sources.
    */
  var Sources: js.UndefOr[listOfSource] = js.native
}
object AddFlowSourcesResponse {
  
  @scala.inline
  def apply(): AddFlowSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowSourcesResponse]
  }
  
  @scala.inline
  implicit class AddFlowSourcesResponseMutableBuilder[Self <: AddFlowSourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    @scala.inline
    def setSources(value: listOfSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "Sources", js.Array(value :_*))
  }
}

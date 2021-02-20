package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition you create.
    */
  var FlowDefinitionArn: typings.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
}
object CreateFlowDefinitionResponse {
  
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn): CreateFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionResponse]
  }
  
  @scala.inline
  implicit class CreateFlowDefinitionResponseMutableBuilder[Self <: CreateFlowDefinitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
  }
}

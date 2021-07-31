package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRequest extends StObject {
  
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The name of the workflow to retrieve.
    */
  var Name: NameString
}
object GetWorkflowRequest {
  
  @scala.inline
  def apply(Name: NameString): GetWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRequest]
  }
  
  @scala.inline
  implicit class GetWorkflowRequestMutableBuilder[Self <: GetWorkflowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeGraph(value: NullableBoolean): Self = StObject.set(x, "IncludeGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGraphUndefined: Self = StObject.set(x, "IncludeGraph", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndpointInput extends StObject {
  
  /**
    * The name of an endpoint configuration. For more information, see CreateEndpointConfig. 
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName = js.native
  
  /**
    * The name of the endpoint.The name must be unique within an AWS Region in your AWS account. The name is case-insensitive in CreateEndpoint, but the case is preserved and must be matched in .
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
  
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tagsin the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateEndpointInput {
  
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName, EndpointName: EndpointName): CreateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointInput]
  }
  
  @scala.inline
  implicit class CreateEndpointInputMutableBuilder[Self <: CreateEndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the resources.
    */
  var resourceArns: ResourceArnList
}
object DescribeTagsRequest {
  
  @scala.inline
  def apply(resourceArns: ResourceArnList): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsRequest]
  }
  
  @scala.inline
  implicit class DescribeTagsRequestMutableBuilder[Self <: DescribeTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "resourceArns", js.Array(value :_*))
  }
}

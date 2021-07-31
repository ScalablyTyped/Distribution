package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsRequest extends StObject {
  
  /**
    *  Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view.
    */
  var ARN: typings.awsSdk.esMod.ARN
}
object ListTagsRequest {
  
  @scala.inline
  def apply(ARN: ARN): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  @scala.inline
  implicit class ListTagsRequestMutableBuilder[Self <: ListTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
  }
}

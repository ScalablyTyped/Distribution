package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsResponse extends StObject {
  
  /**
    * If the request included a Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.native
  
  /**
    * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of NextMarker as the value of the Marker parameter in your next request to retrieve the next set of tags.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * Returns tags associated with the file system as an array of Tag objects. 
    */
  var Tags: typings.awsSdk.efsMod.Tags = js.native
}
object DescribeTagsResponse {
  
  @scala.inline
  def apply(Tags: Tags): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  
  @scala.inline
  implicit class DescribeTagsResponseMutableBuilder[Self <: DescribeTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

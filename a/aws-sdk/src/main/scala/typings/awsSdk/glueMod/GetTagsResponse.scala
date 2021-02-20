package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTagsResponse extends StObject {
  
  /**
    * The requested tags.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}
object GetTagsResponse {
  
  @scala.inline
  def apply(): GetTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagsResponse]
  }
  
  @scala.inline
  implicit class GetTagsResponseMutableBuilder[Self <: GetTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

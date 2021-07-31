package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResult extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
  
  /**
    * List of tags returned by the ListTagsForResource operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.directoryserviceMod.Tags] = js.undefined
}
object ListTagsForResourceResult {
  
  @scala.inline
  def apply(): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResultMutableBuilder[Self <: ListTagsForResourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

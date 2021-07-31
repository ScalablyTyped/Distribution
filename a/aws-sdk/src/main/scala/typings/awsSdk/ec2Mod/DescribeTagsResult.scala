package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagDescriptionList] = js.undefined
}
object DescribeTagsResult {
  
  @scala.inline
  def apply(): DescribeTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResult]
  }
  
  @scala.inline
  implicit class DescribeTagsResultMutableBuilder[Self <: DescribeTagsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagDescriptionList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagDescription*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

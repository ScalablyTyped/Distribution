package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegexMatchSetRequest extends StObject {
  
  /**
    * The RegexMatchSetId of the RegexMatchSet that you want to get. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: ResourceId
}
object GetRegexMatchSetRequest {
  
  @scala.inline
  def apply(RegexMatchSetId: ResourceId): GetRegexMatchSetRequest = {
    val __obj = js.Dynamic.literal(RegexMatchSetId = RegexMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegexMatchSetRequest]
  }
  
  @scala.inline
  implicit class GetRegexMatchSetRequestMutableBuilder[Self <: GetRegexMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexMatchSetId(value: ResourceId): Self = StObject.set(x, "RegexMatchSetId", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegexPatternSetResponse extends StObject {
  
  /**
    * Information about the RegexPatternSet that you specified in the GetRegexPatternSet request, including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for. 
    */
  var RegexPatternSet: js.UndefOr[typings.awsSdk.wafMod.RegexPatternSet] = js.native
}
object GetRegexPatternSetResponse {
  
  @scala.inline
  def apply(): GetRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegexPatternSetResponse]
  }
  
  @scala.inline
  implicit class GetRegexPatternSetResponseMutableBuilder[Self <: GetRegexPatternSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexPatternSet(value: RegexPatternSet): Self = StObject.set(x, "RegexPatternSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetUndefined: Self = StObject.set(x, "RegexPatternSet", js.undefined)
  }
}

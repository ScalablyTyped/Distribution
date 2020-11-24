package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegexPatternSetResponse extends js.Object {
  
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
  implicit class GetRegexPatternSetResponseOps[Self <: GetRegexPatternSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegexPatternSet(value: RegexPatternSet): Self = this.set("RegexPatternSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexPatternSet: Self = this.set("RegexPatternSet", js.undefined)
  }
}

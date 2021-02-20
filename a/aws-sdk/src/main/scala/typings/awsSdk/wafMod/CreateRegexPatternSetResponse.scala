package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRegexPatternSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
  
  /**
    * A RegexPatternSet that contains no objects.
    */
  var RegexPatternSet: js.UndefOr[typings.awsSdk.wafMod.RegexPatternSet] = js.native
}
object CreateRegexPatternSetResponse {
  
  @scala.inline
  def apply(): CreateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRegexPatternSetResponse]
  }
  
  @scala.inline
  implicit class CreateRegexPatternSetResponseMutableBuilder[Self <: CreateRegexPatternSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setRegexPatternSet(value: RegexPatternSet): Self = StObject.set(x, "RegexPatternSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetUndefined: Self = StObject.set(x, "RegexPatternSet", js.undefined)
  }
}

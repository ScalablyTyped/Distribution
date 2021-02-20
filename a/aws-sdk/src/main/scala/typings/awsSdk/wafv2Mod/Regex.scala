package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Regex extends StObject {
  
  /**
    * The string representing the regular expression.
    */
  var RegexString: js.UndefOr[RegexPatternString] = js.native
}
object Regex {
  
  @scala.inline
  def apply(): Regex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Regex]
  }
  
  @scala.inline
  implicit class RegexMutableBuilder[Self <: Regex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexString(value: RegexPatternString): Self = StObject.set(x, "RegexString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexStringUndefined: Self = StObject.set(x, "RegexString", js.undefined)
  }
}

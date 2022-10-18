package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Regex extends StObject {
  
  /**
    * The string representing the regular expression.
    */
  var RegexString: js.UndefOr[RegexPatternString] = js.undefined
}
object Regex {
  
  inline def apply(): Regex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Regex]
  }
  
  extension [Self <: Regex](x: Self) {
    
    inline def setRegexString(value: RegexPatternString): Self = StObject.set(x, "RegexString", value.asInstanceOf[js.Any])
    
    inline def setRegexStringUndefined: Self = StObject.set(x, "RegexString", js.undefined)
  }
}

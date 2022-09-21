package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonBody extends StObject {
  
  /**
    * What WAF should do if it fails to completely parse the JSON body. The options are the following:    EVALUATE_AS_STRING - Inspect the body as plain text. WAF applies the text transformations and inspection criteria that you defined for the JSON inspection to the body text string.    MATCH - Treat the web request as matching the rule statement. WAF applies the rule action to the request.    NO_MATCH - Treat the web request as not matching the rule statement.   If you don't provide this setting, WAF parses and evaluates the content only up to the first parsing failure that it encounters.  WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as invalid characters, duplicate keys, truncation, and any content whose root node isn't an object or an array.  WAF parses the JSON in the following examples as two valid key, value pairs:    Missing comma: {"key1":"value1""key2":"value2"}    Missing colon: {"key1":"value1","key2""value2"}    Extra colons: {"key1"::"value1","key2""value2"}   
    */
  var InvalidFallbackBehavior: js.UndefOr[BodyParsingFallbackBehavior] = js.undefined
  
  /**
    * The patterns to look for in the JSON body. WAF inspects the results of these pattern matches against the rule inspection criteria. 
    */
  var MatchPattern: JsonMatchPattern
  
  /**
    * The parts of the JSON to match against using the MatchPattern. If you specify All, WAF matches against keys and values. 
    */
  var MatchScope: JsonMatchScope
  
  /**
    * What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the request body are forwarded to WAF by the underlying host service.  The options for oversize handling are the following:    CONTINUE - Inspect the body normally, according to the rule inspection criteria.     MATCH - Treat the web request as matching the rule statement. WAF applies the rule action to the request.    NO_MATCH - Treat the web request as not matching the rule statement.   You can combine the MATCH or NO_MATCH settings for oversize handling with your rule and web ACL action settings, so that you block any request whose body is over 8 KB.  Default: CONTINUE 
    */
  var OversizeHandling: js.UndefOr[typings.awsSdk.wafv2Mod.OversizeHandling] = js.undefined
}
object JsonBody {
  
  inline def apply(MatchPattern: JsonMatchPattern, MatchScope: JsonMatchScope): JsonBody = {
    val __obj = js.Dynamic.literal(MatchPattern = MatchPattern.asInstanceOf[js.Any], MatchScope = MatchScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonBody]
  }
  
  extension [Self <: JsonBody](x: Self) {
    
    inline def setInvalidFallbackBehavior(value: BodyParsingFallbackBehavior): Self = StObject.set(x, "InvalidFallbackBehavior", value.asInstanceOf[js.Any])
    
    inline def setInvalidFallbackBehaviorUndefined: Self = StObject.set(x, "InvalidFallbackBehavior", js.undefined)
    
    inline def setMatchPattern(value: JsonMatchPattern): Self = StObject.set(x, "MatchPattern", value.asInstanceOf[js.Any])
    
    inline def setMatchScope(value: JsonMatchScope): Self = StObject.set(x, "MatchScope", value.asInstanceOf[js.Any])
    
    inline def setOversizeHandling(value: OversizeHandling): Self = StObject.set(x, "OversizeHandling", value.asInstanceOf[js.Any])
    
    inline def setOversizeHandlingUndefined: Self = StObject.set(x, "OversizeHandling", js.undefined)
  }
}

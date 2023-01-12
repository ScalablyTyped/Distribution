package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  /**
    * The filter to use to identify the subset of headers to inspect in a web request.  You must specify exactly one setting: either All, IncludedHeaders, or ExcludedHeaders. Example JSON: "MatchPattern": { "ExcludedHeaders": {"KeyToExclude1", "KeyToExclude2"} } 
    */
  var MatchPattern: HeaderMatchPattern
  
  /**
    * The parts of the headers to match with the rule inspection criteria. If you specify All, WAF inspects both keys and values. 
    */
  var MatchScope: MapMatchScope
  
  /**
    * What WAF should do if the headers of the request are larger than WAF can inspect. WAF does not support inspecting the entire contents of request headers when they exceed 8 KB (8192 bytes) or 200 total headers. The underlying host service forwards a maximum of 200 headers and at most 8 KB of header contents to WAF.  The options for oversize handling are the following:    CONTINUE - Inspect the headers normally, according to the rule inspection criteria.     MATCH - Treat the web request as matching the rule statement. WAF applies the rule action to the request.    NO_MATCH - Treat the web request as not matching the rule statement.  
    */
  var OversizeHandling: typings.awsSdk.clientsWafv2Mod.OversizeHandling
}
object Headers {
  
  inline def apply(MatchPattern: HeaderMatchPattern, MatchScope: MapMatchScope, OversizeHandling: OversizeHandling): Headers = {
    val __obj = js.Dynamic.literal(MatchPattern = MatchPattern.asInstanceOf[js.Any], MatchScope = MatchScope.asInstanceOf[js.Any], OversizeHandling = OversizeHandling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    inline def setMatchPattern(value: HeaderMatchPattern): Self = StObject.set(x, "MatchPattern", value.asInstanceOf[js.Any])
    
    inline def setMatchScope(value: MapMatchScope): Self = StObject.set(x, "MatchScope", value.asInstanceOf[js.Any])
    
    inline def setOversizeHandling(value: OversizeHandling): Self = StObject.set(x, "OversizeHandling", value.asInstanceOf[js.Any])
  }
}

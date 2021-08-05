package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegexPatternSetRequest extends StObject {
  
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to get. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId
}
object GetRegexPatternSetRequest {
  
  inline def apply(RegexPatternSetId: ResourceId): GetRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegexPatternSetRequest]
  }
  
  extension [Self <: GetRegexPatternSetRequest](x: Self) {
    
    inline def setRegexPatternSetId(value: ResourceId): Self = StObject.set(x, "RegexPatternSetId", value.asInstanceOf[js.Any])
  }
}

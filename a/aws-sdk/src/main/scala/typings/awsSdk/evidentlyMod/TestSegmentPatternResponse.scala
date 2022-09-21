package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSegmentPatternResponse extends StObject {
  
  /**
    * Returns true if the pattern matches the payload.
    */
  var `match`: Boolean
}
object TestSegmentPatternResponse {
  
  inline def apply(`match`: Boolean): TestSegmentPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSegmentPatternResponse]
  }
  
  extension [Self <: TestSegmentPatternResponse](x: Self) {
    
    inline def setMatch(value: Boolean): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}

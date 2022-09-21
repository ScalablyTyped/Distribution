package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageStringFilter extends StObject {
  
  /**
    * The operator to compare strings on.
    */
  var comparison: CoverageStringComparison
  
  /**
    * The value to compare strings on.
    */
  var value: CoverageStringInput
}
object CoverageStringFilter {
  
  inline def apply(comparison: CoverageStringComparison, value: CoverageStringInput): CoverageStringFilter = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageStringFilter]
  }
  
  extension [Self <: CoverageStringFilter](x: Self) {
    
    inline def setComparison(value: CoverageStringComparison): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CoverageStringInput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

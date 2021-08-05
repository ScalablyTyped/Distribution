package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightImpactGraphEdge extends StObject {
  
  /**
    * Identifier of the edge. Unique within a service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
}
object InsightImpactGraphEdge {
  
  inline def apply(): InsightImpactGraphEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightImpactGraphEdge]
  }
  
  extension [Self <: InsightImpactGraphEdge](x: Self) {
    
    inline def setReferenceId(value: NullableInteger): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
  }
}

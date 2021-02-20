package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightImpactGraphEdge extends StObject {
  
  /**
    * Identifier of the edge. Unique within a service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.native
}
object InsightImpactGraphEdge {
  
  @scala.inline
  def apply(): InsightImpactGraphEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightImpactGraphEdge]
  }
  
  @scala.inline
  implicit class InsightImpactGraphEdgeMutableBuilder[Self <: InsightImpactGraphEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceId(value: NullableInteger): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
  }
}

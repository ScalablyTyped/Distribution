package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationCoverageGroup extends StObject {
  
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  
  /**
    * How much instance usage this group of reservations covered.
    */
  var Coverage: js.UndefOr[typings.awsSdk.costexplorerMod.Coverage] = js.native
}
object ReservationCoverageGroup {
  
  @scala.inline
  def apply(): ReservationCoverageGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationCoverageGroup]
  }
  
  @scala.inline
  implicit class ReservationCoverageGroupMutableBuilder[Self <: ReservationCoverageGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setCoverage(value: Coverage): Self = StObject.set(x, "Coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "Coverage", js.undefined)
  }
}

package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2Specification extends StObject {
  
  /**
    * Whether you want a recommendation for standard or convertible reservations.
    */
  var OfferingClass: js.UndefOr[typings.awsSdk.costexplorerMod.OfferingClass] = js.native
}
object EC2Specification {
  
  @scala.inline
  def apply(): EC2Specification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2Specification]
  }
  
  @scala.inline
  implicit class EC2SpecificationMutableBuilder[Self <: EC2Specification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingClass(value: OfferingClass): Self = StObject.set(x, "OfferingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingClassUndefined: Self = StObject.set(x, "OfferingClass", js.undefined)
  }
}

package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ESInstanceDetails extends StObject {
  
  /**
    * Whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * The class of instance that AWS recommends.
    */
  var InstanceClass: js.UndefOr[GenericString] = js.native
  
  /**
    * The size of instance that AWS recommends.
    */
  var InstanceSize: js.UndefOr[GenericString] = js.native
  
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}
object ESInstanceDetails {
  
  @scala.inline
  def apply(): ESInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESInstanceDetails]
  }
  
  @scala.inline
  implicit class ESInstanceDetailsMutableBuilder[Self <: ESInstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    @scala.inline
    def setInstanceClass(value: GenericString): Self = StObject.set(x, "InstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceClassUndefined: Self = StObject.set(x, "InstanceClass", js.undefined)
    
    @scala.inline
    def setInstanceSize(value: GenericString): Self = StObject.set(x, "InstanceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceSizeUndefined: Self = StObject.set(x, "InstanceSize", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setSizeFlexEligible(value: GenericBoolean): Self = StObject.set(x, "SizeFlexEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeFlexEligibleUndefined: Self = StObject.set(x, "SizeFlexEligible", js.undefined)
  }
}

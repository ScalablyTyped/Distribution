package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElastiCacheInstanceDetails extends StObject {
  
  /**
    * Whether the recommendation is for a current generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  
  /**
    * The type of node that AWS recommends.
    */
  var NodeType: js.UndefOr[GenericString] = js.native
  
  /**
    * The description of the recommended reservation.
    */
  var ProductDescription: js.UndefOr[GenericString] = js.native
  
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}
object ElastiCacheInstanceDetails {
  
  @scala.inline
  def apply(): ElastiCacheInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElastiCacheInstanceDetails]
  }
  
  @scala.inline
  implicit class ElastiCacheInstanceDetailsMutableBuilder[Self <: ElastiCacheInstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    @scala.inline
    def setFamily(value: GenericString): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    @scala.inline
    def setNodeType(value: GenericString): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setProductDescription(value: GenericString): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
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

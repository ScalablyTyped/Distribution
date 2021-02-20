package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionBundle extends StObject {
  
  /**
    * The ID of the bundle.
    */
  var bundleId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the bundle is active, and can be specified for a new distribution.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the distribution bundle.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The monthly price, in US dollars, of the bundle.
    */
  var price: js.UndefOr[float] = js.native
  
  /**
    * The monthly network transfer quota of the bundle.
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.native
}
object DistributionBundle {
  
  @scala.inline
  def apply(): DistributionBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionBundle]
  }
  
  @scala.inline
  implicit class DistributionBundleMutableBuilder[Self <: DistributionBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setTransferPerMonthInGb(value: integer): Self = StObject.set(x, "transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferPerMonthInGbUndefined: Self = StObject.set(x, "transferPerMonthInGb", js.undefined)
  }
}

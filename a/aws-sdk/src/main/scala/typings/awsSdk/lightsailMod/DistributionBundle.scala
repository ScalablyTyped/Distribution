package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionBundle extends js.Object {
  
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
  implicit class DistributionBundleOps[Self <: DistributionBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrice(value: float): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setTransferPerMonthInGb(value: integer): Self = this.set("transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferPerMonthInGb: Self = this.set("transferPerMonthInGb", js.undefined)
  }
}

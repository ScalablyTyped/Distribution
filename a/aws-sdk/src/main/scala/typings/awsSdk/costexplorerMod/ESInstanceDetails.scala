package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ESInstanceDetails extends js.Object {
  
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
  implicit class ESInstanceDetailsOps[Self <: ESInstanceDetails] (val x: Self) extends AnyVal {
    
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
    def setCurrentGeneration(value: GenericBoolean): Self = this.set("CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentGeneration: Self = this.set("CurrentGeneration", js.undefined)
    
    @scala.inline
    def setInstanceClass(value: GenericString): Self = this.set("InstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceClass: Self = this.set("InstanceClass", js.undefined)
    
    @scala.inline
    def setInstanceSize(value: GenericString): Self = this.set("InstanceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceSize: Self = this.set("InstanceSize", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setSizeFlexEligible(value: GenericBoolean): Self = this.set("SizeFlexEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeFlexEligible: Self = this.set("SizeFlexEligible", js.undefined)
  }
}

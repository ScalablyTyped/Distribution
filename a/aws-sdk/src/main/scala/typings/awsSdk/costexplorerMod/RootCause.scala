package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootCause extends js.Object {
  
  /**
    *  The linked account value associated with the cost anomaly. 
    */
  var LinkedAccount: js.UndefOr[GenericString] = js.native
  
  /**
    *  The AWS Region associated with the cost anomaly. 
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    *  The AWS service name associated with the cost anomaly. 
    */
  var Service: js.UndefOr[GenericString] = js.native
  
  /**
    *  The UsageType value associated with the cost anomaly. 
    */
  var UsageType: js.UndefOr[GenericString] = js.native
}
object RootCause {
  
  @scala.inline
  def apply(): RootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootCause]
  }
  
  @scala.inline
  implicit class RootCauseOps[Self <: RootCause] (val x: Self) extends AnyVal {
    
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
    def setLinkedAccount(value: GenericString): Self = this.set("LinkedAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedAccount: Self = this.set("LinkedAccount", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setService(value: GenericString): Self = this.set("Service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("Service", js.undefined)
    
    @scala.inline
    def setUsageType(value: GenericString): Self = this.set("UsageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageType: Self = this.set("UsageType", js.undefined)
  }
}

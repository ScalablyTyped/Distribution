package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NielsenConfiguration extends js.Object {
  
  /**
    * Enter the Distributor ID assigned to your organization by Nielsen.
    */
  var DistributorId: js.UndefOr[string] = js.native
  
  /**
    * Enables Nielsen PCM to ID3 tagging
    */
  var NielsenPcmToId3Tagging: js.UndefOr[NielsenPcmToId3TaggingState] = js.native
}
object NielsenConfiguration {
  
  @scala.inline
  def apply(): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenConfiguration]
  }
  
  @scala.inline
  implicit class NielsenConfigurationOps[Self <: NielsenConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDistributorId(value: string): Self = this.set("DistributorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributorId: Self = this.set("DistributorId", js.undefined)
    
    @scala.inline
    def setNielsenPcmToId3Tagging(value: NielsenPcmToId3TaggingState): Self = this.set("NielsenPcmToId3Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenPcmToId3Tagging: Self = this.set("NielsenPcmToId3Tagging", js.undefined)
  }
}

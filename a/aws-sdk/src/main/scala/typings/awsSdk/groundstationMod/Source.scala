package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends js.Object {
  
  /**
    * Additional details for a Config, if type is dataflow endpoint or antenna demod decode.
    */
  var configDetails: js.UndefOr[ConfigDetails] = js.native
  
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.native
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  
  /**
    * Region of a dataflow source.
    */
  var dataflowSourceRegion: js.UndefOr[String] = js.native
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigDetails(value: ConfigDetails): Self = this.set("configDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigDetails: Self = this.set("configDetails", js.undefined)
    
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = this.set("configType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigType: Self = this.set("configType", js.undefined)
    
    @scala.inline
    def setDataflowSourceRegion(value: String): Self = this.set("dataflowSourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataflowSourceRegion: Self = this.set("dataflowSourceRegion", js.undefined)
  }
}

package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingParameters extends js.Object {
  
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var CSVMappingParameters: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CSVMappingParameters] = js.native
  
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var JSONMappingParameters: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.JSONMappingParameters] = js.native
}
object MappingParameters {
  
  @scala.inline
  def apply(): MappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingParameters]
  }
  
  @scala.inline
  implicit class MappingParametersOps[Self <: MappingParameters] (val x: Self) extends AnyVal {
    
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
    def setCSVMappingParameters(value: CSVMappingParameters): Self = this.set("CSVMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCSVMappingParameters: Self = this.set("CSVMappingParameters", js.undefined)
    
    @scala.inline
    def setJSONMappingParameters(value: JSONMappingParameters): Self = this.set("JSONMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSONMappingParameters: Self = this.set("JSONMappingParameters", js.undefined)
  }
}

package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * User defined description associated with the output.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * The name of the export associated with the output.
    */
  var ExportName: js.UndefOr[typings.awsSdk.cloudformationMod.ExportName] = js.native
  
  /**
    * The key associated with the output.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.cloudformationMod.OutputKey] = js.native
  
  /**
    * The value associated with the output.
    */
  var OutputValue: js.UndefOr[typings.awsSdk.cloudformationMod.OutputValue] = js.native
}
object Output {
  
  @scala.inline
  def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setExportName(value: ExportName): Self = this.set("ExportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportName: Self = this.set("ExportName", js.undefined)
    
    @scala.inline
    def setOutputKey(value: OutputKey): Self = this.set("OutputKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputKey: Self = this.set("OutputKey", js.undefined)
    
    @scala.inline
    def setOutputValue(value: OutputValue): Self = this.set("OutputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputValue: Self = this.set("OutputValue", js.undefined)
  }
}

package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingConfiguration extends js.Object {
  
  /**
    * Enables or disables data processing.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The data processors.
    */
  var Processors: js.UndefOr[ProcessorList] = js.native
}
object ProcessingConfiguration {
  
  @scala.inline
  def apply(): ProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingConfiguration]
  }
  
  @scala.inline
  implicit class ProcessingConfigurationOps[Self <: ProcessingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: BooleanObject): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setProcessorsVarargs(value: Processor*): Self = this.set("Processors", js.Array(value :_*))
    
    @scala.inline
    def setProcessors(value: ProcessorList): Self = this.set("Processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessors: Self = this.set("Processors", js.undefined)
  }
}

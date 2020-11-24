package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedOptionsStatus extends js.Object {
  
  /**
    *  Specifies the status of advanced options for the specified Elasticsearch domain.
    */
  var Options: AdvancedOptions = js.native
  
  /**
    *  Specifies the status of OptionStatus for advanced options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}
object AdvancedOptionsStatus {
  
  @scala.inline
  def apply(Options: AdvancedOptions, Status: OptionStatus): AdvancedOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedOptionsStatus]
  }
  
  @scala.inline
  implicit class AdvancedOptionsStatusOps[Self <: AdvancedOptionsStatus] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: AdvancedOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}

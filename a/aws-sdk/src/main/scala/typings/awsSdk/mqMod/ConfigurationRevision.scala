package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationRevision extends js.Object {
  
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The description of the configuration revision.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * Required. The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.native
}
object ConfigurationRevision {
  
  @scala.inline
  def apply(): ConfigurationRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRevision]
  }
  
  @scala.inline
  implicit class ConfigurationRevisionOps[Self <: ConfigurationRevision] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: timestampIso8601): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setRevision(value: integer): Self = this.set("Revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("Revision", js.undefined)
  }
}

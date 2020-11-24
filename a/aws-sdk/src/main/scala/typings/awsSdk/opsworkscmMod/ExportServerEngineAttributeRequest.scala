package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportServerEngineAttributeRequest extends js.Object {
  
  /**
    * The name of the export attribute. Currently, the supported export attribute is Userdata. This exports a user data script that includes parameters and values provided in the InputAttributes list.
    */
  var ExportAttributeName: String = js.native
  
  /**
    * The list of engine attributes. The list type is EngineAttribute. An EngineAttribute list item is a pair that includes an attribute name and its value. For the Userdata ExportAttributeName, the following are supported engine attribute names.    RunList In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter is ignored.    OrganizationName In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the organization default. In Puppet, this parameter is ignored.    NodeEnvironment In Chef, a node environment (for example, development, staging, or one-box). In Puppet, this parameter is ignored.    NodeClientVersion In Chef, the version of the Chef engine (three numbers separated by dots, such as 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this parameter is ignored.  
    */
  var InputAttributes: js.UndefOr[EngineAttributes] = js.native
  
  /**
    * The name of the server from which you are exporting the attribute.
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}
object ExportServerEngineAttributeRequest {
  
  @scala.inline
  def apply(ExportAttributeName: String, ServerName: ServerName): ExportServerEngineAttributeRequest = {
    val __obj = js.Dynamic.literal(ExportAttributeName = ExportAttributeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportServerEngineAttributeRequest]
  }
  
  @scala.inline
  implicit class ExportServerEngineAttributeRequestOps[Self <: ExportServerEngineAttributeRequest] (val x: Self) extends AnyVal {
    
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
    def setExportAttributeName(value: String): Self = this.set("ExportAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAttributesVarargs(value: EngineAttribute*): Self = this.set("InputAttributes", js.Array(value :_*))
    
    @scala.inline
    def setInputAttributes(value: EngineAttributes): Self = this.set("InputAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAttributes: Self = this.set("InputAttributes", js.undefined)
  }
}

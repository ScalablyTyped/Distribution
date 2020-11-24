package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerSessionTemplate extends js.Object {
  
  /**
    * TSQL for creating a session
    */
  var createStatement: String = js.native
  
  /**
    * Default view for template
    */
  var defaultView: String = js.native
  
  /**
    * Template name
    */
  var name: String = js.native
}
object ProfilerSessionTemplate {
  
  @scala.inline
  def apply(createStatement: String, defaultView: String, name: String): ProfilerSessionTemplate = {
    val __obj = js.Dynamic.literal(createStatement = createStatement.asInstanceOf[js.Any], defaultView = defaultView.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionTemplate]
  }
  
  @scala.inline
  implicit class ProfilerSessionTemplateOps[Self <: ProfilerSessionTemplate] (val x: Self) extends AnyVal {
    
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
    def setCreateStatement(value: String): Self = this.set("createStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultView(value: String): Self = this.set("defaultView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}

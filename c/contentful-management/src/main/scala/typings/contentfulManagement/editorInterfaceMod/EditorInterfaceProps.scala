package typings.contentfulManagement.editorInterfaceMod

import typings.contentfulManagement.anon.MetaSysPropsspacesysMetaL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorInterfaceProps extends js.Object {
  
  /**
    * Array of fields and it's associated widgetId
    */
  var controls: js.Array[Control] = js.native
  
  var sys: MetaSysPropsspacesysMetaL = js.native
}
object EditorInterfaceProps {
  
  @scala.inline
  def apply(controls: js.Array[Control], sys: MetaSysPropsspacesysMetaL): EditorInterfaceProps = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorInterfaceProps]
  }
  
  @scala.inline
  implicit class EditorInterfacePropsOps[Self <: EditorInterfaceProps] (val x: Self) extends AnyVal {
    
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
    def setControlsVarargs(value: Control*): Self = this.set("controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: js.Array[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysPropsspacesysMetaL): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}

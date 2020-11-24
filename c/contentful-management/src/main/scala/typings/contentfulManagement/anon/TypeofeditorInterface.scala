package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.editorInterfaceMod.EditorInterface
import typings.contentfulManagement.editorInterfaceMod.EditorInterfaceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofeditorInterface extends js.Object {
  
  def wrapEditorInterface(http: AxiosInstance, data: EditorInterfaceProps): EditorInterface = js.native
}
object TypeofeditorInterface {
  
  @scala.inline
  def apply(wrapEditorInterface: (AxiosInstance, EditorInterfaceProps) => EditorInterface): TypeofeditorInterface = {
    val __obj = js.Dynamic.literal(wrapEditorInterface = js.Any.fromFunction2(wrapEditorInterface))
    __obj.asInstanceOf[TypeofeditorInterface]
  }
  
  @scala.inline
  implicit class TypeofeditorInterfaceOps[Self <: TypeofeditorInterface] (val x: Self) extends AnyVal {
    
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
    def setWrapEditorInterface(value: (AxiosInstance, EditorInterfaceProps) => EditorInterface): Self = this.set("wrapEditorInterface", js.Any.fromFunction2(value))
  }
}

package typings.bbcodeToReact.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<bbcode-to-react.bbcode-to-react.TagType, 'children'>> */
@js.native
trait PartialOmitTagTypechildre extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var parent: js.UndefOr[ReactNode] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object PartialOmitTagTypechildre {
  
  @scala.inline
  def apply(): PartialOmitTagTypechildre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOmitTagTypechildre]
  }
  
  @scala.inline
  implicit class PartialOmitTagTypechildreOps[Self <: PartialOmitTagTypechildre] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setParent(value: ReactNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}

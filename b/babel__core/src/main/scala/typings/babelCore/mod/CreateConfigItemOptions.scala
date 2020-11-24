package typings.babelCore.mod

import typings.babelCore.babelCoreStrings.plugin
import typings.babelCore.babelCoreStrings.preset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigItemOptions extends js.Object {
  
  var dirname: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[preset | plugin] = js.native
}
object CreateConfigItemOptions {
  
  @scala.inline
  def apply(): CreateConfigItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigItemOptions]
  }
  
  @scala.inline
  implicit class CreateConfigItemOptionsOps[Self <: CreateConfigItemOptions] (val x: Self) extends AnyVal {
    
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
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    
    @scala.inline
    def setType(value: preset | plugin): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

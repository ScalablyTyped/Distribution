package typings.babelPluginMacros.mod

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.PluginPass
import typings.babelPluginMacros.anon.TypeofBabel
import typings.babelPluginMacros.anon.defaultArrayNodePathNodeR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroParams extends js.Object {
  
  var babel: TypeofBabel = js.native
  
  var config: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var references: defaultArrayNodePathNodeR = js.native
  
  var state: PluginPass = js.native
}
object MacroParams {
  
  @scala.inline
  def apply(babel: TypeofBabel, references: defaultArrayNodePathNodeR, state: PluginPass): MacroParams = {
    val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroParams]
  }
  
  @scala.inline
  implicit class MacroParamsOps[Self <: MacroParams] (val x: Self) extends AnyVal {
    
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
    def setBabel(value: TypeofBabel): Self = this.set("babel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferences(value: defaultArrayNodePathNodeR): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PluginPass): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: StringDictionary[js.Any]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}

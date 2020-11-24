package typings.babelPresetEnv.anon

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Esmodules extends _TargetsOptions {
  
  var esmodules: `true` = js.native
}
object Esmodules {
  
  @scala.inline
  def apply(esmodules: `true`): Esmodules = {
    val __obj = js.Dynamic.literal(esmodules = esmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Esmodules]
  }
  
  @scala.inline
  implicit class EsmodulesOps[Self <: Esmodules] (val x: Self) extends AnyVal {
    
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
    def setEsmodules(value: `true`): Self = this.set("esmodules", value.asInstanceOf[js.Any])
  }
}

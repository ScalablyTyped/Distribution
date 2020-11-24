package typings.cosmiconfig.mod

import typings.cosmiconfig.typesMod.CosmiconfigResult
import typings.cosmiconfig.typesMod.LoadersSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSync extends OptionsBase {
  
  var loaders: js.UndefOr[LoadersSync] = js.native
  
  var transform: js.UndefOr[TransformSync] = js.native
}
object OptionsSync {
  
  @scala.inline
  def apply(): OptionsSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSync]
  }
  
  @scala.inline
  implicit class OptionsSyncOps[Self <: OptionsSync] (val x: Self) extends AnyVal {
    
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
    def setLoaders(value: LoadersSync): Self = this.set("loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaders: Self = this.set("loaders", js.undefined)
    
    @scala.inline
    def setTransform(value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}

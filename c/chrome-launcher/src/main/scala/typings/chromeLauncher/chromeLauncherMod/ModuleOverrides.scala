package typings.chromeLauncher.chromeLauncherMod

import typings.chromeLauncher.anon.FnCall
import typings.chromeLauncher.anon.Typeoffs
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOverrides extends js.Object {
  
  var fs: js.UndefOr[Typeoffs] = js.native
  
  var rimraf: js.UndefOr[RimrafModule] = js.native
  
  var spawn: js.UndefOr[FnCall] = js.native
}
object ModuleOverrides {
  
  @scala.inline
  def apply(): ModuleOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOverrides]
  }
  
  @scala.inline
  implicit class ModuleOverridesOps[Self <: ModuleOverrides] (val x: Self) extends AnyVal {
    
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
    def setFs(value: Typeoffs): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setRimraf(value: (/* path */ String, /* callback */ js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("rimraf", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRimraf: Self = this.set("rimraf", js.undefined)
    
    @scala.inline
    def setSpawn(value: FnCall): Self = this.set("spawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpawn: Self = this.set("spawn", js.undefined)
  }
}

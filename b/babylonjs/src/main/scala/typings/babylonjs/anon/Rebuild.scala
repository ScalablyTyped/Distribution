package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rebuild extends js.Object {
  
  /** the material should be rebuilt */
  var rebuild: js.UndefOr[Boolean] = js.native
  
  /** the preview should be updated */
  var update: js.UndefOr[Boolean] = js.native
}
object Rebuild {
  
  @scala.inline
  def apply(): Rebuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rebuild]
  }
  
  @scala.inline
  implicit class RebuildOps[Self <: Rebuild] (val x: Self) extends AnyVal {
    
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
    def setRebuild(value: Boolean): Self = this.set("rebuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebuild: Self = this.set("rebuild", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}

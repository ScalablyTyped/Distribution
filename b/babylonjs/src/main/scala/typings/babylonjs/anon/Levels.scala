package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Levels extends js.Object {
  
  var levels: js.Array[TranscodedPixels] = js.native
}
object Levels {
  
  @scala.inline
  def apply(levels: js.Array[TranscodedPixels]): Levels = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  
  @scala.inline
  implicit class LevelsOps[Self <: Levels] (val x: Self) extends AnyVal {
    
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
    def setLevelsVarargs(value: TranscodedPixels*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[TranscodedPixels]): Self = this.set("levels", value.asInstanceOf[js.Any])
  }
}

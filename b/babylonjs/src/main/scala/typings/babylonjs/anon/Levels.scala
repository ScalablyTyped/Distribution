package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Levels extends StObject {
  
  var levels: js.Array[TranscodedPixels] = js.native
}
object Levels {
  
  @scala.inline
  def apply(levels: js.Array[TranscodedPixels]): Levels = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  
  @scala.inline
  implicit class LevelsMutableBuilder[Self <: Levels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevels(value: js.Array[TranscodedPixels]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: TranscodedPixels*): Self = StObject.set(x, "levels", js.Array(value :_*))
  }
}

package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Levels extends StObject {
  
  var levels: js.Array[TranscodedPixels]
}
object Levels {
  
  inline def apply(levels: js.Array[TranscodedPixels]): Levels = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  
  extension [Self <: Levels](x: Self) {
    
    inline def setLevels(value: js.Array[TranscodedPixels]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: TranscodedPixels*): Self = StObject.set(x, "levels", js.Array(value :_*))
  }
}

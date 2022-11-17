package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeUpdateMode extends StObject {
  
  var mode: UpdateMode
}
object ModeUpdateMode {
  
  inline def apply(mode: UpdateMode): ModeUpdateMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeUpdateMode]
  }
  
  extension [Self <: ModeUpdateMode](x: Self) {
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}

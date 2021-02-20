package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeTokenMod {
  
  @JSImport("babylonjs/Instrumentation/timeToken", "_TimeToken")
  @js.native
  class TimeToken () extends StObject {
    
    var _endTimeQuery: Nullable[WebGLQuery] = js.native
    
    var _startTimeQuery: Nullable[WebGLQuery] = js.native
    
    var _timeElapsedQuery: Nullable[WebGLQuery] = js.native
    
    var _timeElapsedQueryEnded: Boolean = js.native
  }
}

package typings.babylonjs.timeTokenMod

import typings.babylonjs.typesMod.Nullable
import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Instrumentation/timeToken", "_TimeToken")
@js.native
class TimeToken () extends js.Object {
  
  var _endTimeQuery: Nullable[WebGLQuery] = js.native
  
  var _startTimeQuery: Nullable[WebGLQuery] = js.native
  
  var _timeElapsedQuery: Nullable[WebGLQuery] = js.native
  
  var _timeElapsedQueryEnded: Boolean = js.native
}

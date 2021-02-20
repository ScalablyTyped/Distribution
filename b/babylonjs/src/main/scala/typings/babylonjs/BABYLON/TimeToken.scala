package typings.babylonjs.BABYLON

import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeToken extends StObject {
  
  var _endTimeQuery: Nullable[WebGLQuery] = js.native
  
  var _startTimeQuery: Nullable[WebGLQuery] = js.native
  
  var _timeElapsedQuery: Nullable[WebGLQuery] = js.native
  
  var _timeElapsedQueryEnded: Boolean = js.native
}
object TimeToken {
  
  @scala.inline
  def apply(_timeElapsedQueryEnded: Boolean): TimeToken = {
    val __obj = js.Dynamic.literal(_timeElapsedQueryEnded = _timeElapsedQueryEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToken]
  }
  
  @scala.inline
  implicit class TimeTokenMutableBuilder[Self <: TimeToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_endTimeQuery(value: Nullable[WebGLQuery]): Self = StObject.set(x, "_endTimeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endTimeQueryNull: Self = StObject.set(x, "_endTimeQuery", null)
    
    @scala.inline
    def set_startTimeQuery(value: Nullable[WebGLQuery]): Self = StObject.set(x, "_startTimeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startTimeQueryNull: Self = StObject.set(x, "_startTimeQuery", null)
    
    @scala.inline
    def set_timeElapsedQuery(value: Nullable[WebGLQuery]): Self = StObject.set(x, "_timeElapsedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeElapsedQueryEnded(value: Boolean): Self = StObject.set(x, "_timeElapsedQueryEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeElapsedQueryNull: Self = StObject.set(x, "_timeElapsedQuery", null)
  }
}

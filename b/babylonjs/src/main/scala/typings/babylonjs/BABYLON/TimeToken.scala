package typings.babylonjs.BABYLON

import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeToken extends StObject {
  
  var _endTimeQuery: Nullable[WebGLQuery]
  
  var _startTimeQuery: Nullable[WebGLQuery]
  
  var _timeElapsedQuery: Nullable[WebGLQuery]
  
  var _timeElapsedQueryEnded: Boolean
}
object TimeToken {
  
  inline def apply(_timeElapsedQueryEnded: Boolean): TimeToken = {
    val __obj = js.Dynamic.literal(_timeElapsedQueryEnded = _timeElapsedQueryEnded.asInstanceOf[js.Any], _endTimeQuery = null, _startTimeQuery = null, _timeElapsedQuery = null)
    __obj.asInstanceOf[TimeToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeToken] (val x: Self) extends AnyVal {
    
    inline def set_endTimeQuery(value: Nullable[WebGLQuery]): Self = StObject.set(x, "_endTimeQuery", value.asInstanceOf[js.Any])
    
    inline def set_endTimeQueryNull: Self = StObject.set(x, "_endTimeQuery", null)
    
    inline def set_startTimeQuery(value: Nullable[WebGLQuery]): Self = StObject.set(x, "_startTimeQuery", value.asInstanceOf[js.Any])
    
    inline def set_startTimeQueryNull: Self = StObject.set(x, "_startTimeQuery", null)
    
    inline def set_timeElapsedQuery(value: Nullable[WebGLQuery]): Self = StObject.set(x, "_timeElapsedQuery", value.asInstanceOf[js.Any])
    
    inline def set_timeElapsedQueryEnded(value: Boolean): Self = StObject.set(x, "_timeElapsedQueryEnded", value.asInstanceOf[js.Any])
    
    inline def set_timeElapsedQueryNull: Self = StObject.set(x, "_timeElapsedQuery", null)
  }
}

package typings.babylonjs.BABYLON

import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeToken extends js.Object {
  
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
  implicit class TimeTokenOps[Self <: TimeToken] (val x: Self) extends AnyVal {
    
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
    def set_timeElapsedQueryEnded(value: Boolean): Self = this.set("_timeElapsedQueryEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endTimeQuery(value: Nullable[WebGLQuery]): Self = this.set("_endTimeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endTimeQueryNull: Self = this.set("_endTimeQuery", null)
    
    @scala.inline
    def set_startTimeQuery(value: Nullable[WebGLQuery]): Self = this.set("_startTimeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startTimeQueryNull: Self = this.set("_startTimeQuery", null)
    
    @scala.inline
    def set_timeElapsedQuery(value: Nullable[WebGLQuery]): Self = this.set("_timeElapsedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeElapsedQueryNull: Self = this.set("_timeElapsedQuery", null)
  }
}

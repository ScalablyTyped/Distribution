package typings.babylonjs.BABYLON

import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeToken extends js.Object {
  var _endTimeQuery: Nullable[WebGLQuery]
  var _startTimeQuery: Nullable[WebGLQuery]
  var _timeElapsedQuery: Nullable[WebGLQuery]
  var _timeElapsedQueryEnded: Boolean
}

object TimeToken {
  @scala.inline
  def apply(
    _timeElapsedQueryEnded: Boolean,
    _endTimeQuery: Nullable[WebGLQuery] = null,
    _startTimeQuery: Nullable[WebGLQuery] = null,
    _timeElapsedQuery: Nullable[WebGLQuery] = null
  ): TimeToken = {
    val __obj = js.Dynamic.literal(_timeElapsedQueryEnded = _timeElapsedQueryEnded.asInstanceOf[js.Any], _endTimeQuery = _endTimeQuery.asInstanceOf[js.Any], _startTimeQuery = _startTimeQuery.asInstanceOf[js.Any], _timeElapsedQuery = _timeElapsedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToken]
  }
}


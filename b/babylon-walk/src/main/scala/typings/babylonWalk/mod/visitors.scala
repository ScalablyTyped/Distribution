package typings.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait visitors[V]
  extends coreVisitors[V]
     with es2015Visitors[V]
     with flowVisitors[V]
     with jsxVisitors[V]
     with miscVisitors[V]

object visitors {
  @scala.inline
  def apply[V](): visitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[visitors[V]]
  }
}


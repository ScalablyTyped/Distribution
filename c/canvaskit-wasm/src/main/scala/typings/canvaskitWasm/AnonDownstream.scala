package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkAffinity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownstream extends js.Object {
  var Downstream: SkAffinity
  var Upstream: SkAffinity
}

object AnonDownstream {
  @scala.inline
  def apply(Downstream: SkAffinity, Upstream: SkAffinity): AnonDownstream = {
    val __obj = js.Dynamic.literal(Downstream = Downstream.asInstanceOf[js.Any], Upstream = Upstream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDownstream]
  }
}


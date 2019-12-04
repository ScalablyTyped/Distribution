package typings.chunkedDashDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jasmine extends js.Object {
  var Spec: typings.chunkedDashDc.jasmine.Spec
  var clock: Clock
  var util: Util
}

object Jasmine {
  @scala.inline
  def apply(Spec: Spec, clock: Clock, util: Util): Jasmine = {
    val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Jasmine]
  }
}


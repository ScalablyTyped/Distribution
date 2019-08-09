package typings.chaiDashMoment.chaiDashMomentMod.Global.ChaiNs

import typings.chaiDashMoment.chaiDashMomentMod.Global.ChaiMomentNs.Granularity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  def afterMoment(expected: js.Any): Unit = js.native
  def afterMoment(expected: js.Any, granularity: Granularity): Unit = js.native
  def beforeMoment(expected: js.Any): Unit = js.native
  def beforeMoment(expected: js.Any, granularity: Granularity): Unit = js.native
  def sameMoment(expected: js.Any): Unit = js.native
  def sameMoment(expected: js.Any, granularity: Granularity): Unit = js.native
}


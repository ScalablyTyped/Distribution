package typings
package chaiDashUuidLib.chaiDashUuidMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends chaiLib.ChaiNs.LanguageChains
     with chaiLib.ChaiNs.NumericComparison
     with chaiLib.ChaiNs.TypeComparison {
  def guid(): scala.Unit = js.native
  def guid(guid: js.Any): scala.Unit = js.native
  def uuid(): scala.Unit = js.native
  def uuid(uuid: UuidVersion): scala.Unit = js.native
}


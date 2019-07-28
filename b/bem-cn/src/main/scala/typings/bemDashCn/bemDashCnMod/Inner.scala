package typings.bemDashCn.bemDashCnMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inner extends js.Object {
  @JSName("has")
  var has_Original: StateFn = js.native
  @JSName("is")
  var is_Original: StateFn = js.native
  @JSName("state")
  var state_Original: StateFn = js.native
  def apply(): String = js.native
  def apply(elem: String): Inner = js.native
  def apply(elem: String, mods: Modifications): Inner = js.native
  def apply(elem: Modifications): Inner = js.native
  def has(states: StringDictionary[Boolean]): Inner = js.native
  def is(states: StringDictionary[Boolean]): Inner = js.native
  def mix(mixes: String): Inner = js.native
  def mix(mixes: js.Array[String]): Inner = js.native
  def split(separator: String): js.Array[String] = js.native
  def split(separator: String, limit: Double): js.Array[String] = js.native
  def state(states: StringDictionary[Boolean]): Inner = js.native
}


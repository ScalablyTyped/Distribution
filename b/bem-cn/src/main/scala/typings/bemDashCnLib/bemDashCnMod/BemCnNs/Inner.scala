package typings
package bemDashCnLib.bemDashCnMod.BemCnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inner extends js.Object {
  @JSName("has")
  var has_Original: bemDashCnLib.StateFn = js.native
  @JSName("is")
  var is_Original: bemDashCnLib.StateFn = js.native
  @JSName("state")
  var state_Original: bemDashCnLib.StateFn = js.native
  def apply(): java.lang.String = js.native
  def apply(elem: Modifications): Inner = js.native
  def apply(elem: java.lang.String): Inner = js.native
  def apply(elem: java.lang.String, mods: Modifications): Inner = js.native
  def has(states: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): Inner = js.native
  def is(states: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): Inner = js.native
  def mix(mixes: java.lang.String): Inner = js.native
  def mix(mixes: js.Array[java.lang.String]): Inner = js.native
  def split(separator: java.lang.String): js.Array[java.lang.String] = js.native
  def split(separator: java.lang.String, limit: scala.Double): js.Array[java.lang.String] = js.native
  def state(states: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): Inner = js.native
}


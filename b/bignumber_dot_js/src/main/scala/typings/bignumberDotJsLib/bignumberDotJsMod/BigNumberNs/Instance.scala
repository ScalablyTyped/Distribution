package typings
package bignumberDotJsLib.bignumberDotJsMod.BigNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** The coefficient of the value of this BigNumber, an array of base 1e14 integer numbers, or null. */
  val c: js.Array[scala.Double] | scala.Null
  /** The exponent of the value of this BigNumber, an integer number, -1000000000 to 1000000000, or null. */
  val e: scala.Double | scala.Null
  /** The sign of the value of this BigNumber, -1, 1, or null. */
  val s: scala.Double | scala.Null
}

object Instance {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    c: js.Array[scala.Double] = null,
    e: scala.Int | scala.Double = null,
    s: scala.Int | scala.Double = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (c != null) __obj.updateDynamic("c")(c)
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}


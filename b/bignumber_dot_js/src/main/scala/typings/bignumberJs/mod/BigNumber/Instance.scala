package typings.bignumberJs.mod.BigNumber

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance
  extends /* key */ StringDictionary[js.Any] {
  /** The coefficient of the value of this BigNumber, an array of base 1e14 integer numbers, or null. */
  val c: js.Array[Double] | Null
  /** The exponent of the value of this BigNumber, an integer number, -1000000000 to 1000000000, or null. */
  val e: Double | Null
  /** The sign of the value of this BigNumber, -1, 1, or null. */
  val s: Double | Null
}

object Instance {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    c: js.Array[Double] = null,
    e: Double = null.asInstanceOf[Double],
    s: Double = null.asInstanceOf[Double]
  ): Instance = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Instance]
  }
}


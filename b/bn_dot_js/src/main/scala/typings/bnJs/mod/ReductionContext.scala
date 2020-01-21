package typings.bnJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReductionContext
  extends /* key */ StringDictionary[js.Any] {
  var m: Double
  var prime: MPrime
}

object ReductionContext {
  @scala.inline
  def apply(m: Double, prime: MPrime, StringDictionary: /* key */ StringDictionary[js.Any] = null): ReductionContext = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReductionContext]
  }
}


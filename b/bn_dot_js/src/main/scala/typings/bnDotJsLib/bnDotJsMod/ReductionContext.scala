package typings
package bnDotJsLib.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReductionContext
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var m: scala.Double
  var prime: MPrime
}

object ReductionContext {
  @scala.inline
  def apply(
    m: scala.Double,
    prime: MPrime,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ReductionContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("m")(m)
    __obj.updateDynamic("prime")(prime)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReductionContext]
  }
}


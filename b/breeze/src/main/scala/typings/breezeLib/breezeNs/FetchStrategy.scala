package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchStrategy
  extends breezeLib.breezeNs.coreNs.IEnum {
  var FromLocalCache: FetchStrategySymbol
  var FromServer: FetchStrategySymbol
}

object FetchStrategy {
  @scala.inline
  def apply(
    FromLocalCache: FetchStrategySymbol,
    FromServer: FetchStrategySymbol,
    contains: js.Function1[js.Any, scala.Boolean],
    fromName: js.Function1[java.lang.String, breezeLib.breezeNs.coreNs.EnumSymbol],
    getNames: js.Function0[js.Array[java.lang.String]],
    getSymbols: js.Function0[js.Array[breezeLib.breezeNs.coreNs.EnumSymbol]]
  ): FetchStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FromLocalCache")(FromLocalCache)
    __obj.updateDynamic("FromServer")(FromServer)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("fromName")(fromName)
    __obj.updateDynamic("getNames")(getNames)
    __obj.updateDynamic("getSymbols")(getSymbols)
    __obj.asInstanceOf[FetchStrategy]
  }
}


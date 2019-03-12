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
    contains: js.Any => scala.Boolean,
    fromName: java.lang.String => breezeLib.breezeNs.coreNs.EnumSymbol,
    getNames: () => js.Array[java.lang.String],
    getSymbols: () => js.Array[breezeLib.breezeNs.coreNs.EnumSymbol]
  ): FetchStrategy = {
    val __obj = js.Dynamic.literal(FromLocalCache = FromLocalCache, FromServer = FromServer, contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
  
    __obj.asInstanceOf[FetchStrategy]
  }
}


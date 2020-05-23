package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchStrategy extends IEnum {
  var FromLocalCache: FetchStrategySymbol
  var FromServer: FetchStrategySymbol
}

object FetchStrategy {
  @scala.inline
  def apply(
    FromLocalCache: FetchStrategySymbol,
    FromServer: FetchStrategySymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): FetchStrategy = {
    val __obj = js.Dynamic.literal(FromLocalCache = FromLocalCache.asInstanceOf[js.Any], FromServer = FromServer.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[FetchStrategy]
  }
}


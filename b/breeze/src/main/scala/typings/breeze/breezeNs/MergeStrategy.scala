package typings.breeze.breezeNs

import typings.breeze.breezeNs.coreNs.EnumSymbol
import typings.breeze.breezeNs.coreNs.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeStrategy extends IEnum {
  var Disallowed: MergeStrategySymbol
  var OverwriteChanges: MergeStrategySymbol
  var PreserveChanges: MergeStrategySymbol
  var SkipMerge: MergeStrategySymbol
}

object MergeStrategy {
  @scala.inline
  def apply(
    Disallowed: MergeStrategySymbol,
    OverwriteChanges: MergeStrategySymbol,
    PreserveChanges: MergeStrategySymbol,
    SkipMerge: MergeStrategySymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): MergeStrategy = {
    val __obj = js.Dynamic.literal(Disallowed = Disallowed, OverwriteChanges = OverwriteChanges, PreserveChanges = PreserveChanges, SkipMerge = SkipMerge, contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
  
    __obj.asInstanceOf[MergeStrategy]
  }
}


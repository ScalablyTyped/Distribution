package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeStrategy
  extends breezeLib.breezeNs.coreNs.IEnum {
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
    contains: js.Function1[js.Any, scala.Boolean],
    fromName: js.Function1[java.lang.String, breezeLib.breezeNs.coreNs.EnumSymbol],
    getNames: js.Function0[js.Array[java.lang.String]],
    getSymbols: js.Function0[js.Array[breezeLib.breezeNs.coreNs.EnumSymbol]]
  ): MergeStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Disallowed")(Disallowed)
    __obj.updateDynamic("OverwriteChanges")(OverwriteChanges)
    __obj.updateDynamic("PreserveChanges")(PreserveChanges)
    __obj.updateDynamic("SkipMerge")(SkipMerge)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("fromName")(fromName)
    __obj.updateDynamic("getNames")(getNames)
    __obj.updateDynamic("getSymbols")(getSymbols)
    __obj.asInstanceOf[MergeStrategy]
  }
}


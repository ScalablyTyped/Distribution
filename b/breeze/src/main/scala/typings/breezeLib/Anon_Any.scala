package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  var mergeStrategy: js.UndefOr[breezeLib.breezeNs.MergeStrategySymbol] = js.undefined
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ js.Any, scala.Unit]] = js.undefined
}

object Anon_Any {
  @scala.inline
  def apply(
    mergeStrategy: breezeLib.breezeNs.MergeStrategySymbol = null,
    metadataVersionFn: js.Function1[/* any */ js.Any, scala.Unit] = null
  ): Anon_Any = {
    val __obj = js.Dynamic.literal()
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy)
    if (metadataVersionFn != null) __obj.updateDynamic("metadataVersionFn")(metadataVersionFn)
    __obj.asInstanceOf[Anon_Any]
  }
}


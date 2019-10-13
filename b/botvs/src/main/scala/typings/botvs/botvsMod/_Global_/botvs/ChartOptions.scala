package typings.botvs.botvsMod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Highstock.Options * / any */ trait ChartOptions extends js.Object {
  var __isStock: js.UndefOr[Boolean] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(__isStock: js.UndefOr[Boolean] = js.undefined): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__isStock)) __obj.updateDynamic("__isStock")(__isStock)
    __obj.asInstanceOf[ChartOptions]
  }
}


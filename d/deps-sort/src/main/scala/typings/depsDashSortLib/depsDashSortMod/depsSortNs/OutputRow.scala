package typings
package depsDashSortLib.depsDashSortMod.depsSortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All the input properties, and:
  */
trait OutputRow extends js.Object {
  /**
    * when 'opts.dedupe' is true, contains the row ID of a file with identical contents
    */
  var dedupe: java.lang.String
  /**
    * like 'row.dedupe', but contains the 'row.index' instead of 'row.id'
    */
  var dedupeIndex: scala.Double
  /**
    * when 'opts.index' is true, the sorted numeric index of the row
    */
  var index: scala.Double
  /**
    * like 'row.deps', but mapping to 'row.index' instead of 'row.id'
    */
  var indexDeps: org.scalablytyped.runtime.StringDictionary[scala.Double]
}

object OutputRow {
  @scala.inline
  def apply(
    dedupe: java.lang.String,
    dedupeIndex: scala.Double,
    index: scala.Double,
    indexDeps: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): OutputRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dedupe")(dedupe)
    __obj.updateDynamic("dedupeIndex")(dedupeIndex)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("indexDeps")(indexDeps)
    __obj.asInstanceOf[OutputRow]
  }
}


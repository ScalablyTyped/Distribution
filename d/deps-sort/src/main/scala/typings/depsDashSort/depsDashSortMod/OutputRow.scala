package typings.depsDashSort.depsDashSortMod

import org.scalablytyped.runtime.StringDictionary
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
  var dedupe: String
  /**
    * like 'row.dedupe', but contains the 'row.index' instead of 'row.id'
    */
  var dedupeIndex: Double
  /**
    * when 'opts.index' is true, the sorted numeric index of the row
    */
  var index: Double
  /**
    * like 'row.deps', but mapping to 'row.index' instead of 'row.id'
    */
  var indexDeps: StringDictionary[Double]
}

object OutputRow {
  @scala.inline
  def apply(dedupe: String, dedupeIndex: Double, index: Double, indexDeps: StringDictionary[Double]): OutputRow = {
    val __obj = js.Dynamic.literal(dedupe = dedupe.asInstanceOf[js.Any], dedupeIndex = dedupeIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexDeps = indexDeps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutputRow]
  }
}


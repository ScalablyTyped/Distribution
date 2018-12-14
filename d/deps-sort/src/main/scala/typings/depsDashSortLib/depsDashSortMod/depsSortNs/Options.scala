package typings
package depsDashSortLib.depsDashSortMod.depsSortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * module-deps constructor options
     */

trait Options
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
           * Set 'row.dedupe' for files that match existing contents. Sets 'row.dedupeIndex' when 'index' is enabled.
           * When 'row.dedupe' is set, 'row.sameDeps' will be set to a boolean of whether the dependencies at the dedupe target match (true) or just the source content (false).
           */
  var dedupe: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * array of names or object mapping names to true not to mangle with integer indexes when 'index' is turned on.
           * If 'expose' maps names to strings, those strings will be used to resolve the indexed references.
           */
  var expose: js.UndefOr[
    js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[scala.Boolean | java.lang.String])
  ] = js.undefined
  /**
           * When true, for each module-deps row, insert 'row.index' with the numeric index and
           * 'row.indexDeps' like 'row.deps' but mapping require strings to row indices
           */
  var index: js.UndefOr[scala.Boolean] = js.undefined
}


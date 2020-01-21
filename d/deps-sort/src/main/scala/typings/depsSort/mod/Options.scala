package typings.depsSort.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * module-deps constructor options
  */
trait Options
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * Set 'row.dedupe' for files that match existing contents. Sets 'row.dedupeIndex' when 'index' is enabled.
    * When 'row.dedupe' is set, 'row.sameDeps' will be set to a boolean of whether the dependencies at the dedupe target match (true) or just the source content (false).
    */
  var dedupe: js.UndefOr[Boolean] = js.undefined
  /**
    * array of names or object mapping names to true not to mangle with integer indexes when 'index' is turned on.
    * If 'expose' maps names to strings, those strings will be used to resolve the indexed references.
    */
  var expose: js.UndefOr[js.Array[String] | (StringDictionary[Boolean | String])] = js.undefined
  /**
    * When true, for each module-deps row, insert 'row.index' with the numeric index and
    * 'row.indexDeps' like 'row.deps' but mapping require strings to row indices
    */
  var index: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    dedupe: js.UndefOr[Boolean] = js.undefined,
    expose: js.Array[String] | (StringDictionary[Boolean | String]) = null,
    index: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(dedupe)) __obj.updateDynamic("dedupe")(dedupe.asInstanceOf[js.Any])
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


package typings.depsSort.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * module-deps constructor options
  */
@js.native
trait Options
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * Set 'row.dedupe' for files that match existing contents. Sets 'row.dedupeIndex' when 'index' is enabled.
    * When 'row.dedupe' is set, 'row.sameDeps' will be set to a boolean of whether the dependencies at the dedupe target match (true) or just the source content (false).
    */
  var dedupe: js.UndefOr[Boolean] = js.native
  /**
    * array of names or object mapping names to true not to mangle with integer indexes when 'index' is turned on.
    * If 'expose' maps names to strings, those strings will be used to resolve the indexed references.
    */
  var expose: js.UndefOr[js.Array[String] | (StringDictionary[Boolean | String])] = js.native
  /**
    * When true, for each module-deps row, insert 'row.index' with the numeric index and
    * 'row.indexDeps' like 'row.deps' but mapping require strings to row indices
    */
  var index: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDedupe(value: Boolean): Self = this.set("dedupe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedupe: Self = this.set("dedupe", js.undefined)
    @scala.inline
    def setExposeVarargs(value: String*): Self = this.set("expose", js.Array(value :_*))
    @scala.inline
    def setExpose(value: js.Array[String] | (StringDictionary[Boolean | String])): Self = this.set("expose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    @scala.inline
    def setIndex(value: Boolean): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}


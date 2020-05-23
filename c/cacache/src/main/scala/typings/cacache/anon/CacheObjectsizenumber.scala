package typings.cacache.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cacache.cacache/en.CacheObject & {  size  :number} */
trait CacheObjectsizenumber extends js.Object {
  /** Subresource Integrity hash for the content this entry refers to. */
  var integrity: String
  /** Key the entry was looked up under. Matches the key argument. */
  var key: String
  /** User-assigned metadata associated with the entry/content. */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /** Filesystem path where content is stored, joined with cache argument. */
  var path: String
  var size: Double
  /** Timestamp the entry was first added on. */
  var time: Double
}

object CacheObjectsizenumber {
  @scala.inline
  def apply(integrity: String, key: String, path: String, size: Double, time: Double, metadata: js.Any = null): CacheObjectsizenumber = {
    val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheObjectsizenumber]
  }
}


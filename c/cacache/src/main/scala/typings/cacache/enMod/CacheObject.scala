package typings.cacache.enMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheObject extends js.Object {
  /** Subresource Integrity hash for the content this entry refers to. */
  var integrity: String
  /** Key the entry was looked up under. Matches the key argument. */
  var key: String
  /** User-assigned metadata associated with the entry/content. */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /** Filesystem path where content is stored, joined with cache argument. */
  var path: String
  /** Timestamp the entry was first added on. */
  var time: Double
}

object CacheObject {
  @scala.inline
  def apply(integrity: String, key: String, path: String, time: Double, metadata: js.Any = null): CacheObject = {
    val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheObject]
  }
}


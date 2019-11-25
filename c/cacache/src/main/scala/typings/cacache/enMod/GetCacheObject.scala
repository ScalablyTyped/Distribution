package typings.cacache.enMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCacheObject extends js.Object {
  var data: Buffer
  var integrity: String
  var metadata: js.UndefOr[js.Any] = js.undefined
  var size: Double
}

object GetCacheObject {
  @scala.inline
  def apply(data: Buffer, integrity: String, size: Double, metadata: js.Any = null): GetCacheObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCacheObject]
  }
}


package typings.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncCollectionOptions extends js.Object {
  /**
    * option value for Depth header.
    */
  var depth: js.UndefOr[String] = js.undefined
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object]
  /**
    * indicates scope of the sync report request.
    */
  var syncLevel: Double
  /**
    * synchronization token provided by the server.
    */
  var syncToken: String
}

object SyncCollectionOptions {
  @scala.inline
  def apply(props: js.Array[js.Object], syncLevel: Double, syncToken: String, depth: String = null): SyncCollectionOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], syncLevel = syncLevel.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncCollectionOptions]
  }
}


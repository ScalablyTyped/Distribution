package typings.dav.davMod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropfindOptions extends js.Object {
  /**
    *  value for Depth header.
    */
  var depth: js.UndefOr[String] = js.undefined
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object]
}

object PropfindOptions {
  @scala.inline
  def apply(props: js.Array[js.Object], depth: String = null): PropfindOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropfindOptions]
  }
}


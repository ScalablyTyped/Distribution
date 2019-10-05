package typings.dav.davMod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressBookQueryOptions extends js.Object {
  /**
    * value for Depth header.
    */
  var depth: js.UndefOr[String] = js.undefined
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object]
}

object AddressBookQueryOptions {
  @scala.inline
  def apply(props: js.Array[js.Object], depth: String = null): AddressBookQueryOptions = {
    val __obj = js.Dynamic.literal(props = props)
    if (depth != null) __obj.updateDynamic("depth")(depth)
    __obj.asInstanceOf[AddressBookQueryOptions]
  }
}


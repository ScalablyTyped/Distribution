package typings.childDashProcessDashPromise

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: BufferEncoding = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}


package typings
package blocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var create: js.UndefOr[Anon_Url] = js.undefined
  var destroy: js.UndefOr[Anon_Url] = js.undefined
  var read: js.UndefOr[Anon_Url] = js.undefined
  var update: js.UndefOr[Anon_Url] = js.undefined
}

object Anon_Create {
  @scala.inline
  def apply(create: Anon_Url = null, destroy: Anon_Url = null, read: Anon_Url = null, update: Anon_Url = null): Anon_Create = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (read != null) __obj.updateDynamic("read")(read)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_Create]
  }
}


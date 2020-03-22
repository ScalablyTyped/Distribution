package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionOptions extends js.Object {
  /**
  			 * The id of an existing kernel.
  			 */
  var kernelId: js.UndefOr[String] = js.undefined
  /**
  			 * The type of kernel (e.g. python3).
  			 */
  var kernelName: js.UndefOr[String] = js.undefined
  /**
  			 * The name of the session.
  			 */
  var name: js.UndefOr[String] = js.undefined
  /**
  			 * The path (not including name) to the session.
  			 */
  var path: String
  /**
  			 * The type of the session.
  			 */
  var `type`: js.UndefOr[String] = js.undefined
}

object ISessionOptions {
  @scala.inline
  def apply(
    path: String,
    kernelId: String = null,
    kernelName: String = null,
    name: String = null,
    `type`: String = null
  ): ISessionOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (kernelId != null) __obj.updateDynamic("kernelId")(kernelId.asInstanceOf[js.Any])
    if (kernelName != null) __obj.updateDynamic("kernelName")(kernelName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionOptions]
  }
}


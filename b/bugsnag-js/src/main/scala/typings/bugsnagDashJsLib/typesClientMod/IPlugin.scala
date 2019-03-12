package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  var configSchema: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IConfigSchemaEntry]] = js.undefined
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def init(client: Client): js.Any
}

object IPlugin {
  @scala.inline
  def apply(
    init: Client => js.Any,
    configSchema: org.scalablytyped.runtime.StringDictionary[IConfigSchemaEntry] = null,
    destroy: () => scala.Unit = null
  ): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    if (configSchema != null) __obj.updateDynamic("configSchema")(configSchema)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IPlugin]
  }
}


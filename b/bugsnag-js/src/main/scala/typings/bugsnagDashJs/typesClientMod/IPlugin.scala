package typings.bugsnagDashJs.typesClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  var configSchema: js.UndefOr[StringDictionary[IConfigSchemaEntry]] = js.undefined
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  def init(client: Client): js.Any
}

object IPlugin {
  @scala.inline
  def apply(
    init: Client => js.Any,
    configSchema: StringDictionary[IConfigSchemaEntry] = null,
    destroy: () => Unit = null
  ): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    if (configSchema != null) __obj.updateDynamic("configSchema")(configSchema)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IPlugin]
  }
}


package typings.bugsnagJs.clientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlugin extends js.Object {
  var configSchema: js.UndefOr[StringDictionary[IConfigSchemaEntry]] = js.native
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  def init(client: Client): js.Any = js.native
}

object IPlugin {
  @scala.inline
  def apply(init: Client => js.Any): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[IPlugin]
  }
  @scala.inline
  implicit class IPluginOps[Self <: IPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInit(value: Client => js.Any): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setConfigSchema(value: StringDictionary[IConfigSchemaEntry]): Self = this.set("configSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigSchema: Self = this.set("configSchema", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
  }
  
}


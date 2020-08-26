package typings.contractProxyKit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonConfig extends js.Object {
  var networks: js.UndefOr[StringDictionary[NetworkConfigEntry]] = js.native
}

object CommonConfig {
  @scala.inline
  def apply(): CommonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonConfig]
  }
  @scala.inline
  implicit class CommonConfigOps[Self <: CommonConfig] (val x: Self) extends AnyVal {
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
    def setNetworks(value: StringDictionary[NetworkConfigEntry]): Self = this.set("networks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworks: Self = this.set("networks", js.undefined)
  }
  
}


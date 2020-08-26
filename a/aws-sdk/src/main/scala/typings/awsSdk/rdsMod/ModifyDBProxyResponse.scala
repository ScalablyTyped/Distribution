package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBProxyResponse extends js.Object {
  /**
    * The DBProxy object representing the new settings for the proxy.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.rdsMod.DBProxy] = js.native
}

object ModifyDBProxyResponse {
  @scala.inline
  def apply(): ModifyDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyResponse]
  }
  @scala.inline
  implicit class ModifyDBProxyResponseOps[Self <: ModifyDBProxyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDBProxy(value: DBProxy): Self = this.set("DBProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBProxy: Self = this.set("DBProxy", js.undefined)
  }
  
}


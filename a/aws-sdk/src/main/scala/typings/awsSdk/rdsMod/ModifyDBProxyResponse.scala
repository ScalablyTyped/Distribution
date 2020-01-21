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
  def apply(DBProxy: DBProxy = null): ModifyDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    if (DBProxy != null) __obj.updateDynamic("DBProxy")(DBProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyResponse]
  }
}


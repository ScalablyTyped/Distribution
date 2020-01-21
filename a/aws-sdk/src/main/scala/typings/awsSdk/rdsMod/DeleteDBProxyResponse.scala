package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBProxyResponse extends js.Object {
  /**
    * The data structure representing the details of the DB proxy that you delete.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.rdsMod.DBProxy] = js.native
}

object DeleteDBProxyResponse {
  @scala.inline
  def apply(DBProxy: DBProxy = null): DeleteDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    if (DBProxy != null) __obj.updateDynamic("DBProxy")(DBProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBProxyResponse]
  }
}


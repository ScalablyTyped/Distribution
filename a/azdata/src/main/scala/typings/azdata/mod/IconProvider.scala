package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProvider extends DataProvider {
  def getConnectionIconId(connection: IConnectionProfile, serverInfo: ServerInfo): Thenable[String]
}

object IconProvider {
  @scala.inline
  def apply(
    getConnectionIconId: (IConnectionProfile, ServerInfo) => Thenable[String],
    providerId: String,
    handle: Int | Double = null
  ): IconProvider = {
    val __obj = js.Dynamic.literal(getConnectionIconId = js.Any.fromFunction2(getConnectionIconId), providerId = providerId.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProvider]
  }
}


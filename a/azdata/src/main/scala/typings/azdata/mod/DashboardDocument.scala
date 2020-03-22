package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardDocument extends js.Object {
  var profile: IConnectionProfile
  var serverInfo: ServerInfo
}

object DashboardDocument {
  @scala.inline
  def apply(profile: IConnectionProfile, serverInfo: ServerInfo): DashboardDocument = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DashboardDocument]
  }
}


package typings.azdata.mod.connection

import typings.azdata.mod.ConnectionResult
import typings.azdata.mod.IConnectionProfile
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "connection.connect")
@js.native
object connect extends js.Object {
  
  def apply(connectionProfile: IConnectionProfile): Thenable[ConnectionResult] = js.native
  def apply(
    connectionProfile: IConnectionProfile,
    saveConnection: js.UndefOr[scala.Nothing],
    showDashboard: Boolean
  ): Thenable[ConnectionResult] = js.native
  def apply(connectionProfile: IConnectionProfile, saveConnection: Boolean): Thenable[ConnectionResult] = js.native
  def apply(connectionProfile: IConnectionProfile, saveConnection: Boolean, showDashboard: Boolean): Thenable[ConnectionResult] = js.native
}

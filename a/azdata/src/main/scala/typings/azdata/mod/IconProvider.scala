package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProvider extends DataProvider {
  
  def getConnectionIconId(connection: IConnectionProfile, serverInfo: ServerInfo): Thenable[String] = js.native
}
object IconProvider {
  
  @scala.inline
  def apply(getConnectionIconId: (IConnectionProfile, ServerInfo) => Thenable[String], providerId: String): IconProvider = {
    val __obj = js.Dynamic.literal(getConnectionIconId = js.Any.fromFunction2(getConnectionIconId), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProvider]
  }
  
  @scala.inline
  implicit class IconProviderOps[Self <: IconProvider] (val x: Self) extends AnyVal {
    
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
    def setGetConnectionIconId(value: (IConnectionProfile, ServerInfo) => Thenable[String]): Self = this.set("getConnectionIconId", js.Any.fromFunction2(value))
  }
}

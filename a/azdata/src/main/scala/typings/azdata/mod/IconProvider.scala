package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconProvider
  extends StObject
     with DataProvider {
  
  def getConnectionIconId(connection: IConnectionProfile, serverInfo: ServerInfo): Thenable[js.UndefOr[String]]
}
object IconProvider {
  
  inline def apply(
    getConnectionIconId: (IConnectionProfile, ServerInfo) => Thenable[js.UndefOr[String]],
    providerId: String
  ): IconProvider = {
    val __obj = js.Dynamic.literal(getConnectionIconId = js.Any.fromFunction2(getConnectionIconId), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconProvider] (val x: Self) extends AnyVal {
    
    inline def setGetConnectionIconId(value: (IConnectionProfile, ServerInfo) => Thenable[js.UndefOr[String]]): Self = StObject.set(x, "getConnectionIconId", js.Any.fromFunction2(value))
  }
}

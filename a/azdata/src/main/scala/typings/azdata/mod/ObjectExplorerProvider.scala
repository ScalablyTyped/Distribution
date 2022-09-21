package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerProvider
  extends StObject
     with ObjectExplorerProviderBase {
  
  def closeSession(closeSessionInfo: ObjectExplorerCloseSessionInfo): Thenable[ObjectExplorerCloseSessionResponse]
  
  def createNewSession(connInfo: ConnectionInfo): Thenable[ObjectExplorerSessionResponse]
  
  /**
    * Registers a handler for SessionCreated events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnSessionCreated(handler: js.Function1[/* response */ ObjectExplorerSession, Any]): Unit
  
  /**
    * Registers a handler for SessionDisconnected events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  var registerOnSessionDisconnected: js.UndefOr[
    js.Function1[/* handler */ js.Function1[/* response */ ObjectExplorerSession, Any], Unit]
  ] = js.undefined
}
object ObjectExplorerProvider {
  
  inline def apply(
    closeSession: ObjectExplorerCloseSessionInfo => Thenable[ObjectExplorerCloseSessionResponse],
    createNewSession: ConnectionInfo => Thenable[ObjectExplorerSessionResponse],
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, Any] => Unit,
    registerOnSessionCreated: js.Function1[/* response */ ObjectExplorerSession, Any] => Unit
  ): ObjectExplorerProvider = {
    val __obj = js.Dynamic.literal(closeSession = js.Any.fromFunction1(closeSession), createNewSession = js.Any.fromFunction1(createNewSession), expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted), registerOnSessionCreated = js.Any.fromFunction1(registerOnSessionCreated))
    __obj.asInstanceOf[ObjectExplorerProvider]
  }
  
  extension [Self <: ObjectExplorerProvider](x: Self) {
    
    inline def setCloseSession(value: ObjectExplorerCloseSessionInfo => Thenable[ObjectExplorerCloseSessionResponse]): Self = StObject.set(x, "closeSession", js.Any.fromFunction1(value))
    
    inline def setCreateNewSession(value: ConnectionInfo => Thenable[ObjectExplorerSessionResponse]): Self = StObject.set(x, "createNewSession", js.Any.fromFunction1(value))
    
    inline def setRegisterOnSessionCreated(value: js.Function1[/* response */ ObjectExplorerSession, Any] => Unit): Self = StObject.set(x, "registerOnSessionCreated", js.Any.fromFunction1(value))
    
    inline def setRegisterOnSessionDisconnected(value: /* handler */ js.Function1[/* response */ ObjectExplorerSession, Any] => Unit): Self = StObject.set(x, "registerOnSessionDisconnected", js.Any.fromFunction1(value))
    
    inline def setRegisterOnSessionDisconnectedUndefined: Self = StObject.set(x, "registerOnSessionDisconnected", js.undefined)
  }
}

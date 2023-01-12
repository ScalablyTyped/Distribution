package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreProvider
  extends StObject
     with DataProvider {
  
  def cancelRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[Boolean]
  
  def getRestoreConfigInfo(connectionUri: String): Thenable[RestoreConfigInfo]
  
  def getRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestorePlanResponse]
  
  def restore(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestoreResponse]
}
object RestoreProvider {
  
  inline def apply(
    cancelRestorePlan: (String, RestoreInfo) => Thenable[Boolean],
    getRestoreConfigInfo: String => Thenable[RestoreConfigInfo],
    getRestorePlan: (String, RestoreInfo) => Thenable[RestorePlanResponse],
    providerId: String,
    restore: (String, RestoreInfo) => Thenable[RestoreResponse]
  ): RestoreProvider = {
    val __obj = js.Dynamic.literal(cancelRestorePlan = js.Any.fromFunction2(cancelRestorePlan), getRestoreConfigInfo = js.Any.fromFunction1(getRestoreConfigInfo), getRestorePlan = js.Any.fromFunction2(getRestorePlan), providerId = providerId.asInstanceOf[js.Any], restore = js.Any.fromFunction2(restore))
    __obj.asInstanceOf[RestoreProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreProvider] (val x: Self) extends AnyVal {
    
    inline def setCancelRestorePlan(value: (String, RestoreInfo) => Thenable[Boolean]): Self = StObject.set(x, "cancelRestorePlan", js.Any.fromFunction2(value))
    
    inline def setGetRestoreConfigInfo(value: String => Thenable[RestoreConfigInfo]): Self = StObject.set(x, "getRestoreConfigInfo", js.Any.fromFunction1(value))
    
    inline def setGetRestorePlan(value: (String, RestoreInfo) => Thenable[RestorePlanResponse]): Self = StObject.set(x, "getRestorePlan", js.Any.fromFunction2(value))
    
    inline def setRestore(value: (String, RestoreInfo) => Thenable[RestoreResponse]): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
  }
}

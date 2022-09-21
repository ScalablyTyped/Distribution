package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait NavigatorStorage extends StObject {
  
  val storage: StorageManager
}
object NavigatorStorage {
  
  inline def apply(storage: StorageManager): NavigatorStorage = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStorage]
  }
  
  extension [Self <: NavigatorStorage](x: Self) {
    
    inline def setStorage(value: StorageManager): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}

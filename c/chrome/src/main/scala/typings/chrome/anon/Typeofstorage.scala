package typings.chrome.anon

import typings.chrome.chrome.storage.LocalStorageArea
import typings.chrome.chrome.storage.StorageArea
import typings.chrome.chrome.storage.StorageChangedEvent
import typings.chrome.chrome.storage.SyncStorageArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofstorage extends StObject {
  
  var local: LocalStorageArea
  
  var managed: StorageArea
  
  var onChanged: StorageChangedEvent
  
  var sync: SyncStorageArea
}
object Typeofstorage {
  
  inline def apply(
    local: LocalStorageArea,
    managed: StorageArea,
    onChanged: StorageChangedEvent,
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstorage]
  }
  
  extension [Self <: Typeofstorage](x: Self) {
    
    inline def setLocal(value: LocalStorageArea): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setManaged(value: StorageArea): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    inline def setOnChanged(value: StorageChangedEvent): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
    
    inline def setSync(value: SyncStorageArea): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}

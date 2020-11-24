package typings.chrome.chrome.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined keyof std.Pick<{  local :chrome.chrome.storage.LocalStorageArea,   sync :chrome.chrome.storage.SyncStorageArea,   managed :chrome.chrome.storage.StorageArea,   onChanged :chrome.chrome.storage.StorageChangedEvent}, 'sync' | 'local' | 'managed'> */
/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.sync
  - typings.chrome.chromeStrings.local
  - typings.chrome.chromeStrings.managed
*/
trait AreaName extends js.Object
object AreaName {
  
  @scala.inline
  def local: typings.chrome.chromeStrings.local = "local".asInstanceOf[typings.chrome.chromeStrings.local]
  
  @scala.inline
  def managed: typings.chrome.chromeStrings.managed = "managed".asInstanceOf[typings.chrome.chromeStrings.managed]
  
  @scala.inline
  def sync: typings.chrome.chromeStrings.sync = "sync".asInstanceOf[typings.chrome.chromeStrings.sync]
}

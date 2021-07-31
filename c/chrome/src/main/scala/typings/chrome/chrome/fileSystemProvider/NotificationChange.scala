package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChange extends StObject {
  
  /** The type of the change which happened to the entry. */
  var changeType: String
  
  /** The path of the changed entry. */
  var entryPath: String
}
object NotificationChange {
  
  @scala.inline
  def apply(changeType: String, entryPath: String): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChange]
  }
  
  @scala.inline
  implicit class NotificationChangeMutableBuilder[Self <: NotificationChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
  }
}

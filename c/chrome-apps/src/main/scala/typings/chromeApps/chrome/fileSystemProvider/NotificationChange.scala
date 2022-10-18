package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.DELETED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CHANGED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChange extends StObject {
  
  /**
    * The type of the change which happened to the entry.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[
    DELETED, 
    /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} extends keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} ? std.Exclude<keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'}, 'CHANGED' | 'DELETED'> : never */ js.Any
  ]
  
  /** The path of the changed entry. */
  var entryPath: String
}
object NotificationChange {
  
  inline def apply(
    changeType: ToStringLiteral[
      DELETED, 
      /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} extends keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} ? std.Exclude<keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'}, 'CHANGED' | 'DELETED'> : never */ js.Any
    ],
    entryPath: String
  ): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChange]
  }
  
  extension [Self <: NotificationChange](x: Self) {
    
    inline def setChangeType(
      value: ToStringLiteral[
          DELETED, 
          /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} extends keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} ? std.Exclude<keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'}, 'CHANGED' | 'DELETED'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
  }
}

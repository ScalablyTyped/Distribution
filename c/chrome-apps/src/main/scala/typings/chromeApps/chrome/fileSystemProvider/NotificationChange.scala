package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.DELETED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CHANGED
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationChange extends StObject {
  
  /**
    * The type of the change which happened to the entry.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[
    DELETED, 
    /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
    Exclude[
      /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
      CHANGED | typings.chromeApps.chromeAppsStrings.DELETED
    ]
  ] = js.native
  
  /** The path of the changed entry. */
  var entryPath: String = js.native
}
object NotificationChange {
  
  @scala.inline
  def apply(
    changeType: ToStringLiteral[
      DELETED, 
      /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
      Exclude[
        /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
        CHANGED | typings.chromeApps.chromeAppsStrings.DELETED
      ]
    ],
    entryPath: String
  ): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChange]
  }
  
  @scala.inline
  implicit class NotificationChangeMutableBuilder[Self <: NotificationChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(
      value: ToStringLiteral[
          DELETED, 
          /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
          Exclude[
            /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
            CHANGED | typings.chromeApps.chromeAppsStrings.DELETED
          ]
        ]
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPath(value: String): Self = StObject.set(x, "entryPath", value.asInstanceOf[js.Any])
  }
}

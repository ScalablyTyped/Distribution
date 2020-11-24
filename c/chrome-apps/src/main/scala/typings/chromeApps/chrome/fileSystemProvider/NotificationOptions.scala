package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.DELETED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CHANGED
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationOptions extends js.Object {
  
  /**
    * The type of the change which happened to the observed entry.
    * If it is DELETED, then the observed entry will be automatically
    * removed from the list of observed entries.
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
  
  /** List of changes to entries within the observed directory (including the entry itself)  */
  var changes: js.UndefOr[js.Array[NotificationChange]] = js.native
  
  /** The identifier of the file system related to this change. */
  var fileSystemId: String = js.native
  
  /** The path of the observed entry. */
  var observedPath: String = js.native
  
  /** Mode of the observed entry. */
  var recursive: Boolean = js.native
  
  /**
    * Tag for the notification.
    * Required if the file system was mounted with the supportsNotifyTag option.
    * Note, that this flag is necessary to provide notifications about changes
    * which changed even when the system was shutdown.
    */
  var tag: js.UndefOr[String] = js.native
}
object NotificationOptions {
  
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
    fileSystemId: String,
    observedPath: String,
    recursive: Boolean
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], observedPath = observedPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setChangeType(
      value: ToStringLiteral[
          DELETED, 
          /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
          Exclude[
            /* keyof chrome-apps.anon.DELETED */ CHANGED | typings.chromeApps.chromeAppsStrings.DELETED, 
            CHANGED | typings.chromeApps.chromeAppsStrings.DELETED
          ]
        ]
    ): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedPath(value: String): Self = this.set("observedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: NotificationChange*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[NotificationChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}

package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.OFFLINENOTNECESSARY
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typings.chromeApps.chromeAppsStrings.SHARE
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  /**
    * The identifier of the action.
    * Any string or CommonActionId for common actions.
    * @see CommonActionId
    **/
  var id: (ToStringLiteral[
    OFFLINENOTNECESSARY, 
    /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
    Exclude[
      /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
      SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE
    ]
  ]) | String = js.native
  
  /** The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[String] = js.native
}
object Action {
  
  @scala.inline
  def apply(
    id: (ToStringLiteral[
      OFFLINENOTNECESSARY, 
      /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
      Exclude[
        /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
        SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE
      ]
    ]) | String
  ): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setId(
      value: (ToStringLiteral[
          OFFLINENOTNECESSARY, 
          /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
          Exclude[
            /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
            SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE
          ]
        ]) | String
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

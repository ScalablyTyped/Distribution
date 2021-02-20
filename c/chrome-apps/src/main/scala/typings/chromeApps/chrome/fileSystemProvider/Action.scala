package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.anon.OFFLINENOTNECESSARY
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typings.chromeApps.chromeAppsStrings.SHARE
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
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
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
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
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

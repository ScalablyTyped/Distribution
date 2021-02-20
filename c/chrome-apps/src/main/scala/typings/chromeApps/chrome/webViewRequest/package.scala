package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webViewRequest {
  
  type DeclarativeWebRequestConditionsList = typings.chromeApps.chromeAppsStrings.declarativeContentDotPageStateMatcher
  
  /**
    * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
    * from an action of the declarative web request API.
    */
  type OnMessageEvent = typings.chromeApps.chrome.events.Event[
    js.Function1[
      /* details */ typings.chromeApps.chrome.webViewRequest.OnMessageEventDetails, 
      scala.Unit
    ]
  ]
  
  /** Supported conditions */
  type OnRequestConditions = typings.chromeApps.chrome.webViewRequest.RequestMatcher
  
  /**
    * Description of a declarative rule for handling events.
    * With correct types for the onRequest event.
    */
  type OnRequestRule = typings.chromeApps.chrome.events.Rule[
    typings.chromeApps.chrome.webViewRequest.OnRequestConditions, 
    typings.chromeApps.chrome.webViewRequest.OnRequestActions
  ]
}

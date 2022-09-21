package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.events.Rule
import typings.chromeApps.chromeAppsStrings.declarativeContentDotPageStateMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DeclarativeWebRequestConditionsList = declarativeContentDotPageStateMatcher

/**
  * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
  * from an action of the declarative web request API.
  */
type OnMessageEvent = Event[js.Function1[/* details */ OnMessageEventDetails, Unit]]

/** Supported conditions */
type OnRequestConditions = RequestMatcher

/**
  * Description of a declarative rule for handling events.
  * With correct types for the onRequest event.
  */
type OnRequestRule = Rule[OnRequestConditions, OnRequestActions]

package typings.cordovaUniversalLinksPlugin

import typings.cordovaUniversalLinksPlugin.universalLinks.EventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object universalLinks {
    
    @JSGlobal("universalLinks.subscribe")
    @js.native
    def subscribe(eventName: String, callback: js.Function1[/* data */ EventData, Unit]): Unit = js.native
    @JSGlobal("universalLinks.subscribe")
    @js.native
    def subscribe(eventName: Null, callback: js.Function1[/* data */ EventData, Unit]): Unit = js.native
    
    @JSGlobal("universalLinks.unsubscribe")
    @js.native
    def unsubscribe(): Unit = js.native
    @JSGlobal("universalLinks.unsubscribe")
    @js.native
    def unsubscribe(eventName: String): Unit = js.native
  }
}

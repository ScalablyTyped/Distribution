package typings.cordovaUniversalLinksPlugin

import typings.cordovaUniversalLinksPlugin.universalLinks.EventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object universalLinks {
    
    @JSGlobal("universalLinks")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def subscribe(eventName: String, callback: js.Function1[/* data */ EventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def subscribe(eventName: Null, callback: js.Function1[/* data */ EventData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def unsubscribe(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")().asInstanceOf[Unit]
    @scala.inline
    def unsubscribe(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

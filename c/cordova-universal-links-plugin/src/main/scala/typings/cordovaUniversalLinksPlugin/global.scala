package typings.cordovaUniversalLinksPlugin

import typings.cordovaUniversalLinksPlugin.universalLinks.EventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object universalLinks extends js.Object {
    def subscribe(eventName: String, callback: js.Function1[/* data */ EventData, Unit]): Unit = js.native
    def subscribe(eventName: Null, callback: js.Function1[/* data */ EventData, Unit]): Unit = js.native
    def unsubscribe(): Unit = js.native
    def unsubscribe(eventName: String): Unit = js.native
  }
  
}


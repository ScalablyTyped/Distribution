package typings.chromeDashApps.chrome.app.runtime

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.AppView.EmbedRequest
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an embedding app requests to embed this app.
  * @since Chrome 43.
  * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
  */
@JSGlobal("chrome.app.runtime.onEmbedRequested")
@js.native
object onEmbedRequested
  extends TopLevel[Event[js.Function1[/* request */ EmbedRequest, Unit]]]


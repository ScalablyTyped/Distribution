package typings.cordovaPluginInappbrowser

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InAppBrowserEvent extends Event {
  
  /** the error code, only in the case of loaderror. */
  var code: Double = js.native
  
  /** the error message, only in the case of loaderror. */
  var message: String = js.native
  
  /** the URL that was loaded. */
  var url: String = js.native
}

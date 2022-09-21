package typings.chromecastCafSender

import typings.chromecastCafSender.anon.Typeofcast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Global object
////////////////////
@js.native
trait Window extends StObject {
  
  def __onGCastApiAvailable(available: Boolean): Unit = js.native
  def __onGCastApiAvailable(available: Boolean, reason: String): Unit = js.native
  
  var cast: Typeofcast = js.native
}

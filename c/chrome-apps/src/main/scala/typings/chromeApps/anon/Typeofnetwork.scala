package typings.chromeApps.anon

import typings.chromeApps.chrome.system.network.NetworkInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofnetwork extends StObject {
  
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit
}
object Typeofnetwork {
  
  @scala.inline
  def apply(
    getNetworkInterfaces: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Unit
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getNetworkInterfaces = js.Any.fromFunction1(getNetworkInterfaces))
    __obj.asInstanceOf[Typeofnetwork]
  }
  
  @scala.inline
  implicit class TypeofnetworkMutableBuilder[Self <: Typeofnetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNetworkInterfaces(value: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Unit): Self = StObject.set(x, "getNetworkInterfaces", js.Any.fromFunction1(value))
  }
}

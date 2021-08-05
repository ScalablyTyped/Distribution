package typings.chromeApps.anon

import typings.chromeApps.chrome.dns.ResolveCallbackResolveInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdns extends StObject {
  
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  def resolve(hostname: String, callback: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]): Unit
}
object Typeofdns {
  
  inline def apply(resolve: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Unit): Typeofdns = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[Typeofdns]
  }
  
  extension [Self <: Typeofdns](x: Self) {
    
    inline def setResolve(value: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
  }
}

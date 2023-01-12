package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with BaseOptions {
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var protocol: js.UndefOr[Protocol] = js.undefined
  
  var target: js.UndefOr[
    (js.Function1[/* targets */ js.Array[Target], Target | Double]) | Target | String
  ] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setTarget(value: (js.Function1[/* targets */ js.Array[Target], Target | Double]) | Target | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetFunction1(value: /* targets */ js.Array[Target] => Target | Double): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}

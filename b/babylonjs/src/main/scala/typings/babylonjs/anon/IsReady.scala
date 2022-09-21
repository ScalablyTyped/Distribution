package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsReady extends StObject {
  
  var isAsync: Boolean
  
  var isReady: Boolean
  
  var proxy: Nullable[this.type | js.Promise[this.type]]
}
object IsReady {
  
  inline def apply(isAsync: Boolean, isReady: Boolean): IsReady = {
    val __obj = js.Dynamic.literal(isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], proxy = null)
    __obj.asInstanceOf[IsReady]
  }
  
  extension [Self <: IsReady](x: Self) {
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: Nullable[IsReady | js.Promise[IsReady]]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyNull: Self = StObject.set(x, "proxy", null)
  }
}

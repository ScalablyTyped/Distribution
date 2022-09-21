package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAsync extends StObject {
  
  var isAsync: Boolean
  
  var isReady: Boolean
  
  var proxy: Nullable[this.type | js.Promise[this.type]]
}
object IsAsync {
  
  inline def apply(isAsync: Boolean, isReady: Boolean): IsAsync = {
    val __obj = js.Dynamic.literal(isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], proxy = null)
    __obj.asInstanceOf[IsAsync]
  }
  
  extension [Self <: IsAsync](x: Self) {
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: Nullable[IsAsync | js.Promise[IsAsync]]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyNull: Self = StObject.set(x, "proxy", null)
  }
}

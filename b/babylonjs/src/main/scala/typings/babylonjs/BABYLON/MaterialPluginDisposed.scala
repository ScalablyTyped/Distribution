package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginDisposed extends StObject {
  
  var forceDisposeTextures: js.UndefOr[Boolean] = js.undefined
}
object MaterialPluginDisposed {
  
  inline def apply(): MaterialPluginDisposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialPluginDisposed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialPluginDisposed] (val x: Self) extends AnyVal {
    
    inline def setForceDisposeTextures(value: Boolean): Self = StObject.set(x, "forceDisposeTextures", value.asInstanceOf[js.Any])
    
    inline def setForceDisposeTexturesUndefined: Self = StObject.set(x, "forceDisposeTextures", js.undefined)
  }
}

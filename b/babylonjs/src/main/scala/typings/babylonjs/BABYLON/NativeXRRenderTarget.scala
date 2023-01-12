package typings.babylonjs.BABYLON

import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeXRRenderTarget
  extends StObject
     with WebXRRenderTarget {
  
  /* private */ var _nativeRenderTarget: Any
}
object NativeXRRenderTarget {
  
  inline def apply(
    _nativeRenderTarget: Any,
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
  ): NativeXRRenderTarget = {
    val __obj = js.Dynamic.literal(_nativeRenderTarget = _nativeRenderTarget.asInstanceOf[js.Any], canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), xrLayer = null)
    __obj.asInstanceOf[NativeXRRenderTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeXRRenderTarget] (val x: Self) extends AnyVal {
    
    inline def set_nativeRenderTarget(value: Any): Self = StObject.set(x, "_nativeRenderTarget", value.asInstanceOf[js.Any])
  }
}

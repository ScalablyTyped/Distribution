package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRLayersOptions extends StObject {
  
  /**
    * Whether to try initializing the base projection layer as a multiview render target, if multiview is supported.
    * Defaults to false.
    */
  var preferMultiviewOnInit: js.UndefOr[Boolean] = js.undefined
}
object IWebXRLayersOptions {
  
  inline def apply(): IWebXRLayersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRLayersOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRLayersOptions] (val x: Self) extends AnyVal {
    
    inline def setPreferMultiviewOnInit(value: Boolean): Self = StObject.set(x, "preferMultiviewOnInit", value.asInstanceOf[js.Any])
    
    inline def setPreferMultiviewOnInitUndefined: Self = StObject.set(x, "preferMultiviewOnInit", js.undefined)
  }
}

package typings.baseui.anon

import typings.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppContainer extends StObject {
  
  var AppContainer: js.UndefOr[Override[Any]] = js.undefined
  
  var LayersContainer: js.UndefOr[Override[Any]] = js.undefined
}
object AppContainer {
  
  inline def apply(): AppContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppContainer] (val x: Self) extends AnyVal {
    
    inline def setAppContainer(value: Override[Any]): Self = StObject.set(x, "AppContainer", value.asInstanceOf[js.Any])
    
    inline def setAppContainerUndefined: Self = StObject.set(x, "AppContainer", js.undefined)
    
    inline def setLayersContainer(value: Override[Any]): Self = StObject.set(x, "LayersContainer", value.asInstanceOf[js.Any])
    
    inline def setLayersContainerUndefined: Self = StObject.set(x, "LayersContainer", js.undefined)
  }
}

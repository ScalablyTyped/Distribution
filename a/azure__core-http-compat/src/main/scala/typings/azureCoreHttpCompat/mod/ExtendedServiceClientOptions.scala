package typings.azureCoreHttpCompat.mod

import typings.azureCoreClient.mod.ServiceClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azureCoreHttpCompat.mod.ExtendedClientOptions because var conflicts: redirectOptions. Inlined keepAliveOptions */ trait ExtendedServiceClientOptions
  extends StObject
     with ServiceClientOptions {
  
  /**
    * Options to disable keep alive.
    */
  var keepAliveOptions: js.UndefOr[KeepAliveOptions] = js.undefined
}
object ExtendedServiceClientOptions {
  
  inline def apply(): ExtendedServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedServiceClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedServiceClientOptions] (val x: Self) extends AnyVal {
    
    inline def setKeepAliveOptions(value: KeepAliveOptions): Self = StObject.set(x, "keepAliveOptions", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveOptionsUndefined: Self = StObject.set(x, "keepAliveOptions", js.undefined)
  }
}

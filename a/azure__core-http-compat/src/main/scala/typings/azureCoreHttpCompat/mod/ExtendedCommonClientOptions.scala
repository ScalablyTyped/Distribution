package typings.azureCoreHttpCompat.mod

import typings.azureCoreClient.mod.CommonClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azureCoreHttpCompat.mod.ExtendedClientOptions because var conflicts: redirectOptions. Inlined keepAliveOptions */ trait ExtendedCommonClientOptions
  extends StObject
     with CommonClientOptions {
  
  /**
    * Options to disable keep alive.
    */
  var keepAliveOptions: js.UndefOr[KeepAliveOptions] = js.undefined
}
object ExtendedCommonClientOptions {
  
  inline def apply(): ExtendedCommonClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedCommonClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedCommonClientOptions] (val x: Self) extends AnyVal {
    
    inline def setKeepAliveOptions(value: KeepAliveOptions): Self = StObject.set(x, "keepAliveOptions", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveOptionsUndefined: Self = StObject.set(x, "keepAliveOptions", js.undefined)
  }
}

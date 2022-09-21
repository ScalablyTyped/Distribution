package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAcquisition
  extends StObject
     with /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  
  var disableFilenameBasedTypeAcquisition: js.UndefOr[Boolean] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated typingOptions.enableAutoDiscovery
    * Use typeAcquisition.enable instead.
    */
  var enableAutoDiscovery: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[Array[java.lang.String]] = js.undefined
  
  var include: js.UndefOr[Array[java.lang.String]] = js.undefined
}
object TypeAcquisition {
  
  inline def apply(): TypeAcquisition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeAcquisition]
  }
  
  extension [Self <: TypeAcquisition](x: Self) {
    
    inline def setDisableFilenameBasedTypeAcquisition(value: Boolean): Self = StObject.set(x, "disableFilenameBasedTypeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setDisableFilenameBasedTypeAcquisitionUndefined: Self = StObject.set(x, "disableFilenameBasedTypeAcquisition", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoDiscovery(value: Boolean): Self = StObject.set(x, "enableAutoDiscovery", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoDiscoveryUndefined: Self = StObject.set(x, "enableAutoDiscovery", js.undefined)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setExclude(value: Array[java.lang.String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setInclude(value: Array[java.lang.String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}

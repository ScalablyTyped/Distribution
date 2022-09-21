package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceConfiguration extends StObject {
  
  /**
    * Specifies how the results of an operation will be stored by the caller.  Valid values include:    SingleUse specifies that the results won't be stored.     Storage specifies that the result can be cached or stored in a database.   Default value: SingleUse 
    */
  var IntendedUse: js.UndefOr[typings.awsSdk.locationMod.IntendedUse] = js.undefined
}
object DataSourceConfiguration {
  
  inline def apply(): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfiguration]
  }
  
  extension [Self <: DataSourceConfiguration](x: Self) {
    
    inline def setIntendedUse(value: IntendedUse): Self = StObject.set(x, "IntendedUse", value.asInstanceOf[js.Any])
    
    inline def setIntendedUseUndefined: Self = StObject.set(x, "IntendedUse", js.undefined)
  }
}

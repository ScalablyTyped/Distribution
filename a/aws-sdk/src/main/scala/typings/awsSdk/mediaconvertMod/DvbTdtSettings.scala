package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbTdtSettings extends StObject {
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var TdtInterval: js.UndefOr[integerMin1000Max30000] = js.undefined
}
object DvbTdtSettings {
  
  inline def apply(): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbTdtSettings]
  }
  
  extension [Self <: DvbTdtSettings](x: Self) {
    
    inline def setTdtInterval(value: integerMin1000Max30000): Self = StObject.set(x, "TdtInterval", value.asInstanceOf[js.Any])
    
    inline def setTdtIntervalUndefined: Self = StObject.set(x, "TdtInterval", js.undefined)
  }
}

package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadBlobOptions
  extends StObject
     with GetBlobPropertiesOptions {
  
  var disableContentMD5Validation: js.UndefOr[Boolean] = js.undefined
  
  var rangeEnd: js.UndefOr[String] = js.undefined
  
  var rangeStart: js.UndefOr[String] = js.undefined
  
  var useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
}
object ReadBlobOptions {
  
  inline def apply(): ReadBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadBlobOptions]
  }
  
  extension [Self <: ReadBlobOptions](x: Self) {
    
    inline def setDisableContentMD5Validation(value: Boolean): Self = StObject.set(x, "disableContentMD5Validation", value.asInstanceOf[js.Any])
    
    inline def setDisableContentMD5ValidationUndefined: Self = StObject.set(x, "disableContentMD5Validation", js.undefined)
    
    inline def setRangeEnd(value: String): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: String): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    inline def setUseTransactionalMD5(value: Boolean): Self = StObject.set(x, "useTransactionalMD5", value.asInstanceOf[js.Any])
    
    inline def setUseTransactionalMD5Undefined: Self = StObject.set(x, "useTransactionalMD5", js.undefined)
  }
}

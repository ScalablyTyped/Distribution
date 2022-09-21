package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedFileFormatDescriptor extends StObject {
  
  /**
    * Details about a CSV format.
    */
  var CsvFormatDescriptor: js.UndefOr[DetectedCsvFormatDescriptor] = js.undefined
  
  /**
    * Details about a JSON format.
    */
  var JsonFormatDescriptor: js.UndefOr[DetectedJsonFormatDescriptor] = js.undefined
}
object DetectedFileFormatDescriptor {
  
  inline def apply(): DetectedFileFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedFileFormatDescriptor]
  }
  
  extension [Self <: DetectedFileFormatDescriptor](x: Self) {
    
    inline def setCsvFormatDescriptor(value: DetectedCsvFormatDescriptor): Self = StObject.set(x, "CsvFormatDescriptor", value.asInstanceOf[js.Any])
    
    inline def setCsvFormatDescriptorUndefined: Self = StObject.set(x, "CsvFormatDescriptor", js.undefined)
    
    inline def setJsonFormatDescriptor(value: DetectedJsonFormatDescriptor): Self = StObject.set(x, "JsonFormatDescriptor", value.asInstanceOf[js.Any])
    
    inline def setJsonFormatDescriptorUndefined: Self = StObject.set(x, "JsonFormatDescriptor", js.undefined)
  }
}

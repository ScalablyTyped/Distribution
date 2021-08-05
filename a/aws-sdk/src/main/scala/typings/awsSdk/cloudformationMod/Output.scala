package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * User defined description associated with the output.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * The name of the export associated with the output.
    */
  var ExportName: js.UndefOr[typings.awsSdk.cloudformationMod.ExportName] = js.undefined
  
  /**
    * The key associated with the output.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.cloudformationMod.OutputKey] = js.undefined
  
  /**
    * The value associated with the output.
    */
  var OutputValue: js.UndefOr[typings.awsSdk.cloudformationMod.OutputValue] = js.undefined
}
object Output {
  
  inline def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  
  extension [Self <: Output](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExportName(value: ExportName): Self = StObject.set(x, "ExportName", value.asInstanceOf[js.Any])
    
    inline def setExportNameUndefined: Self = StObject.set(x, "ExportName", js.undefined)
    
    inline def setOutputKey(value: OutputKey): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    inline def setOutputValue(value: OutputValue): Self = StObject.set(x, "OutputValue", value.asInstanceOf[js.Any])
    
    inline def setOutputValueUndefined: Self = StObject.set(x, "OutputValue", js.undefined)
  }
}

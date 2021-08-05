package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordOutput extends StObject {
  
  /**
    * The description of the output.
    */
  var Description: js.UndefOr[typings.awsSdk.servicecatalogMod.Description] = js.undefined
  
  /**
    * The output key.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.servicecatalogMod.OutputKey] = js.undefined
  
  /**
    * The output value.
    */
  var OutputValue: js.UndefOr[typings.awsSdk.servicecatalogMod.OutputValue] = js.undefined
}
object RecordOutput {
  
  inline def apply(): RecordOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOutput]
  }
  
  extension [Self <: RecordOutput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOutputKey(value: OutputKey): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    inline def setOutputValue(value: OutputValue): Self = StObject.set(x, "OutputValue", value.asInstanceOf[js.Any])
    
    inline def setOutputValueUndefined: Self = StObject.set(x, "OutputValue", js.undefined)
  }
}

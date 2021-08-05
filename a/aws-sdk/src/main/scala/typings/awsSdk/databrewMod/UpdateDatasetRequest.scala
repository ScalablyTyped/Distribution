package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetRequest extends StObject {
  
  var FormatOptions: js.UndefOr[typings.awsSdk.databrewMod.FormatOptions] = js.undefined
  
  var Input: typings.awsSdk.databrewMod.Input
  
  /**
    * The name of the dataset to be updated.
    */
  var Name: DatasetName
}
object UpdateDatasetRequest {
  
  inline def apply(Input: Input, Name: DatasetName): UpdateDatasetRequest = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetRequest]
  }
  
  extension [Self <: UpdateDatasetRequest](x: Self) {
    
    inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

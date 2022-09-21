package typings.azdata.mod.nb

import typings.azdata.azdataStrings.update_display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateDisplayData
  extends StObject
     with IDisplayResult
     with Output {
  
  @JSName("output_type")
  var output_type_IUpdateDisplayData: update_display_data
}
object IUpdateDisplayData {
  
  inline def apply(data: DisplayResultData): IUpdateDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = "update_display_data")
    __obj.asInstanceOf[IUpdateDisplayData]
  }
  
  extension [Self <: IUpdateDisplayData](x: Self) {
    
    inline def setOutput_type(value: update_display_data): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}

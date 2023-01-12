package typings.azdata.mod.nb

import typings.azdata.azdataStrings.display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisplayData
  extends StObject
     with IDisplayResult
     with Output {
  
  @JSName("output_type")
  var output_type_IDisplayData: display_data
}
object IDisplayData {
  
  inline def apply(data: DisplayResultData): IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = "display_data")
    __obj.asInstanceOf[IDisplayData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDisplayData] (val x: Self) extends AnyVal {
    
    inline def setOutput_type(value: display_data): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}

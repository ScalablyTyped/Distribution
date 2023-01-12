package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisplayResult
  extends StObject
     with ICellOutput {
  
  /**
    * The output data to display as a mapping object of mime type to contents
    */
  var data: DisplayResultData
}
object IDisplayResult {
  
  inline def apply(data: DisplayResultData, output_type: OutputTypeName): IDisplayResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDisplayResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: DisplayResultData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azdata.mod.nb.IDisplayData
  - typings.azdata.mod.nb.IUpdateDisplayData
  - typings.azdata.mod.nb.IExecuteResult
  - typings.azdata.mod.nb.IErrorResult
  - typings.azdata.mod.nb.IStreamResult
*/
trait Output extends StObject
object Output {
  
  inline def IDisplayData(data: DisplayResultData): typings.azdata.mod.nb.IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = "display_data")
    __obj.asInstanceOf[typings.azdata.mod.nb.IDisplayData]
  }
  
  inline def IErrorResult(ename: String, evalue: String): typings.azdata.mod.nb.IErrorResult = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = "error")
    __obj.asInstanceOf[typings.azdata.mod.nb.IErrorResult]
  }
  
  inline def IExecuteResult(data: DisplayResultData, execution_count: Double): typings.azdata.mod.nb.IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = "execute_result")
    __obj.asInstanceOf[typings.azdata.mod.nb.IExecuteResult]
  }
  
  inline def IStreamResult(name: StreamType, text: MultilineString): typings.azdata.mod.nb.IStreamResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = "stream", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azdata.mod.nb.IStreamResult]
  }
  
  inline def IUpdateDisplayData(data: DisplayResultData): typings.azdata.mod.nb.IUpdateDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = "update_display_data")
    __obj.asInstanceOf[typings.azdata.mod.nb.IUpdateDisplayData]
  }
}

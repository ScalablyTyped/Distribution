package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.display_data
import typings.azdata.azdataStrings.error
import typings.azdata.azdataStrings.execute_result
import typings.azdata.azdataStrings.stream
import typings.azdata.azdataStrings.update_display_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azdata.mod.nb.IDisplayData
  - typings.azdata.mod.nb.IUpdateDisplayData
  - typings.azdata.mod.nb.IExecuteResult
  - typings.azdata.mod.nb.IErrorResult
  - typings.azdata.mod.nb.IStreamResult
*/
trait Output extends js.Object
object Output {
  
  @scala.inline
  def IDisplayData(data: StringDictionary[js.Any], output_type: display_data): Output = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  def IStreamResult(name: StreamType, output_type: stream, text: MultilineString): Output = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  def IUpdateDisplayData(data: StringDictionary[js.Any], output_type: update_display_data): Output = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  def IExecuteResult(data: StringDictionary[js.Any], execution_count: Double, output_type: execute_result): Output = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  def IErrorResult(ename: String, evalue: String, output_type: error): Output = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

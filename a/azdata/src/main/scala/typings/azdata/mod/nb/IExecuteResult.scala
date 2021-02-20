package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.execute_result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteResult
  extends IDisplayResult
     with Output {
  
  /**
    * Number of times the cell was executed
    */
  var execution_count: Double = js.native
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IExecuteResult: execute_result = js.native
}
object IExecuteResult {
  
  @scala.inline
  def apply(data: StringDictionary[js.Any], execution_count: Double, output_type: execute_result): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResult]
  }
  
  @scala.inline
  implicit class IExecuteResultMutableBuilder[Self <: IExecuteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecution_count(value: Double): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: execute_result): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}

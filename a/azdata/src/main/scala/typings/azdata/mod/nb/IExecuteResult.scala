package typings.azdata.mod.nb

import typings.azdata.azdataStrings.execute_result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteResult
  extends StObject
     with IDisplayResult
     with Output {
  
  /**
    * Number of times the cell was executed
    */
  var execution_count: Double
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IExecuteResult: execute_result
}
object IExecuteResult {
  
  inline def apply(data: DisplayResultData, execution_count: Double): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = "execute_result")
    __obj.asInstanceOf[IExecuteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExecuteResult] (val x: Self) extends AnyVal {
    
    inline def setExecution_count(value: Double): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setOutput_type(value: execute_result): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}

package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.execute_result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IExecuteResultOps[Self <: IExecuteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecution_count(value: Double): Self = this.set("execution_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput_type(value: execute_result): Self = this.set("output_type", value.asInstanceOf[js.Any])
  }
  
}


package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.execute_result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteResult
  extends IDisplayResult
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
  @scala.inline
  def apply(
    data: StringDictionary[js.Any],
    execution_count: Double,
    output_type: execute_result,
    metadata: js.Object = null
  ): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResult]
  }
}


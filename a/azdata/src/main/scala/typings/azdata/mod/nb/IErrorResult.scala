package typings.azdata.mod.nb

import typings.azdata.azdataStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorResult
  extends ICellOutput
     with Output {
  /**
    * Exception name
    */
  var ename: String
  /**
    * Exception value
    */
  var evalue: String
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IErrorResult: error
  /**
    * Stacktrace equivalent
    */
  var traceback: js.UndefOr[js.Array[String]] = js.undefined
}

object IErrorResult {
  @scala.inline
  def apply(ename: String, evalue: String, output_type: error, traceback: js.Array[String] = null): IErrorResult = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    if (traceback != null) __obj.updateDynamic("traceback")(traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorResult]
  }
}


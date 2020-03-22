package typings.azdata.mod.nb

import typings.azdata.azdataStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamResult
  extends ICellOutput
     with Output {
  /**
  			 * Stream output field defining the stream name, for example stdout
  			 */
  var name: StreamType
  @JSName("output_type")
  var output_type_IStreamResult: stream
  /**
  			 * Stream output field defining the multiline stream text
  			 */
  var text: MultilineString
}

object IStreamResult {
  @scala.inline
  def apply(name: StreamType, output_type: stream, text: MultilineString): IStreamResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStreamResult]
  }
}


package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayResult extends ICellOutput {
  /**
  			 * Mime bundle expected to contain mime type -> contents mappings.
  			 * This is dynamic and is controlled by kernels, so cannot be more specific
  			 */
  var data: StringDictionary[js.Any]
  /**
  			 * Optional metadata, also a mime bundle
  			 */
  var metadata: js.UndefOr[js.Object] = js.undefined
}

object IDisplayResult {
  @scala.inline
  def apply(data: StringDictionary[js.Any], output_type: OutputTypeName, metadata: js.Object = null): IDisplayResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayResult]
  }
}


package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.display_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayData
  extends IDisplayResult
     with Output {
  @JSName("output_type")
  var output_type_IDisplayData: display_data
}

object IDisplayData {
  @scala.inline
  def apply(data: StringDictionary[js.Any], output_type: display_data, metadata: js.Object = null): IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayData]
  }
}


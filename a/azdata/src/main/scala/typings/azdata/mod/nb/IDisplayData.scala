package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.display_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayData
  extends IDisplayResult
     with Output {
  @JSName("output_type")
  var output_type_IDisplayData: display_data = js.native
}

object IDisplayData {
  @scala.inline
  def apply(data: StringDictionary[js.Any], output_type: display_data): IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayData]
  }
  @scala.inline
  implicit class IDisplayDataOps[Self <: IDisplayData] (val x: Self) extends AnyVal {
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
    def setOutput_type(value: display_data): Self = this.set("output_type", value.asInstanceOf[js.Any])
  }
  
}


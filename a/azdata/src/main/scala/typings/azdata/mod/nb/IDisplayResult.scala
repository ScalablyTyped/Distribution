package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayResult extends ICellOutput {
  /**
    * Mime bundle expected to contain mime type -> contents mappings.
    * This is dynamic and is controlled by kernels, so cannot be more specific
    */
  var data: StringDictionary[js.Any] = js.native
  /**
    * Optional metadata, also a mime bundle
    */
  var metadata: js.UndefOr[js.Object] = js.native
}

object IDisplayResult {
  @scala.inline
  def apply(data: StringDictionary[js.Any], output_type: OutputTypeName): IDisplayResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayResult]
  }
  @scala.inline
  implicit class IDisplayResultOps[Self <: IDisplayResult] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


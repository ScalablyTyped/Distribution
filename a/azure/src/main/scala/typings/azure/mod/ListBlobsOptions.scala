package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBlobsOptions extends ListContainersOptions {
  var delimiter: js.UndefOr[String] = js.native
}

object ListBlobsOptions {
  @scala.inline
  def apply(marker: String): ListBlobsOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBlobsOptions]
  }
  @scala.inline
  implicit class ListBlobsOptionsOps[Self <: ListBlobsOptions] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
  }
  
}


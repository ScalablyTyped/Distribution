package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportBlobOptions extends ExportOptions {
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[blob] = js.native
}

object ExportBlobOptions {
  @scala.inline
  def apply(): ExportBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBlobOptions]
  }
  @scala.inline
  implicit class ExportBlobOptionsOps[Self <: ExportBlobOptions] (val x: Self) extends AnyVal {
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
    def setOutput(value: blob): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
  
}


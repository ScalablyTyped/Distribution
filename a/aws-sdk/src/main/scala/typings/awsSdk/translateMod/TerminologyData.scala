package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminologyData extends js.Object {
  /**
    * The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on this field before sending a request to the AWS service. Users of the SDK should not perform Base64-encoding themselves.
    */
  var File: TerminologyFile = js.native
  /**
    * The data format of the custom terminology. Either CSV or TMX.
    */
  var Format: TerminologyDataFormat = js.native
}

object TerminologyData {
  @scala.inline
  def apply(File: TerminologyFile, Format: TerminologyDataFormat): TerminologyData = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyData]
  }
  @scala.inline
  implicit class TerminologyDataOps[Self <: TerminologyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFile(value: TerminologyFile): Self = this.set("File", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: TerminologyDataFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
  }
  
}


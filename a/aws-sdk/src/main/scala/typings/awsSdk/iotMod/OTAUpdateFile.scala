package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OTAUpdateFile extends js.Object {
  /**
    * A list of name/attribute pairs.
    */
  var attributes: js.UndefOr[AttributesMap] = js.native
  /**
    * The code signing method of the file.
    */
  var codeSigning: js.UndefOr[CodeSigning] = js.native
  /**
    * The location of the updated firmware.
    */
  var fileLocation: js.UndefOr[FileLocation] = js.native
  /**
    * The name of the file.
    */
  var fileName: js.UndefOr[FileName] = js.native
  /**
    * The file version.
    */
  var fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.native
}

object OTAUpdateFile {
  @scala.inline
  def apply(): OTAUpdateFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateFile]
  }
  @scala.inline
  implicit class OTAUpdateFileOps[Self <: OTAUpdateFile] (val x: Self) extends AnyVal {
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
    def setAttributes(value: AttributesMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCodeSigning(value: CodeSigning): Self = this.set("codeSigning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSigning: Self = this.set("codeSigning", js.undefined)
    @scala.inline
    def setFileLocation(value: FileLocation): Self = this.set("fileLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileLocation: Self = this.set("fileLocation", js.undefined)
    @scala.inline
    def setFileName(value: FileName): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFileVersion(value: OTAUpdateFileVersion): Self = this.set("fileVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileVersion: Self = this.set("fileVersion", js.undefined)
  }
  
}


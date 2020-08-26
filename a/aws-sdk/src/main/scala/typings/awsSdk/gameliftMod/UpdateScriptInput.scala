package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScriptInput extends js.Object {
  /**
    * A descriptive label that is associated with a script. Script names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a Realtime script to update. You can use either the script ID or ARN value.
    */
  var ScriptId: ScriptIdOrArn = js.native
  /**
    * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on, you can use the ObjectVersion parameter to specify an earlier version. 
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  /**
    * The version that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or multiple files. Maximum size of a zip file is 5 MB. When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended with the string "fileb://" to indicate that the file data is a binary object. For example: --zip-file fileb://myRealtimeScript.zip.
    */
  var ZipFile: js.UndefOr[ZipBlob] = js.native
}

object UpdateScriptInput {
  @scala.inline
  def apply(ScriptId: ScriptIdOrArn): UpdateScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScriptInput]
  }
  @scala.inline
  implicit class UpdateScriptInputOps[Self <: UpdateScriptInput] (val x: Self) extends AnyVal {
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
    def setScriptId(value: ScriptIdOrArn): Self = this.set("ScriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStorageLocation(value: S3Location): Self = this.set("StorageLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageLocation: Self = this.set("StorageLocation", js.undefined)
    @scala.inline
    def setVersion(value: NonZeroAndMaxString): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    @scala.inline
    def setZipFile(value: ZipBlob): Self = this.set("ZipFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipFile: Self = this.set("ZipFile", js.undefined)
  }
  
}


package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScriptOutput extends js.Object {
  /**
    * The newly created script record with a unique script ID and ARN. The new script's storage location reflects an Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the information that was provided in the CreateScript request; (2) If the script file was uploaded from a local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
    */
  var Script: js.UndefOr[typings.awsSdk.gameliftMod.Script] = js.native
}

object CreateScriptOutput {
  @scala.inline
  def apply(): CreateScriptOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptOutput]
  }
  @scala.inline
  implicit class CreateScriptOutputOps[Self <: CreateScriptOutput] (val x: Self) extends AnyVal {
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
    def setScript(value: Script): Self = this.set("Script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("Script", js.undefined)
  }
  
}


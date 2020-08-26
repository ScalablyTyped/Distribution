package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCommand extends js.Object {
  /**
    * The name of the job command. For an Apache Spark ETL job, this must be glueetl. For a Python shell job, it must be pythonshell. For an Apache Spark streaming ETL job, this must be gluestreaming.
    */
  var Name: js.UndefOr[GenericString] = js.native
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var PythonVersion: js.UndefOr[PythonVersionString] = js.native
  /**
    * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
    */
  var ScriptLocation: js.UndefOr[ScriptLocationString] = js.native
}

object JobCommand {
  @scala.inline
  def apply(): JobCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobCommand]
  }
  @scala.inline
  implicit class JobCommandOps[Self <: JobCommand] (val x: Self) extends AnyVal {
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
    def setName(value: GenericString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPythonVersion(value: PythonVersionString): Self = this.set("PythonVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePythonVersion: Self = this.set("PythonVersion", js.undefined)
    @scala.inline
    def setScriptLocation(value: ScriptLocationString): Self = this.set("ScriptLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptLocation: Self = this.set("ScriptLocation", js.undefined)
  }
  
}


package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlanResponse extends js.Object {
  /**
    * A Python script to perform the mapping.
    */
  var PythonScript: js.UndefOr[typings.awsSdk.glueMod.PythonScript] = js.native
  /**
    * The Scala code to perform the mapping.
    */
  var ScalaCode: js.UndefOr[typings.awsSdk.glueMod.ScalaCode] = js.native
}

object GetPlanResponse {
  @scala.inline
  def apply(): GetPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlanResponse]
  }
  @scala.inline
  implicit class GetPlanResponseOps[Self <: GetPlanResponse] (val x: Self) extends AnyVal {
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
    def setPythonScript(value: PythonScript): Self = this.set("PythonScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePythonScript: Self = this.set("PythonScript", js.undefined)
    @scala.inline
    def setScalaCode(value: ScalaCode): Self = this.set("ScalaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalaCode: Self = this.set("ScalaCode", js.undefined)
  }
  
}


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
  def apply(PythonScript: PythonScript = null, ScalaCode: ScalaCode = null): GetPlanResponse = {
    val __obj = js.Dynamic.literal()
    if (PythonScript != null) __obj.updateDynamic("PythonScript")(PythonScript.asInstanceOf[js.Any])
    if (ScalaCode != null) __obj.updateDynamic("ScalaCode")(ScalaCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlanResponse]
  }
}


package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepConfig extends js.Object {
  /**
    * The action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is provided for backward compatibility. We recommend using TERMINATE_CLUSTER instead.
    */
  var ActionOnFailure: js.UndefOr[typings.awsSdk.emrMod.ActionOnFailure] = js.native
  /**
    * The JAR file used for the step.
    */
  var HadoopJarStep: HadoopJarStepConfig = js.native
  /**
    * The name of the step.
    */
  var Name: XmlStringMaxLen256 = js.native
}

object StepConfig {
  @scala.inline
  def apply(
    HadoopJarStep: HadoopJarStepConfig,
    Name: XmlStringMaxLen256,
    ActionOnFailure: ActionOnFailure = null
  ): StepConfig = {
    val __obj = js.Dynamic.literal(HadoopJarStep = HadoopJarStep.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (ActionOnFailure != null) __obj.updateDynamic("ActionOnFailure")(ActionOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepConfig]
  }
}


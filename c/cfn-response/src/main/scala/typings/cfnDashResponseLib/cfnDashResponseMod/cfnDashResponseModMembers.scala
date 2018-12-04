package typings
package cfnDashResponseLib.cfnDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cfn-response", JSImport.Namespace)
@js.native
object cfnDashResponseModMembers extends js.Object {
  val FAILED: ResponseStatus = js.native
  val SUCCESS: ResponseStatus = js.native
  def send(
    event: awsDashLambdaLib.awsDashLambdaMod.CloudFormationCustomResourceEvent,
    context: awsDashLambdaLib.awsDashLambdaMod.Context,
    responseStatus: ResponseStatus
  ): scala.Unit = js.native
  def send(
    event: awsDashLambdaLib.awsDashLambdaMod.CloudFormationCustomResourceEvent,
    context: awsDashLambdaLib.awsDashLambdaMod.Context,
    responseStatus: ResponseStatus,
    responseData: js.Object
  ): scala.Unit = js.native
  def send(
    event: awsDashLambdaLib.awsDashLambdaMod.CloudFormationCustomResourceEvent,
    context: awsDashLambdaLib.awsDashLambdaMod.Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: java.lang.String
  ): scala.Unit = js.native
}


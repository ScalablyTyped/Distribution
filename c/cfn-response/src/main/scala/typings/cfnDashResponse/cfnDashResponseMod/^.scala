package typings.cfnDashResponse.cfnDashResponseMod

import typings.awsDashLambda.awsDashLambdaMod.CloudFormationCustomResourceEvent
import typings.awsDashLambda.awsDashLambdaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cfn-response", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FAILED: ResponseStatus = js.native
  val SUCCESS: ResponseStatus = js.native
  def send(event: CloudFormationCustomResourceEvent, context: Context, responseStatus: ResponseStatus): Unit = js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object
  ): Unit = js.native
  def send(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String
  ): Unit = js.native
}


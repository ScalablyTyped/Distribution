package typings.cfnDashResponse

import typings.awsDashLambda.awsDashLambdaMod.CloudFormationCustomResourceEvent
import typings.awsDashLambda.awsDashLambdaMod.Context
import typings.cfnDashResponse.cfnDashResponseMod.ResponseStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cfn-response", JSImport.Namespace)
@js.native
object cfnDashResponseMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.cfnDashResponse.cfnDashResponseStrings.SUCCESS
    - typings.cfnDashResponse.cfnDashResponseStrings.FAILED
  */
  trait ResponseStatus extends js.Object
  
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


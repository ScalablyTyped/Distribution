package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECSService extends js.Object {
  /**
    *  The name of the cluster that the Amazon ECS service is associated with. 
    */
  var clusterName: js.UndefOr[ECSClusterName] = js.native
  /**
    *  The name of the target Amazon ECS service. 
    */
  var serviceName: js.UndefOr[ECSServiceName] = js.native
}

object ECSService {
  @scala.inline
  def apply(clusterName: ECSClusterName = null, serviceName: ECSServiceName = null): ECSService = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECSService]
  }
}


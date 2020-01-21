package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectInformationRequest extends js.Object {
  /**
    * The consistency level at which to retrieve the object information.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The ARN of the directory being retrieved.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A reference to the object.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object GetObjectInformationRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, ConsistencyLevel: ConsistencyLevel = null): GetObjectInformationRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectInformationRequest]
  }
}


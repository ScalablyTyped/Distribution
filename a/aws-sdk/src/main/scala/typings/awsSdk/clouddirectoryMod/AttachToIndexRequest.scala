package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachToIndexRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory where the object and index exist.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A reference to the index that you are attaching the object to.
    */
  var IndexReference: ObjectReference = js.native
  /**
    * A reference to the object that you are attaching to the index.
    */
  var TargetReference: ObjectReference = js.native
}

object AttachToIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference, TargetReference: ObjectReference): AttachToIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToIndexRequest]
  }
}


package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachFromIndexRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory the index and object exist in.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A reference to the index object.
    */
  var IndexReference: ObjectReference = js.native
  /**
    * A reference to the object being detached from the index.
    */
  var TargetReference: ObjectReference = js.native
}

object DetachFromIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference, TargetReference: ObjectReference): DetachFromIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachFromIndexRequest]
  }
}


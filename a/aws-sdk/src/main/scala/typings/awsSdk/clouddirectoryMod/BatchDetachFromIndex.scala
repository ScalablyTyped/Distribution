package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachFromIndex extends js.Object {
  /**
    * A reference to the index object.
    */
  var IndexReference: ObjectReference = js.native
  /**
    * A reference to the object being detached from the index.
    */
  var TargetReference: ObjectReference = js.native
}

object BatchDetachFromIndex {
  @scala.inline
  def apply(IndexReference: ObjectReference, TargetReference: ObjectReference): BatchDetachFromIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachFromIndex]
  }
}


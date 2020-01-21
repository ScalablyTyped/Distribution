package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexAttachment extends js.Object {
  /**
    * The indexed attribute values.
    */
  var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * In response to ListIndex, the ObjectIdentifier of the object attached to the index. In response to ListAttachedIndices, the ObjectIdentifier of the index attached to the object. This field will always contain the ObjectIdentifier of the object on the opposite side of the attachment specified in the query.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object IndexAttachment {
  @scala.inline
  def apply(IndexedAttributes: AttributeKeyAndValueList = null, ObjectIdentifier: ObjectIdentifier = null): IndexAttachment = {
    val __obj = js.Dynamic.literal()
    if (IndexedAttributes != null) __obj.updateDynamic("IndexedAttributes")(IndexedAttributes.asInstanceOf[js.Any])
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexAttachment]
  }
}


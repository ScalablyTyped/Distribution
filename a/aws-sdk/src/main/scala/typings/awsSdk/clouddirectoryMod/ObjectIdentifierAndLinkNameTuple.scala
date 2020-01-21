package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdentifierAndLinkNameTuple extends js.Object {
  /**
    * The name of the link between the parent and the child object.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clouddirectoryMod.LinkName] = js.native
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object ObjectIdentifierAndLinkNameTuple {
  @scala.inline
  def apply(LinkName: LinkName = null, ObjectIdentifier: ObjectIdentifier = null): ObjectIdentifierAndLinkNameTuple = {
    val __obj = js.Dynamic.literal()
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName.asInstanceOf[js.Any])
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifierAndLinkNameTuple]
  }
}


package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedResourceListMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of tags with their associated resources.
    */
  var TaggedResources: js.UndefOr[TaggedResourceList] = js.native
}

object TaggedResourceListMessage {
  @scala.inline
  def apply(): TaggedResourceListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedResourceListMessage]
  }
  @scala.inline
  implicit class TaggedResourceListMessageOps[Self <: TaggedResourceListMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setTaggedResourcesVarargs(value: TaggedResource*): Self = this.set("TaggedResources", js.Array(value :_*))
    @scala.inline
    def setTaggedResources(value: TaggedResourceList): Self = this.set("TaggedResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaggedResources: Self = this.set("TaggedResources", js.undefined)
  }
  
}


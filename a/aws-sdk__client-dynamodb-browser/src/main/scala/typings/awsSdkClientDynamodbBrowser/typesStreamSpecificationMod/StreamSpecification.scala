package typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KEYS_ONLY
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NEW_AND_OLD_IMAGES
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NEW_IMAGE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.OLD_IMAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSpecification extends js.Object {
  /**
    * <p>Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.</p>
    */
  var StreamEnabled: js.UndefOr[Boolean] = js.native
  /**
    * <p> When an item in the table is modified, <code>StreamViewType</code> determines what information is written to the stream for this table. Valid values for <code>StreamViewType</code> are:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the key attributes of the modified item are written to the stream.</p> </li> <li> <p> <code>NEW_IMAGE</code> - The entire item, as it appears after it was modified, is written to the stream.</p> </li> <li> <p> <code>OLD_IMAGE</code> - The entire item, as it appeared before it was modified, is written to the stream.</p> </li> <li> <p> <code>NEW_AND_OLD_IMAGES</code> - Both the new and the old item images of the item are written to the stream.</p> </li> </ul>
    */
  var StreamViewType: js.UndefOr[NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES | KEYS_ONLY | String] = js.native
}

object StreamSpecification {
  @scala.inline
  def apply(): StreamSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSpecification]
  }
  @scala.inline
  implicit class StreamSpecificationOps[Self <: StreamSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStreamEnabled(value: Boolean): Self = this.set("StreamEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamEnabled: Self = this.set("StreamEnabled", js.undefined)
    @scala.inline
    def setStreamViewType(value: NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES | KEYS_ONLY | String): Self = this.set("StreamViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamViewType: Self = this.set("StreamViewType", js.undefined)
  }
  
}


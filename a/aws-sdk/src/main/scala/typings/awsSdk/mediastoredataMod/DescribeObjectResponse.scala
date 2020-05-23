package typings.awsSdk.mediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObjectResponse extends js.Object {
  /**
    * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
    */
  var CacheControl: js.UndefOr[StringPrimitive] = js.native
  /**
    * The length of the object in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.native
  /**
    * The content type of the object.
    */
  var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.native
  /**
    * The ETag that represents a unique instance of the object.
    */
  var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.native
  /**
    * The date and time that the object was last modified.
    */
  var LastModified: js.UndefOr[TimeStamp] = js.native
}

object DescribeObjectResponse {
  @scala.inline
  def apply(
    CacheControl: StringPrimitive = null,
    ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
    ContentType: ContentType = null,
    ETag: ETag = null,
    LastModified: TimeStamp = null
  ): DescribeObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl.asInstanceOf[js.Any])
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength.get.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectResponse]
  }
}


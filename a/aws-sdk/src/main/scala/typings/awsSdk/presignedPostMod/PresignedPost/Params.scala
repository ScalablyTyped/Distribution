package typings.awsSdk.presignedPostMod.PresignedPost

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  /**
    * The S3 bucket to which the form should upload an attached file.
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * An array of conditions that must be met for the form upload to be
    * accepted by S3.
    */
  var Conditions: js.UndefOr[js.Array[StringDictionary[_] | (js.Tuple3[String, _, _])]] = js.native
  /**
    * The number of seconds for which the POST form's signed policy should be
    * valid. Defaults to 3600 (one hour).
    */
  var Expires: js.UndefOr[Double] = js.native
  /**
    * A hash of form fields to include in the presigned POST form. All fields
    * (except 'key') will be included as exact match conditions in the
    * presigned policy.
    */
  var Fields: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Params {
  @scala.inline
  def apply(
    Bucket: String = null,
    Conditions: js.Array[StringDictionary[_] | (js.Tuple3[String, _, _])] = null,
    Expires: Int | Double = null,
    Fields: StringDictionary[js.Any] = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Conditions != null) __obj.updateDynamic("Conditions")(Conditions.asInstanceOf[js.Any])
    if (Expires != null) __obj.updateDynamic("Expires")(Expires.asInstanceOf[js.Any])
    if (Fields != null) __obj.updateDynamic("Fields")(Fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}


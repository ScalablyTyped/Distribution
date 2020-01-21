package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionConfig extends js.Object {
  /**
    * A unique number that ensures the request can't be replayed.
    */
  var CallerReference: String = js.native
  /**
    * An optional comment about the configuration.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
    */
  var ContentTypeProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.ContentTypeProfileConfig] = js.native
  /**
    * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
    */
  var QueryArgProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.QueryArgProfileConfig] = js.native
}

object FieldLevelEncryptionConfig {
  @scala.inline
  def apply(
    CallerReference: String,
    Comment: String = null,
    ContentTypeProfileConfig: ContentTypeProfileConfig = null,
    QueryArgProfileConfig: QueryArgProfileConfig = null
  ): FieldLevelEncryptionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (ContentTypeProfileConfig != null) __obj.updateDynamic("ContentTypeProfileConfig")(ContentTypeProfileConfig.asInstanceOf[js.Any])
    if (QueryArgProfileConfig != null) __obj.updateDynamic("QueryArgProfileConfig")(QueryArgProfileConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionConfig]
  }
}


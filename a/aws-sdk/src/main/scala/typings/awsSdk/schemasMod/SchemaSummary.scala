package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSummary extends js.Object {
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[timestampIso8601] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  /**
    * Tags associated with the schema.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
  /**
    * The number of versions available for the schema.
    */
  var VersionCount: js.UndefOr[long] = js.native
}

object SchemaSummary {
  @scala.inline
  def apply(
    LastModified: timestampIso8601 = null,
    SchemaArn: string = null,
    SchemaName: string = null,
    Tags: Tags = null,
    VersionCount: Int | Double = null
  ): SchemaSummary = {
    val __obj = js.Dynamic.literal()
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VersionCount != null) __obj.updateDynamic("VersionCount")(VersionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSummary]
  }
}


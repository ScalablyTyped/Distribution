package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupDescription extends js.Object {
  /**
    * Contains the details of the backup created for the table. 
    */
  var BackupDetails: js.UndefOr[typings.awsSdk.dynamodbMod.BackupDetails] = js.native
  /**
    * Contains the details of the table when the backup was created. 
    */
  var SourceTableDetails: js.UndefOr[typings.awsSdk.dynamodbMod.SourceTableDetails] = js.native
  /**
    * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
    */
  var SourceTableFeatureDetails: js.UndefOr[typings.awsSdk.dynamodbMod.SourceTableFeatureDetails] = js.native
}

object BackupDescription {
  @scala.inline
  def apply(
    BackupDetails: BackupDetails = null,
    SourceTableDetails: SourceTableDetails = null,
    SourceTableFeatureDetails: SourceTableFeatureDetails = null
  ): BackupDescription = {
    val __obj = js.Dynamic.literal()
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails.asInstanceOf[js.Any])
    if (SourceTableDetails != null) __obj.updateDynamic("SourceTableDetails")(SourceTableDetails.asInstanceOf[js.Any])
    if (SourceTableFeatureDetails != null) __obj.updateDynamic("SourceTableFeatureDetails")(SourceTableFeatureDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupDescription]
  }
}


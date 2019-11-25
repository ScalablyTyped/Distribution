package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreBackupDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreBackupDetailsMod._BackupDetails
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSourceTableDetailsMod._SourceTableDetails
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSourceTableFeatureDetailsMod._SourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BackupDescription extends js.Object {
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  var BackupDetails: js.UndefOr[_BackupDetails] = js.undefined
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  var SourceTableDetails: js.UndefOr[_SourceTableDetails] = js.undefined
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  var SourceTableFeatureDetails: js.UndefOr[_SourceTableFeatureDetails] = js.undefined
}

object _BackupDescription {
  @scala.inline
  def apply(
    BackupDetails: _BackupDetails = null,
    SourceTableDetails: _SourceTableDetails = null,
    SourceTableFeatureDetails: _SourceTableFeatureDetails = null
  ): _BackupDescription = {
    val __obj = js.Dynamic.literal()
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails.asInstanceOf[js.Any])
    if (SourceTableDetails != null) __obj.updateDynamic("SourceTableDetails")(SourceTableDetails.asInstanceOf[js.Any])
    if (SourceTableFeatureDetails != null) __obj.updateDynamic("SourceTableFeatureDetails")(SourceTableFeatureDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BackupDescription]
  }
}


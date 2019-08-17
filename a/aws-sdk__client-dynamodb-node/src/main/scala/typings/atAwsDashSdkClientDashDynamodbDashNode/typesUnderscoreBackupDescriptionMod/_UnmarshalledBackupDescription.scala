package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreBackupDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreBackupDetailsMod._UnmarshalledBackupDetails
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSourceTableDetailsMod._UnmarshalledSourceTableDetails
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSourceTableFeatureDetailsMod._UnmarshalledSourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledBackupDescription extends _BackupDescription {
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  @JSName("BackupDetails")
  var BackupDetails__UnmarshalledBackupDescription: js.UndefOr[_UnmarshalledBackupDetails] = js.undefined
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  @JSName("SourceTableDetails")
  var SourceTableDetails__UnmarshalledBackupDescription: js.UndefOr[_UnmarshalledSourceTableDetails] = js.undefined
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  @JSName("SourceTableFeatureDetails")
  var SourceTableFeatureDetails__UnmarshalledBackupDescription: js.UndefOr[_UnmarshalledSourceTableFeatureDetails] = js.undefined
}

object _UnmarshalledBackupDescription {
  @scala.inline
  def apply(
    BackupDetails: _UnmarshalledBackupDetails = null,
    SourceTableDetails: _UnmarshalledSourceTableDetails = null,
    SourceTableFeatureDetails: _UnmarshalledSourceTableFeatureDetails = null
  ): _UnmarshalledBackupDescription = {
    val __obj = js.Dynamic.literal()
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails)
    if (SourceTableDetails != null) __obj.updateDynamic("SourceTableDetails")(SourceTableDetails)
    if (SourceTableFeatureDetails != null) __obj.updateDynamic("SourceTableFeatureDetails")(SourceTableFeatureDetails)
    __obj.asInstanceOf[_UnmarshalledBackupDescription]
  }
}


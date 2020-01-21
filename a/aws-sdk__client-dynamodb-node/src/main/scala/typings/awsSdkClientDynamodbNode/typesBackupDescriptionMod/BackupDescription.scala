package typings.awsSdkClientDynamodbNode.typesBackupDescriptionMod

import typings.awsSdkClientDynamodbNode.typesBackupDetailsMod.BackupDetails
import typings.awsSdkClientDynamodbNode.typesSourceTableDetailsMod.SourceTableDetails
import typings.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupDescription extends js.Object {
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  var BackupDetails: js.UndefOr[typings.awsSdkClientDynamodbNode.typesBackupDetailsMod.BackupDetails] = js.undefined
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  var SourceTableDetails: js.UndefOr[typings.awsSdkClientDynamodbNode.typesSourceTableDetailsMod.SourceTableDetails] = js.undefined
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  var SourceTableFeatureDetails: js.UndefOr[
    typings.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
  ] = js.undefined
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


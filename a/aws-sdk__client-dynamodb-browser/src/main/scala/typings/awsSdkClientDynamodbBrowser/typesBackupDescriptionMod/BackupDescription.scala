package typings.awsSdkClientDynamodbBrowser.typesBackupDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.BackupDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.SourceTableDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupDescription extends js.Object {
  
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  var BackupDetails: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.BackupDetails] = js.native
  
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  var SourceTableDetails: js.UndefOr[
    typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.SourceTableDetails
  ] = js.native
  
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  var SourceTableFeatureDetails: js.UndefOr[
    typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
  ] = js.native
}
object BackupDescription {
  
  @scala.inline
  def apply(): BackupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupDescription]
  }
  
  @scala.inline
  implicit class BackupDescriptionOps[Self <: BackupDescription] (val x: Self) extends AnyVal {
    
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
    def setBackupDetails(value: BackupDetails): Self = this.set("BackupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupDetails: Self = this.set("BackupDetails", js.undefined)
    
    @scala.inline
    def setSourceTableDetails(value: SourceTableDetails): Self = this.set("SourceTableDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableDetails: Self = this.set("SourceTableDetails", js.undefined)
    
    @scala.inline
    def setSourceTableFeatureDetails(value: SourceTableFeatureDetails): Self = this.set("SourceTableFeatureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableFeatureDetails: Self = this.set("SourceTableFeatureDetails", js.undefined)
  }
}

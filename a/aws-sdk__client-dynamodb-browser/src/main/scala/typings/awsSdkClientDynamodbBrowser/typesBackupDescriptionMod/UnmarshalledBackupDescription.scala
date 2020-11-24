package typings.awsSdkClientDynamodbBrowser.typesBackupDescriptionMod

import typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.UnmarshalledSourceTableDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.UnmarshalledSourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledBackupDescription extends BackupDescription {
  
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  @JSName("BackupDetails")
  var BackupDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledBackupDetails] = js.native
  
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  @JSName("SourceTableDetails")
  var SourceTableDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableDetails] = js.native
  
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  @JSName("SourceTableFeatureDetails")
  var SourceTableFeatureDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableFeatureDetails] = js.native
}
object UnmarshalledBackupDescription {
  
  @scala.inline
  def apply(): UnmarshalledBackupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledBackupDescription]
  }
  
  @scala.inline
  implicit class UnmarshalledBackupDescriptionOps[Self <: UnmarshalledBackupDescription] (val x: Self) extends AnyVal {
    
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
    def setBackupDetails(value: UnmarshalledBackupDetails): Self = this.set("BackupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupDetails: Self = this.set("BackupDetails", js.undefined)
    
    @scala.inline
    def setSourceTableDetails(value: UnmarshalledSourceTableDetails): Self = this.set("SourceTableDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableDetails: Self = this.set("SourceTableDetails", js.undefined)
    
    @scala.inline
    def setSourceTableFeatureDetails(value: UnmarshalledSourceTableFeatureDetails): Self = this.set("SourceTableFeatureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableFeatureDetails: Self = this.set("SourceTableFeatureDetails", js.undefined)
  }
}

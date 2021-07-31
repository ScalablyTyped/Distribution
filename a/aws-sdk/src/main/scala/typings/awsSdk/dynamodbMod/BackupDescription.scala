package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupDescription extends StObject {
  
  /**
    * Contains the details of the backup created for the table. 
    */
  var BackupDetails: js.UndefOr[typings.awsSdk.dynamodbMod.BackupDetails] = js.undefined
  
  /**
    * Contains the details of the table when the backup was created. 
    */
  var SourceTableDetails: js.UndefOr[typings.awsSdk.dynamodbMod.SourceTableDetails] = js.undefined
  
  /**
    * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
    */
  var SourceTableFeatureDetails: js.UndefOr[typings.awsSdk.dynamodbMod.SourceTableFeatureDetails] = js.undefined
}
object BackupDescription {
  
  @scala.inline
  def apply(): BackupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupDescription]
  }
  
  @scala.inline
  implicit class BackupDescriptionMutableBuilder[Self <: BackupDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
    
    @scala.inline
    def setSourceTableDetails(value: SourceTableDetails): Self = StObject.set(x, "SourceTableDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableDetailsUndefined: Self = StObject.set(x, "SourceTableDetails", js.undefined)
    
    @scala.inline
    def setSourceTableFeatureDetails(value: SourceTableFeatureDetails): Self = StObject.set(x, "SourceTableFeatureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableFeatureDetailsUndefined: Self = StObject.set(x, "SourceTableFeatureDetails", js.undefined)
  }
}

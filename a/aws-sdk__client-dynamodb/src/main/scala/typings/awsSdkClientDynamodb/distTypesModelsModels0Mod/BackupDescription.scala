package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupDescription extends StObject {
  
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  var BackupDetails: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BackupDetails] = js.undefined
  
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  var SourceTableDetails: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SourceTableDetails] = js.undefined
  
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created.
    *             For example, LSIs, GSIs, streams, TTL.</p>
    */
  var SourceTableFeatureDetails: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SourceTableFeatureDetails] = js.undefined
}
object BackupDescription {
  
  inline def apply(): BackupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupDescription] (val x: Self) extends AnyVal {
    
    inline def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
    
    inline def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
    
    inline def setSourceTableDetails(value: SourceTableDetails): Self = StObject.set(x, "SourceTableDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceTableDetailsUndefined: Self = StObject.set(x, "SourceTableDetails", js.undefined)
    
    inline def setSourceTableFeatureDetails(value: SourceTableFeatureDetails): Self = StObject.set(x, "SourceTableFeatureDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceTableFeatureDetailsUndefined: Self = StObject.set(x, "SourceTableFeatureDetails", js.undefined)
  }
}

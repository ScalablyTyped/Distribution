package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.BackupDetails
import typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.SourceTableDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.UnmarshalledSourceTableDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
import typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.UnmarshalledSourceTableFeatureDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupDescriptionMod {
  
  trait BackupDescription extends StObject {
    
    /**
      * <p>Contains the details of the backup created for the table. </p>
      */
    var BackupDetails: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.BackupDetails] = js.undefined
    
    /**
      * <p>Contains the details of the table when the backup was created. </p>
      */
    var SourceTableDetails: js.UndefOr[
        typings.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.SourceTableDetails
      ] = js.undefined
    
    /**
      * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
      */
    var SourceTableFeatureDetails: js.UndefOr[
        typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
      ] = js.undefined
  }
  object BackupDescription {
    
    inline def apply(): BackupDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupDescription]
    }
    
    extension [Self <: BackupDescription](x: Self) {
      
      inline def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      inline def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
      
      inline def setSourceTableDetails(value: SourceTableDetails): Self = StObject.set(x, "SourceTableDetails", value.asInstanceOf[js.Any])
      
      inline def setSourceTableDetailsUndefined: Self = StObject.set(x, "SourceTableDetails", js.undefined)
      
      inline def setSourceTableFeatureDetails(value: SourceTableFeatureDetails): Self = StObject.set(x, "SourceTableFeatureDetails", value.asInstanceOf[js.Any])
      
      inline def setSourceTableFeatureDetailsUndefined: Self = StObject.set(x, "SourceTableFeatureDetails", js.undefined)
    }
  }
  
  trait UnmarshalledBackupDescription
    extends StObject
       with BackupDescription {
    
    /**
      * <p>Contains the details of the backup created for the table. </p>
      */
    @JSName("BackupDetails")
    var BackupDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledBackupDetails] = js.undefined
    
    /**
      * <p>Contains the details of the table when the backup was created. </p>
      */
    @JSName("SourceTableDetails")
    var SourceTableDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableDetails] = js.undefined
    
    /**
      * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
      */
    @JSName("SourceTableFeatureDetails")
    var SourceTableFeatureDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableFeatureDetails] = js.undefined
  }
  object UnmarshalledBackupDescription {
    
    inline def apply(): UnmarshalledBackupDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledBackupDescription]
    }
    
    extension [Self <: UnmarshalledBackupDescription](x: Self) {
      
      inline def setBackupDetails(value: UnmarshalledBackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      inline def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
      
      inline def setSourceTableDetails(value: UnmarshalledSourceTableDetails): Self = StObject.set(x, "SourceTableDetails", value.asInstanceOf[js.Any])
      
      inline def setSourceTableDetailsUndefined: Self = StObject.set(x, "SourceTableDetails", js.undefined)
      
      inline def setSourceTableFeatureDetails(value: UnmarshalledSourceTableFeatureDetails): Self = StObject.set(x, "SourceTableFeatureDetails", value.asInstanceOf[js.Any])
      
      inline def setSourceTableFeatureDetailsUndefined: Self = StObject.set(x, "SourceTableFeatureDetails", js.undefined)
    }
  }
}

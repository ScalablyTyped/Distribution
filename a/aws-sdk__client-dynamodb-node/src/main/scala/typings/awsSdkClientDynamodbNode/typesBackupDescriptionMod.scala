package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesBackupDetailsMod.BackupDetails
import typings.awsSdkClientDynamodbNode.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkClientDynamodbNode.typesSourceTableDetailsMod.SourceTableDetails
import typings.awsSdkClientDynamodbNode.typesSourceTableDetailsMod.UnmarshalledSourceTableDetails
import typings.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
import typings.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod.UnmarshalledSourceTableFeatureDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupDescriptionMod {
  
  @js.native
  trait BackupDescription extends StObject {
    
    /**
      * <p>Contains the details of the backup created for the table. </p>
      */
    var BackupDetails: js.UndefOr[typings.awsSdkClientDynamodbNode.typesBackupDetailsMod.BackupDetails] = js.native
    
    /**
      * <p>Contains the details of the table when the backup was created. </p>
      */
    var SourceTableDetails: js.UndefOr[typings.awsSdkClientDynamodbNode.typesSourceTableDetailsMod.SourceTableDetails] = js.native
    
    /**
      * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
      */
    var SourceTableFeatureDetails: js.UndefOr[
        typings.awsSdkClientDynamodbNode.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
      ] = js.native
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
    implicit class UnmarshalledBackupDescriptionMutableBuilder[Self <: UnmarshalledBackupDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupDetails(value: UnmarshalledBackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
      
      @scala.inline
      def setSourceTableDetails(value: UnmarshalledSourceTableDetails): Self = StObject.set(x, "SourceTableDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableDetailsUndefined: Self = StObject.set(x, "SourceTableDetails", js.undefined)
      
      @scala.inline
      def setSourceTableFeatureDetails(value: UnmarshalledSourceTableFeatureDetails): Self = StObject.set(x, "SourceTableFeatureDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableFeatureDetailsUndefined: Self = StObject.set(x, "SourceTableFeatureDetails", js.undefined)
    }
  }
}

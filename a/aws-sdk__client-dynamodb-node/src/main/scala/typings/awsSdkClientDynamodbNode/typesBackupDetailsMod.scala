package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AVAILABLE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupDetailsMod {
  
  @js.native
  trait BackupDetails extends StObject {
    
    /**
      * <p>ARN associated with the backup.</p>
      */
    var BackupArn: String = js.native
    
    /**
      * <p>Time at which the backup was created. This is the request time of the backup. </p>
      */
    var BackupCreationDateTime: Date | String | Double = js.native
    
    /**
      * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
      */
    var BackupExpiryDateTime: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>Name of the requested backup.</p>
      */
    var BackupName: String = js.native
    
    /**
      * <p>Size of the backup in bytes.</p>
      */
    var BackupSizeBytes: js.UndefOr[Double] = js.native
    
    /**
      * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED. </p>
      */
    var BackupStatus: CREATING | DELETED | AVAILABLE | String = js.native
    
    /**
      * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
      */
    var BackupType: USER | SYSTEM | String = js.native
  }
  object BackupDetails {
    
    @scala.inline
    def apply(
      BackupArn: String,
      BackupCreationDateTime: Date | String | Double,
      BackupName: String,
      BackupStatus: CREATING | DELETED | AVAILABLE | String,
      BackupType: USER | SYSTEM | String
    ): BackupDetails = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupDetails]
    }
    
    @scala.inline
    implicit class BackupDetailsMutableBuilder[Self <: BackupDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupCreationDateTime(value: Date | String | Double): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTime(value: Date | String | Double): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
      
      @scala.inline
      def setBackupName(value: String): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupSizeBytes(value: Double): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
      
      @scala.inline
      def setBackupStatus(value: CREATING | DELETED | AVAILABLE | String): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupType(value: USER | SYSTEM | String): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledBackupDetails extends BackupDetails {
    
    /**
      * <p>Time at which the backup was created. This is the request time of the backup. </p>
      */
    @JSName("BackupCreationDateTime")
    var BackupCreationDateTime_UnmarshalledBackupDetails: Date = js.native
    
    /**
      * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
      */
    @JSName("BackupExpiryDateTime")
    var BackupExpiryDateTime_UnmarshalledBackupDetails: js.UndefOr[Date] = js.native
  }
  object UnmarshalledBackupDetails {
    
    @scala.inline
    def apply(
      BackupArn: String,
      BackupCreationDateTime: Date,
      BackupName: String,
      BackupStatus: CREATING | DELETED | AVAILABLE | String,
      BackupType: USER | SYSTEM | String
    ): UnmarshalledBackupDetails = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledBackupDetails]
    }
    
    @scala.inline
    implicit class UnmarshalledBackupDetailsMutableBuilder[Self <: UnmarshalledBackupDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupCreationDateTime(value: Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTime(value: Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
    }
  }
}

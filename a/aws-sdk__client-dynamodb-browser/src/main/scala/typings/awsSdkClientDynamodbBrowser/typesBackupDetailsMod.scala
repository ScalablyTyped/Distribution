package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.AVAILABLE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.SYSTEM
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.USER
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupDetailsMod {
  
  trait BackupDetails extends StObject {
    
    /**
      * <p>ARN associated with the backup.</p>
      */
    var BackupArn: String
    
    /**
      * <p>Time at which the backup was created. This is the request time of the backup. </p>
      */
    var BackupCreationDateTime: Date | String | Double
    
    /**
      * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
      */
    var BackupExpiryDateTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>Name of the requested backup.</p>
      */
    var BackupName: String
    
    /**
      * <p>Size of the backup in bytes.</p>
      */
    var BackupSizeBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED. </p>
      */
    var BackupStatus: CREATING | DELETED | AVAILABLE | String
    
    /**
      * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
      */
    var BackupType: USER | SYSTEM | String
  }
  object BackupDetails {
    
    inline def apply(
      BackupArn: String,
      BackupCreationDateTime: Date | String | Double,
      BackupName: String,
      BackupStatus: CREATING | DELETED | AVAILABLE | String,
      BackupType: USER | SYSTEM | String
    ): BackupDetails = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupDetails]
    }
    
    extension [Self <: BackupDetails](x: Self) {
      
      inline def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      inline def setBackupCreationDateTime(value: Date | String | Double): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupExpiryDateTime(value: Date | String | Double): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
      
      inline def setBackupName(value: String): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      inline def setBackupSizeBytes(value: Double): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
      
      inline def setBackupStatus(value: CREATING | DELETED | AVAILABLE | String): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
      
      inline def setBackupType(value: USER | SYSTEM | String): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledBackupDetails
    extends StObject
       with BackupDetails {
    
    /**
      * <p>Time at which the backup was created. This is the request time of the backup. </p>
      */
    @JSName("BackupCreationDateTime")
    var BackupCreationDateTime_UnmarshalledBackupDetails: Date
    
    /**
      * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
      */
    @JSName("BackupExpiryDateTime")
    var BackupExpiryDateTime_UnmarshalledBackupDetails: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledBackupDetails {
    
    inline def apply(
      BackupArn: String,
      BackupCreationDateTime: Date,
      BackupName: String,
      BackupStatus: CREATING | DELETED | AVAILABLE | String,
      BackupType: USER | SYSTEM | String
    ): UnmarshalledBackupDetails = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledBackupDetails]
    }
    
    extension [Self <: UnmarshalledBackupDetails](x: Self) {
      
      inline def setBackupCreationDateTime(value: Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupExpiryDateTime(value: Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
    }
  }
}

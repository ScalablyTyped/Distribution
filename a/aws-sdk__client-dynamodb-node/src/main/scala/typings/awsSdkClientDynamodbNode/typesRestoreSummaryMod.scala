package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreSummaryMod {
  
  trait RestoreSummary extends StObject {
    
    /**
      * <p>Point in time or source backup time.</p>
      */
    var RestoreDateTime: js.Date | String | Double
    
    /**
      * <p>Indicates if a restore is in progress or not.</p>
      */
    var RestoreInProgress: Boolean
    
    /**
      * <p>ARN of the backup from which the table was restored.</p>
      */
    var SourceBackupArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>ARN of the source table of the backup that is being restored.</p>
      */
    var SourceTableArn: js.UndefOr[String] = js.undefined
  }
  object RestoreSummary {
    
    inline def apply(RestoreDateTime: js.Date | String | Double, RestoreInProgress: Boolean): RestoreSummary = {
      val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreSummary]
    }
    
    extension [Self <: RestoreSummary](x: Self) {
      
      inline def setRestoreDateTime(value: js.Date | String | Double): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      inline def setRestoreInProgress(value: Boolean): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
      
      inline def setSourceBackupArn(value: String): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
      
      inline def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
      
      inline def setSourceTableArn(value: String): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
      
      inline def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
    }
  }
  
  trait UnmarshalledRestoreSummary
    extends StObject
       with RestoreSummary {
    
    /**
      * <p>Point in time or source backup time.</p>
      */
    @JSName("RestoreDateTime")
    var RestoreDateTime_UnmarshalledRestoreSummary: js.Date
  }
  object UnmarshalledRestoreSummary {
    
    inline def apply(RestoreDateTime: js.Date, RestoreInProgress: Boolean): UnmarshalledRestoreSummary = {
      val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRestoreSummary]
    }
    
    extension [Self <: UnmarshalledRestoreSummary](x: Self) {
      
      inline def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    }
  }
}

package typings.awsSdkClientDynamodbBrowser

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreSummaryMod {
  
  @js.native
  trait RestoreSummary extends StObject {
    
    /**
      * <p>Point in time or source backup time.</p>
      */
    var RestoreDateTime: Date | String | Double = js.native
    
    /**
      * <p>Indicates if a restore is in progress or not.</p>
      */
    var RestoreInProgress: Boolean = js.native
    
    /**
      * <p>ARN of the backup from which the table was restored.</p>
      */
    var SourceBackupArn: js.UndefOr[String] = js.native
    
    /**
      * <p>ARN of the source table of the backup that is being restored.</p>
      */
    var SourceTableArn: js.UndefOr[String] = js.native
  }
  object RestoreSummary {
    
    @scala.inline
    def apply(RestoreDateTime: Date | String | Double, RestoreInProgress: Boolean): RestoreSummary = {
      val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreSummary]
    }
    
    @scala.inline
    implicit class RestoreSummaryMutableBuilder[Self <: RestoreSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestoreDateTime(value: Date | String | Double): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreInProgress(value: Boolean): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceBackupArn(value: String): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
      
      @scala.inline
      def setSourceTableArn(value: String): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledRestoreSummary extends RestoreSummary {
    
    /**
      * <p>Point in time or source backup time.</p>
      */
    @JSName("RestoreDateTime")
    var RestoreDateTime_UnmarshalledRestoreSummary: Date = js.native
  }
  object UnmarshalledRestoreSummary {
    
    @scala.inline
    def apply(RestoreDateTime: Date, RestoreInProgress: Boolean): UnmarshalledRestoreSummary = {
      val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRestoreSummary]
    }
    
    @scala.inline
    implicit class UnmarshalledRestoreSummaryMutableBuilder[Self <: UnmarshalledRestoreSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestoreDateTime(value: Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    }
  }
}

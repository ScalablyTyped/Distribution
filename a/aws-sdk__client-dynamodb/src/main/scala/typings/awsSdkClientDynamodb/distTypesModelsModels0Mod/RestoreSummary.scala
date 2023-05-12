package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSummary extends StObject {
  
  /**
    * <p>Point in time or source backup time.</p>
    */
  var RestoreDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Indicates if a restore is in progress or not.</p>
    */
  var RestoreInProgress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) of the backup from which the table was restored.</p>
    */
  var SourceBackupArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The ARN of the source table of the backup that is being restored.</p>
    */
  var SourceTableArn: js.UndefOr[String] = js.undefined
}
object RestoreSummary {
  
  inline def apply(): RestoreSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreSummary] (val x: Self) extends AnyVal {
    
    inline def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    inline def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
    
    inline def setRestoreInProgress(value: Boolean): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
    
    inline def setRestoreInProgressUndefined: Self = StObject.set(x, "RestoreInProgress", js.undefined)
    
    inline def setSourceBackupArn(value: String): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
    
    inline def setSourceTableArn(value: String): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    inline def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
  }
}

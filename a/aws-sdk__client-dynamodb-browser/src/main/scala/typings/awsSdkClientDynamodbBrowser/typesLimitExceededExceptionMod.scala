package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_LimitExceededExceptionDetails> * / any */ trait LimitExceededException
    extends StObject
       with CreateBackupExceptionsUnion
       with CreateGlobalTableExceptionsUnion
       with CreateTableExceptionsUnion
       with DeleteBackupExceptionsUnion
       with DeleteTableExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateGlobalTableSettingsExceptionsUnion
       with UpdateTableExceptionsUnion
       with UpdateTimeToLiveExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.LimitExceededException
  }
  object LimitExceededException {
    
    inline def apply(): LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[LimitExceededException]
    }
    
    extension [Self <: LimitExceededException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.LimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait LimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>Too many operations for a given subscriber.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object LimitExceededExceptionDetails {
    
    inline def apply(): LimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitExceededExceptionDetails]
    }
    
    extension [Self <: LimitExceededExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}

package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesBatchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesCreateTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesGetItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesListTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesQueryExceptionsUnionMod.QueryExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesScanExceptionsUnionMod.ScanExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalServerErrorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InternalServerErrorDetails> * / any */ trait InternalServerError
    extends StObject
       with BatchGetItemExceptionsUnion
       with BatchWriteItemExceptionsUnion
       with CreateBackupExceptionsUnion
       with CreateGlobalTableExceptionsUnion
       with CreateTableExceptionsUnion
       with DeleteBackupExceptionsUnion
       with DeleteItemExceptionsUnion
       with DeleteTableExceptionsUnion
       with DescribeBackupExceptionsUnion
       with DescribeContinuousBackupsExceptionsUnion
       with DescribeGlobalTableExceptionsUnion
       with DescribeGlobalTableSettingsExceptionsUnion
       with DescribeTableExceptionsUnion
       with DescribeTimeToLiveExceptionsUnion
       with GetItemExceptionsUnion
       with ListTagsOfResourceExceptionsUnion
       with PutItemExceptionsUnion
       with QueryExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion
       with ScanExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateContinuousBackupsExceptionsUnion
       with UpdateGlobalTableExceptionsUnion
       with UpdateGlobalTableSettingsExceptionsUnion
       with UpdateItemExceptionsUnion
       with UpdateTableExceptionsUnion
       with UpdateTimeToLiveExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InternalServerError
  }
  object InternalServerError {
    
    inline def apply(): InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[InternalServerError]
    }
    
    extension [Self <: InternalServerError](x: Self) {
      
      inline def setName(value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InternalServerError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalServerErrorDetails extends StObject {
    
    /**
      * <p>The server encountered an internal error trying to fulfill the request.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InternalServerErrorDetails {
    
    inline def apply(): InternalServerErrorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalServerErrorDetails]
    }
    
    extension [Self <: InternalServerErrorDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}

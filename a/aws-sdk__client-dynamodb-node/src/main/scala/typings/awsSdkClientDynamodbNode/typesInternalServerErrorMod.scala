package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.createTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typings.awsSdkClientDynamodbNode.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.listTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typings.awsSdkClientDynamodbNode.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.queryExceptionsUnionMod.QueryExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkClientDynamodbNode.scanExceptionsUnionMod.ScanExceptionsUnion
import typings.awsSdkClientDynamodbNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
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
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError
  }
  object InternalServerError {
    
    @scala.inline
    def apply(): InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[InternalServerError]
    }
    
    @scala.inline
    implicit class InternalServerErrorMutableBuilder[Self <: InternalServerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalServerErrorDetails extends StObject {
    
    /**
      * <p>The server encountered an internal error trying to fulfill the request.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InternalServerErrorDetails {
    
    @scala.inline
    def apply(): InternalServerErrorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalServerErrorDetails]
    }
    
    @scala.inline
    implicit class InternalServerErrorDetailsMutableBuilder[Self <: InternalServerErrorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}

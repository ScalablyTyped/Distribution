package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeysAndAttributesMod.KeysAndAttributes
import typings.awsSdkClientDynamodbNode.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbNode.typesReplicaMod.Replica
import typings.awsSdkClientDynamodbNode.typesReplicaUpdateMod.ReplicaUpdate
import typings.awsSdkClientDynamodbNode.typesTagMod.Tag
import typings.awsSdkClientDynamodbNode.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import typings.awsSdkClientDynamodbNode.typesWriteRequestMod.WriteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
    - typings.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput
    - typings.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput
    - typings.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput
    - typings.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput
    - typings.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput
    - typings.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput
    - typings.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput
    - typings.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput
    - typings.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
    - typings.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput
    - typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
    - typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
    - typings.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typings.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput
    - typings.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
    - typings.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput
    - typings.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput
    - typings.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput
    - typings.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput
    - typings.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
    - typings.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput
    - typings.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput
    - typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
    - typings.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
    - typings.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
    - typings.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput
    - typings.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput
    - typings.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
    - typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
    - typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
    - typings.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput
    - typings.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput
    - typings.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def BatchGetItemInput(
      RequestItems: StringDictionary[KeysAndAttributes] | (js.Iterable[js.Tuple2[String, KeysAndAttributes]])
    ): typings.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput]
    }
    
    inline def BatchWriteItemInput(
      RequestItems: (StringDictionary[js.Array[WriteRequest] | js.Iterable[WriteRequest]]) | (js.Iterable[js.Tuple2[String, js.Array[WriteRequest] | js.Iterable[WriteRequest]]])
    ): typings.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput]
    }
    
    inline def CreateBackupInput(BackupName: String, TableName: String): typings.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput]
    }
    
    inline def CreateGlobalTableInput(GlobalTableName: String, ReplicationGroup: js.Array[Replica] | js.Iterable[Replica]): typings.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput]
    }
    
    inline def CreateTableInput(
      AttributeDefinitions: js.Array[AttributeDefinition] | js.Iterable[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableName: String
    ): typings.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput]
    }
    
    inline def DeleteBackupInput(BackupArn: String): typings.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput]
    }
    
    inline def DeleteItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput]
    }
    
    inline def DeleteTableInput(TableName: String): typings.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput]
    }
    
    inline def DescribeBackupInput(BackupArn: String): typings.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput]
    }
    
    inline def DescribeContinuousBackupsInput(TableName: String): typings.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput]
    }
    
    inline def DescribeEndpointsInput(): typings.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput]
    }
    
    inline def DescribeGlobalTableInput(GlobalTableName: String): typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput]
    }
    
    inline def DescribeGlobalTableSettingsInput(GlobalTableName: String): typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput]
    }
    
    inline def DescribeLimitsInput(): typings.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    inline def DescribeTableInput(TableName: String): typings.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput]
    }
    
    inline def DescribeTimeToLiveInput(TableName: String): typings.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput]
    }
    
    inline def GetItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput]
    }
    
    inline def ListBackupsInput(): typings.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput]
    }
    
    inline def ListGlobalTablesInput(): typings.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput]
    }
    
    inline def ListTablesInput(): typings.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput]
    }
    
    inline def ListTagsOfResourceInput(ResourceArn: String): typings.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput]
    }
    
    inline def PutItemInput(
      Item: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput]
    }
    
    inline def QueryInput(TableName: String): typings.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput]
    }
    
    inline def RestoreTableFromBackupInput(BackupArn: String, TargetTableName: String): typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput]
    }
    
    inline def RestoreTableToPointInTimeInput(SourceTableName: String, TargetTableName: String): typings.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput]
    }
    
    inline def ScanInput(TableName: String): typings.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput]
    }
    
    inline def TagResourceInput(ResourceArn: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typings.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(ResourceArn: String, TagKeys: js.Array[String] | js.Iterable[String]): typings.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateContinuousBackupsInput(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): typings.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput]
    }
    
    inline def UpdateGlobalTableInput(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate]): typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput]
    }
    
    inline def UpdateGlobalTableSettingsInput(GlobalTableName: String): typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput]
    }
    
    inline def UpdateItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typings.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput]
    }
    
    inline def UpdateTableInput(TableName: String): typings.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput]
    }
    
    inline def UpdateTimeToLiveInput(TableName: String, TimeToLiveSpecification: TimeToLiveSpecification): typings.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput]
    }
  }
}

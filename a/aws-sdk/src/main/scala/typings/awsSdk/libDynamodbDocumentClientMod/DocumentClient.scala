package typings.awsSdk.libDynamodbDocumentClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.Binary_
import typings.awsSdk.awsSdkStrings.Number_
import typings.awsSdk.awsSdkStrings.String_
import typings.awsSdk.clientsDynamodbMod.ClientConfiguration
import typings.awsSdk.clientsDynamodbMod.^
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BatchGetItemInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BatchGetItemOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BatchWriteItemInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BatchWriteItemOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.CreateSetOptions
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DeleteItemInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DeleteItemOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DynamoDbSet
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.GetItemInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.GetItemOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PutItemInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PutItemOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.QueryInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.QueryOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ScanInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ScanOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TransactGetItemsInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TransactGetItemsOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TransactWriteItemsInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TransactWriteItemsOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateItemInput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateItemOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.binaryType
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/dynamodb/document_client", "DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
open class DocumentClient () extends StObject {
  def this(options: DocumentClientOptions & ClientConfiguration) = this()
  
  /**
    * Returns the attributes of one or more items from one or more tables by delegating to AWS.DynamoDB.batchGetItem().
    */
  def batchGet(params: BatchGetItemInput): Request[BatchGetItemOutput, AWSError] = js.native
  def batchGet(
    params: BatchGetItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetItemOutput, Unit]
  ): Request[BatchGetItemOutput, AWSError] = js.native
  
  /**
    * Puts or deletes multiple items in one or more tables by delegating to AWS.DynamoDB.batchWriteItem().
    */
  def batchWrite(params: BatchWriteItemInput): Request[BatchWriteItemOutput, AWSError] = js.native
  def batchWrite(
    params: BatchWriteItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchWriteItemOutput, Unit]
  ): Request[BatchWriteItemOutput, AWSError] = js.native
  
  /**
    * Creates a set of elements inferring the type of set from the type of the first element. Amazon DynamoDB currently supports the number sets, string sets, and binary sets. For more information about DynamoDB data types see the documentation on the Amazon DynamoDB Data Model.
    */
  def createSet(list: js.Array[Double | String | binaryType]): DynamoDbSet = js.native
  def createSet(list: js.Array[Double | String | binaryType], options: CreateSetOptions): DynamoDbSet = js.native
  
  /**
    * Deletes a single item in a table by primary key by delegating to AWS.DynamoDB.deleteItem().
    */
  def delete(params: DeleteItemInput): Request[DeleteItemOutput, AWSError] = js.native
  def delete(
    params: DeleteItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteItemOutput, Unit]
  ): Request[DeleteItemOutput, AWSError] = js.native
  
  /**
    * Returns a set of attributes for the item with the given primary key by delegating to AWS.DynamoDB.getItem().
    */
  def get(params: GetItemInput): Request[GetItemOutput, AWSError] = js.native
  def get(params: GetItemInput, callback: js.Function2[/* err */ AWSError, /* data */ GetItemOutput, Unit]): Request[GetItemOutput, AWSError] = js.native
  
  /**
    * Creates a new item, or replaces an old item with a new item by delegating to AWS.DynamoDB.putItem().
    */
  def put(params: PutItemInput): Request[PutItemOutput, AWSError] = js.native
  def put(params: PutItemInput, callback: js.Function2[/* err */ AWSError, /* data */ PutItemOutput, Unit]): Request[PutItemOutput, AWSError] = js.native
  
  /**
    * Directly access items from a table by primary key or a secondary index.
    */
  def query(params: QueryInput): Request[QueryOutput, AWSError] = js.native
  def query(params: QueryInput, callback: js.Function2[/* err */ AWSError, /* data */ QueryOutput, Unit]): Request[QueryOutput, AWSError] = js.native
  
  /**
    * Returns one or more items and item attributes by accessing every item in a table or a secondary index.
    */
  def scan(params: ScanInput): Request[ScanOutput, AWSError] = js.native
  def scan(params: ScanInput, callback: js.Function2[/* err */ AWSError, /* data */ ScanOutput, Unit]): Request[ScanOutput, AWSError] = js.native
  
  /**
    * Atomically retrieves multiple items from one or more tables (but not from indexes) in a single account and region.
    */
  def transactGet(params: TransactGetItemsInput): Request[TransactGetItemsOutput, AWSError] = js.native
  def transactGet(
    params: TransactGetItemsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TransactGetItemsOutput, Unit]
  ): Request[TransactGetItemsOutput, AWSError] = js.native
  
  /**
    * Synchronous write operation that groups up to 25 action requests.
    */
  def transactWrite(params: TransactWriteItemsInput): Request[TransactWriteItemsOutput, AWSError] = js.native
  def transactWrite(
    params: TransactWriteItemsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TransactWriteItemsOutput, Unit]
  ): Request[TransactWriteItemsOutput, AWSError] = js.native
  
  /**
    * Edits an existing item's attributes, or adds a new item to the table if it does not already exist by delegating to AWS.DynamoDB.updateItem().
    */
  def update(params: UpdateItemInput): Request[UpdateItemOutput, AWSError] = js.native
  def update(
    params: UpdateItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateItemOutput, Unit]
  ): Request[UpdateItemOutput, AWSError] = js.native
}
object DocumentClient {
  
  type ArchivalReason = java.lang.String
  
  trait ArchivalSummary extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason. If you wish to restore this backup to the same table name, you will need to delete the original table.
      */
    var ArchivalBackupArn: js.UndefOr[BackupArn] = js.undefined
    
    /**
      * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
      */
    var ArchivalDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The reason DynamoDB archived the table. Currently, the only possible value is:    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The table was archived due to the table's KMS key being inaccessible for more than seven days. An On-Demand backup was created at the archival time.  
      */
    var ArchivalReason: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ArchivalReason] = js.undefined
  }
  object ArchivalSummary {
    
    inline def apply(): ArchivalSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchivalSummary]
    }
    
    extension [Self <: ArchivalSummary](x: Self) {
      
      inline def setArchivalBackupArn(value: BackupArn): Self = StObject.set(x, "ArchivalBackupArn", value.asInstanceOf[js.Any])
      
      inline def setArchivalBackupArnUndefined: Self = StObject.set(x, "ArchivalBackupArn", js.undefined)
      
      inline def setArchivalDateTime(value: js.Date): Self = StObject.set(x, "ArchivalDateTime", value.asInstanceOf[js.Any])
      
      inline def setArchivalDateTimeUndefined: Self = StObject.set(x, "ArchivalDateTime", js.undefined)
      
      inline def setArchivalReason(value: ArchivalReason): Self = StObject.set(x, "ArchivalReason", value.asInstanceOf[js.Any])
      
      inline def setArchivalReasonUndefined: Self = StObject.set(x, "ArchivalReason", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADD
    - typings.awsSdk.awsSdkStrings.PUT
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = _AttributeAction | java.lang.String
  
  trait AttributeDefinition extends StObject {
    
    /**
      * A name for the attribute.
      */
    var AttributeName: KeySchemaAttributeName
    
    /**
      * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
      */
    var AttributeType: ScalarAttributeType
  }
  object AttributeDefinition {
    
    inline def apply(AttributeName: KeySchemaAttributeName, AttributeType: ScalarAttributeType): AttributeDefinition = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDefinition]
    }
    
    extension [Self <: AttributeDefinition](x: Self) {
      
      inline def setAttributeName(value: KeySchemaAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeType(value: ScalarAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    }
  }
  
  type AttributeDefinitions = js.Array[AttributeDefinition]
  
  type AttributeMap = StringDictionary[AttributeValue]
  
  type AttributeName = java.lang.String
  
  type AttributeNameList = js.Array[AttributeName]
  
  type AttributeUpdates = StringDictionary[AttributeValueUpdate]
  
  type AttributeValue = Any
  
  type AttributeValueList = js.Array[AttributeValue]
  
  trait AttributeValueUpdate extends StObject {
    
    /**
      * Specifies how to perform the update. Valid values are PUT (default), DELETE, and ADD. The behavior depends on whether the specified primary key already exists in the table.  If an item with the specified Key is found in the table:     PUT - Adds the specified attribute to the item. If the attribute already exists, it is replaced by the new value.     DELETE - If no value is specified, the attribute and its value are removed from the item. The data type of the specified value must match the existing value's data type. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specified [a,c], then the final attribute value would be [b]. Specifying an empty set is an error.    ADD - If the attribute does not already exist, then the attribute and its values are added to the item. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then the Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.   If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. In addition, if you use ADD to update an existing item, and intend to increment or decrement an attribute value which does not yet exist, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update does not yet have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway, even though it currently does not exist. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set, and if the Value is also a set, then the Value is added to the existing set. (This is a set operation, not mathematical addition.) For example, if the attribute value was the set [1,2], and the ADD action specified [3], then the final attribute value would be [1,2,3]. An error occurs if an Add action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings. The same holds true for number sets and binary sets.   This action is only valid for an existing attribute whose data type is number or is a set. Do not use ADD for any other data types.    If no item with the specified Key is found:     PUT - DynamoDB creates a new item with the specified primary key, and then adds the attribute.     DELETE - Nothing happens; there is no attribute to delete.    ADD - DynamoDB creates a new item with the supplied primary key and number (or set) for the attribute value. The only data types allowed are number, number set, string set or binary set.  
      */
    var Action: js.UndefOr[AttributeAction] = js.undefined
    
    /**
      * Represents the data for an attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide. 
      */
    var Value: js.UndefOr[AttributeValue] = js.undefined
  }
  object AttributeValueUpdate {
    
    inline def apply(): AttributeValueUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeValueUpdate]
    }
    
    extension [Self <: AttributeValueUpdate](x: Self) {
      
      inline def setAction(value: AttributeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  trait AutoScalingPolicyDescription extends StObject {
    
    /**
      * The name of the scaling policy.
      */
    var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
    
    /**
      * Represents a target tracking scaling policy configuration.
      */
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
  }
  object AutoScalingPolicyDescription {
    
    inline def apply(): AutoScalingPolicyDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingPolicyDescription]
    }
    
    extension [Self <: AutoScalingPolicyDescription](x: Self) {
      
      inline def setPolicyName(value: AutoScalingPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      inline def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
  
  type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]
  
  type AutoScalingPolicyName = java.lang.String
  
  trait AutoScalingPolicyUpdate extends StObject {
    
    /**
      * The name of the scaling policy.
      */
    var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
    
    /**
      * Represents a target tracking scaling policy configuration.
      */
    var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  }
  object AutoScalingPolicyUpdate {
    
    inline def apply(
      TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    ): AutoScalingPolicyUpdate = {
      val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingPolicyUpdate]
    }
    
    extension [Self <: AutoScalingPolicyUpdate](x: Self) {
      
      inline def setPolicyName(value: AutoScalingPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      inline def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    }
  }
  
  type AutoScalingRoleArn = java.lang.String
  
  trait AutoScalingSettingsDescription extends StObject {
    
    /**
      * Disabled auto scaling for this global table or global secondary index.
      */
    var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
    
    /**
      * Role ARN used for configuring the auto scaling policy.
      */
    var AutoScalingRoleArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
    
    /**
      * The maximum capacity units that a global table or global secondary index should be scaled up to.
      */
    var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * The minimum capacity units that a global table or global secondary index should be scaled down to.
      */
    var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * Information about the scaling policies.
      */
    var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.undefined
  }
  object AutoScalingSettingsDescription {
    
    inline def apply(): AutoScalingSettingsDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingSettingsDescription]
    }
    
    extension [Self <: AutoScalingSettingsDescription](x: Self) {
      
      inline def setAutoScalingDisabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
      
      inline def setAutoScalingRoleArn(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
      
      inline def setMaximumUnits(value: PositiveLongObject): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
      
      inline def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
      
      inline def setMinimumUnits(value: PositiveLongObject): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
      
      inline def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
      
      inline def setScalingPolicies(value: AutoScalingPolicyDescriptionList): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
      
      inline def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
      
      inline def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value*))
    }
  }
  
  trait AutoScalingSettingsUpdate extends StObject {
    
    /**
      * Disabled auto scaling for this global table or global secondary index.
      */
    var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
    
    /**
      * Role ARN used for configuring auto scaling policy.
      */
    var AutoScalingRoleArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AutoScalingRoleArn] = js.undefined
    
    /**
      * The maximum capacity units that a global table or global secondary index should be scaled up to.
      */
    var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * The minimum capacity units that a global table or global secondary index should be scaled down to.
      */
    var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * The scaling policy to apply for scaling target global table or global secondary index capacity units.
      */
    var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined
  }
  object AutoScalingSettingsUpdate {
    
    inline def apply(): AutoScalingSettingsUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingSettingsUpdate]
    }
    
    extension [Self <: AutoScalingSettingsUpdate](x: Self) {
      
      inline def setAutoScalingDisabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
      
      inline def setAutoScalingRoleArn(value: AutoScalingRoleArn): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
      
      inline def setMaximumUnits(value: PositiveLongObject): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
      
      inline def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
      
      inline def setMinimumUnits(value: PositiveLongObject): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
      
      inline def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
      
      inline def setScalingPolicyUpdate(value: AutoScalingPolicyUpdate): Self = StObject.set(x, "ScalingPolicyUpdate", value.asInstanceOf[js.Any])
      
      inline def setScalingPolicyUpdateUndefined: Self = StObject.set(x, "ScalingPolicyUpdate", js.undefined)
    }
  }
  
  trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends StObject {
    
    /**
      * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
      */
    var DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined
    
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application auto scaling scales out your scalable target immediately. 
      */
    var ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined
    
    /**
      * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
      */
    var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
    
    /**
      * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
      */
    var TargetValue: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Double
  }
  object AutoScalingTargetTrackingScalingPolicyConfigurationDescription {
    
    inline def apply(TargetValue: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Double): AutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
    }
    
    extension [Self <: AutoScalingTargetTrackingScalingPolicyConfigurationDescription](x: Self) {
      
      inline def setDisableScaleIn(value: BooleanObject): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
      
      inline def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
      
      inline def setScaleInCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
      
      inline def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
      
      inline def setScaleOutCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
      
      inline def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
      
      inline def setTargetValue(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Double): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends StObject {
    
    /**
      * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
      */
    var DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined
    
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application auto scaling scales out your scalable target immediately. 
      */
    var ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined
    
    /**
      * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
      */
    var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
    
    /**
      * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
      */
    var TargetValue: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Double
  }
  object AutoScalingTargetTrackingScalingPolicyConfigurationUpdate {
    
    inline def apply(TargetValue: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Double): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
    }
    
    extension [Self <: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate](x: Self) {
      
      inline def setDisableScaleIn(value: BooleanObject): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
      
      inline def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
      
      inline def setScaleInCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
      
      inline def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
      
      inline def setScaleOutCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
      
      inline def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
      
      inline def setTargetValue(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Double): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Backfilling = Boolean
  
  type BackupArn = java.lang.String
  
  type BackupCreationDateTime = js.Date
  
  trait BackupDescription extends StObject {
    
    /**
      * Contains the details of the backup created for the table. 
      */
    var BackupDetails: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupDetails] = js.undefined
    
    /**
      * Contains the details of the table when the backup was created. 
      */
    var SourceTableDetails: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SourceTableDetails] = js.undefined
    
    /**
      * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
      */
    var SourceTableFeatureDetails: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SourceTableFeatureDetails
      ] = js.undefined
  }
  object BackupDescription {
    
    inline def apply(): BackupDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupDescription]
    }
    
    extension [Self <: BackupDescription](x: Self) {
      
      inline def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      inline def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
      
      inline def setSourceTableDetails(value: SourceTableDetails): Self = StObject.set(x, "SourceTableDetails", value.asInstanceOf[js.Any])
      
      inline def setSourceTableDetailsUndefined: Self = StObject.set(x, "SourceTableDetails", js.undefined)
      
      inline def setSourceTableFeatureDetails(value: SourceTableFeatureDetails): Self = StObject.set(x, "SourceTableFeatureDetails", value.asInstanceOf[js.Any])
      
      inline def setSourceTableFeatureDetailsUndefined: Self = StObject.set(x, "SourceTableFeatureDetails", js.undefined)
    }
  }
  
  trait BackupDetails extends StObject {
    
    /**
      * ARN associated with the backup.
      */
    var BackupArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupArn
    
    /**
      * Time at which the backup was created. This is the request time of the backup. 
      */
    var BackupCreationDateTime: js.Date
    
    /**
      * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
      */
    var BackupExpiryDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Name of the requested backup.
      */
    var BackupName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupName
    
    /**
      * Size of the backup in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var BackupSizeBytes: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupSizeBytes] = js.undefined
    
    /**
      * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
      */
    var BackupStatus: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupStatus
    
    /**
      * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from Backup service.  
      */
    var BackupType: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupType
  }
  object BackupDetails {
    
    inline def apply(
      BackupArn: BackupArn,
      BackupCreationDateTime: js.Date,
      BackupName: BackupName,
      BackupStatus: BackupStatus,
      BackupType: BackupType
    ): BackupDetails = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupDetails]
    }
    
    extension [Self <: BackupDetails](x: Self) {
      
      inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      inline def setBackupCreationDateTime(value: js.Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupExpiryDateTime(value: js.Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
      
      inline def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      inline def setBackupSizeBytes(value: BackupSizeBytes): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
      
      inline def setBackupStatus(value: BackupStatus): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
      
      inline def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    }
  }
  
  type BackupName = java.lang.String
  
  type BackupSizeBytes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - java.lang.String
  */
  type BackupStatus = _BackupStatus | java.lang.String
  
  type BackupSummaries = js.Array[BackupSummary]
  
  trait BackupSummary extends StObject {
    
    /**
      * ARN associated with the backup.
      */
    var BackupArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupArn] = js.undefined
    
    /**
      * Time at which the backup was created.
      */
    var BackupCreationDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
      */
    var BackupExpiryDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Name of the specified backup.
      */
    var BackupName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupName] = js.undefined
    
    /**
      * Size of the backup in bytes.
      */
    var BackupSizeBytes: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupSizeBytes] = js.undefined
    
    /**
      * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
      */
    var BackupStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupStatus] = js.undefined
    
    /**
      * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from Backup service.  
      */
    var BackupType: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupType] = js.undefined
    
    /**
      * ARN associated with the table.
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn] = js.undefined
    
    /**
      * Unique identifier for the table.
      */
    var TableId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableId] = js.undefined
    
    /**
      * Name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object BackupSummary {
    
    inline def apply(): BackupSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupSummary]
    }
    
    extension [Self <: BackupSummary](x: Self) {
      
      inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      inline def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
      
      inline def setBackupCreationDateTime(value: js.Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupCreationDateTimeUndefined: Self = StObject.set(x, "BackupCreationDateTime", js.undefined)
      
      inline def setBackupExpiryDateTime(value: js.Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      inline def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
      
      inline def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      inline def setBackupNameUndefined: Self = StObject.set(x, "BackupName", js.undefined)
      
      inline def setBackupSizeBytes(value: BackupSizeBytes): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
      
      inline def setBackupStatus(value: BackupStatus): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
      
      inline def setBackupStatusUndefined: Self = StObject.set(x, "BackupStatus", js.undefined)
      
      inline def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
      
      inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.SYSTEM
    - typings.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = _BackupType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.SYSTEM
    - typings.awsSdk.awsSdkStrings.AWS_BACKUP
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = _BackupTypeFilter | java.lang.String
  
  type BackupsInputLimit = scala.Double
  
  trait BatchExecuteStatementInput extends StObject {
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * The list of PartiQL statements representing the batch to run.
      */
    var Statements: PartiQLBatchRequest
  }
  object BatchExecuteStatementInput {
    
    inline def apply(Statements: PartiQLBatchRequest): BatchExecuteStatementInput = {
      val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchExecuteStatementInput]
    }
    
    extension [Self <: BatchExecuteStatementInput](x: Self) {
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setStatements(value: PartiQLBatchRequest): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsVarargs(value: BatchStatementRequest*): Self = StObject.set(x, "Statements", js.Array(value*))
    }
  }
  
  trait BatchExecuteStatementOutput extends StObject {
    
    /**
      * The capacity units consumed by the entire operation. The values of the list are ordered according to the ordering of the statements.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    
    /**
      * The response to each PartiQL statement in the batch.
      */
    var Responses: js.UndefOr[PartiQLBatchResponse] = js.undefined
  }
  object BatchExecuteStatementOutput {
    
    inline def apply(): BatchExecuteStatementOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchExecuteStatementOutput]
    }
    
    extension [Self <: BatchExecuteStatementOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setResponses(value: PartiQLBatchResponse): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setResponsesVarargs(value: BatchStatementResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
    }
  }
  
  trait BatchGetItemInput extends StObject {
    
    /**
      * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from that table. Each table name can be used only once per BatchGetItem request. Each element in the map of items to retrieve consists of the following:    ConsistentRead - If true, a strongly consistent read is used; if false (the default), an eventually consistent read is used.    ExpressionAttributeNames - One or more substitution tokens for attribute names in the ProjectionExpression parameter. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information about expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    Keys - An array of primary key attribute values that define specific items in the table. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide the partition key value. For a composite key, you must provide both the partition key value and the sort key value.    ProjectionExpression - A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    AttributesToGet - This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.   
      */
    var RequestItems: BatchGetRequestMap
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
  }
  object BatchGetItemInput {
    
    inline def apply(RequestItems: BatchGetRequestMap): BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetItemInput]
    }
    
    extension [Self <: BatchGetItemInput](x: Self) {
      
      inline def setRequestItems(value: BatchGetRequestMap): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    }
  }
  
  trait BatchGetItemOutput extends StObject {
    
    /**
      * The read capacity units consumed by the entire BatchGetItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    
    /**
      * A map of table name to a list of items. Each object in Responses consists of a table name, along with a map of attribute data consisting of the data type and attribute value.
      */
    var Responses: js.UndefOr[BatchGetResponseMap] = js.undefined
    
    /**
      * A map of tables and their respective keys that were not processed with the current response. The UnprocessedKeys value is in the same form as RequestItems, so the value can be provided directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each element consists of:    Keys - An array of primary key attribute values that define specific items in the table.    ProjectionExpression - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.    ConsistentRead - The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.   If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
      */
    var UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.undefined
  }
  object BatchGetItemOutput {
    
    inline def apply(): BatchGetItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchGetItemOutput]
    }
    
    extension [Self <: BatchGetItemOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setResponses(value: BatchGetResponseMap): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setUnprocessedKeys(value: BatchGetRequestMap): Self = StObject.set(x, "UnprocessedKeys", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedKeysUndefined: Self = StObject.set(x, "UnprocessedKeys", js.undefined)
    }
  }
  
  type BatchGetRequestMap = StringDictionary[KeysAndAttributes]
  
  type BatchGetResponseMap = StringDictionary[ItemList]
  
  trait BatchStatementError extends StObject {
    
    /**
      *  The error code associated with the failed PartiQL batch statement. 
      */
    var Code: js.UndefOr[BatchStatementErrorCodeEnum] = js.undefined
    
    /**
      *  The error message associated with the PartiQL batch response. 
      */
    var Message: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
  }
  object BatchStatementError {
    
    inline def apply(): BatchStatementError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchStatementError]
    }
    
    extension [Self <: BatchStatementError](x: Self) {
      
      inline def setCode(value: BatchStatementErrorCodeEnum): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
      
      inline def setMessage(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ConditionalCheckFailed
    - typings.awsSdk.awsSdkStrings.ItemCollectionSizeLimitExceeded
    - typings.awsSdk.awsSdkStrings.RequestLimitExceeded
    - typings.awsSdk.awsSdkStrings.ValidationError
    - typings.awsSdk.awsSdkStrings.ProvisionedThroughputExceeded
    - typings.awsSdk.awsSdkStrings.TransactionConflict
    - typings.awsSdk.awsSdkStrings.ThrottlingError
    - typings.awsSdk.awsSdkStrings.InternalServerError
    - typings.awsSdk.awsSdkStrings.ResourceNotFound
    - typings.awsSdk.awsSdkStrings.AccessDenied
    - typings.awsSdk.awsSdkStrings.DuplicateItem
    - java.lang.String
  */
  type BatchStatementErrorCodeEnum = _BatchStatementErrorCodeEnum | java.lang.String
  
  trait BatchStatementRequest extends StObject {
    
    /**
      *  The read consistency of the PartiQL batch request. 
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsistentRead] = js.undefined
    
    /**
      *  The parameters associated with a PartiQL statement in the batch request. 
      */
    var Parameters: js.UndefOr[PreparedStatementParameters] = js.undefined
    
    /**
      *  A valid PartiQL statement. 
      */
    var Statement: PartiQLStatement
  }
  object BatchStatementRequest {
    
    inline def apply(Statement: PartiQLStatement): BatchStatementRequest = {
      val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchStatementRequest]
    }
    
    extension [Self <: BatchStatementRequest](x: Self) {
      
      inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setParameters(value: PreparedStatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
      
      inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
      
      inline def setStatement(value: PartiQLStatement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchStatementResponse extends StObject {
    
    /**
      *  The error associated with a failed PartiQL batch statement. 
      */
    var Error: js.UndefOr[BatchStatementError] = js.undefined
    
    /**
      *  A DynamoDB item associated with a BatchStatementResponse 
      */
    var Item: js.UndefOr[AttributeMap] = js.undefined
    
    /**
      *  The table name associated with a failed PartiQL batch statement. 
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object BatchStatementResponse {
    
    inline def apply(): BatchStatementResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchStatementResponse]
    }
    
    extension [Self <: BatchStatementResponse](x: Self) {
      
      inline def setError(value: BatchStatementError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      inline def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  trait BatchWriteItemInput extends StObject {
    
    /**
      * A map of one or more table names and, for each table, a list of operations to be performed (DeleteRequest or PutRequest). Each element in the map consists of the following:    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values are rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.    
      */
    var RequestItems: BatchWriteItemRequestMap
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnItemCollectionMetrics
      ] = js.undefined
  }
  object BatchWriteItemInput {
    
    inline def apply(RequestItems: BatchWriteItemRequestMap): BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchWriteItemInput]
    }
    
    extension [Self <: BatchWriteItemInput](x: Self) {
      
      inline def setRequestItems(value: BatchWriteItemRequestMap): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    }
  }
  
  trait BatchWriteItemOutput extends StObject {
    
    /**
      * The capacity units consumed by the entire BatchWriteItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    
    /**
      * A list of tables that were processed by BatchWriteItem and, for each table, information about any item collections that were affected by individual DeleteItem or PutItem operations. Each entry consists of the following subelements:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item.    SizeEstimateRangeGB - An estimate of item collection size, expressed in GB. This is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on the table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined
    
    /**
      * A map of tables and requests against those tables that were not processed. The UnprocessedItems value is in the same form as RequestItems, so you can provide this value directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each UnprocessedItems entry consists of a table name and, for that table, a list of operations to perform (DeleteRequest or PutRequest).    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.     If there are no unprocessed items remaining, the response contains an empty UnprocessedItems map.
      */
    var UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap] = js.undefined
  }
  object BatchWriteItemOutput {
    
    inline def apply(): BatchWriteItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchWriteItemOutput]
    }
    
    extension [Self <: BatchWriteItemOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setItemCollectionMetrics(value: ItemCollectionMetricsPerTable): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
      
      inline def setUnprocessedItems(value: BatchWriteItemRequestMap): Self = StObject.set(x, "UnprocessedItems", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedItemsUndefined: Self = StObject.set(x, "UnprocessedItems", js.undefined)
    }
  }
  
  type BatchWriteItemRequestMap = StringDictionary[WriteRequests]
  
  type BilledSizeBytes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PROVISIONED
    - typings.awsSdk.awsSdkStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = _BillingMode | java.lang.String
  
  trait BillingModeSummary extends StObject {
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BillingMode] = js.undefined
    
    /**
      * Represents the time when PAY_PER_REQUEST was last set as the read/write capacity mode.
      */
    var LastUpdateToPayPerRequestDateTime: js.UndefOr[js.Date] = js.undefined
  }
  object BillingModeSummary {
    
    inline def apply(): BillingModeSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingModeSummary]
    }
    
    extension [Self <: BillingModeSummary](x: Self) {
      
      inline def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      inline def setLastUpdateToPayPerRequestDateTime(value: js.Date): Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastUpdateToPayPerRequestDateTimeUndefined: Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", js.undefined)
    }
  }
  
  type BinaryAttributeValue = Buffer | js.typedarray.Uint8Array | typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Blob | java.lang.String
  
  trait BinarySet
    extends StObject
       with DynamoDbSet {
    
    var `type`: Binary_
    
    var values: js.Array[binaryType]
  }
  object BinarySet {
    
    inline def apply(values: js.Array[binaryType]): BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Binary")
      __obj.asInstanceOf[BinarySet]
    }
    
    extension [Self <: BinarySet](x: Self) {
      
      inline def setType(value: Binary_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[binaryType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: binaryType*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  
  //<!--auto-generated start-->
  trait Blob extends StObject
  
  type BooleanAttributeValue = Boolean
  
  type BooleanObject = Boolean
  
  trait Capacity extends StObject {
    
    /**
      * The total number of capacity units consumed on a table or an index.
      */
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    
    /**
      * The total number of read capacity units consumed on a table or an index.
      */
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    
    /**
      * The total number of write capacity units consumed on a table or an index.
      */
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  }
  object Capacity {
    
    inline def apply(): Capacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capacity]
    }
    
    extension [Self <: Capacity](x: Self) {
      
      inline def setCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
      
      inline def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      inline def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  type ClientRequestToken = java.lang.String
  
  type ClientToken = java.lang.String
  
  type CloudWatchLogGroupArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQ
    - typings.awsSdk.awsSdkStrings.NE
    - typings.awsSdk.awsSdkStrings.IN
    - typings.awsSdk.awsSdkStrings.LE
    - typings.awsSdk.awsSdkStrings.LT
    - typings.awsSdk.awsSdkStrings.GE
    - typings.awsSdk.awsSdkStrings.GT
    - typings.awsSdk.awsSdkStrings.BETWEEN
    - typings.awsSdk.awsSdkStrings.NOT_NULL
    - typings.awsSdk.awsSdkStrings.NULL
    - typings.awsSdk.awsSdkStrings.CONTAINS
    - typings.awsSdk.awsSdkStrings.NOT_CONTAINS
    - typings.awsSdk.awsSdkStrings.BEGINS_WITH
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  
  trait Condition extends StObject {
    
    /**
      * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
      */
    var AttributeValueList: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AttributeValueList] = js.undefined
    
    /**
      * A comparator for evaluating attributes. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}    For usage examples of AttributeValueList and ComparisonOperator, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
      */
    var ComparisonOperator: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ComparisonOperator
  }
  object Condition {
    
    inline def apply(ComparisonOperator: ComparisonOperator): Condition = {
      val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    extension [Self <: Condition](x: Self) {
      
      inline def setAttributeValueList(value: AttributeValueList): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
      
      inline def setAttributeValueListVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
      
      inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConditionCheck extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed.
      */
    var ConditionExpression: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionExpression
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * The primary key of the item to be checked. Each element consists of an attribute name and a value for that attribute.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.undefined
    
    /**
      * Name of the table for the check item request.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object ConditionCheck {
    
    inline def apply(ConditionExpression: ConditionExpression, Key: Key, TableName: TableName): ConditionCheck = {
      val __obj = js.Dynamic.literal(ConditionExpression = ConditionExpression.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionCheck]
    }
    
    extension [Self <: ConditionCheck](x: Self) {
      
      inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  type ConditionExpression = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AND
    - typings.awsSdk.awsSdkStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = _ConditionalOperator | java.lang.String
  
  type ConsistentRead = Boolean
  
  trait ConsumedCapacity extends StObject {
    
    /**
      * The total number of capacity units consumed by the operation.
      */
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    
    /**
      * The amount of throughput consumed on each global index affected by the operation.
      */
    var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
    
    /**
      * The amount of throughput consumed on each local index affected by the operation.
      */
    var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
    
    /**
      * The total number of read capacity units consumed by the operation.
      */
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    
    /**
      * The amount of throughput consumed on the table affected by the operation.
      */
    var Table: js.UndefOr[Capacity] = js.undefined
    
    /**
      * The name of the table that was affected by the operation.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
    
    /**
      * The total number of write capacity units consumed by the operation.
      */
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  }
  object ConsumedCapacity {
    
    inline def apply(): ConsumedCapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumedCapacity]
    }
    
    extension [Self <: ConsumedCapacity](x: Self) {
      
      inline def setCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      inline def setTable(value: Capacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      inline def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]
  
  type ConsumedCapacityUnits = scala.Double
  
  trait ContinuousBackupsDescription extends StObject {
    
    /**
      *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
      */
    var ContinuousBackupsStatus: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContinuousBackupsStatus
    
    /**
      * The description of the point in time recovery settings applied to the table.
      */
    var PointInTimeRecoveryDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PointInTimeRecoveryDescription
      ] = js.undefined
  }
  object ContinuousBackupsDescription {
    
    inline def apply(ContinuousBackupsStatus: ContinuousBackupsStatus): ContinuousBackupsDescription = {
      val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuousBackupsDescription]
    }
    
    extension [Self <: ContinuousBackupsDescription](x: Self) {
      
      inline def setContinuousBackupsStatus(value: ContinuousBackupsStatus): Self = StObject.set(x, "ContinuousBackupsStatus", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = _ContinuousBackupsStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLE
    - typings.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type ContributorInsightsAction = _ContributorInsightsAction | java.lang.String
  
  type ContributorInsightsRule = java.lang.String
  
  type ContributorInsightsRuleList = js.Array[ContributorInsightsRule]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ContributorInsightsStatus = _ContributorInsightsStatus | java.lang.String
  
  type ContributorInsightsSummaries = js.Array[ContributorInsightsSummary]
  
  trait ContributorInsightsSummary extends StObject {
    
    /**
      * Describes the current status for contributor insights for the given table and index, if applicable.
      */
    var ContributorInsightsStatus: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContributorInsightsStatus
      ] = js.undefined
    
    /**
      * Name of the index associated with the summary, if any.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * Name of the table associated with the summary.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object ContributorInsightsSummary {
    
    inline def apply(): ContributorInsightsSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContributorInsightsSummary]
    }
    
    extension [Self <: ContributorInsightsSummary](x: Self) {
      
      inline def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
      
      inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  trait ConverterOptions extends StObject {
    
    /**
      * An optional flag indicating that the document client should cast
      * empty strings, buffers, and sets to NULL shapes
      */
    var convertEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to return numbers as a NumberValue object instead of
      * converting them to native JavaScript numbers. This allows for the
      * safe round-trip transport of numbers of arbitrary size.
      */
    var wrapNumbers: js.UndefOr[Boolean] = js.undefined
  }
  object ConverterOptions {
    
    inline def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    extension [Self <: ConverterOptions](x: Self) {
      
      inline def setConvertEmptyValues(value: Boolean): Self = StObject.set(x, "convertEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setConvertEmptyValuesUndefined: Self = StObject.set(x, "convertEmptyValues", js.undefined)
      
      inline def setWrapNumbers(value: Boolean): Self = StObject.set(x, "wrapNumbers", value.asInstanceOf[js.Any])
      
      inline def setWrapNumbersUndefined: Self = StObject.set(x, "wrapNumbers", js.undefined)
    }
  }
  
  trait CreateBackupInput extends StObject {
    
    /**
      * Specified name for the backup.
      */
    var BackupName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupName
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object CreateBackupInput {
    
    inline def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBackupInput]
    }
    
    extension [Self <: CreateBackupInput](x: Self) {
      
      inline def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateBackupOutput extends StObject {
    
    /**
      * Contains the details of the backup created for the table.
      */
    var BackupDetails: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupDetails] = js.undefined
  }
  object CreateBackupOutput {
    
    inline def apply(): CreateBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBackupOutput]
    }
    
    extension [Self <: CreateBackupOutput](x: Self) {
      
      inline def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      inline def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
    }
  }
  
  trait CreateGlobalSecondaryIndexAction extends StObject {
    
    /**
      * The name of the global secondary index to be created.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      * The key schema for the global secondary index.
      */
    var KeySchema: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema
    
    /**
      * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
      */
    var Projection: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Projection
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput] = js.undefined
  }
  object CreateGlobalSecondaryIndexAction {
    
    inline def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): CreateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
    }
    
    extension [Self <: CreateGlobalSecondaryIndexAction](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  trait CreateGlobalTableInput extends StObject {
    
    /**
      * The global table name.
      */
    var GlobalTableName: TableName
    
    /**
      * The Regions where the global table needs to be created.
      */
    var ReplicationGroup: ReplicaList
  }
  object CreateGlobalTableInput {
    
    inline def apply(GlobalTableName: TableName, ReplicationGroup: ReplicaList): CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateGlobalTableInput]
    }
    
    extension [Self <: CreateGlobalTableInput](x: Self) {
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroup(value: ReplicaList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value*))
    }
  }
  
  trait CreateGlobalTableOutput extends StObject {
    
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.GlobalTableDescription
      ] = js.undefined
  }
  object CreateGlobalTableOutput {
    
    inline def apply(): CreateGlobalTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateGlobalTableOutput]
    }
    
    extension [Self <: CreateGlobalTableOutput](x: Self) {
      
      inline def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
  
  trait CreateReplicaAction extends StObject {
    
    /**
      * The Region of the replica to be added.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
  }
  object CreateReplicaAction {
    
    inline def apply(RegionName: RegionName): CreateReplicaAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateReplicaAction]
    }
    
    extension [Self <: CreateReplicaAction](x: Self) {
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateReplicationGroupMemberAction extends StObject {
    
    /**
      * Replica-specific global secondary index settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.undefined
    
    /**
      * The KMS key that should be used for KMS encryption in the new replica. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS key alias/aws/dynamodb.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KMSMasterKeyId] = js.undefined
    
    /**
      * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughputOverride
      ] = js.undefined
    
    /**
      * The Region where the new replica will be created.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
    
    /**
      * Replica-specific table class. If not specified, uses the source table's table class.
      */
    var TableClassOverride: js.UndefOr[TableClass] = js.undefined
  }
  object CreateReplicationGroupMemberAction {
    
    inline def apply(RegionName: RegionName): CreateReplicationGroupMemberAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateReplicationGroupMemberAction]
    }
    
    extension [Self <: CreateReplicationGroupMemberAction](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setTableClassOverride(value: TableClass): Self = StObject.set(x, "TableClassOverride", value.asInstanceOf[js.Any])
      
      inline def setTableClassOverrideUndefined: Self = StObject.set(x, "TableClassOverride", js.undefined)
    }
  }
  
  trait CreateSetOptions extends StObject {
    
    /**
      * Set to true if you want to validate the type of each element in the set. Defaults to false.
      */
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object CreateSetOptions {
    
    inline def apply(): CreateSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSetOptions]
    }
    
    extension [Self <: CreateSetOptions](x: Self) {
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait CreateTableInput extends StObject {
    
    /**
      * An array of attributes that describe the key schema for the table and indexes.
      */
    var AttributeDefinitions: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AttributeDefinitions
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BillingMode] = js.undefined
    
    /**
      * One or more global secondary indexes (the maximum is 20) to be created on the table. Each global secondary index in the array includes the following:    IndexName - The name of the global secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the global secondary index.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units.  
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.undefined
    
    /**
      * Specifies the attributes that make up the primary key for a table or an index. The attributes in KeySchema must also be defined in the AttributeDefinitions array. For more information, see Data Model in the Amazon DynamoDB Developer Guide. Each KeySchemaElement in the array is composed of:    AttributeName - The name of this key attribute.    KeyType - The role that the key attribute will assume:    HASH - partition key    RANGE - sort key      The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from the DynamoDB usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.  For a simple primary key (partition key), you must provide exactly one element with a KeyType of HASH. For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order: The first element must have a KeyType of HASH, and the second element must have a KeyType of RANGE. For more information, see Working with Tables in the Amazon DynamoDB Developer Guide.
      */
    var KeySchema: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema
    
    /**
      * One or more local secondary indexes (the maximum is 5) to be created on the table. Each index is scoped to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local secondary index is unconstrained. Each local secondary index in the array includes the following:    IndexName - The name of the local secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the local secondary index. The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.    
      */
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList] = js.undefined
    
    /**
      * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the UpdateTable operation.  If you set BillingMode as PROVISIONED, you must specify this property. If you set BillingMode as PAY_PER_REQUEST, you cannot specify this property. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput] = js.undefined
    
    /**
      * Represents the settings used to enable server-side encryption.
      */
    var SSESpecification: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SSESpecification] = js.undefined
    
    /**
      * The settings for DynamoDB Streams on the table. These settings consist of:    StreamEnabled - Indicates whether DynamoDB Streams is to be enabled (true) or disabled (false).    StreamViewType - When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.    
      */
    var StreamSpecification: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamSpecification] = js.undefined
    
    /**
      * The table class of the new table. Valid values are STANDARD and STANDARD_INFREQUENT_ACCESS.
      */
    var TableClass: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableClass] = js.undefined
    
    /**
      * The name of the table to create.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
    
    /**
      * A list of key-value pairs to label the table. For more information, see Tagging for DynamoDB.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  object CreateTableInput {
    
    inline def apply(AttributeDefinitions: AttributeDefinitions, KeySchema: KeySchema, TableName: TableName): CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTableInput]
    }
    
    extension [Self <: CreateTableInput](x: Self) {
      
      inline def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
      
      inline def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setLocalSecondaryIndexes(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      inline def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
      
      inline def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
      
      inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      inline def setTableClass(value: TableClass): Self = StObject.set(x, "TableClass", value.asInstanceOf[js.Any])
      
      inline def setTableClassUndefined: Self = StObject.set(x, "TableClass", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
  
  trait CreateTableOutput extends StObject {
    
    /**
      * Represents the properties of the table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableDescription] = js.undefined
  }
  object CreateTableOutput {
    
    inline def apply(): CreateTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTableOutput]
    }
    
    extension [Self <: CreateTableOutput](x: Self) {
      
      inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  type CsvDelimiter = java.lang.String
  
  type CsvHeader = java.lang.String
  
  type CsvHeaderList = js.Array[CsvHeader]
  
  trait CsvOptions extends StObject {
    
    /**
      *  The delimiter used for separating items in the CSV file being imported. 
      */
    var Delimiter: js.UndefOr[CsvDelimiter] = js.undefined
    
    /**
      *  List of the headers used to specify a common header for all source CSV files being imported. If this field is specified then the first line of each CSV file is treated as data instead of the header. If this field is not specified the the first line of each CSV file is treated as the header. 
      */
    var HeaderList: js.UndefOr[CsvHeaderList] = js.undefined
  }
  object CsvOptions {
    
    inline def apply(): CsvOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvOptions]
    }
    
    extension [Self <: CsvOptions](x: Self) {
      
      inline def setDelimiter(value: CsvDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
      
      inline def setHeaderList(value: CsvHeaderList): Self = StObject.set(x, "HeaderList", value.asInstanceOf[js.Any])
      
      inline def setHeaderListUndefined: Self = StObject.set(x, "HeaderList", js.undefined)
      
      inline def setHeaderListVarargs(value: CsvHeader*): Self = StObject.set(x, "HeaderList", js.Array(value*))
    }
  }
  
  type Date = js.Date
  
  trait Delete extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional delete to succeed.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionExpression] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that attribute.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.undefined
    
    /**
      * Name of the table in which the item to be deleted resides.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object Delete {
    
    inline def apply(Key: Key, TableName: TableName): Delete = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteBackupInput extends StObject {
    
    /**
      * The ARN associated with the backup.
      */
    var BackupArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupArn
  }
  object DeleteBackupInput {
    
    inline def apply(BackupArn: BackupArn): DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBackupInput]
    }
    
    extension [Self <: DeleteBackupInput](x: Self) {
      
      inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteBackupOutput extends StObject {
    
    /**
      * Contains the description of the backup created for the table.
      */
    var BackupDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupDescription] = js.undefined
  }
  object DeleteBackupOutput {
    
    inline def apply(): DeleteBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteBackupOutput]
    }
    
    extension [Self <: DeleteBackupOutput](x: Self) {
      
      inline def setBackupDescription(value: BackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
      
      inline def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
    }
  }
  
  trait DeleteGlobalSecondaryIndexAction extends StObject {
    
    /**
      * The name of the global secondary index to be deleted.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
  }
  object DeleteGlobalSecondaryIndexAction {
    
    inline def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
    }
    
    extension [Self <: DeleteGlobalSecondaryIndexAction](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteItemInput extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional DeleteItem to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information about condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionExpression] = js.undefined
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionalOperator] = js.undefined
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * A map of attribute names to AttributeValue objects, representing the primary key of the item to delete. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnItemCollectionMetrics
      ] = js.undefined
    
    /**
      * Use ReturnValues if you want to get the item attributes as they appeared before they were deleted. For DeleteItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - The content of the old item is returned.   There is no additional cost associated with requesting a return value aside from the small network and processing overhead of receiving a larger response. No read capacity units are consumed.  The ReturnValues parameter is used by several DynamoDB operations; however, DeleteItem does not recognize any values other than NONE or ALL_OLD. 
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
    
    /**
      * The name of the table from which to delete the item.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DeleteItemInput {
    
    inline def apply(Key: Key, TableName: TableName): DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteItemInput]
    }
    
    extension [Self <: DeleteItemInput](x: Self) {
      
      inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      inline def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      inline def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      inline def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteItemOutput extends StObject {
    
    /**
      * A map of attribute names to AttributeValue objects, representing the item as it appeared before the DeleteItem operation. This map appears in the response only if ReturnValues was specified as ALL_OLD in the request.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    
    /**
      * The capacity units consumed by the DeleteItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Mode in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsumedCapacity] = js.undefined
    
    /**
      * Information about item collections, if any, that were affected by the DeleteItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ItemCollectionMetrics] = js.undefined
  }
  object DeleteItemOutput {
    
    inline def apply(): DeleteItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteItemOutput]
    }
    
    extension [Self <: DeleteItemOutput](x: Self) {
      
      inline def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  trait DeleteReplicaAction extends StObject {
    
    /**
      * The Region of the replica to be removed.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
  }
  object DeleteReplicaAction {
    
    inline def apply(RegionName: RegionName): DeleteReplicaAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteReplicaAction]
    }
    
    extension [Self <: DeleteReplicaAction](x: Self) {
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteReplicationGroupMemberAction extends StObject {
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
  }
  object DeleteReplicationGroupMemberAction {
    
    inline def apply(RegionName: RegionName): DeleteReplicationGroupMemberAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteReplicationGroupMemberAction]
    }
    
    extension [Self <: DeleteReplicationGroupMemberAction](x: Self) {
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteRequest extends StObject {
    
    /**
      * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
  }
  object DeleteRequest {
    
    inline def apply(Key: Key): DeleteRequest = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRequest]
    }
    
    extension [Self <: DeleteRequest](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteTableInput extends StObject {
    
    /**
      * The name of the table to delete.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DeleteTableInput {
    
    inline def apply(TableName: TableName): DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteTableInput]
    }
    
    extension [Self <: DeleteTableInput](x: Self) {
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteTableOutput extends StObject {
    
    /**
      * Represents the properties of a table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableDescription] = js.undefined
  }
  object DeleteTableOutput {
    
    inline def apply(): DeleteTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTableOutput]
    }
    
    extension [Self <: DeleteTableOutput](x: Self) {
      
      inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  trait DescribeBackupInput extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated with the backup.
      */
    var BackupArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupArn
  }
  object DescribeBackupInput {
    
    inline def apply(BackupArn: BackupArn): DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeBackupInput]
    }
    
    extension [Self <: DescribeBackupInput](x: Self) {
      
      inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeBackupOutput extends StObject {
    
    /**
      * Contains the description of the backup created for the table.
      */
    var BackupDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupDescription] = js.undefined
  }
  object DescribeBackupOutput {
    
    inline def apply(): DescribeBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeBackupOutput]
    }
    
    extension [Self <: DescribeBackupOutput](x: Self) {
      
      inline def setBackupDescription(value: BackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
      
      inline def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
    }
  }
  
  trait DescribeContinuousBackupsInput extends StObject {
    
    /**
      * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DescribeContinuousBackupsInput {
    
    inline def apply(TableName: TableName): DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeContinuousBackupsInput]
    }
    
    extension [Self <: DescribeContinuousBackupsInput](x: Self) {
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeContinuousBackupsOutput extends StObject {
    
    /**
      * Represents the continuous backups and point in time recovery settings on the table.
      */
    var ContinuousBackupsDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContinuousBackupsDescription
      ] = js.undefined
  }
  object DescribeContinuousBackupsOutput {
    
    inline def apply(): DescribeContinuousBackupsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeContinuousBackupsOutput]
    }
    
    extension [Self <: DescribeContinuousBackupsOutput](x: Self) {
      
      inline def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
      
      inline def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
    }
  }
  
  trait DescribeContributorInsightsInput extends StObject {
    
    /**
      * The name of the global secondary index to describe, if applicable.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The name of the table to describe.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DescribeContributorInsightsInput {
    
    inline def apply(TableName: TableName): DescribeContributorInsightsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeContributorInsightsInput]
    }
    
    extension [Self <: DescribeContributorInsightsInput](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeContributorInsightsOutput extends StObject {
    
    /**
      * List of names of the associated contributor insights rules.
      */
    var ContributorInsightsRuleList: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContributorInsightsRuleList
      ] = js.undefined
    
    /**
      * Current status of contributor insights.
      */
    var ContributorInsightsStatus: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContributorInsightsStatus
      ] = js.undefined
    
    /**
      * Returns information about the last failure that was encountered. The most common exceptions for a FAILED status are:   LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.   AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient permissions.   AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient permissions.   InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.  
      */
    var FailureException: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.FailureException] = js.undefined
    
    /**
      * The name of the global secondary index being described.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * Timestamp of the last time the status was changed.
      */
    var LastUpdateDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The name of the table being described.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object DescribeContributorInsightsOutput {
    
    inline def apply(): DescribeContributorInsightsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeContributorInsightsOutput]
    }
    
    extension [Self <: DescribeContributorInsightsOutput](x: Self) {
      
      inline def setContributorInsightsRuleList(value: ContributorInsightsRuleList): Self = StObject.set(x, "ContributorInsightsRuleList", value.asInstanceOf[js.Any])
      
      inline def setContributorInsightsRuleListUndefined: Self = StObject.set(x, "ContributorInsightsRuleList", js.undefined)
      
      inline def setContributorInsightsRuleListVarargs(value: ContributorInsightsRule*): Self = StObject.set(x, "ContributorInsightsRuleList", js.Array(value*))
      
      inline def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
      
      inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
      
      inline def setFailureException(value: FailureException): Self = StObject.set(x, "FailureException", value.asInstanceOf[js.Any])
      
      inline def setFailureExceptionUndefined: Self = StObject.set(x, "FailureException", js.undefined)
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setLastUpdateDateTime(value: js.Date): Self = StObject.set(x, "LastUpdateDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "LastUpdateDateTime", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  trait DescribeEndpointsRequest extends StObject
  
  trait DescribeEndpointsResponse extends StObject {
    
    /**
      * List of endpoints.
      */
    var Endpoints: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Endpoints
  }
  object DescribeEndpointsResponse {
    
    inline def apply(Endpoints: Endpoints): DescribeEndpointsResponse = {
      val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
    
    extension [Self <: DescribeEndpointsResponse](x: Self) {
      
      inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    }
  }
  
  trait DescribeExportInput extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated with the export.
      */
    var ExportArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportArn
  }
  object DescribeExportInput {
    
    inline def apply(ExportArn: ExportArn): DescribeExportInput = {
      val __obj = js.Dynamic.literal(ExportArn = ExportArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeExportInput]
    }
    
    extension [Self <: DescribeExportInput](x: Self) {
      
      inline def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeExportOutput extends StObject {
    
    /**
      * Represents the properties of the export.
      */
    var ExportDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportDescription] = js.undefined
  }
  object DescribeExportOutput {
    
    inline def apply(): DescribeExportOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeExportOutput]
    }
    
    extension [Self <: DescribeExportOutput](x: Self) {
      
      inline def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
      
      inline def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
    }
  }
  
  trait DescribeGlobalTableInput extends StObject {
    
    /**
      * The name of the global table.
      */
    var GlobalTableName: TableName
  }
  object DescribeGlobalTableInput {
    
    inline def apply(GlobalTableName: TableName): DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableInput]
    }
    
    extension [Self <: DescribeGlobalTableInput](x: Self) {
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeGlobalTableOutput extends StObject {
    
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.GlobalTableDescription
      ] = js.undefined
  }
  object DescribeGlobalTableOutput {
    
    inline def apply(): DescribeGlobalTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeGlobalTableOutput]
    }
    
    extension [Self <: DescribeGlobalTableOutput](x: Self) {
      
      inline def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
  
  trait DescribeGlobalTableSettingsInput extends StObject {
    
    /**
      * The name of the global table to describe.
      */
    var GlobalTableName: TableName
  }
  object DescribeGlobalTableSettingsInput {
    
    inline def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
    }
    
    extension [Self <: DescribeGlobalTableSettingsInput](x: Self) {
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeGlobalTableSettingsOutput extends StObject {
    
    /**
      * The name of the global table.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * The Region-specific settings for the global table.
      */
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
  }
  object DescribeGlobalTableSettingsOutput {
    
    inline def apply(): DescribeGlobalTableSettingsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
    }
    
    extension [Self <: DescribeGlobalTableSettingsOutput](x: Self) {
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
      
      inline def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value*))
    }
  }
  
  trait DescribeImportInput extends StObject {
    
    /**
      *  The Amazon Resource Name (ARN) associated with the table you're importing to. 
      */
    var ImportArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportArn
  }
  object DescribeImportInput {
    
    inline def apply(ImportArn: ImportArn): DescribeImportInput = {
      val __obj = js.Dynamic.literal(ImportArn = ImportArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeImportInput]
    }
    
    extension [Self <: DescribeImportInput](x: Self) {
      
      inline def setImportArn(value: ImportArn): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeImportOutput extends StObject {
    
    /**
      *  Represents the properties of the table created for the import, and parameters of the import. The import parameters include import status, how many items were processed, and how many errors were encountered. 
      */
    var ImportTableDescription: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportTableDescription
  }
  object DescribeImportOutput {
    
    inline def apply(ImportTableDescription: ImportTableDescription): DescribeImportOutput = {
      val __obj = js.Dynamic.literal(ImportTableDescription = ImportTableDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeImportOutput]
    }
    
    extension [Self <: DescribeImportOutput](x: Self) {
      
      inline def setImportTableDescription(value: ImportTableDescription): Self = StObject.set(x, "ImportTableDescription", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeKinesisStreamingDestinationInput extends StObject {
    
    /**
      * The name of the table being described.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DescribeKinesisStreamingDestinationInput {
    
    inline def apply(TableName: TableName): DescribeKinesisStreamingDestinationInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeKinesisStreamingDestinationInput]
    }
    
    extension [Self <: DescribeKinesisStreamingDestinationInput](x: Self) {
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeKinesisStreamingDestinationOutput extends StObject {
    
    /**
      * The list of replica structures for the table being described.
      */
    var KinesisDataStreamDestinations: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KinesisDataStreamDestinations
      ] = js.undefined
    
    /**
      * The name of the table being described.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object DescribeKinesisStreamingDestinationOutput {
    
    inline def apply(): DescribeKinesisStreamingDestinationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeKinesisStreamingDestinationOutput]
    }
    
    extension [Self <: DescribeKinesisStreamingDestinationOutput](x: Self) {
      
      inline def setKinesisDataStreamDestinations(value: KinesisDataStreamDestinations): Self = StObject.set(x, "KinesisDataStreamDestinations", value.asInstanceOf[js.Any])
      
      inline def setKinesisDataStreamDestinationsUndefined: Self = StObject.set(x, "KinesisDataStreamDestinations", js.undefined)
      
      inline def setKinesisDataStreamDestinationsVarargs(value: KinesisDataStreamDestination*): Self = StObject.set(x, "KinesisDataStreamDestinations", js.Array(value*))
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  trait DescribeLimitsInput extends StObject
  
  trait DescribeLimitsOutput extends StObject {
    
    /**
      * The maximum total read capacity units that your account allows you to provision across all of your tables in this Region.
      */
    var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * The maximum total write capacity units that your account allows you to provision across all of your tables in this Region.
      */
    var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this Region, including the read capacity units provisioned for its global secondary indexes (GSIs).
      */
    var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this Region, including the write capacity units provisioned for its global secondary indexes (GSIs).
      */
    var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  object DescribeLimitsOutput {
    
    inline def apply(): DescribeLimitsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeLimitsOutput]
    }
    
    extension [Self <: DescribeLimitsOutput](x: Self) {
      
      inline def setAccountMaxReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "AccountMaxReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setAccountMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxReadCapacityUnits", js.undefined)
      
      inline def setAccountMaxWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "AccountMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setAccountMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxWriteCapacityUnits", js.undefined)
      
      inline def setTableMaxReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "TableMaxReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setTableMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxReadCapacityUnits", js.undefined)
      
      inline def setTableMaxWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "TableMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setTableMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxWriteCapacityUnits", js.undefined)
    }
  }
  
  trait DescribeTableInput extends StObject {
    
    /**
      * The name of the table to describe.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DescribeTableInput {
    
    inline def apply(TableName: TableName): DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTableInput]
    }
    
    extension [Self <: DescribeTableInput](x: Self) {
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeTableOutput extends StObject {
    
    /**
      * The properties of the table.
      */
    var Table: js.UndefOr[TableDescription] = js.undefined
  }
  object DescribeTableOutput {
    
    inline def apply(): DescribeTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeTableOutput]
    }
    
    extension [Self <: DescribeTableOutput](x: Self) {
      
      inline def setTable(value: TableDescription): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
  
  trait DescribeTableReplicaAutoScalingInput extends StObject {
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DescribeTableReplicaAutoScalingInput {
    
    inline def apply(TableName: TableName): DescribeTableReplicaAutoScalingInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTableReplicaAutoScalingInput]
    }
    
    extension [Self <: DescribeTableReplicaAutoScalingInput](x: Self) {
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeTableReplicaAutoScalingOutput extends StObject {
    
    /**
      * Represents the auto scaling properties of the table.
      */
    var TableAutoScalingDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableAutoScalingDescription
      ] = js.undefined
  }
  object DescribeTableReplicaAutoScalingOutput {
    
    inline def apply(): DescribeTableReplicaAutoScalingOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
    }
    
    extension [Self <: DescribeTableReplicaAutoScalingOutput](x: Self) {
      
      inline def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
      
      inline def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
    }
  }
  
  trait DescribeTimeToLiveInput extends StObject {
    
    /**
      * The name of the table to be described.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object DescribeTimeToLiveInput {
    
    inline def apply(TableName: TableName): DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTimeToLiveInput]
    }
    
    extension [Self <: DescribeTimeToLiveInput](x: Self) {
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeTimeToLiveOutput extends StObject {
    
    /**
      * 
      */
    var TimeToLiveDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TimeToLiveDescription] = js.undefined
  }
  object DescribeTimeToLiveOutput {
    
    inline def apply(): DescribeTimeToLiveOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeTimeToLiveOutput]
    }
    
    extension [Self <: DescribeTimeToLiveOutput](x: Self) {
      
      inline def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.ENABLE_FAILED
    - java.lang.String
  */
  type DestinationStatus = _DestinationStatus | java.lang.String
  
  trait DocumentClientOptions
    extends StObject
       with ConverterOptions {
    
    /**
      * An optional map of parameters to bind to every request sent by this service object.
      */
    var params: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * An optional pre-configured instance
      * of the AWS.DynamoDB service object. This instance's config will be
      * copied to a new instance used by this client. You should not need to
      * retain a reference to the input object, and may destroy it or allow it
      * to be garbage collected.
      */
    var service: js.UndefOr[^] = js.undefined
  }
  object DocumentClientOptions {
    
    inline def apply(): DocumentClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentClientOptions]
    }
    
    extension [Self <: DocumentClientOptions](x: Self) {
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setService(value: ^): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
  
  type Double = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StringSet
    - typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.NumberSet
    - typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BinarySet
  */
  trait DynamoDbSet extends StObject
  object DynamoDbSet {
    
    inline def BinarySet(values: js.Array[binaryType]): typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Binary")
      __obj.asInstanceOf[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BinarySet]
    }
    
    inline def NumberSet(values: js.Array[scala.Double]): typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Number")
      __obj.asInstanceOf[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.NumberSet]
    }
    
    inline def StringSet(values: js.Array[java.lang.String]): typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("String")
      __obj.asInstanceOf[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StringSet]
    }
  }
  
  trait Endpoint extends StObject {
    
    /**
      * IP address of the endpoint.
      */
    var Address: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String
    
    /**
      * Endpoint cache time to live (TTL) value.
      */
    var CachePeriodInMinutes: Long
  }
  object Endpoint {
    
    inline def apply(
      Address: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String,
      CachePeriodInMinutes: Long
    ): Endpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setAddress(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      inline def setCachePeriodInMinutes(value: Long): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
    }
  }
  
  type Endpoints = js.Array[Endpoint]
  
  type ErrorCount = scala.Double
  
  type ExceptionDescription = java.lang.String
  
  type ExceptionName = java.lang.String
  
  trait ExecuteStatementInput extends StObject {
    
    /**
      * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsistentRead] = js.undefined
    
    /**
      * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, along with a key in LastEvaluatedKey to apply in a subsequent operation so you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. 
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    
    /**
      * Set this value to get remaining results, if NextToken was returned in the statement response.
      */
    var NextToken: js.UndefOr[PartiQLNextToken] = js.undefined
    
    /**
      * The parameters for the PartiQL statement, if any.
      */
    var Parameters: js.UndefOr[PreparedStatementParameters] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * The PartiQL statement representing the operation to run.
      */
    var Statement: PartiQLStatement
  }
  object ExecuteStatementInput {
    
    inline def apply(Statement: PartiQLStatement): ExecuteStatementInput = {
      val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteStatementInput]
    }
    
    extension [Self <: ExecuteStatementInput](x: Self) {
      
      inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setNextToken(value: PartiQLNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setParameters(value: PreparedStatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
      
      inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setStatement(value: PartiQLStatement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecuteStatementOutput extends StObject {
    
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsumedCapacity] = js.undefined
    
    /**
      * If a read operation was used, this property will contain the result of the read operation; a map of attribute names and their values. For the write operations this value will be empty.
      */
    var Items: js.UndefOr[ItemList] = js.undefined
    
    /**
      * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty. 
      */
    var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
    
    /**
      * If the response of a read request exceeds the response payload limit DynamoDB will set this value in the response. If set, you can use that this value in the subsequent request to get the remaining results.
      */
    var NextToken: js.UndefOr[PartiQLNextToken] = js.undefined
  }
  object ExecuteStatementOutput {
    
    inline def apply(): ExecuteStatementOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteStatementOutput]
    }
    
    extension [Self <: ExecuteStatementOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      inline def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value*))
      
      inline def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      inline def setNextToken(value: PartiQLNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ExecuteTransactionInput extends StObject {
    
    /**
      * Set this value to get remaining results, if NextToken was returned in the statement response.
      */
    var ClientRequestToken: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ClientRequestToken] = js.undefined
    
    /**
      * Determines the level of detail about either provisioned or on-demand throughput consumption that is returned in the response. For more information, see TransactGetItems and TransactWriteItems.
      */
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * The list of PartiQL statements representing the transaction to run.
      */
    var TransactStatements: ParameterizedStatements
  }
  object ExecuteTransactionInput {
    
    inline def apply(TransactStatements: ParameterizedStatements): ExecuteTransactionInput = {
      val __obj = js.Dynamic.literal(TransactStatements = TransactStatements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteTransactionInput]
    }
    
    extension [Self <: ExecuteTransactionInput](x: Self) {
      
      inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setTransactStatements(value: ParameterizedStatements): Self = StObject.set(x, "TransactStatements", value.asInstanceOf[js.Any])
      
      inline def setTransactStatementsVarargs(value: ParameterizedStatement*): Self = StObject.set(x, "TransactStatements", js.Array(value*))
    }
  }
  
  trait ExecuteTransactionOutput extends StObject {
    
    /**
      * The capacity units consumed by the entire operation. The values of the list are ordered according to the ordering of the statements.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    
    /**
      * The response to a PartiQL transaction.
      */
    var Responses: js.UndefOr[ItemResponseList] = js.undefined
  }
  object ExecuteTransactionOutput {
    
    inline def apply(): ExecuteTransactionOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteTransactionOutput]
    }
    
    extension [Self <: ExecuteTransactionOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setResponses(value: ItemResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setResponsesVarargs(value: ItemResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
    }
  }
  
  type ExpectedAttributeMap = StringDictionary[ExpectedAttributeValue]
  
  trait ExpectedAttributeValue extends StObject {
    
    /**
      * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values. For information on specifying data types in JSON, see JSON Data Format in the Amazon DynamoDB Developer Guide.
      */
    var AttributeValueList: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AttributeValueList] = js.undefined
    
    /**
      * A comparator for evaluating attributes in the AttributeValueList. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}   
      */
    var ComparisonOperator: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ComparisonOperator] = js.undefined
    
    /**
      * Causes DynamoDB to evaluate the value before attempting a conditional operation:   If Exists is true, DynamoDB will check to see if that attribute value already exists in the table. If it is found, then the operation succeeds. If it is not found, the operation fails with a ConditionCheckFailedException.   If Exists is false, DynamoDB assumes that the attribute value does not exist in the table. If in fact the value does not exist, then the assumption is valid and the operation succeeds. If the value is found, despite the assumption that it does not exist, the operation fails with a ConditionCheckFailedException.   The default setting for Exists is true. If you supply a Value all by itself, DynamoDB assumes the attribute exists: You don't have to set Exists to true, because it is implied. DynamoDB returns a ValidationException if:    Exists is true but there is no Value to check. (You expect a value to exist, but don't specify what that value is.)    Exists is false but you also provide a Value. (You cannot expect an attribute to have a value, while also expecting it not to exist.)  
      */
    var Exists: js.UndefOr[BooleanObject] = js.undefined
    
    /**
      * Represents the data for the expected attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide.
      */
    var Value: js.UndefOr[AttributeValue] = js.undefined
  }
  object ExpectedAttributeValue {
    
    inline def apply(): ExpectedAttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectedAttributeValue]
    }
    
    extension [Self <: ExpectedAttributeValue](x: Self) {
      
      inline def setAttributeValueList(value: AttributeValueList): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
      
      inline def setAttributeValueListVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
      
      inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
      
      inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
      
      inline def setExists(value: BooleanObject): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "Exists", js.undefined)
      
      inline def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type ExportArn = java.lang.String
  
  trait ExportDescription extends StObject {
    
    /**
      * The billable size of the table export.
      */
    var BilledSizeBytes: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BilledSizeBytes] = js.undefined
    
    /**
      * The client token that was provided for the export task. A client token makes calls to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call.
      */
    var ClientToken: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ClientToken] = js.undefined
    
    /**
      * The time at which the export task completed.
      */
    var EndTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the table export.
      */
    var ExportArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportArn] = js.undefined
    
    /**
      * The format of the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
      */
    var ExportFormat: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportFormat] = js.undefined
    
    /**
      * The name of the manifest file for the export task.
      */
    var ExportManifest: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportManifest] = js.undefined
    
    /**
      * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
      */
    var ExportStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportStatus] = js.undefined
    
    /**
      * Point in time from which table data was exported.
      */
    var ExportTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Status code for the result of the failed export.
      */
    var FailureCode: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.FailureCode] = js.undefined
    
    /**
      * Export failure reason description.
      */
    var FailureMessage: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.FailureMessage] = js.undefined
    
    /**
      * The number of items exported.
      */
    var ItemCount: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ItemCount] = js.undefined
    
    /**
      * The name of the Amazon S3 bucket containing the export.
      */
    var S3Bucket: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3Bucket] = js.undefined
    
    /**
      * The ID of the Amazon Web Services account that owns the bucket containing the export.
      */
    var S3BucketOwner: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3BucketOwner] = js.undefined
    
    /**
      * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
      */
    var S3Prefix: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3Prefix] = js.undefined
    
    /**
      * Type of encryption used on the bucket where export data is stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with KMS managed keys  
      */
    var S3SseAlgorithm: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3SseAlgorithm] = js.undefined
    
    /**
      * The ID of the KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
      */
    var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3SseKmsKeyId] = js.undefined
    
    /**
      * The time at which the export task began.
      */
    var StartTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the table that was exported.
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn] = js.undefined
    
    /**
      * Unique ID of the table that was exported.
      */
    var TableId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableId] = js.undefined
  }
  object ExportDescription {
    
    inline def apply(): ExportDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportDescription]
    }
    
    extension [Self <: ExportDescription](x: Self) {
      
      inline def setBilledSizeBytes(value: BilledSizeBytes): Self = StObject.set(x, "BilledSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setBilledSizeBytesUndefined: Self = StObject.set(x, "BilledSizeBytes", js.undefined)
      
      inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
      
      inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      inline def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
      
      inline def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
      
      inline def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
      
      inline def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
      
      inline def setExportManifest(value: ExportManifest): Self = StObject.set(x, "ExportManifest", value.asInstanceOf[js.Any])
      
      inline def setExportManifestUndefined: Self = StObject.set(x, "ExportManifest", js.undefined)
      
      inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
      
      inline def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
      
      inline def setExportTime(value: js.Date): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
      
      inline def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
      
      inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
      
      inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
      
      inline def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
      
      inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
      
      inline def setItemCount(value: ItemCount): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
      
      inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
      
      inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
      
      inline def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
      
      inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
      
      inline def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
      
      inline def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    }
  }
  
  type ExportEndTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DYNAMODB_JSON
    - typings.awsSdk.awsSdkStrings.ION
    - java.lang.String
  */
  type ExportFormat = _ExportFormat | java.lang.String
  
  type ExportManifest = java.lang.String
  
  type ExportNextToken = java.lang.String
  
  type ExportStartTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ExportStatus = _ExportStatus | java.lang.String
  
  type ExportSummaries = js.Array[ExportSummary]
  
  trait ExportSummary extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the export.
      */
    var ExportArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportArn] = js.undefined
    
    /**
      * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
      */
    var ExportStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportStatus] = js.undefined
  }
  object ExportSummary {
    
    inline def apply(): ExportSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSummary]
    }
    
    extension [Self <: ExportSummary](x: Self) {
      
      inline def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
      
      inline def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
      
      inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
      
      inline def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
    }
  }
  
  trait ExportTableToPointInTimeInput extends StObject {
    
    /**
      * Providing a ClientToken makes the call to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call. A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an ImportConflictException.
      */
    var ClientToken: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ClientToken] = js.undefined
    
    /**
      * The format for the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
      */
    var ExportFormat: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportFormat] = js.undefined
    
    /**
      * Time in the past from which to export table data, counted in seconds from the start of the Unix epoch. The table export will be a snapshot of the table's state at this point in time.
      */
    var ExportTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The name of the Amazon S3 bucket to export the snapshot to.
      */
    var S3Bucket: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3Bucket
    
    /**
      * The ID of the Amazon Web Services account that owns the bucket the export will be stored in.
      */
    var S3BucketOwner: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3BucketOwner] = js.undefined
    
    /**
      * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
      */
    var S3Prefix: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3Prefix] = js.undefined
    
    /**
      * Type of encryption used on the bucket where export data will be stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with KMS managed keys  
      */
    var S3SseAlgorithm: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3SseAlgorithm] = js.undefined
    
    /**
      * The ID of the KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
      */
    var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3SseKmsKeyId] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) associated with the table to export.
      */
    var TableArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn
  }
  object ExportTableToPointInTimeInput {
    
    inline def apply(S3Bucket: S3Bucket, TableArn: TableArn): ExportTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any], TableArn = TableArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportTableToPointInTimeInput]
    }
    
    extension [Self <: ExportTableToPointInTimeInput](x: Self) {
      
      inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
      
      inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
      
      inline def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
      
      inline def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
      
      inline def setExportTime(value: js.Date): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
      
      inline def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
      
      inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
      
      inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
      
      inline def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
      
      inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
      
      inline def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
      
      inline def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportTableToPointInTimeOutput extends StObject {
    
    /**
      * Contains a description of the table export.
      */
    var ExportDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportDescription] = js.undefined
  }
  object ExportTableToPointInTimeOutput {
    
    inline def apply(): ExportTableToPointInTimeOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportTableToPointInTimeOutput]
    }
    
    extension [Self <: ExportTableToPointInTimeOutput](x: Self) {
      
      inline def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
      
      inline def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
    }
  }
  
  type ExportTime = js.Date
  
  type ExpressionAttributeNameMap = StringDictionary[AttributeName]
  
  type ExpressionAttributeNameVariable = java.lang.String
  
  type ExpressionAttributeValueMap = StringDictionary[AttributeValue]
  
  type ExpressionAttributeValueVariable = java.lang.String
  
  type FailureCode = java.lang.String
  
  trait FailureException extends StObject {
    
    /**
      * Description of the failure.
      */
    var ExceptionDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExceptionDescription] = js.undefined
    
    /**
      * Exception name.
      */
    var ExceptionName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExceptionName] = js.undefined
  }
  object FailureException {
    
    inline def apply(): FailureException = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailureException]
    }
    
    extension [Self <: FailureException](x: Self) {
      
      inline def setExceptionDescription(value: ExceptionDescription): Self = StObject.set(x, "ExceptionDescription", value.asInstanceOf[js.Any])
      
      inline def setExceptionDescriptionUndefined: Self = StObject.set(x, "ExceptionDescription", js.undefined)
      
      inline def setExceptionName(value: ExceptionName): Self = StObject.set(x, "ExceptionName", value.asInstanceOf[js.Any])
      
      inline def setExceptionNameUndefined: Self = StObject.set(x, "ExceptionName", js.undefined)
    }
  }
  
  type FailureMessage = java.lang.String
  
  type FilterConditionMap = StringDictionary[Condition]
  
  trait Get extends StObject {
    
    /**
      * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * A map of attribute names to AttributeValue objects that specifies the primary key of the item to retrieve.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
    
    /**
      * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes of the specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression] = js.undefined
    
    /**
      * The name of the table from which to retrieve the specified item.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object Get {
    
    inline def apply(Key: Key, TableName: TableName): Get = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetItemInput extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    
    /**
      * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsistentRead] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * A map of attribute names to AttributeValue objects, representing the primary key of the item to retrieve. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
    
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result. For more information, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * The name of the table containing the requested item.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object GetItemInput {
    
    inline def apply(Key: Key, TableName: TableName): GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetItemInput]
    }
    
    extension [Self <: GetItemInput](x: Self) {
      
      inline def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      inline def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
      
      inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetItemOutput extends StObject {
    
    /**
      * The capacity units consumed by the GetItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsumedCapacity] = js.undefined
    
    /**
      * A map of attribute names to AttributeValue objects, as specified by ProjectionExpression.
      */
    var Item: js.UndefOr[AttributeMap] = js.undefined
  }
  object GetItemOutput {
    
    inline def apply(): GetItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetItemOutput]
    }
    
    extension [Self <: GetItemOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    }
  }
  
  trait GlobalSecondaryIndex extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Projection
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput] = js.undefined
  }
  object GlobalSecondaryIndex {
    
    inline def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): GlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalSecondaryIndex]
    }
    
    extension [Self <: GlobalSecondaryIndex](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  trait GlobalSecondaryIndexAutoScalingUpdate extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  }
  object GlobalSecondaryIndexAutoScalingUpdate {
    
    inline def apply(): GlobalSecondaryIndexAutoScalingUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexAutoScalingUpdate]
    }
    
    extension [Self <: GlobalSecondaryIndexAutoScalingUpdate](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[GlobalSecondaryIndexAutoScalingUpdate]
  
  trait GlobalSecondaryIndexDescription extends StObject {
    
    /**
      * Indicates whether the index is currently backfilling. Backfilling is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and Backfilling is false. You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false.   For indexes that were created during a CreateTable operation, the Backfilling attribute does not appear in the DescribeTable output. 
      */
    var Backfilling: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Backfilling] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the index.
      */
    var IndexArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var IndexSizeBytes: js.UndefOr[Long] = js.undefined
    
    /**
      * The current state of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
      */
    var IndexStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexStatus] = js.undefined
    
    /**
      * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.undefined
    
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema] = js.undefined
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Projection] = js.undefined
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
  }
  object GlobalSecondaryIndexDescription {
    
    inline def apply(): GlobalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexDescription]
    }
    
    extension [Self <: GlobalSecondaryIndexDescription](x: Self) {
      
      inline def setBackfilling(value: Backfilling): Self = StObject.set(x, "Backfilling", value.asInstanceOf[js.Any])
      
      inline def setBackfillingUndefined: Self = StObject.set(x, "Backfilling", js.undefined)
      
      inline def setIndexArn(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
      
      inline def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setIndexSizeBytes(value: Long): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
      
      inline def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      inline def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      inline def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      inline def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]
  
  trait GlobalSecondaryIndexInfo extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema] = js.undefined
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Projection] = js.undefined
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. 
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput] = js.undefined
  }
  object GlobalSecondaryIndexInfo {
    
    inline def apply(): GlobalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexInfo]
    }
    
    extension [Self <: GlobalSecondaryIndexInfo](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]
  
  trait GlobalSecondaryIndexUpdate extends StObject {
    
    /**
      * The parameters required for creating a global secondary index on an existing table:    IndexName      KeySchema      AttributeDefinitions      Projection      ProvisionedThroughput    
      */
    var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined
    
    /**
      * The name of an existing global secondary index to be removed.
      */
    var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined
    
    /**
      * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.
      */
    var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined
  }
  object GlobalSecondaryIndexUpdate {
    
    inline def apply(): GlobalSecondaryIndexUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexUpdate]
    }
    
    extension [Self <: GlobalSecondaryIndexUpdate](x: Self) {
      
      inline def setCreate(value: CreateGlobalSecondaryIndexAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      inline def setDelete(value: DeleteGlobalSecondaryIndexAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      inline def setUpdate(value: UpdateGlobalSecondaryIndexAction): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]
  
  type GlobalSecondaryIndexes = js.Array[GlobalSecondaryIndexInfo]
  
  trait GlobalTable extends StObject {
    
    /**
      * The global table name.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * The Regions where the global table has replicas.
      */
    var ReplicationGroup: js.UndefOr[ReplicaList] = js.undefined
  }
  object GlobalTable {
    
    inline def apply(): GlobalTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTable]
    }
    
    extension [Self <: GlobalTable](x: Self) {
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setReplicationGroup(value: ReplicaList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value*))
    }
  }
  
  type GlobalTableArnString = java.lang.String
  
  trait GlobalTableDescription extends StObject {
    
    /**
      * The creation time of the global table.
      */
    var CreationDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The unique identifier of the global table.
      */
    var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.undefined
    
    /**
      * The global table name.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
      */
    var GlobalTableStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.GlobalTableStatus] = js.undefined
    
    /**
      * The Regions where the global table has replicas.
      */
    var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.undefined
  }
  object GlobalTableDescription {
    
    inline def apply(): GlobalTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableDescription]
    }
    
    extension [Self <: GlobalTableDescription](x: Self) {
      
      inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      inline def setGlobalTableArn(value: GlobalTableArnString): Self = StObject.set(x, "GlobalTableArn", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableArnUndefined: Self = StObject.set(x, "GlobalTableArn", js.undefined)
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setGlobalTableStatus(value: GlobalTableStatus): Self = StObject.set(x, "GlobalTableStatus", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableStatusUndefined: Self = StObject.set(x, "GlobalTableStatus", js.undefined)
      
      inline def setReplicationGroup(value: ReplicaDescriptionList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: ReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value*))
    }
  }
  
  trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      * Auto scaling settings for managing a global secondary index's write capacity units.
      */
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  object GlobalTableGlobalSecondaryIndexSettingsUpdate {
    
    inline def apply(IndexName: IndexName): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
    }
    
    extension [Self <: GlobalTableGlobalSecondaryIndexSettingsUpdate](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityUnits", js.undefined)
    }
  }
  
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  
  type GlobalTableList = js.Array[GlobalTable]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = _GlobalTableStatus | java.lang.String
  
  type ImportArn = java.lang.String
  
  type ImportEndTime = js.Date
  
  type ImportNextToken = java.lang.String
  
  type ImportStartTime = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.CANCELLING
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ImportStatus = _ImportStatus | java.lang.String
  
  trait ImportSummary extends StObject {
    
    /**
      *  The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task. 
      */
    var CloudWatchLogGroupArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.CloudWatchLogGroupArn] = js.undefined
    
    /**
      *  The time at which this import task ended. (Does this include the successful complete creation of the table it was imported to?) 
      */
    var EndTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      *  The Amazon Resource Number (ARN) corresponding to the import request. 
      */
    var ImportArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportArn] = js.undefined
    
    /**
      *  The status of the import operation. 
      */
    var ImportStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportStatus] = js.undefined
    
    /**
      *  The format of the source data. Valid values are CSV, DYNAMODB_JSON or ION.
      */
    var InputFormat: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.InputFormat] = js.undefined
    
    /**
      *  The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required), S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester). 
      */
    var S3BucketSource: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3BucketSource] = js.undefined
    
    /**
      *  The time at which this import task began. 
      */
    var StartTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      *  The Amazon Resource Number (ARN) of the table being imported into. 
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn] = js.undefined
  }
  object ImportSummary {
    
    inline def apply(): ImportSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportSummary]
    }
    
    extension [Self <: ImportSummary](x: Self) {
      
      inline def setCloudWatchLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
      
      inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      inline def setImportArn(value: ImportArn): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
      
      inline def setImportArnUndefined: Self = StObject.set(x, "ImportArn", js.undefined)
      
      inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
      
      inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
      
      inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
      
      inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
      
      inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
      
      inline def setS3BucketSourceUndefined: Self = StObject.set(x, "S3BucketSource", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    }
  }
  
  type ImportSummaryList = js.Array[ImportSummary]
  
  trait ImportTableDescription extends StObject {
    
    /**
      *  The client token that was provided for the import task. Reusing the client token on retry makes a call to ImportTable idempotent. 
      */
    var ClientToken: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ClientToken] = js.undefined
    
    /**
      *  The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table. 
      */
    var CloudWatchLogGroupArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.CloudWatchLogGroupArn] = js.undefined
    
    /**
      *  The time at which the creation of the table associated with this import task completed. 
      */
    var EndTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      *  The number of errors occurred on importing the source file into the target table. 
      */
    var ErrorCount: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ErrorCount] = js.undefined
    
    /**
      *  The error code corresponding to the failure that the import job ran into during execution. 
      */
    var FailureCode: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.FailureCode] = js.undefined
    
    /**
      *  The error message corresponding to the failure that the import job ran into during execution. 
      */
    var FailureMessage: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.FailureMessage] = js.undefined
    
    /**
      *  The Amazon Resource Number (ARN) corresponding to the import request. 
      */
    var ImportArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportArn] = js.undefined
    
    /**
      *  The status of the import. 
      */
    var ImportStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportStatus] = js.undefined
    
    /**
      *  The number of items successfully imported into the new table. 
      */
    var ImportedItemCount: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportedItemCount] = js.undefined
    
    /**
      *  The compression options for the data that has been imported into the target table. The values are NONE, GZIP, or ZSTD. 
      */
    var InputCompressionType: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.InputCompressionType] = js.undefined
    
    /**
      *  The format of the source data going into the target table. 
      */
    var InputFormat: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.InputFormat] = js.undefined
    
    /**
      *  The format options for the data that was imported into the target table. There is one value, CsvOption. 
      */
    var InputFormatOptions: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.InputFormatOptions] = js.undefined
    
    /**
      *  The total number of items processed from the source file. 
      */
    var ProcessedItemCount: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProcessedItemCount] = js.undefined
    
    /**
      *  The total size of data processed from the source file, in Bytes. 
      */
    var ProcessedSizeBytes: js.UndefOr[Long] = js.undefined
    
    /**
      *  Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix (optional) and bucket account owner ID (optional). 
      */
    var S3BucketSource: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3BucketSource] = js.undefined
    
    /**
      *  The time when this import task started. 
      */
    var StartTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      *  The Amazon Resource Number (ARN) of the table being imported into. 
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn] = js.undefined
    
    /**
      *  The parameters for the new table that is being imported into. 
      */
    var TableCreationParameters: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableCreationParameters
      ] = js.undefined
    
    /**
      *  The table id corresponding to the table created by import table process. 
      */
    var TableId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableId] = js.undefined
  }
  object ImportTableDescription {
    
    inline def apply(): ImportTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportTableDescription]
    }
    
    extension [Self <: ImportTableDescription](x: Self) {
      
      inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
      
      inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
      
      inline def setCloudWatchLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
      
      inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      inline def setErrorCount(value: ErrorCount): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
      
      inline def setErrorCountUndefined: Self = StObject.set(x, "ErrorCount", js.undefined)
      
      inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
      
      inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
      
      inline def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
      
      inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
      
      inline def setImportArn(value: ImportArn): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
      
      inline def setImportArnUndefined: Self = StObject.set(x, "ImportArn", js.undefined)
      
      inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
      
      inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
      
      inline def setImportedItemCount(value: ImportedItemCount): Self = StObject.set(x, "ImportedItemCount", value.asInstanceOf[js.Any])
      
      inline def setImportedItemCountUndefined: Self = StObject.set(x, "ImportedItemCount", js.undefined)
      
      inline def setInputCompressionType(value: InputCompressionType): Self = StObject.set(x, "InputCompressionType", value.asInstanceOf[js.Any])
      
      inline def setInputCompressionTypeUndefined: Self = StObject.set(x, "InputCompressionType", js.undefined)
      
      inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
      
      inline def setInputFormatOptions(value: InputFormatOptions): Self = StObject.set(x, "InputFormatOptions", value.asInstanceOf[js.Any])
      
      inline def setInputFormatOptionsUndefined: Self = StObject.set(x, "InputFormatOptions", js.undefined)
      
      inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
      
      inline def setProcessedItemCount(value: ProcessedItemCount): Self = StObject.set(x, "ProcessedItemCount", value.asInstanceOf[js.Any])
      
      inline def setProcessedItemCountUndefined: Self = StObject.set(x, "ProcessedItemCount", js.undefined)
      
      inline def setProcessedSizeBytes(value: Long): Self = StObject.set(x, "ProcessedSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setProcessedSizeBytesUndefined: Self = StObject.set(x, "ProcessedSizeBytes", js.undefined)
      
      inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
      
      inline def setS3BucketSourceUndefined: Self = StObject.set(x, "S3BucketSource", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      inline def setTableCreationParameters(value: TableCreationParameters): Self = StObject.set(x, "TableCreationParameters", value.asInstanceOf[js.Any])
      
      inline def setTableCreationParametersUndefined: Self = StObject.set(x, "TableCreationParameters", js.undefined)
      
      inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    }
  }
  
  trait ImportTableInput extends StObject {
    
    /**
      * Providing a ClientToken makes the call to ImportTableInput idempotent, meaning that multiple identical calls have the same effect as one single call. A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
      */
    var ClientToken: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ClientToken] = js.undefined
    
    /**
      *  Type of compression to be used on the input coming from the imported table. 
      */
    var InputCompressionType: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.InputCompressionType] = js.undefined
    
    /**
      *  The format of the source data. Valid values for ImportFormat are CSV, DYNAMODB_JSON or ION. 
      */
    var InputFormat: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.InputFormat
    
    /**
      *  Additional properties that specify how the input is formatted, 
      */
    var InputFormatOptions: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.InputFormatOptions] = js.undefined
    
    /**
      *  The S3 bucket that provides the source for the import. 
      */
    var S3BucketSource: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3BucketSource
    
    /**
      * Parameters for the table to import the data into. 
      */
    var TableCreationParameters: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableCreationParameters
  }
  object ImportTableInput {
    
    inline def apply(
      InputFormat: InputFormat,
      S3BucketSource: S3BucketSource,
      TableCreationParameters: TableCreationParameters
    ): ImportTableInput = {
      val __obj = js.Dynamic.literal(InputFormat = InputFormat.asInstanceOf[js.Any], S3BucketSource = S3BucketSource.asInstanceOf[js.Any], TableCreationParameters = TableCreationParameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportTableInput]
    }
    
    extension [Self <: ImportTableInput](x: Self) {
      
      inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
      
      inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
      
      inline def setInputCompressionType(value: InputCompressionType): Self = StObject.set(x, "InputCompressionType", value.asInstanceOf[js.Any])
      
      inline def setInputCompressionTypeUndefined: Self = StObject.set(x, "InputCompressionType", js.undefined)
      
      inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
      
      inline def setInputFormatOptions(value: InputFormatOptions): Self = StObject.set(x, "InputFormatOptions", value.asInstanceOf[js.Any])
      
      inline def setInputFormatOptionsUndefined: Self = StObject.set(x, "InputFormatOptions", js.undefined)
      
      inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
      
      inline def setTableCreationParameters(value: TableCreationParameters): Self = StObject.set(x, "TableCreationParameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportTableOutput extends StObject {
    
    /**
      *  Represents the properties of the table created for the import, and parameters of the import. The import parameters include import status, how many items were processed, and how many errors were encountered. 
      */
    var ImportTableDescription: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportTableDescription
  }
  object ImportTableOutput {
    
    inline def apply(ImportTableDescription: ImportTableDescription): ImportTableOutput = {
      val __obj = js.Dynamic.literal(ImportTableDescription = ImportTableDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportTableOutput]
    }
    
    extension [Self <: ImportTableOutput](x: Self) {
      
      inline def setImportTableDescription(value: ImportTableDescription): Self = StObject.set(x, "ImportTableDescription", value.asInstanceOf[js.Any])
    }
  }
  
  type ImportedItemCount = scala.Double
  
  type IndexName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = _IndexStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GZIP
    - typings.awsSdk.awsSdkStrings.ZSTD
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type InputCompressionType = _InputCompressionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DYNAMODB_JSON
    - typings.awsSdk.awsSdkStrings.ION
    - typings.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type InputFormat = _InputFormat | java.lang.String
  
  trait InputFormatOptions extends StObject {
    
    /**
      *  The options for imported source files in CSV format. The values are Delimiter and HeaderList. 
      */
    var Csv: js.UndefOr[CsvOptions] = js.undefined
  }
  object InputFormatOptions {
    
    inline def apply(): InputFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputFormatOptions]
    }
    
    extension [Self <: InputFormatOptions](x: Self) {
      
      inline def setCsv(value: CsvOptions): Self = StObject.set(x, "Csv", value.asInstanceOf[js.Any])
      
      inline def setCsvUndefined: Self = StObject.set(x, "Csv", js.undefined)
    }
  }
  
  type Integer = scala.Double
  
  type IntegerObject = scala.Double
  
  type ItemCollectionKeyAttributeMap = StringDictionary[AttributeValue]
  
  trait ItemCollectionMetrics extends StObject {
    
    /**
      * The partition key value of the item collection. This value is the same as the partition key value of the item.
      */
    var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.undefined
    
    /**
      * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
      */
    var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.undefined
  }
  object ItemCollectionMetrics {
    
    inline def apply(): ItemCollectionMetrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionMetrics]
    }
    
    extension [Self <: ItemCollectionMetrics](x: Self) {
      
      inline def setItemCollectionKey(value: ItemCollectionKeyAttributeMap): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
      
      inline def setSizeEstimateRangeGB(value: ItemCollectionSizeEstimateRange): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
      
      inline def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
      
      inline def setSizeEstimateRangeGBVarargs(value: ItemCollectionSizeEstimateBound*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value*))
    }
  }
  
  type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]
  
  type ItemCollectionMetricsPerTable = StringDictionary[ItemCollectionMetricsMultiple]
  
  type ItemCollectionSizeEstimateBound = scala.Double
  
  type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]
  
  type ItemCount = scala.Double
  
  type ItemList = js.Array[AttributeMap]
  
  trait ItemResponse extends StObject {
    
    /**
      * Map of attribute data consisting of the data type and attribute value.
      */
    var Item: js.UndefOr[AttributeMap] = js.undefined
  }
  object ItemResponse {
    
    inline def apply(): ItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemResponse]
    }
    
    extension [Self <: ItemResponse](x: Self) {
      
      inline def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    }
  }
  
  type ItemResponseList = js.Array[ItemResponse]
  
  type KMSMasterKeyArn = java.lang.String
  
  type KMSMasterKeyId = java.lang.String
  
  type Key = StringDictionary[AttributeValue]
  
  type KeyConditions = StringDictionary[Condition]
  
  type KeyExpression = java.lang.String
  
  type KeyList = js.Array[Key]
  
  type KeySchema = js.Array[KeySchemaElement]
  
  type KeySchemaAttributeName = java.lang.String
  
  trait KeySchemaElement extends StObject {
    
    /**
      * The name of a key attribute.
      */
    var AttributeName: KeySchemaAttributeName
    
    /**
      * The role that this key attribute will assume:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeyType: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeyType
  }
  object KeySchemaElement {
    
    inline def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], KeyType = KeyType.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeySchemaElement]
    }
    
    extension [Self <: KeySchemaElement](x: Self) {
      
      inline def setAttributeName(value: KeySchemaAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HASH
    - typings.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = _KeyType | java.lang.String
  
  trait KeysAndAttributes extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    
    /**
      * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsistentRead] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * The primary key attribute values that define the items and the attributes associated with the items.
      */
    var Keys: KeyList
    
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the ProjectionExpression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression] = js.undefined
  }
  object KeysAndAttributes {
    
    inline def apply(Keys: KeyList): KeysAndAttributes = {
      val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeysAndAttributes]
    }
    
    extension [Self <: KeysAndAttributes](x: Self) {
      
      inline def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      inline def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
      
      inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setKeys(value: KeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "Keys", js.Array(value*))
      
      inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    }
  }
  
  trait KinesisDataStreamDestination extends StObject {
    
    /**
      * The current status of replication.
      */
    var DestinationStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DestinationStatus] = js.undefined
    
    /**
      * The human-readable string that corresponds to the replica status.
      */
    var DestinationStatusDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
    
    /**
      * The ARN for a specific Kinesis data stream.
      */
    var StreamArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamArn] = js.undefined
  }
  object KinesisDataStreamDestination {
    
    inline def apply(): KinesisDataStreamDestination = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KinesisDataStreamDestination]
    }
    
    extension [Self <: KinesisDataStreamDestination](x: Self) {
      
      inline def setDestinationStatus(value: DestinationStatus): Self = StObject.set(x, "DestinationStatus", value.asInstanceOf[js.Any])
      
      inline def setDestinationStatusDescription(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "DestinationStatusDescription", value.asInstanceOf[js.Any])
      
      inline def setDestinationStatusDescriptionUndefined: Self = StObject.set(x, "DestinationStatusDescription", js.undefined)
      
      inline def setDestinationStatusUndefined: Self = StObject.set(x, "DestinationStatus", js.undefined)
      
      inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
      
      inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
    }
  }
  
  type KinesisDataStreamDestinations = js.Array[KinesisDataStreamDestination]
  
  trait KinesisStreamingDestinationInput extends StObject {
    
    /**
      * The ARN for a Kinesis data stream.
      */
    var StreamArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamArn
    
    /**
      * The name of the DynamoDB table.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object KinesisStreamingDestinationInput {
    
    inline def apply(StreamArn: StreamArn, TableName: TableName): KinesisStreamingDestinationInput = {
      val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamingDestinationInput]
    }
    
    extension [Self <: KinesisStreamingDestinationInput](x: Self) {
      
      inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait KinesisStreamingDestinationOutput extends StObject {
    
    /**
      * The current status of the replication.
      */
    var DestinationStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DestinationStatus] = js.undefined
    
    /**
      * The ARN for the specific Kinesis data stream.
      */
    var StreamArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamArn] = js.undefined
    
    /**
      * The name of the table being modified.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object KinesisStreamingDestinationOutput {
    
    inline def apply(): KinesisStreamingDestinationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KinesisStreamingDestinationOutput]
    }
    
    extension [Self <: KinesisStreamingDestinationOutput](x: Self) {
      
      inline def setDestinationStatus(value: DestinationStatus): Self = StObject.set(x, "DestinationStatus", value.asInstanceOf[js.Any])
      
      inline def setDestinationStatusUndefined: Self = StObject.set(x, "DestinationStatus", js.undefined)
      
      inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
      
      inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  type LastUpdateDateTime = js.Date
  
  type ListAttributeValue = js.Array[AttributeValue]
  
  trait ListBackupsInput extends StObject {
    
    /**
      * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you. (The default setting if no other backup types are specified.)    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
      */
    var BackupType: js.UndefOr[BackupTypeFilter] = js.undefined
    
    /**
      *  LastEvaluatedBackupArn is the Amazon Resource Name (ARN) of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
      */
    var ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.undefined
    
    /**
      * Maximum number of backups to return at once.
      */
    var Limit: js.UndefOr[BackupsInputLimit] = js.undefined
    
    /**
      * The backups from the table specified by TableName are listed. 
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
    
    /**
      * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
      */
    var TimeRangeLowerBound: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
      */
    var TimeRangeUpperBound: js.UndefOr[js.Date] = js.undefined
  }
  object ListBackupsInput {
    
    inline def apply(): ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBackupsInput]
    }
    
    extension [Self <: ListBackupsInput](x: Self) {
      
      inline def setBackupType(value: BackupTypeFilter): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
      
      inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
      
      inline def setExclusiveStartBackupArn(value: BackupArn): Self = StObject.set(x, "ExclusiveStartBackupArn", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartBackupArnUndefined: Self = StObject.set(x, "ExclusiveStartBackupArn", js.undefined)
      
      inline def setLimit(value: BackupsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      inline def setTimeRangeLowerBound(value: js.Date): Self = StObject.set(x, "TimeRangeLowerBound", value.asInstanceOf[js.Any])
      
      inline def setTimeRangeLowerBoundUndefined: Self = StObject.set(x, "TimeRangeLowerBound", js.undefined)
      
      inline def setTimeRangeUpperBound(value: js.Date): Self = StObject.set(x, "TimeRangeUpperBound", value.asInstanceOf[js.Any])
      
      inline def setTimeRangeUpperBoundUndefined: Self = StObject.set(x, "TimeRangeUpperBound", js.undefined)
    }
  }
  
  trait ListBackupsOutput extends StObject {
    
    /**
      * List of BackupSummary objects.
      */
    var BackupSummaries: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupSummaries] = js.undefined
    
    /**
      *  The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results.   If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there are no more results to be retrieved.   If LastEvaluatedBackupArn is not empty, this may or may not indicate that there is more data to be returned. All results are guaranteed to have been returned if and only if no value for LastEvaluatedBackupArn is returned. 
      */
    var LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.undefined
  }
  object ListBackupsOutput {
    
    inline def apply(): ListBackupsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBackupsOutput]
    }
    
    extension [Self <: ListBackupsOutput](x: Self) {
      
      inline def setBackupSummaries(value: BackupSummaries): Self = StObject.set(x, "BackupSummaries", value.asInstanceOf[js.Any])
      
      inline def setBackupSummariesUndefined: Self = StObject.set(x, "BackupSummaries", js.undefined)
      
      inline def setBackupSummariesVarargs(value: BackupSummary*): Self = StObject.set(x, "BackupSummaries", js.Array(value*))
      
      inline def setLastEvaluatedBackupArn(value: BackupArn): Self = StObject.set(x, "LastEvaluatedBackupArn", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedBackupArnUndefined: Self = StObject.set(x, "LastEvaluatedBackupArn", js.undefined)
    }
  }
  
  trait ListContributorInsightsInput extends StObject {
    
    /**
      * Maximum number of results to return per page.
      */
    var MaxResults: js.UndefOr[ListContributorInsightsLimit] = js.undefined
    
    /**
      * A token to for the desired page, if there is one.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.undefined
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object ListContributorInsightsInput {
    
    inline def apply(): ListContributorInsightsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListContributorInsightsInput]
    }
    
    extension [Self <: ListContributorInsightsInput](x: Self) {
      
      inline def setMaxResults(value: ListContributorInsightsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  type ListContributorInsightsLimit = scala.Double
  
  trait ListContributorInsightsOutput extends StObject {
    
    /**
      * A list of ContributorInsightsSummary.
      */
    var ContributorInsightsSummaries: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContributorInsightsSummaries
      ] = js.undefined
    
    /**
      * A token to go to the next page if there is one.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.undefined
  }
  object ListContributorInsightsOutput {
    
    inline def apply(): ListContributorInsightsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListContributorInsightsOutput]
    }
    
    extension [Self <: ListContributorInsightsOutput](x: Self) {
      
      inline def setContributorInsightsSummaries(value: ContributorInsightsSummaries): Self = StObject.set(x, "ContributorInsightsSummaries", value.asInstanceOf[js.Any])
      
      inline def setContributorInsightsSummariesUndefined: Self = StObject.set(x, "ContributorInsightsSummaries", js.undefined)
      
      inline def setContributorInsightsSummariesVarargs(value: ContributorInsightsSummary*): Self = StObject.set(x, "ContributorInsightsSummaries", js.Array(value*))
      
      inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListExportsInput extends StObject {
    
    /**
      * Maximum number of results to return per page.
      */
    var MaxResults: js.UndefOr[ListExportsMaxLimit] = js.undefined
    
    /**
      * An optional string that, if supplied, must be copied from the output of a previous call to ListExports. When provided in this manner, the API fetches the next page of results.
      */
    var NextToken: js.UndefOr[ExportNextToken] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) associated with the exported table.
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn] = js.undefined
  }
  object ListExportsInput {
    
    inline def apply(): ListExportsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListExportsInput]
    }
    
    extension [Self <: ListExportsInput](x: Self) {
      
      inline def setMaxResults(value: ListExportsMaxLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: ExportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    }
  }
  
  type ListExportsMaxLimit = scala.Double
  
  trait ListExportsOutput extends StObject {
    
    /**
      * A list of ExportSummary objects.
      */
    var ExportSummaries: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExportSummaries] = js.undefined
    
    /**
      * If this value is returned, there are additional results to be displayed. To retrieve them, call ListExports again, with NextToken set to this value.
      */
    var NextToken: js.UndefOr[ExportNextToken] = js.undefined
  }
  object ListExportsOutput {
    
    inline def apply(): ListExportsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListExportsOutput]
    }
    
    extension [Self <: ListExportsOutput](x: Self) {
      
      inline def setExportSummaries(value: ExportSummaries): Self = StObject.set(x, "ExportSummaries", value.asInstanceOf[js.Any])
      
      inline def setExportSummariesUndefined: Self = StObject.set(x, "ExportSummaries", js.undefined)
      
      inline def setExportSummariesVarargs(value: ExportSummary*): Self = StObject.set(x, "ExportSummaries", js.Array(value*))
      
      inline def setNextToken(value: ExportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListGlobalTablesInput extends StObject {
    
    /**
      * The first global table name that this operation will evaluate.
      */
    var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * The maximum number of table names to return, if the parameter is not specified DynamoDB defaults to 100. If the number of global tables DynamoDB finds reaches this limit, it stops the operation and returns the table names collected up to that point, with a table name in the LastEvaluatedGlobalTableName to apply in a subsequent operation to the ExclusiveStartGlobalTableName parameter.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    
    /**
      * Lists the global tables in a specific Region.
      */
    var RegionName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName] = js.undefined
  }
  object ListGlobalTablesInput {
    
    inline def apply(): ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGlobalTablesInput]
    }
    
    extension [Self <: ListGlobalTablesInput](x: Self) {
      
      inline def setExclusiveStartGlobalTableName(value: TableName): Self = StObject.set(x, "ExclusiveStartGlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartGlobalTableNameUndefined: Self = StObject.set(x, "ExclusiveStartGlobalTableName", js.undefined)
      
      inline def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    }
  }
  
  trait ListGlobalTablesOutput extends StObject {
    
    /**
      * List of global table names.
      */
    var GlobalTables: js.UndefOr[GlobalTableList] = js.undefined
    
    /**
      * Last evaluated global table name.
      */
    var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.undefined
  }
  object ListGlobalTablesOutput {
    
    inline def apply(): ListGlobalTablesOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGlobalTablesOutput]
    }
    
    extension [Self <: ListGlobalTablesOutput](x: Self) {
      
      inline def setGlobalTables(value: GlobalTableList): Self = StObject.set(x, "GlobalTables", value.asInstanceOf[js.Any])
      
      inline def setGlobalTablesUndefined: Self = StObject.set(x, "GlobalTables", js.undefined)
      
      inline def setGlobalTablesVarargs(value: GlobalTable*): Self = StObject.set(x, "GlobalTables", js.Array(value*))
      
      inline def setLastEvaluatedGlobalTableName(value: TableName): Self = StObject.set(x, "LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedGlobalTableNameUndefined: Self = StObject.set(x, "LastEvaluatedGlobalTableName", js.undefined)
    }
  }
  
  trait ListImportsInput extends StObject {
    
    /**
      *  An optional string that, if supplied, must be copied from the output of a previous call to ListImports. When provided in this manner, the API fetches the next page of results. 
      */
    var NextToken: js.UndefOr[ImportNextToken] = js.undefined
    
    /**
      *  The number of ImportSummary objects returned in a single page. 
      */
    var PageSize: js.UndefOr[ListImportsMaxLimit] = js.undefined
    
    /**
      *  The Amazon Resource Name (ARN) associated with the table that was imported to. 
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn] = js.undefined
  }
  object ListImportsInput {
    
    inline def apply(): ListImportsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListImportsInput]
    }
    
    extension [Self <: ListImportsInput](x: Self) {
      
      inline def setNextToken(value: ImportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setPageSize(value: ListImportsMaxLimit): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    }
  }
  
  type ListImportsMaxLimit = scala.Double
  
  trait ListImportsOutput extends StObject {
    
    /**
      *  A list of ImportSummary objects. 
      */
    var ImportSummaryList: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ImportSummaryList] = js.undefined
    
    /**
      *  If this value is returned, there are additional results to be displayed. To retrieve them, call ListImports again, with NextToken set to this value. 
      */
    var NextToken: js.UndefOr[ImportNextToken] = js.undefined
  }
  object ListImportsOutput {
    
    inline def apply(): ListImportsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListImportsOutput]
    }
    
    extension [Self <: ListImportsOutput](x: Self) {
      
      inline def setImportSummaryList(value: ImportSummaryList): Self = StObject.set(x, "ImportSummaryList", value.asInstanceOf[js.Any])
      
      inline def setImportSummaryListUndefined: Self = StObject.set(x, "ImportSummaryList", js.undefined)
      
      inline def setImportSummaryListVarargs(value: ImportSummary*): Self = StObject.set(x, "ImportSummaryList", js.Array(value*))
      
      inline def setNextToken(value: ImportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListTablesInput extends StObject {
    
    /**
      * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
      */
    var ExclusiveStartTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
      */
    var Limit: js.UndefOr[ListTablesInputLimit] = js.undefined
  }
  object ListTablesInput {
    
    inline def apply(): ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTablesInput]
    }
    
    extension [Self <: ListTablesInput](x: Self) {
      
      inline def setExclusiveStartTableName(value: TableName): Self = StObject.set(x, "ExclusiveStartTableName", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartTableNameUndefined: Self = StObject.set(x, "ExclusiveStartTableName", js.undefined)
      
      inline def setLimit(value: ListTablesInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    }
  }
  
  type ListTablesInputLimit = scala.Double
  
  trait ListTablesOutput extends StObject {
    
    /**
      * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
      */
    var LastEvaluatedTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
      */
    var TableNames: js.UndefOr[TableNameList] = js.undefined
  }
  object ListTablesOutput {
    
    inline def apply(): ListTablesOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTablesOutput]
    }
    
    extension [Self <: ListTablesOutput](x: Self) {
      
      inline def setLastEvaluatedTableName(value: TableName): Self = StObject.set(x, "LastEvaluatedTableName", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedTableNameUndefined: Self = StObject.set(x, "LastEvaluatedTableName", js.undefined)
      
      inline def setTableNames(value: TableNameList): Self = StObject.set(x, "TableNames", value.asInstanceOf[js.Any])
      
      inline def setTableNamesUndefined: Self = StObject.set(x, "TableNames", js.undefined)
      
      inline def setTableNamesVarargs(value: TableName*): Self = StObject.set(x, "TableNames", js.Array(value*))
    }
  }
  
  trait ListTagsOfResourceInput extends StObject {
    
    /**
      * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.undefined
    
    /**
      * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString
  }
  object ListTagsOfResourceInput {
    
    inline def apply(ResourceArn: ResourceArnString): ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsOfResourceInput]
    }
    
    extension [Self <: ListTagsOfResourceInput](x: Self) {
      
      inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListTagsOfResourceOutput extends StObject {
    
    /**
      * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.undefined
    
    /**
      * The tags currently associated with the Amazon DynamoDB resource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  object ListTagsOfResourceOutput {
    
    inline def apply(): ListTagsOfResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTagsOfResourceOutput]
    }
    
    extension [Self <: ListTagsOfResourceOutput](x: Self) {
      
      inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
  
  trait LocalSecondaryIndex extends StObject {
    
    /**
      * The name of the local secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema
    
    /**
      * Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Projection
  }
  object LocalSecondaryIndex {
    
    inline def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): LocalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalSecondaryIndex]
    }
    
    extension [Self <: LocalSecondaryIndex](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalSecondaryIndexDescription extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the index.
      */
    var IndexArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
    
    /**
      * Represents the name of the local secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var IndexSizeBytes: js.UndefOr[Long] = js.undefined
    
    /**
      * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.undefined
    
    /**
      * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema] = js.undefined
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Projection] = js.undefined
  }
  object LocalSecondaryIndexDescription {
    
    inline def apply(): LocalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalSecondaryIndexDescription]
    }
    
    extension [Self <: LocalSecondaryIndexDescription](x: Self) {
      
      inline def setIndexArn(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
      
      inline def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setIndexSizeBytes(value: Long): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
      
      inline def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
    }
  }
  
  type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]
  
  trait LocalSecondaryIndexInfo extends StObject {
    
    /**
      * Represents the name of the local secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema] = js.undefined
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Projection] = js.undefined
  }
  object LocalSecondaryIndexInfo {
    
    inline def apply(): LocalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalSecondaryIndexInfo]
    }
    
    extension [Self <: LocalSecondaryIndexInfo](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
    }
  }
  
  type LocalSecondaryIndexList = js.Array[LocalSecondaryIndex]
  
  type LocalSecondaryIndexes = js.Array[LocalSecondaryIndexInfo]
  
  type Long = scala.Double
  
  type MapAttributeValue = StringDictionary[AttributeValue]
  
  type NextTokenString = java.lang.String
  
  type NonKeyAttributeName = java.lang.String
  
  type NonKeyAttributeNameList = js.Array[NonKeyAttributeName]
  
  type NonNegativeLongObject = scala.Double
  
  type NullAttributeValue = Boolean
  
  type NumberAttributeValue = java.lang.String
  
  trait NumberSet
    extends StObject
       with DynamoDbSet {
    
    var `type`: Number_
    
    var values: js.Array[scala.Double]
  }
  object NumberSet {
    
    inline def apply(values: js.Array[scala.Double]): NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Number")
      __obj.asInstanceOf[NumberSet]
    }
    
    extension [Self <: NumberSet](x: Self) {
      
      inline def setType(value: Number_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[scala.Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: scala.Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  
  trait ParameterizedStatement extends StObject {
    
    /**
      *  The parameter values. 
      */
    var Parameters: js.UndefOr[PreparedStatementParameters] = js.undefined
    
    /**
      *  A PartiQL statment that uses parameters. 
      */
    var Statement: PartiQLStatement
  }
  object ParameterizedStatement {
    
    inline def apply(Statement: PartiQLStatement): ParameterizedStatement = {
      val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterizedStatement]
    }
    
    extension [Self <: ParameterizedStatement](x: Self) {
      
      inline def setParameters(value: PreparedStatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
      
      inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
      
      inline def setStatement(value: PartiQLStatement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    }
  }
  
  type ParameterizedStatements = js.Array[ParameterizedStatement]
  
  type PartiQLBatchRequest = js.Array[BatchStatementRequest]
  
  type PartiQLBatchResponse = js.Array[BatchStatementResponse]
  
  type PartiQLNextToken = java.lang.String
  
  type PartiQLStatement = java.lang.String
  
  trait PointInTimeRecoveryDescription extends StObject {
    
    /**
      * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days. 
      */
    var EarliestRestorableDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      *  LatestRestorableDateTime is typically 5 minutes before the current time. 
      */
    var LatestRestorableDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The current state of point in time recovery:    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
      */
    var PointInTimeRecoveryStatus: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PointInTimeRecoveryStatus
      ] = js.undefined
  }
  object PointInTimeRecoveryDescription {
    
    inline def apply(): PointInTimeRecoveryDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointInTimeRecoveryDescription]
    }
    
    extension [Self <: PointInTimeRecoveryDescription](x: Self) {
      
      inline def setEarliestRestorableDateTime(value: js.Date): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
      
      inline def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
      
      inline def setLatestRestorableDateTime(value: js.Date): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
      
      inline def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
      
      inline def setPointInTimeRecoveryStatus(value: PointInTimeRecoveryStatus): Self = StObject.set(x, "PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
      
      inline def setPointInTimeRecoveryStatusUndefined: Self = StObject.set(x, "PointInTimeRecoveryStatus", js.undefined)
    }
  }
  
  trait PointInTimeRecoverySpecification extends StObject {
    
    /**
      * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
      */
    var PointInTimeRecoveryEnabled: BooleanObject
  }
  object PointInTimeRecoverySpecification {
    
    inline def apply(PointInTimeRecoveryEnabled: BooleanObject): PointInTimeRecoverySpecification = {
      val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointInTimeRecoverySpecification]
    }
    
    extension [Self <: PointInTimeRecoverySpecification](x: Self) {
      
      inline def setPointInTimeRecoveryEnabled(value: BooleanObject): Self = StObject.set(x, "PointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = _PointInTimeRecoveryStatus | java.lang.String
  
  type PositiveIntegerObject = scala.Double
  
  type PositiveLongObject = scala.Double
  
  type PreparedStatementParameters = js.Array[AttributeValue]
  
  type ProcessedItemCount = scala.Double
  
  trait Projection extends StObject {
    
    /**
      * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 100. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
      */
    var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.undefined
    
    /**
      * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - In addition to the attributes described in KEYS_ONLY, the secondary index will include other non-key attributes that you specify.    ALL - All of the table attributes are projected into the index.  
      */
    var ProjectionType: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionType] = js.undefined
  }
  object Projection {
    
    inline def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    extension [Self <: Projection](x: Self) {
      
      inline def setNonKeyAttributes(value: NonKeyAttributeNameList): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      inline def setNonKeyAttributesVarargs(value: NonKeyAttributeName*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value*))
      
      inline def setProjectionType(value: ProjectionType): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
      
      inline def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
    }
  }
  
  type ProjectionExpression = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.KEYS_ONLY
    - typings.awsSdk.awsSdkStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = _ProjectionType | java.lang.String
  
  trait ProvisionedThroughput extends StObject {
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
      */
    var ReadCapacityUnits: PositiveLongObject
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
      */
    var WriteCapacityUnits: PositiveLongObject
  }
  object ProvisionedThroughput {
    
    inline def apply(ReadCapacityUnits: PositiveLongObject, WriteCapacityUnits: PositiveLongObject): ProvisionedThroughput = {
      val __obj = js.Dynamic.literal(ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any], WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisionedThroughput]
    }
    
    extension [Self <: ProvisionedThroughput](x: Self) {
      
      inline def setReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvisionedThroughputDescription extends StObject {
    
    /**
      * The date and time of the last provisioned throughput decrease for this table.
      */
    var LastDecreaseDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The date and time of the last provisioned throughput increase for this table.
      */
    var LastIncreaseDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
      */
    var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
      */
    var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  }
  object ProvisionedThroughputDescription {
    
    inline def apply(): ProvisionedThroughputDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputDescription]
    }
    
    extension [Self <: ProvisionedThroughputDescription](x: Self) {
      
      inline def setLastDecreaseDateTime(value: js.Date): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
      
      inline def setLastIncreaseDateTime(value: js.Date): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
      
      inline def setNumberOfDecreasesToday(value: PositiveLongObject): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
      
      inline def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
      
      inline def setReadCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      inline def setWriteCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  trait ProvisionedThroughputOverride extends StObject {
    
    /**
      * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
      */
    var ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  object ProvisionedThroughputOverride {
    
    inline def apply(): ProvisionedThroughputOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputOverride]
    }
    
    extension [Self <: ProvisionedThroughputOverride](x: Self) {
      
      inline def setReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    }
  }
  
  trait Put extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionExpression] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * A map of attribute name to attribute values, representing the primary key of the item to be written by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema. 
      */
    var Item: PutItemInputAttributeMap
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.undefined
    
    /**
      * Name of the table in which to write the item.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object Put {
    
    inline def apply(Item: PutItemInputAttributeMap, TableName: TableName): Put = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Put]
    }
    
    extension [Self <: Put](x: Self) {
      
      inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait PutItemInput extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional PutItem operation to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionExpression] = js.undefined
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionalOperator] = js.undefined
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item. You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition. Empty String and Binary attribute values are allowed. Attribute values of type String and Binary must have a length greater than zero if the attribute is used as a key attribute for a table or index. For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide. Each element in the Item map is an AttributeValue object.
      */
    var Item: PutItemInputAttributeMap
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnItemCollectionMetrics
      ] = js.undefined
    
    /**
      * Use ReturnValues if you want to get the item attributes as they appeared before they were updated with the PutItem request. For PutItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - If PutItem overwrote an attribute name-value pair, then the content of the old item is returned.   The values returned are strongly consistent. There is no additional cost associated with requesting a return value aside from the small network and processing overhead of receiving a larger response. No read capacity units are consumed.  The ReturnValues parameter is used by several DynamoDB operations; however, PutItem does not recognize any values other than NONE or ALL_OLD. 
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
    
    /**
      * The name of the table to contain the item.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object PutItemInput {
    
    inline def apply(Item: PutItemInputAttributeMap, TableName: TableName): PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutItemInput]
    }
    
    extension [Self <: PutItemInput](x: Self) {
      
      inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      inline def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      inline def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      inline def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  type PutItemInputAttributeMap = StringDictionary[AttributeValue]
  
  trait PutItemOutput extends StObject {
    
    /**
      * The attribute values as they appeared before the PutItem operation, but only if ReturnValues is specified as ALL_OLD in the request. Each element consists of an attribute name and an attribute value.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    
    /**
      * The capacity units consumed by the PutItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsumedCapacity] = js.undefined
    
    /**
      * Information about item collections, if any, that were affected by the PutItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ItemCollectionMetrics] = js.undefined
  }
  object PutItemOutput {
    
    inline def apply(): PutItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutItemOutput]
    }
    
    extension [Self <: PutItemOutput](x: Self) {
      
      inline def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  trait PutRequest extends StObject {
    
    /**
      * A map of attribute name to attribute values, representing the primary key of an item to be processed by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema.
      */
    var Item: PutItemInputAttributeMap
  }
  object PutRequest {
    
    inline def apply(Item: PutItemInputAttributeMap): PutRequest = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRequest]
    }
    
    extension [Self <: PutRequest](x: Self) {
      
      inline def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryInput extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionalOperator] = js.undefined
    
    /**
      * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads. Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsistentRead] = js.undefined
    
    /**
      * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number, or Binary. No set data types are allowed.
      */
    var ExclusiveStartKey: js.UndefOr[Key] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * A string that contains conditions that DynamoDB applies after the Query operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned. A FilterExpression does not allow key attributes. You cannot define a filter expression based on a partition key or a sort key.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
      */
    var FilterExpression: js.UndefOr[ConditionExpression] = js.undefined
    
    /**
      * The name of an index to query. This index can be any local secondary index or global secondary index on the table. Note that if you use the IndexName parameter, you must also provide TableName. 
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The condition that specifies the key values for items to be retrieved by the Query action. The condition must perform an equality test on a single partition key value. The condition can optionally perform one of several comparison tests on a single sort key value. This allows Query to retrieve one item with a given partition key value and sort key value, or several items that have the same partition key value but different sort key values. The partition key equality test is required, and must be specified in the following format:  partitionKeyName = :partitionkeyval  If you also want to provide a condition for the sort key, it must be combined using AND with the condition for the sort key. Following is an example, using the = comparison operator for the sort key:  partitionKeyName = :partitionkeyval AND sortKeyName = :sortkeyval  Valid comparisons for the sort key condition are as follows:    sortKeyName = :sortkeyval - true if the sort key value is equal to :sortkeyval.    sortKeyName &lt; :sortkeyval - true if the sort key value is less than :sortkeyval.    sortKeyName &lt;= :sortkeyval - true if the sort key value is less than or equal to :sortkeyval.    sortKeyName &gt; :sortkeyval - true if the sort key value is greater than :sortkeyval.    sortKeyName &gt;=  :sortkeyval - true if the sort key value is greater than or equal to :sortkeyval.    sortKeyName BETWEEN :sortkeyval1 AND :sortkeyval2 - true if the sort key value is greater than or equal to :sortkeyval1, and less than or equal to :sortkeyval2.    begins_with ( sortKeyName, :sortkeyval ) - true if the sort key value begins with a particular operand. (You cannot use this function with a sort key that is of type Number.) Note that the function name begins_with is case-sensitive.   Use the ExpressionAttributeValues parameter to replace tokens such as :partitionval and :sortval with actual values at runtime. You can optionally use the ExpressionAttributeNames parameter to replace the names of the partition key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a DynamoDB reserved word. For example, the following KeyConditionExpression parameter causes an error because Size is a reserved word:    Size = :myval    To work around this, define a placeholder (such a #S) to represent the attribute name Size. KeyConditionExpression then is as follows:    #S = :myval    For a list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide. For more information on ExpressionAttributeNames and ExpressionAttributeValues, see Using Placeholders for Attribute Names and Values in the Amazon DynamoDB Developer Guide.
      */
    var KeyConditionExpression: js.UndefOr[KeyExpression] = js.undefined
    
    /**
      * This is a legacy parameter. Use KeyConditionExpression instead. For more information, see KeyConditions in the Amazon DynamoDB Developer Guide.
      */
    var KeyConditions: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeyConditions] = js.undefined
    
    /**
      * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Query and Scan in the Amazon DynamoDB Developer Guide.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression] = js.undefined
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see QueryFilter in the Amazon DynamoDB Developer Guide.
      */
    var QueryFilter: js.UndefOr[FilterConditionMap] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * Specifies the order for index traversal: If true (default), the traversal is performed in ascending order; if false, the traversal is performed in descending order.  Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned. If ScanIndexForward is true, DynamoDB returns the results in the order in which they are stored (by sort key value). This is the default behavior. If ScanIndexForward is false, DynamoDB reads the results in reverse order by sort key value, and then returns the results to the client.
      */
    var ScanIndexForward: js.UndefOr[BooleanObject] = js.undefined
    
    /**
      * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in ProjectionExpression. This return value is equivalent to specifying ProjectionExpression without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor ProjectionExpression are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and ProjectionExpression together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying ProjectionExpression without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
      */
    var Select: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Select] = js.undefined
    
    /**
      * The name of the table containing the requested items.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object QueryInput {
    
    inline def apply(TableName: TableName): QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryInput]
    }
    
    extension [Self <: QueryInput](x: Self) {
      
      inline def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      inline def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
      
      inline def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setExclusiveStartKey(value: Key): Self = StObject.set(x, "ExclusiveStartKey", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartKeyUndefined: Self = StObject.set(x, "ExclusiveStartKey", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setFilterExpression(value: ConditionExpression): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
      
      inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setKeyConditionExpression(value: KeyExpression): Self = StObject.set(x, "KeyConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setKeyConditionExpressionUndefined: Self = StObject.set(x, "KeyConditionExpression", js.undefined)
      
      inline def setKeyConditions(value: KeyConditions): Self = StObject.set(x, "KeyConditions", value.asInstanceOf[js.Any])
      
      inline def setKeyConditionsUndefined: Self = StObject.set(x, "KeyConditions", js.undefined)
      
      inline def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      inline def setQueryFilter(value: FilterConditionMap): Self = StObject.set(x, "QueryFilter", value.asInstanceOf[js.Any])
      
      inline def setQueryFilterUndefined: Self = StObject.set(x, "QueryFilter", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setScanIndexForward(value: BooleanObject): Self = StObject.set(x, "ScanIndexForward", value.asInstanceOf[js.Any])
      
      inline def setScanIndexForwardUndefined: Self = StObject.set(x, "ScanIndexForward", js.undefined)
      
      inline def setSelect(value: Select): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryOutput extends StObject {
    
    /**
      * The capacity units consumed by the Query operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsumedCapacity] = js.undefined
    
    /**
      * The number of items in the response. If you used a QueryFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count and ScannedCount are the same.
      */
    var Count: js.UndefOr[Integer] = js.undefined
    
    /**
      * An array of item attributes that match the query criteria. Each element in this array consists of an attribute name and the value for that attribute.
      */
    var Items: js.UndefOr[ItemList] = js.undefined
    
    /**
      * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
      */
    var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
    
    /**
      * The number of items evaluated, before any QueryFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Query operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
      */
    var ScannedCount: js.UndefOr[Integer] = js.undefined
  }
  object QueryOutput {
    
    inline def apply(): QueryOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOutput]
    }
    
    extension [Self <: QueryOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      inline def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      inline def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value*))
      
      inline def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      inline def setScannedCount(value: Integer): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
      
      inline def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
    }
  }
  
  type RegionName = java.lang.String
  
  trait Replica extends StObject {
    
    /**
      * The Region where the replica needs to be created.
      */
    var RegionName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName] = js.undefined
  }
  object Replica {
    
    inline def apply(): Replica = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replica]
    }
    
    extension [Self <: Replica](x: Self) {
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    }
  }
  
  trait ReplicaAutoScalingDescription extends StObject {
    
    /**
      * Replica-specific global secondary index auto scaling settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingDescriptionList] = js.undefined
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName] = js.undefined
    
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    /**
      * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
      */
    var ReplicaStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReplicaStatus] = js.undefined
  }
  object ReplicaAutoScalingDescription {
    
    inline def apply(): ReplicaAutoScalingDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaAutoScalingDescription]
    }
    
    extension [Self <: ReplicaAutoScalingDescription](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexAutoScalingDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      inline def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    }
  }
  
  type ReplicaAutoScalingDescriptionList = js.Array[ReplicaAutoScalingDescription]
  
  trait ReplicaAutoScalingUpdate extends StObject {
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
    
    /**
      * Represents the auto scaling settings of global secondary indexes that will be modified.
      */
    var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList] = js.undefined
    
    var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  }
  object ReplicaAutoScalingUpdate {
    
    inline def apply(RegionName: RegionName): ReplicaAutoScalingUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaAutoScalingUpdate]
    }
    
    extension [Self <: ReplicaAutoScalingUpdate](x: Self) {
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexUpdates(value: ReplicaGlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexUpdatesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.Array(value*))
      
      inline def setReplicaProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", js.undefined)
    }
  }
  
  type ReplicaAutoScalingUpdateList = js.Array[ReplicaAutoScalingUpdate]
  
  trait ReplicaDescription extends StObject {
    
    /**
      * Replica-specific global secondary index settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexDescriptionList] = js.undefined
    
    /**
      * The KMS key of the replica that will be used for KMS encryption.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KMSMasterKeyId] = js.undefined
    
    /**
      * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughputOverride
      ] = js.undefined
    
    /**
      * The name of the Region.
      */
    var RegionName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName] = js.undefined
    
    /**
      * The time at which the replica was first detected as inaccessible. To determine cause of inaccessibility check the ReplicaStatus property.
      */
    var ReplicaInaccessibleDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.    REGION_DISABLED - The replica is inaccessible because the Amazon Web Services Region has been disabled.  If the Amazon Web Services Region remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.     INACCESSIBLE_ENCRYPTION_CREDENTIALS  - The KMS key used to encrypt the table is inaccessible.  If the KMS key remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.   
      */
    var ReplicaStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReplicaStatus] = js.undefined
    
    /**
      * Detailed information about the replica status.
      */
    var ReplicaStatusDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReplicaStatusDescription
      ] = js.undefined
    
    /**
      * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
      */
    var ReplicaStatusPercentProgress: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReplicaStatusPercentProgress
      ] = js.undefined
    
    var ReplicaTableClassSummary: js.UndefOr[TableClassSummary] = js.undefined
  }
  object ReplicaDescription {
    
    inline def apply(): ReplicaDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaDescription]
    }
    
    extension [Self <: ReplicaDescription](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
      
      inline def setReplicaInaccessibleDateTime(value: js.Date): Self = StObject.set(x, "ReplicaInaccessibleDateTime", value.asInstanceOf[js.Any])
      
      inline def setReplicaInaccessibleDateTimeUndefined: Self = StObject.set(x, "ReplicaInaccessibleDateTime", js.undefined)
      
      inline def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      inline def setReplicaStatusDescription(value: ReplicaStatusDescription): Self = StObject.set(x, "ReplicaStatusDescription", value.asInstanceOf[js.Any])
      
      inline def setReplicaStatusDescriptionUndefined: Self = StObject.set(x, "ReplicaStatusDescription", js.undefined)
      
      inline def setReplicaStatusPercentProgress(value: ReplicaStatusPercentProgress): Self = StObject.set(x, "ReplicaStatusPercentProgress", value.asInstanceOf[js.Any])
      
      inline def setReplicaStatusPercentProgressUndefined: Self = StObject.set(x, "ReplicaStatusPercentProgress", js.undefined)
      
      inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
      
      inline def setReplicaTableClassSummary(value: TableClassSummary): Self = StObject.set(x, "ReplicaTableClassSummary", value.asInstanceOf[js.Any])
      
      inline def setReplicaTableClassSummaryUndefined: Self = StObject.set(x, "ReplicaTableClassSummary", js.undefined)
    }
  }
  
  type ReplicaDescriptionList = js.Array[ReplicaDescription]
  
  trait ReplicaGlobalSecondaryIndex extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughputOverride
      ] = js.undefined
  }
  object ReplicaGlobalSecondaryIndex {
    
    inline def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndex]
    }
    
    extension [Self <: ReplicaGlobalSecondaryIndex](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    }
  }
  
  trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The current state of the replica global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
      */
    var IndexStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexStatus] = js.undefined
    
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  }
  object ReplicaGlobalSecondaryIndexAutoScalingDescription {
    
    inline def apply(): ReplicaGlobalSecondaryIndexAutoScalingDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingDescription]
    }
    
    extension [Self <: ReplicaGlobalSecondaryIndexAutoScalingDescription](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      inline def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      inline def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      inline def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  
  trait ReplicaGlobalSecondaryIndexAutoScalingUpdate extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    var ProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  }
  object ReplicaGlobalSecondaryIndexAutoScalingUpdate {
    
    inline def apply(): ReplicaGlobalSecondaryIndexAutoScalingUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
    }
    
    extension [Self <: ReplicaGlobalSecondaryIndexAutoScalingUpdate](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingUpdate", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  
  trait ReplicaGlobalSecondaryIndexDescription extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * If not described, uses the source table GSI's read capacity settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughputOverride
      ] = js.undefined
  }
  object ReplicaGlobalSecondaryIndexDescription {
    
    inline def apply(): ReplicaGlobalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexDescription]
    }
    
    extension [Self <: ReplicaGlobalSecondaryIndexDescription](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[ReplicaGlobalSecondaryIndexDescription]
  
  type ReplicaGlobalSecondaryIndexList = js.Array[ReplicaGlobalSecondaryIndex]
  
  trait ReplicaGlobalSecondaryIndexSettingsDescription extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
      */
    var IndexStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexStatus] = js.undefined
    
    /**
      * Auto scaling settings for a global secondary index replica's read capacity units.
      */
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * Auto scaling settings for a global secondary index replica's write capacity units.
      */
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  object ReplicaGlobalSecondaryIndexSettingsDescription {
    
    inline def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsDescription = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
    }
    
    extension [Self <: ReplicaGlobalSecondaryIndexSettingsDescription](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      inline def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      inline def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      inline def setProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
      
      inline def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      inline def setProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityUnits", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  
  trait ReplicaGlobalSecondaryIndexSettingsUpdate extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      * Auto scaling settings for managing a global secondary index replica's read capacity units.
      */
    var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  }
  object ReplicaGlobalSecondaryIndexSettingsUpdate {
    
    inline def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
    }
    
    extension [Self <: ReplicaGlobalSecondaryIndexSettingsUpdate](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  
  type ReplicaList = js.Array[Replica]
  
  trait ReplicaSettingsDescription extends StObject {
    
    /**
      * The Region name of the replica.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
    
    /**
      * The read/write capacity mode of the replica.
      */
    var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined
    
    /**
      * Replica global secondary index settings for the global table.
      */
    var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.undefined
    
    /**
      * Auto scaling settings for a global table replica's read capacity units.
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
    
    /**
      * Auto scaling settings for a global table replica's write capacity units.
      */
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
      */
    var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
    
    /**
      * The current state of the Region:    CREATING - The Region is being created.    UPDATING - The Region is being updated.    DELETING - The Region is being deleted.    ACTIVE - The Region is ready for use.  
      */
    var ReplicaStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReplicaStatus] = js.undefined
    
    var ReplicaTableClassSummary: js.UndefOr[TableClassSummary] = js.undefined
  }
  object ReplicaSettingsDescription {
    
    inline def apply(RegionName: RegionName): ReplicaSettingsDescription = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsDescription]
    }
    
    extension [Self <: ReplicaSettingsDescription](x: Self) {
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setReplicaBillingModeSummary(value: BillingModeSummary): Self = StObject.set(x, "ReplicaBillingModeSummary", value.asInstanceOf[js.Any])
      
      inline def setReplicaBillingModeSummaryUndefined: Self = StObject.set(x, "ReplicaBillingModeSummary", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexSettings(value: ReplicaGlobalSecondaryIndexSettingsDescriptionList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value*))
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      inline def setReplicaProvisionedReadCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      inline def setReplicaProvisionedWriteCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", js.undefined)
      
      inline def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
      
      inline def setReplicaTableClassSummary(value: TableClassSummary): Self = StObject.set(x, "ReplicaTableClassSummary", value.asInstanceOf[js.Any])
      
      inline def setReplicaTableClassSummaryUndefined: Self = StObject.set(x, "ReplicaTableClassSummary", js.undefined)
    }
  }
  
  type ReplicaSettingsDescriptionList = js.Array[ReplicaSettingsDescription]
  
  trait ReplicaSettingsUpdate extends StObject {
    
    /**
      * The Region of the replica to be added.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
    
    /**
      * Represents the settings of a global secondary index for a global table that will be modified.
      */
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.undefined
    
    /**
      * Auto scaling settings for managing a global table replica's read capacity units.
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * Replica-specific table class. If not specified, uses the source table's table class.
      */
    var ReplicaTableClass: js.UndefOr[TableClass] = js.undefined
  }
  object ReplicaSettingsUpdate {
    
    inline def apply(RegionName: RegionName): ReplicaSettingsUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsUpdate]
    }
    
    extension [Self <: ReplicaSettingsUpdate](x: Self) {
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdate(value: ReplicaGlobalSecondaryIndexSettingsUpdateList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value*))
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setReplicaProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
      
      inline def setReplicaTableClass(value: TableClass): Self = StObject.set(x, "ReplicaTableClass", value.asInstanceOf[js.Any])
      
      inline def setReplicaTableClassUndefined: Self = StObject.set(x, "ReplicaTableClass", js.undefined)
    }
  }
  
  type ReplicaSettingsUpdateList = js.Array[ReplicaSettingsUpdate]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.CREATION_FAILED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.REGION_DISABLED
    - typings.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
    - java.lang.String
  */
  type ReplicaStatus = _ReplicaStatus | java.lang.String
  
  type ReplicaStatusDescription = java.lang.String
  
  type ReplicaStatusPercentProgress = java.lang.String
  
  trait ReplicaUpdate extends StObject {
    
    /**
      * The parameters required for creating a replica on an existing global table.
      */
    var Create: js.UndefOr[CreateReplicaAction] = js.undefined
    
    /**
      * The name of the existing replica to be removed.
      */
    var Delete: js.UndefOr[DeleteReplicaAction] = js.undefined
  }
  object ReplicaUpdate {
    
    inline def apply(): ReplicaUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaUpdate]
    }
    
    extension [Self <: ReplicaUpdate](x: Self) {
      
      inline def setCreate(value: CreateReplicaAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      inline def setDelete(value: DeleteReplicaAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    }
  }
  
  type ReplicaUpdateList = js.Array[ReplicaUpdate]
  
  trait ReplicationGroupUpdate extends StObject {
    
    /**
      * The parameters required for creating a replica for the table.
      */
    var Create: js.UndefOr[CreateReplicationGroupMemberAction] = js.undefined
    
    /**
      * The parameters required for deleting a replica for the table.
      */
    var Delete: js.UndefOr[DeleteReplicationGroupMemberAction] = js.undefined
    
    /**
      * The parameters required for updating a replica for the table.
      */
    var Update: js.UndefOr[UpdateReplicationGroupMemberAction] = js.undefined
  }
  object ReplicationGroupUpdate {
    
    inline def apply(): ReplicationGroupUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationGroupUpdate]
    }
    
    extension [Self <: ReplicationGroupUpdate](x: Self) {
      
      inline def setCreate(value: CreateReplicationGroupMemberAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      inline def setDelete(value: DeleteReplicationGroupMemberAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      inline def setUpdate(value: UpdateReplicationGroupMemberAction): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
  
  type ReplicationGroupUpdateList = js.Array[ReplicationGroupUpdate]
  
  type ResourceArnString = java.lang.String
  
  type RestoreInProgress = Boolean
  
  trait RestoreSummary extends StObject {
    
    /**
      * Point in time or source backup time.
      */
    var RestoreDateTime: js.Date
    
    /**
      * Indicates if a restore is in progress or not.
      */
    var RestoreInProgress: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RestoreInProgress
    
    /**
      * The Amazon Resource Name (ARN) of the backup from which the table was restored.
      */
    var SourceBackupArn: js.UndefOr[BackupArn] = js.undefined
    
    /**
      * The ARN of the source table of the backup that is being restored.
      */
    var SourceTableArn: js.UndefOr[TableArn] = js.undefined
  }
  object RestoreSummary {
    
    inline def apply(RestoreDateTime: js.Date, RestoreInProgress: RestoreInProgress): RestoreSummary = {
      val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreSummary]
    }
    
    extension [Self <: RestoreSummary](x: Self) {
      
      inline def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      inline def setRestoreInProgress(value: RestoreInProgress): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
      
      inline def setSourceBackupArn(value: BackupArn): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
      
      inline def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
      
      inline def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
      
      inline def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
    }
  }
  
  trait RestoreTableFromBackupInput extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated with the backup.
      */
    var BackupArn: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BackupArn
    
    /**
      * The billing mode of the restored table.
      */
    var BillingModeOverride: js.UndefOr[BillingMode] = js.undefined
    
    /**
      * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.undefined
    
    /**
      * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.undefined
    
    /**
      * Provisioned throughput settings for the restored table.
      */
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.undefined
    
    /**
      * The new server-side encryption settings for the restored table.
      */
    var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.undefined
    
    /**
      * The name of the new table to which the backup must be restored.
      */
    var TargetTableName: TableName
  }
  object RestoreTableFromBackupInput {
    
    inline def apply(BackupArn: BackupArn, TargetTableName: TableName): RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableFromBackupInput]
    }
    
    extension [Self <: RestoreTableFromBackupInput](x: Self) {
      
      inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      inline def setBillingModeOverride(value: BillingMode): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
      
      inline def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
      
      inline def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
      
      inline def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value*))
      
      inline def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
      
      inline def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value*))
      
      inline def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      inline def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
      
      inline def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
      
      inline def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestoreTableFromBackupOutput extends StObject {
    
    /**
      * The description of the table created from an existing backup.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableDescription] = js.undefined
  }
  object RestoreTableFromBackupOutput {
    
    inline def apply(): RestoreTableFromBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestoreTableFromBackupOutput]
    }
    
    extension [Self <: RestoreTableFromBackupOutput](x: Self) {
      
      inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  trait RestoreTableToPointInTimeInput extends StObject {
    
    /**
      * The billing mode of the restored table.
      */
    var BillingModeOverride: js.UndefOr[BillingMode] = js.undefined
    
    /**
      * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.undefined
    
    /**
      * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.undefined
    
    /**
      * Provisioned throughput settings for the restored table.
      */
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.undefined
    
    /**
      * Time in the past to restore the table to.
      */
    var RestoreDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The new server-side encryption settings for the restored table.
      */
    var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.undefined
    
    /**
      * The DynamoDB table that will be restored. This value is an Amazon Resource Name (ARN).
      */
    var SourceTableArn: js.UndefOr[TableArn] = js.undefined
    
    /**
      * Name of the source table that is being restored.
      */
    var SourceTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * The name of the new table to which it must be restored to.
      */
    var TargetTableName: TableName
    
    /**
      * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
      */
    var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.undefined
  }
  object RestoreTableToPointInTimeInput {
    
    inline def apply(TargetTableName: TableName): RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableToPointInTimeInput]
    }
    
    extension [Self <: RestoreTableToPointInTimeInput](x: Self) {
      
      inline def setBillingModeOverride(value: BillingMode): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
      
      inline def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
      
      inline def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
      
      inline def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value*))
      
      inline def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
      
      inline def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value*))
      
      inline def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      inline def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      inline def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
      
      inline def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
      
      inline def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
      
      inline def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
      
      inline def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
      
      inline def setSourceTableName(value: TableName): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
      
      inline def setSourceTableNameUndefined: Self = StObject.set(x, "SourceTableName", js.undefined)
      
      inline def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
      
      inline def setUseLatestRestorableTime(value: BooleanObject): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
      
      inline def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
    }
  }
  
  trait RestoreTableToPointInTimeOutput extends StObject {
    
    /**
      * Represents the properties of a table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableDescription] = js.undefined
  }
  object RestoreTableToPointInTimeOutput {
    
    inline def apply(): RestoreTableToPointInTimeOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
    }
    
    extension [Self <: RestoreTableToPointInTimeOutput](x: Self) {
      
      inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INDEXES
    - typings.awsSdk.awsSdkStrings.TOTAL
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = _ReturnConsumedCapacity | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIZE
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = _ReturnItemCollectionMetrics | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.ALL_OLD
    - typings.awsSdk.awsSdkStrings.UPDATED_OLD
    - typings.awsSdk.awsSdkStrings.ALL_NEW
    - typings.awsSdk.awsSdkStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = _ReturnValue | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL_OLD
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = _ReturnValuesOnConditionCheckFailure | java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3BucketOwner = java.lang.String
  
  trait S3BucketSource extends StObject {
    
    /**
      *  The S3 bucket that is being imported from. 
      */
    var S3Bucket: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3Bucket
    
    /**
      *  The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester this is optional. 
      */
    var S3BucketOwner: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.S3BucketOwner] = js.undefined
    
    /**
      *  The key prefix shared by all S3 Objects that are being imported. 
      */
    var S3KeyPrefix: js.UndefOr[S3Prefix] = js.undefined
  }
  object S3BucketSource {
    
    inline def apply(S3Bucket: S3Bucket): S3BucketSource = {
      val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3BucketSource]
    }
    
    extension [Self <: S3BucketSource](x: Self) {
      
      inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
      
      inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
      
      inline def setS3KeyPrefix(value: S3Prefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    }
  }
  
  type S3Prefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AES256
    - typings.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type S3SseAlgorithm = _S3SseAlgorithm | java.lang.String
  
  type S3SseKmsKeyId = java.lang.String
  
  trait SSEDescription extends StObject {
    
    /**
      * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's KMS key was inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's KMS key is accessible again. DynamoDB will initiate the table archival process when table's KMS key remains inaccessible for more than seven days from this date.
      */
    var InaccessibleEncryptionDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The KMS key ARN used for the KMS encryption.
      */
    var KMSMasterKeyArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KMSMasterKeyArn] = js.undefined
    
    /**
      * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses Key Management Service. The key is stored in your account and is managed by KMS (KMS charges apply).  
      */
    var SSEType: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SSEType] = js.undefined
    
    /**
      * Represents the current state of server-side encryption. The only supported values are:    ENABLED - Server-side encryption is enabled.    UPDATING - Server-side encryption is being updated.  
      */
    var Status: js.UndefOr[SSEStatus] = js.undefined
  }
  object SSEDescription {
    
    inline def apply(): SSEDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSEDescription]
    }
    
    extension [Self <: SSEDescription](x: Self) {
      
      inline def setInaccessibleEncryptionDateTime(value: js.Date): Self = StObject.set(x, "InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
      
      inline def setInaccessibleEncryptionDateTimeUndefined: Self = StObject.set(x, "InaccessibleEncryptionDateTime", js.undefined)
      
      inline def setKMSMasterKeyArn(value: KMSMasterKeyArn): Self = StObject.set(x, "KMSMasterKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyArnUndefined: Self = StObject.set(x, "KMSMasterKeyArn", js.undefined)
      
      inline def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
      
      inline def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
      
      inline def setStatus(value: SSEStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type SSEEnabled = Boolean
  
  trait SSESpecification extends StObject {
    
    /**
      * Indicates whether server-side encryption is done using an Amazon Web Services managed key or an Amazon Web Services owned key. If enabled (true), server-side encryption type is set to KMS and an Amazon Web Services managed key is used (KMS charges apply). If disabled (false) or not specified, server-side encryption is set to Amazon Web Services owned key.
      */
    var Enabled: js.UndefOr[SSEEnabled] = js.undefined
    
    /**
      * The KMS key that should be used for the KMS encryption. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB key alias/aws/dynamodb.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KMSMasterKeyId] = js.undefined
    
    /**
      * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses Key Management Service. The key is stored in your account and is managed by KMS (KMS charges apply).  
      */
    var SSEType: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SSEType] = js.undefined
  }
  object SSESpecification {
    
    inline def apply(): SSESpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSESpecification]
    }
    
    extension [Self <: SSESpecification](x: Self) {
      
      inline def setEnabled(value: SSEEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      inline def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
      
      inline def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = _SSEStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AES256
    - typings.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type SSEType = _SSEType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S
    - typings.awsSdk.awsSdkStrings.N
    - typings.awsSdk.awsSdkStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = _ScalarAttributeType | java.lang.String
  
  trait ScanInput extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionalOperator] = js.undefined
    
    /**
      * A Boolean value that determines the read consistency model during the scan:   If ConsistentRead is false, then the data returned from Scan might not contain the results from other recently completed write operations (PutItem, UpdateItem, or DeleteItem).   If ConsistentRead is true, then all of the write operations that completed before the Scan began are guaranteed to be contained in the Scan response.   The default setting for ConsistentRead is false. The ConsistentRead parameter is not supported on global secondary indexes. If you scan a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsistentRead] = js.undefined
    
    /**
      * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are allowed. In a parallel scan, a Scan request that includes ExclusiveStartKey must specify the same segment whose previous Scan returned the corresponding value of LastEvaluatedKey.
      */
    var ExclusiveStartKey: js.UndefOr[Key] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * A string that contains conditions that DynamoDB applies after the Scan operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
      */
    var FilterExpression: js.UndefOr[ConditionExpression] = js.undefined
    
    /**
      * The name of a secondary index to scan. This index can be any local secondary index or global secondary index. Note that if you use the IndexName parameter, you must also provide TableName.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Working with Queries in the Amazon DynamoDB Developer Guide.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    
    /**
      * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ScanFilter in the Amazon DynamoDB Developer Guide.
      */
    var ScanFilter: js.UndefOr[FilterConditionMap] = js.undefined
    
    /**
      * For a parallel Scan request, Segment identifies an individual segment to be scanned by an application worker. Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application threads to scan a table or an index, then the first thread specifies a Segment value of 0, the second thread specifies 1, and so on. The value of LastEvaluatedKey returned from a parallel Scan request must be used as ExclusiveStartKey with the same segment ID in a subsequent Scan operation. The value for Segment must be greater than or equal to 0, and less than the value provided for TotalSegments. If you provide Segment, you must also provide TotalSegments.
      */
    var Segment: js.UndefOr[ScanSegment] = js.undefined
    
    /**
      * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in ProjectionExpression. This return value is equivalent to specifying ProjectionExpression without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation reads only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor ProjectionExpression are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and ProjectionExpression together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying ProjectionExpression without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
      */
    var Select: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Select] = js.undefined
    
    /**
      * The name of the table containing the requested items; or, if you provide IndexName, the name of the table to which that index belongs.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
    
    /**
      * For a parallel Scan request, TotalSegments represents the total number of segments into which the Scan operation will be divided. The value of TotalSegments corresponds to the number of application workers that will perform the parallel scan. For example, if you want to use four application threads to scan a table or an index, specify a TotalSegments value of 4. The value for TotalSegments must be greater than or equal to 1, and less than or equal to 1000000. If you specify a TotalSegments value of 1, the Scan operation will be sequential rather than parallel. If you specify TotalSegments, you must also specify Segment.
      */
    var TotalSegments: js.UndefOr[ScanTotalSegments] = js.undefined
  }
  object ScanInput {
    
    inline def apply(TableName: TableName): ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanInput]
    }
    
    extension [Self <: ScanInput](x: Self) {
      
      inline def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      inline def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
      
      inline def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      inline def setExclusiveStartKey(value: Key): Self = StObject.set(x, "ExclusiveStartKey", value.asInstanceOf[js.Any])
      
      inline def setExclusiveStartKeyUndefined: Self = StObject.set(x, "ExclusiveStartKey", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setFilterExpression(value: ConditionExpression): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
      
      inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setScanFilter(value: FilterConditionMap): Self = StObject.set(x, "ScanFilter", value.asInstanceOf[js.Any])
      
      inline def setScanFilterUndefined: Self = StObject.set(x, "ScanFilter", js.undefined)
      
      inline def setSegment(value: ScanSegment): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "Segment", js.undefined)
      
      inline def setSelect(value: Select): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTotalSegments(value: ScanTotalSegments): Self = StObject.set(x, "TotalSegments", value.asInstanceOf[js.Any])
      
      inline def setTotalSegmentsUndefined: Self = StObject.set(x, "TotalSegments", js.undefined)
    }
  }
  
  trait ScanOutput extends StObject {
    
    /**
      * The capacity units consumed by the Scan operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsumedCapacity] = js.undefined
    
    /**
      * The number of items in the response. If you set ScanFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count is the same as ScannedCount.
      */
    var Count: js.UndefOr[Integer] = js.undefined
    
    /**
      * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.
      */
    var Items: js.UndefOr[ItemList] = js.undefined
    
    /**
      * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
      */
    var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
    
    /**
      * The number of items evaluated, before any ScanFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Scan operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
      */
    var ScannedCount: js.UndefOr[Integer] = js.undefined
  }
  object ScanOutput {
    
    inline def apply(): ScanOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanOutput]
    }
    
    extension [Self <: ScanOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      inline def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      inline def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value*))
      
      inline def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      inline def setScannedCount(value: Integer): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
      
      inline def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
    }
  }
  
  type ScanSegment = scala.Double
  
  type ScanTotalSegments = scala.Double
  
  type SecondaryIndexesCapacityMap = StringDictionary[Capacity]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
    - typings.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
    - typings.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
    - typings.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type Select = _Select | java.lang.String
  
  trait SourceTableDetails extends StObject {
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BillingMode] = js.undefined
    
    /**
      * Number of items in the table. Note that this is an approximate value. 
      */
    var ItemCount: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ItemCount] = js.undefined
    
    /**
      * Schema of the table. 
      */
    var KeySchema: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema
    
    /**
      * Read IOPs and Write IOPS on the table when the backup was created.
      */
    var ProvisionedThroughput: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput
    
    /**
      * ARN of the table for which backup was created. 
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableArn] = js.undefined
    
    /**
      * Time when the source table was created. 
      */
    var TableCreationDateTime: js.Date
    
    /**
      * Unique identifier for the table for which the backup was created. 
      */
    var TableId: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableId
    
    /**
      * The name of the table for which the backup was created. 
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
    
    /**
      * Size of the table in bytes. Note that this is an approximate value.
      */
    var TableSizeBytes: js.UndefOr[Long] = js.undefined
  }
  object SourceTableDetails {
    
    inline def apply(
      KeySchema: KeySchema,
      ProvisionedThroughput: ProvisionedThroughput,
      TableCreationDateTime: js.Date,
      TableId: TableId,
      TableName: TableName
    ): SourceTableDetails = {
      val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceTableDetails]
    }
    
    extension [Self <: SourceTableDetails](x: Self) {
      
      inline def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      inline def setItemCount(value: ItemCount): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      inline def setTableCreationDateTime(value: js.Date): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableSizeBytes(value: Long): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
    }
  }
  
  trait SourceTableFeatureDetails extends StObject {
    
    /**
      * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection, and ProvisionedThroughput for the GSIs on the table at the time of backup. 
      */
    var GlobalSecondaryIndexes: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.GlobalSecondaryIndexes
      ] = js.undefined
    
    /**
      * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
      */
    var LocalSecondaryIndexes: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.LocalSecondaryIndexes] = js.undefined
    
    /**
      * The description of the server-side encryption status on the table when the backup was created.
      */
    var SSEDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SSEDescription] = js.undefined
    
    /**
      * Stream settings on the table when the backup was created.
      */
    var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
    
    /**
      * Time to Live settings on the table when the backup was created.
      */
    var TimeToLiveDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TimeToLiveDescription] = js.undefined
  }
  object SourceTableFeatureDetails {
    
    inline def apply(): SourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceTableFeatureDetails]
    }
    
    extension [Self <: SourceTableFeatureDetails](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexes): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setLocalSecondaryIndexes(value: LocalSecondaryIndexes): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
      
      inline def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      inline def setStreamDescription(value: StreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      inline def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      inline def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
  
  type StreamArn = java.lang.String
  
  type StreamEnabled = Boolean
  
  trait StreamSpecification extends StObject {
    
    /**
      * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
      */
    var StreamEnabled: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamEnabled
    
    /**
      *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
      */
    var StreamViewType: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamViewType] = js.undefined
  }
  object StreamSpecification {
    
    inline def apply(StreamEnabled: StreamEnabled): StreamSpecification = {
      val __obj = js.Dynamic.literal(StreamEnabled = StreamEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSpecification]
    }
    
    extension [Self <: StreamSpecification](x: Self) {
      
      inline def setStreamEnabled(value: StreamEnabled): Self = StObject.set(x, "StreamEnabled", value.asInstanceOf[js.Any])
      
      inline def setStreamViewType(value: StreamViewType): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
      
      inline def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEW_IMAGE
    - typings.awsSdk.awsSdkStrings.OLD_IMAGE
    - typings.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typings.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = _StreamViewType | java.lang.String
  
  type String = java.lang.String
  
  type StringAttributeValue = java.lang.String
  
  trait StringSet
    extends StObject
       with DynamoDbSet {
    
    var `type`: String_
    
    var values: js.Array[java.lang.String]
  }
  object StringSet {
    
    inline def apply(values: js.Array[java.lang.String]): StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("String")
      __obj.asInstanceOf[StringSet]
    }
    
    extension [Self <: StringSet](x: Self) {
      
      inline def setType(value: String_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[java.lang.String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: java.lang.String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  
  type TableArn = java.lang.String
  
  trait TableAutoScalingDescription extends StObject {
    
    /**
      * Represents replicas of the global table.
      */
    var Replicas: js.UndefOr[ReplicaAutoScalingDescriptionList] = js.undefined
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
    
    /**
      * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
      */
    var TableStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableStatus] = js.undefined
  }
  object TableAutoScalingDescription {
    
    inline def apply(): TableAutoScalingDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableAutoScalingDescription]
    }
    
    extension [Self <: TableAutoScalingDescription](x: Self) {
      
      inline def setReplicas(value: ReplicaAutoScalingDescriptionList): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
      
      inline def setReplicasVarargs(value: ReplicaAutoScalingDescription*): Self = StObject.set(x, "Replicas", js.Array(value*))
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      inline def setTableStatus(value: TableStatus): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
      
      inline def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.STANDARD_INFREQUENT_ACCESS
    - java.lang.String
  */
  type TableClass = _TableClass | java.lang.String
  
  trait TableClassSummary extends StObject {
    
    /**
      * The date and time at which the table class was last updated.
      */
    var LastUpdateDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The table class of the specified table. Valid values are STANDARD and STANDARD_INFREQUENT_ACCESS.
      */
    var TableClass: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableClass] = js.undefined
  }
  object TableClassSummary {
    
    inline def apply(): TableClassSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableClassSummary]
    }
    
    extension [Self <: TableClassSummary](x: Self) {
      
      inline def setLastUpdateDateTime(value: js.Date): Self = StObject.set(x, "LastUpdateDateTime", value.asInstanceOf[js.Any])
      
      inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "LastUpdateDateTime", js.undefined)
      
      inline def setTableClass(value: TableClass): Self = StObject.set(x, "TableClass", value.asInstanceOf[js.Any])
      
      inline def setTableClassUndefined: Self = StObject.set(x, "TableClass", js.undefined)
    }
  }
  
  type TableCreationDateTime = js.Date
  
  trait TableCreationParameters extends StObject {
    
    /**
      *  The attributes of the table created as part of the import operation. 
      */
    var AttributeDefinitions: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AttributeDefinitions
    
    /**
      *  The billing mode for provisioning the table created as part of the import operation. 
      */
    var BillingMode: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BillingMode] = js.undefined
    
    /**
      *  The Global Secondary Indexes (GSI) of the table to be created as part of the import operation. 
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.undefined
    
    /**
      *  The primary key and option sort key of the table created as part of the import operation. 
      */
    var KeySchema: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema
    
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput] = js.undefined
    
    var SSESpecification: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SSESpecification] = js.undefined
    
    /**
      *  The name of the table created as part of the import operation. 
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object TableCreationParameters {
    
    inline def apply(AttributeDefinitions: AttributeDefinitions, KeySchema: KeySchema, TableName: TableName): TableCreationParameters = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableCreationParameters]
    }
    
    extension [Self <: TableCreationParameters](x: Self) {
      
      inline def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
      
      inline def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      inline def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
      
      inline def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableDescription extends StObject {
    
    /**
      * Contains information about the table archive.
      */
    var ArchivalSummary: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ArchivalSummary] = js.undefined
    
    /**
      * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
      */
    var AttributeDefinitions: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AttributeDefinitions] = js.undefined
    
    /**
      * Contains the details for the read/write capacity mode.
      */
    var BillingModeSummary: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BillingModeSummary] = js.undefined
    
    /**
      * The date and time when the table was created, in UNIX epoch time format.
      */
    var CreationDateTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table. It is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)   You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - In addition to the attributes described in KEYS_ONLY, the secondary index will include other non-key attributes that you specify.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.undefined
    
    /**
      * Represents the version of global tables in use, if the table is replicated across Amazon Web Services Regions.
      */
    var GlobalTableVersion: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
    
    /**
      * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.undefined
    
    /**
      * The primary key structure for the table. Each KeySchemaElement consists of:    AttributeName - The name of the attribute.    KeyType - The role of the attribute:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.    For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
      */
    var KeySchema: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeySchema] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
      */
    var LatestStreamArn: js.UndefOr[StreamArn] = js.undefined
    
    /**
      * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   Amazon Web Services customer ID   Table name    StreamLabel   
      */
    var LatestStreamLabel: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
    
    /**
      * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:    IndexName - The name of the local secondary index.    KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.    ItemCount - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.   If the table is in the DELETING state, no information about indexes will be returned.
      */
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.undefined
    
    /**
      * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
    
    /**
      * Represents replicas of the table.
      */
    var Replicas: js.UndefOr[ReplicaDescriptionList] = js.undefined
    
    /**
      * Contains details for the restore.
      */
    var RestoreSummary: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RestoreSummary] = js.undefined
    
    /**
      * The description of the server-side encryption status on the specified table.
      */
    var SSEDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SSEDescription] = js.undefined
    
    /**
      * The current DynamoDB Streams configuration for the table.
      */
    var StreamSpecification: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamSpecification] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the table.
      */
    var TableArn: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String] = js.undefined
    
    /**
      * Contains details of the table class.
      */
    var TableClassSummary: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableClassSummary] = js.undefined
    
    /**
      * Unique identifier for the table for which the backup was created. 
      */
    var TableId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableId] = js.undefined
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
    
    /**
      * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var TableSizeBytes: js.UndefOr[Long] = js.undefined
    
    /**
      * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The KMS key used to encrypt the table in inaccessible. Table operations may fail due to failure to use the KMS key. DynamoDB will initiate the table archival process when a table's KMS key remains inaccessible for more than seven days.     ARCHIVING - The table is being archived. Operations are not allowed until archival is complete.     ARCHIVED - The table has been archived. See the ArchivalReason for more information.   
      */
    var TableStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableStatus] = js.undefined
  }
  object TableDescription {
    
    inline def apply(): TableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableDescription]
    }
    
    extension [Self <: TableDescription](x: Self) {
      
      inline def setArchivalSummary(value: ArchivalSummary): Self = StObject.set(x, "ArchivalSummary", value.asInstanceOf[js.Any])
      
      inline def setArchivalSummaryUndefined: Self = StObject.set(x, "ArchivalSummary", js.undefined)
      
      inline def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
      
      inline def setBillingModeSummary(value: BillingModeSummary): Self = StObject.set(x, "BillingModeSummary", value.asInstanceOf[js.Any])
      
      inline def setBillingModeSummaryUndefined: Self = StObject.set(x, "BillingModeSummary", js.undefined)
      
      inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      inline def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setGlobalTableVersion(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "GlobalTableVersion", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableVersionUndefined: Self = StObject.set(x, "GlobalTableVersion", js.undefined)
      
      inline def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setLatestStreamArn(value: StreamArn): Self = StObject.set(x, "LatestStreamArn", value.asInstanceOf[js.Any])
      
      inline def setLatestStreamArnUndefined: Self = StObject.set(x, "LatestStreamArn", js.undefined)
      
      inline def setLatestStreamLabel(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "LatestStreamLabel", value.asInstanceOf[js.Any])
      
      inline def setLatestStreamLabelUndefined: Self = StObject.set(x, "LatestStreamLabel", js.undefined)
      
      inline def setLocalSecondaryIndexes(value: LocalSecondaryIndexDescriptionList): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      inline def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexDescription*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
      
      inline def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      inline def setReplicas(value: ReplicaDescriptionList): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
      
      inline def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
      
      inline def setReplicasVarargs(value: ReplicaDescription*): Self = StObject.set(x, "Replicas", js.Array(value*))
      
      inline def setRestoreSummary(value: RestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
      
      inline def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
      
      inline def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      inline def setTableArn(value: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      inline def setTableClassSummary(value: TableClassSummary): Self = StObject.set(x, "TableClassSummary", value.asInstanceOf[js.Any])
      
      inline def setTableClassSummaryUndefined: Self = StObject.set(x, "TableClassSummary", js.undefined)
      
      inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      inline def setTableSizeBytes(value: Long): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
      
      inline def setTableStatus(value: TableStatus): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
      
      inline def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
    }
  }
  
  type TableId = java.lang.String
  
  type TableName = java.lang.String
  
  type TableNameList = js.Array[TableName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
    - typings.awsSdk.awsSdkStrings.ARCHIVING
    - typings.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type TableStatus = _TableStatus | java.lang.String
  
  trait Tag extends StObject {
    
    /**
      * The key of the tag. Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value.
      */
    var Key: TagKeyString
    
    /**
      * The value of the tag. Tag values are case-sensitive and can be null.
      */
    var Value: TagValueString
  }
  object Tag {
    
    inline def apply(Key: TagKeyString, Value: TagValueString): Tag = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setKey(value: TagKeyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TagValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type TagKeyList = js.Array[TagKeyString]
  
  type TagKeyString = java.lang.String
  
  type TagList = js.Array[Tag]
  
  trait TagResourceInput extends StObject {
    
    /**
      * Identifies the Amazon DynamoDB resource to which tags should be added. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString
    
    /**
      * The tags to be assigned to the Amazon DynamoDB resource.
      */
    var Tags: TagList
  }
  object TagResourceInput {
    
    inline def apply(ResourceArn: ResourceArnString, Tags: TagList): TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagResourceInput]
    }
    
    extension [Self <: TagResourceInput](x: Self) {
      
      inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
      
      inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
  
  type TagValueString = java.lang.String
  
  type TimeRangeLowerBound = js.Date
  
  type TimeRangeUpperBound = js.Date
  
  type TimeToLiveAttributeName = java.lang.String
  
  trait TimeToLiveDescription extends StObject {
    
    /**
      *  The name of the TTL attribute for items in the table.
      */
    var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.undefined
    
    /**
      *  The TTL status for the table.
      */
    var TimeToLiveStatus: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TimeToLiveStatus] = js.undefined
  }
  object TimeToLiveDescription {
    
    inline def apply(): TimeToLiveDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeToLiveDescription]
    }
    
    extension [Self <: TimeToLiveDescription](x: Self) {
      
      inline def setAttributeName(value: TimeToLiveAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
      
      inline def setTimeToLiveStatus(value: TimeToLiveStatus): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
    }
  }
  
  type TimeToLiveEnabled = Boolean
  
  trait TimeToLiveSpecification extends StObject {
    
    /**
      * The name of the TTL attribute used to store the expiration time for items in the table.
      */
    var AttributeName: TimeToLiveAttributeName
    
    /**
      * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
      */
    var Enabled: TimeToLiveEnabled
  }
  object TimeToLiveSpecification {
    
    inline def apply(AttributeName: TimeToLiveAttributeName, Enabled: TimeToLiveEnabled): TimeToLiveSpecification = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeToLiveSpecification]
    }
    
    extension [Self <: TimeToLiveSpecification](x: Self) {
      
      inline def setAttributeName(value: TimeToLiveAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: TimeToLiveEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type TimeToLiveStatus = _TimeToLiveStatus | java.lang.String
  
  trait TransactGetItem extends StObject {
    
    /**
      * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
      */
    var Get: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Get
  }
  object TransactGetItem {
    
    inline def apply(Get: Get): TransactGetItem = {
      val __obj = js.Dynamic.literal(Get = Get.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactGetItem]
    }
    
    extension [Self <: TransactGetItem](x: Self) {
      
      inline def setGet(value: Get): Self = StObject.set(x, "Get", value.asInstanceOf[js.Any])
    }
  }
  
  type TransactGetItemList = js.Array[TransactGetItem]
  
  trait TransactGetItemsInput extends StObject {
    
    /**
      * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
      */
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * An ordered array of up to 100 TransactGetItem objects, each of which contains a Get structure.
      */
    var TransactItems: TransactGetItemList
  }
  object TransactGetItemsInput {
    
    inline def apply(TransactItems: TransactGetItemList): TransactGetItemsInput = {
      val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactGetItemsInput]
    }
    
    extension [Self <: TransactGetItemsInput](x: Self) {
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setTransactItems(value: TransactGetItemList): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
      
      inline def setTransactItemsVarargs(value: TransactGetItem*): Self = StObject.set(x, "TransactItems", js.Array(value*))
    }
  }
  
  trait TransactGetItemsOutput extends StObject {
    
    /**
      * If the ReturnConsumedCapacity value was TOTAL, this is an array of ConsumedCapacity objects, one for each table addressed by TransactGetItem objects in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity units consumed by the TransactGetItems call in that table.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    
    /**
      * An ordered array of up to 100 ItemResponse objects, each of which corresponds to the TransactGetItem object in the same position in the TransactItems array. Each ItemResponse object contains a Map of the name-value pairs that are the projected attributes of the requested item. If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if the requested item has no projected attributes, the corresponding ItemResponse object is an empty Map. 
      */
    var Responses: js.UndefOr[ItemResponseList] = js.undefined
  }
  object TransactGetItemsOutput {
    
    inline def apply(): TransactGetItemsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactGetItemsOutput]
    }
    
    extension [Self <: TransactGetItemsOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setResponses(value: ItemResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setResponsesVarargs(value: ItemResponse*): Self = StObject.set(x, "Responses", js.Array(value*))
    }
  }
  
  trait TransactWriteItem extends StObject {
    
    /**
      * A request to perform a check item operation.
      */
    var ConditionCheck: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionCheck] = js.undefined
    
    /**
      * A request to perform a DeleteItem operation.
      */
    var Delete: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Delete] = js.undefined
    
    /**
      * A request to perform a PutItem operation.
      */
    var Put: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Put] = js.undefined
    
    /**
      * A request to perform an UpdateItem operation.
      */
    var Update: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Update] = js.undefined
  }
  object TransactWriteItem {
    
    inline def apply(): TransactWriteItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactWriteItem]
    }
    
    extension [Self <: TransactWriteItem](x: Self) {
      
      inline def setConditionCheck(value: ConditionCheck): Self = StObject.set(x, "ConditionCheck", value.asInstanceOf[js.Any])
      
      inline def setConditionCheckUndefined: Self = StObject.set(x, "ConditionCheck", js.undefined)
      
      inline def setDelete(value: Delete): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      inline def setPut(value: Put): Self = StObject.set(x, "Put", value.asInstanceOf[js.Any])
      
      inline def setPutUndefined: Self = StObject.set(x, "Put", js.undefined)
      
      inline def setUpdate(value: Update): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
  
  type TransactWriteItemList = js.Array[TransactWriteItem]
  
  trait TransactWriteItemsInput extends StObject {
    
    /**
      * Providing a ClientRequestToken makes the call to TransactWriteItems idempotent, meaning that multiple identical calls have the same effect as one single call. Although multiple identical calls using the same client request token produce the same result on the server (no side effects), the responses to the calls might not be the same. If the ReturnConsumedCapacity&gt; parameter is set, then the initial TransactWriteItems call returns the amount of write capacity units consumed in making the changes. Subsequent TransactWriteItems calls with the same client token return the number of read capacity units consumed in reading the item. A client request token is valid for 10 minutes after the first request that uses it is completed. After 10 minutes, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 10 minutes, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 10-minute idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
      */
    var ClientRequestToken: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ClientRequestToken] = js.undefined
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections (if any), that were modified during the operation and are returned in the response. If set to NONE (the default), no statistics are returned. 
      */
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnItemCollectionMetrics
      ] = js.undefined
    
    /**
      * An ordered array of up to 100 TransactWriteItem objects, each of which contains a ConditionCheck, Put, Update, or Delete object. These can operate on items in different tables, but the tables must reside in the same Amazon Web Services account and Region, and no two of them can operate on the same item. 
      */
    var TransactItems: TransactWriteItemList
  }
  object TransactWriteItemsInput {
    
    inline def apply(TransactItems: TransactWriteItemList): TransactWriteItemsInput = {
      val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactWriteItemsInput]
    }
    
    extension [Self <: TransactWriteItemsInput](x: Self) {
      
      inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      inline def setTransactItems(value: TransactWriteItemList): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
      
      inline def setTransactItemsVarargs(value: TransactWriteItem*): Self = StObject.set(x, "TransactItems", js.Array(value*))
    }
  }
  
  trait TransactWriteItemsOutput extends StObject {
    
    /**
      * The capacity units consumed by the entire TransactWriteItems operation. The values of the list are ordered according to the ordering of the TransactItems request parameter. 
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    
    /**
      * A list of tables that were processed by TransactWriteItems and, for each table, information about any item collections that were affected by individual UpdateItem, PutItem, or DeleteItem operations. 
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined
  }
  object TransactWriteItemsOutput {
    
    inline def apply(): TransactWriteItemsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactWriteItemsOutput]
    }
    
    extension [Self <: TransactWriteItemsOutput](x: Self) {
      
      inline def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
      
      inline def setItemCollectionMetrics(value: ItemCollectionMetricsPerTable): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  trait UntagResourceInput extends StObject {
    
    /**
      * The DynamoDB resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString
    
    /**
      * A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from the DynamoDB resource.
      */
    var TagKeys: TagKeyList
  }
  object UntagResourceInput {
    
    inline def apply(ResourceArn: ResourceArnString, TagKeys: TagKeyList): UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[UntagResourceInput]
    }
    
    extension [Self <: UntagResourceInput](x: Self) {
      
      inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
      
      inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
      
      inline def setTagKeysVarargs(value: TagKeyString*): Self = StObject.set(x, "TagKeys", js.Array(value*))
    }
  }
  
  trait Update extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionExpression] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.undefined
    
    /**
      * Name of the table for the UpdateItem request.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
    
    /**
      * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
      */
    var UpdateExpression: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateExpression
  }
  object Update {
    
    inline def apply(Key: Key, TableName: TableName, UpdateExpression: UpdateExpression): Update = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateContinuousBackupsInput extends StObject {
    
    /**
      * Represents the settings used to enable point in time recovery.
      */
    var PointInTimeRecoverySpecification: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PointInTimeRecoverySpecification
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object UpdateContinuousBackupsInput {
    
    inline def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: TableName): UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateContinuousBackupsInput]
    }
    
    extension [Self <: UpdateContinuousBackupsInput](x: Self) {
      
      inline def setPointInTimeRecoverySpecification(value: PointInTimeRecoverySpecification): Self = StObject.set(x, "PointInTimeRecoverySpecification", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateContinuousBackupsOutput extends StObject {
    
    /**
      * Represents the continuous backups and point in time recovery settings on the table.
      */
    var ContinuousBackupsDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContinuousBackupsDescription
      ] = js.undefined
  }
  object UpdateContinuousBackupsOutput {
    
    inline def apply(): UpdateContinuousBackupsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContinuousBackupsOutput]
    }
    
    extension [Self <: UpdateContinuousBackupsOutput](x: Self) {
      
      inline def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
      
      inline def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
    }
  }
  
  trait UpdateContributorInsightsInput extends StObject {
    
    /**
      * Represents the contributor insights action.
      */
    var ContributorInsightsAction: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContributorInsightsAction
    
    /**
      * The global secondary index name, if applicable.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object UpdateContributorInsightsInput {
    
    inline def apply(ContributorInsightsAction: ContributorInsightsAction, TableName: TableName): UpdateContributorInsightsInput = {
      val __obj = js.Dynamic.literal(ContributorInsightsAction = ContributorInsightsAction.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateContributorInsightsInput]
    }
    
    extension [Self <: UpdateContributorInsightsInput](x: Self) {
      
      inline def setContributorInsightsAction(value: ContributorInsightsAction): Self = StObject.set(x, "ContributorInsightsAction", value.asInstanceOf[js.Any])
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateContributorInsightsOutput extends StObject {
    
    /**
      * The status of contributor insights
      */
    var ContributorInsightsStatus: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ContributorInsightsStatus
      ] = js.undefined
    
    /**
      * The name of the global secondary index, if applicable.
      */
    var IndexName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName] = js.undefined
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName] = js.undefined
  }
  object UpdateContributorInsightsOutput {
    
    inline def apply(): UpdateContributorInsightsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContributorInsightsOutput]
    }
    
    extension [Self <: UpdateContributorInsightsOutput](x: Self) {
      
      inline def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
      
      inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  type UpdateExpression = java.lang.String
  
  trait UpdateGlobalSecondaryIndexAction extends StObject {
    
    /**
      * The name of the global secondary index to be updated.
      */
    var IndexName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.IndexName
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput
  }
  object UpdateGlobalSecondaryIndexAction {
    
    inline def apply(IndexName: IndexName, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
    }
    
    extension [Self <: UpdateGlobalSecondaryIndexAction](x: Self) {
      
      inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateGlobalTableInput extends StObject {
    
    /**
      * The global table name.
      */
    var GlobalTableName: TableName
    
    /**
      * A list of Regions that should be added or removed from the global table.
      */
    var ReplicaUpdates: ReplicaUpdateList
  }
  object UpdateGlobalTableInput {
    
    inline def apply(GlobalTableName: TableName, ReplicaUpdates: ReplicaUpdateList): UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableInput]
    }
    
    extension [Self <: UpdateGlobalTableInput](x: Self) {
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setReplicaUpdates(value: ReplicaUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      inline def setReplicaUpdatesVarargs(value: ReplicaUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value*))
    }
  }
  
  trait UpdateGlobalTableOutput extends StObject {
    
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.GlobalTableDescription
      ] = js.undefined
  }
  object UpdateGlobalTableOutput {
    
    inline def apply(): UpdateGlobalTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateGlobalTableOutput]
    }
    
    extension [Self <: UpdateGlobalTableOutput](x: Self) {
      
      inline def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
  
  trait UpdateGlobalTableSettingsInput extends StObject {
    
    /**
      * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
      */
    var GlobalTableBillingMode: js.UndefOr[BillingMode] = js.undefined
    
    /**
      * Represents the settings of a global secondary index for a global table that will be modified.
      */
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.undefined
    
    /**
      * The name of the global table
      */
    var GlobalTableName: TableName
    
    /**
      * Auto scaling settings for managing provisioned write capacity for the global table.
      */
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
      */
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    
    /**
      * Represents the settings for a global table in a Region that will be modified.
      */
    var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.undefined
  }
  object UpdateGlobalTableSettingsInput {
    
    inline def apply(GlobalTableName: TableName): UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
    }
    
    extension [Self <: UpdateGlobalTableSettingsInput](x: Self) {
      
      inline def setGlobalTableBillingMode(value: BillingMode): Self = StObject.set(x, "GlobalTableBillingMode", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableBillingModeUndefined: Self = StObject.set(x, "GlobalTableBillingMode", js.undefined)
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdate(value: GlobalTableGlobalSecondaryIndexSettingsUpdateList): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value*))
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setGlobalTableProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", js.undefined)
      
      inline def setReplicaSettingsUpdate(value: ReplicaSettingsUpdateList): Self = StObject.set(x, "ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaSettingsUpdate", js.undefined)
      
      inline def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = StObject.set(x, "ReplicaSettingsUpdate", js.Array(value*))
    }
  }
  
  trait UpdateGlobalTableSettingsOutput extends StObject {
    
    /**
      * The name of the global table.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.undefined
    
    /**
      * The Region-specific settings for the global table.
      */
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
  }
  object UpdateGlobalTableSettingsOutput {
    
    inline def apply(): UpdateGlobalTableSettingsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateGlobalTableSettingsOutput]
    }
    
    extension [Self <: UpdateGlobalTableSettingsOutput](x: Self) {
      
      inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
      
      inline def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value*))
    }
  }
  
  trait UpdateItemInput extends StObject {
    
    /**
      * This is a legacy parameter. Use UpdateExpression instead. For more information, see AttributeUpdates in the Amazon DynamoDB Developer Guide.
      */
    var AttributeUpdates: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AttributeUpdates] = js.undefined
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information about condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionExpression] = js.undefined
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConditionalOperator] = js.undefined
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide.) To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information about expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
    
    /**
      * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
    
    var ReturnConsumedCapacity: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnConsumedCapacity
      ] = js.undefined
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ReturnItemCollectionMetrics
      ] = js.undefined
    
    /**
      * Use ReturnValues if you want to get the item attributes as they appear before or after they are updated. For UpdateItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - Returns all of the attributes of the item, as they appeared before the UpdateItem operation.    UPDATED_OLD - Returns only the updated attributes, as they appeared before the UpdateItem operation.    ALL_NEW - Returns all of the attributes of the item, as they appear after the UpdateItem operation.    UPDATED_NEW - Returns only the updated attributes, as they appear after the UpdateItem operation.   There is no additional cost associated with requesting a return value aside from the small network and processing overhead of receiving a larger response. No read capacity units are consumed. The values returned are strongly consistent.
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.undefined
    
    /**
      * The name of the table containing the item to update.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
    
    /**
      * An expression that defines one or more attributes to be updated, the action to be performed on them, and new values for them. The following action values are available for UpdateExpression.    SET - Adds one or more attributes and values to an item. If any of these attributes already exist, they are replaced by the new values. You can also use SET to add or subtract from an attribute that is of type Number. For example: SET myNum = myNum + :val   SET supports the following functions:    if_not_exists (path, operand) - if the item does not contain an attribute at the specified path, then if_not_exists evaluates to operand; otherwise, it evaluates to path. You can use this function to avoid overwriting an attribute that may already be present in the item.    list_append (operand, operand) - evaluates to a list with a new element added to it. You can append the new element to the start or the end of the list by reversing the order of the operands.   These function names are case-sensitive.    REMOVE - Removes one or more attributes from an item.    ADD - Adds the specified value to the item, if the attribute does not already exist. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.  If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. Similarly, if you use ADD for an existing item to increment or decrement an attribute value that doesn't exist before the update, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update doesn't have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set and if Value is also a set, then Value is added to the existing set. For example, if the attribute value is the set [1,2], and the ADD action specified [3], then the final attribute value is [1,2,3]. An error occurs if an ADD action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings.    The ADD action only supports Number and set data types. In addition, ADD can only be used on top-level attributes, not nested attributes.     DELETE - Deletes an element from a set. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specifies [a,c], then the final attribute value is [b]. Specifying an empty set is an error.  The DELETE action only supports set data types. In addition, DELETE can only be used on top-level attributes, not nested attributes.    You can have many actions in a single expression, such as the following: SET a=:value1, b=:value2 DELETE :value3, :value4, :value5  For more information on update expressions, see Modifying Items and Attributes in the Amazon DynamoDB Developer Guide.
      */
    var UpdateExpression: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateExpression] = js.undefined
  }
  object UpdateItemInput {
    
    inline def apply(Key: Key, TableName: TableName): UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateItemInput]
    }
    
    extension [Self <: UpdateItemInput](x: Self) {
      
      inline def setAttributeUpdates(value: AttributeUpdates): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
      
      inline def setAttributeUpdatesUndefined: Self = StObject.set(x, "AttributeUpdates", js.undefined)
      
      inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      inline def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      inline def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      inline def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      inline def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
    }
  }
  
  trait UpdateItemOutput extends StObject {
    
    /**
      * A map of attribute values as they appear before or after the UpdateItem operation, as determined by the ReturnValues parameter. The Attributes map is only present if ReturnValues was specified as something other than NONE in the request. Each element represents one attribute.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    
    /**
      * The capacity units consumed by the UpdateItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ConsumedCapacity] = js.undefined
    
    /**
      * Information about item collections, if any, that were affected by the UpdateItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ItemCollectionMetrics] = js.undefined
  }
  object UpdateItemOutput {
    
    inline def apply(): UpdateItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateItemOutput]
    }
    
    extension [Self <: UpdateItemOutput](x: Self) {
      
      inline def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  trait UpdateReplicationGroupMemberAction extends StObject {
    
    /**
      * Replica-specific global secondary index settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.undefined
    
    /**
      * The KMS key of the replica that should be used for KMS encryption. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS key alias/aws/dynamodb.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KMSMasterKeyId] = js.undefined
    
    /**
      * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughputOverride
      ] = js.undefined
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
    
    /**
      * Replica-specific table class. If not specified, uses the source table's table class.
      */
    var TableClassOverride: js.UndefOr[TableClass] = js.undefined
  }
  object UpdateReplicationGroupMemberAction {
    
    inline def apply(RegionName: RegionName): UpdateReplicationGroupMemberAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateReplicationGroupMemberAction]
    }
    
    extension [Self <: UpdateReplicationGroupMemberAction](x: Self) {
      
      inline def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
      
      inline def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setTableClassOverride(value: TableClass): Self = StObject.set(x, "TableClassOverride", value.asInstanceOf[js.Any])
      
      inline def setTableClassOverrideUndefined: Self = StObject.set(x, "TableClassOverride", js.undefined)
    }
  }
  
  trait UpdateTableInput extends StObject {
    
    /**
      * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, AttributeDefinitions must include the key element(s) of the new index.
      */
    var AttributeDefinitions: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.AttributeDefinitions] = js.undefined
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. When switching from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned capacity values are estimated based on the consumed read and write capacity of your table and global secondary indexes over the past 30 minutes.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.BillingMode] = js.undefined
    
    /**
      * An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:    Create - add a new global secondary index to the table.    Update - modify the provisioned throughput settings of an existing global secondary index.    Delete - remove a global secondary index from the table.   You can create or delete only one global secondary index per UpdateTable operation. For more information, see Managing Global Secondary Indexes in the Amazon DynamoDB Developer Guide. 
      */
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.undefined
    
    /**
      * The new provisioned throughput settings for the specified table or index.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProvisionedThroughput] = js.undefined
    
    /**
      * A list of replica update actions (create, delete, or update) for the table.  This property only applies to Version 2019.11.21 of global tables. 
      */
    var ReplicaUpdates: js.UndefOr[ReplicationGroupUpdateList] = js.undefined
    
    /**
      * The new server-side encryption settings for the specified table.
      */
    var SSESpecification: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.SSESpecification] = js.undefined
    
    /**
      * Represents the DynamoDB Streams configuration for the table.  You receive a ResourceInUseException if you try to enable a stream on a table that already has a stream, or if you try to disable a stream on a table that doesn't have a stream. 
      */
    var StreamSpecification: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.StreamSpecification] = js.undefined
    
    /**
      * The table class of the table to be updated. Valid values are STANDARD and STANDARD_INFREQUENT_ACCESS.
      */
    var TableClass: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableClass] = js.undefined
    
    /**
      * The name of the table to be updated.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object UpdateTableInput {
    
    inline def apply(TableName: TableName): UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTableInput]
    }
    
    extension [Self <: UpdateTableInput](x: Self) {
      
      inline def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
      
      inline def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      inline def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexUpdateList): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
      
      inline def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value*))
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      inline def setReplicaUpdates(value: ReplicationGroupUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      inline def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
      
      inline def setReplicaUpdatesVarargs(value: ReplicationGroupUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value*))
      
      inline def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
      
      inline def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
      
      inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      inline def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      inline def setTableClass(value: TableClass): Self = StObject.set(x, "TableClass", value.asInstanceOf[js.Any])
      
      inline def setTableClassUndefined: Self = StObject.set(x, "TableClass", js.undefined)
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateTableOutput extends StObject {
    
    /**
      * Represents the properties of the table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableDescription] = js.undefined
  }
  object UpdateTableOutput {
    
    inline def apply(): UpdateTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTableOutput]
    }
    
    extension [Self <: UpdateTableOutput](x: Self) {
      
      inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  trait UpdateTableReplicaAutoScalingInput extends StObject {
    
    /**
      * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
      */
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexAutoScalingUpdateList] = js.undefined
    
    var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * Represents the auto scaling settings of replicas of the table that will be modified.
      */
    var ReplicaUpdates: js.UndefOr[ReplicaAutoScalingUpdateList] = js.undefined
    
    /**
      * The name of the global table to be updated.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
  }
  object UpdateTableReplicaAutoScalingInput {
    
    inline def apply(TableName: TableName): UpdateTableReplicaAutoScalingInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
    }
    
    extension [Self <: UpdateTableReplicaAutoScalingInput](x: Self) {
      
      inline def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
      
      inline def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
      
      inline def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value*))
      
      inline def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      inline def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
      
      inline def setReplicaUpdates(value: ReplicaAutoScalingUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      inline def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
      
      inline def setReplicaUpdatesVarargs(value: ReplicaAutoScalingUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value*))
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateTableReplicaAutoScalingOutput extends StObject {
    
    /**
      * Returns information about the auto scaling settings of a table with replicas.
      */
    var TableAutoScalingDescription: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableAutoScalingDescription
      ] = js.undefined
  }
  object UpdateTableReplicaAutoScalingOutput {
    
    inline def apply(): UpdateTableReplicaAutoScalingOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTableReplicaAutoScalingOutput]
    }
    
    extension [Self <: UpdateTableReplicaAutoScalingOutput](x: Self) {
      
      inline def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
      
      inline def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
    }
  }
  
  trait UpdateTimeToLiveInput extends StObject {
    
    /**
      * The name of the table to be configured.
      */
    var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
    
    /**
      * Represents the settings used to enable or disable Time to Live for the specified table.
      */
    var TimeToLiveSpecification: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TimeToLiveSpecification
  }
  object UpdateTimeToLiveInput {
    
    inline def apply(TableName: TableName, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTimeToLiveInput]
    }
    
    extension [Self <: UpdateTimeToLiveInput](x: Self) {
      
      inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateTimeToLiveOutput extends StObject {
    
    /**
      * Represents the output of an UpdateTimeToLive operation.
      */
    var TimeToLiveSpecification: js.UndefOr[
        typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TimeToLiveSpecification
      ] = js.undefined
  }
  object UpdateTimeToLiveOutput {
    
    inline def apply(): UpdateTimeToLiveOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTimeToLiveOutput]
    }
    
    extension [Self <: UpdateTimeToLiveOutput](x: Self) {
      
      inline def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveSpecificationUndefined: Self = StObject.set(x, "TimeToLiveSpecification", js.undefined)
    }
  }
  
  trait WriteRequest extends StObject {
    
    /**
      * A request to perform a DeleteItem operation.
      */
    var DeleteRequest: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DeleteRequest] = js.undefined
    
    /**
      * A request to perform a PutItem operation.
      */
    var PutRequest: js.UndefOr[typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PutRequest] = js.undefined
  }
  object WriteRequest {
    
    inline def apply(): WriteRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteRequest]
    }
    
    extension [Self <: WriteRequest](x: Self) {
      
      inline def setDeleteRequest(value: DeleteRequest): Self = StObject.set(x, "DeleteRequest", value.asInstanceOf[js.Any])
      
      inline def setDeleteRequestUndefined: Self = StObject.set(x, "DeleteRequest", js.undefined)
      
      inline def setPutRequest(value: PutRequest): Self = StObject.set(x, "PutRequest", value.asInstanceOf[js.Any])
      
      inline def setPutRequestUndefined: Self = StObject.set(x, "PutRequest", js.undefined)
    }
  }
  
  type WriteRequests = js.Array[WriteRequest]
  
  trait _AttributeAction extends StObject
  
  trait _BackupStatus extends StObject
  
  trait _BackupType extends StObject
  
  trait _BackupTypeFilter extends StObject
  
  trait _BatchStatementErrorCodeEnum extends StObject
  
  trait _BillingMode extends StObject
  
  trait _ComparisonOperator extends StObject
  
  trait _ConditionalOperator extends StObject
  
  trait _ContinuousBackupsStatus extends StObject
  
  trait _ContributorInsightsAction extends StObject
  
  trait _ContributorInsightsStatus extends StObject
  
  trait _DestinationStatus extends StObject
  
  trait _ExportFormat extends StObject
  
  trait _ExportStatus extends StObject
  
  trait _GlobalTableStatus extends StObject
  
  trait _ImportStatus extends StObject
  
  trait _IndexStatus extends StObject
  
  trait _InputCompressionType extends StObject
  
  trait _InputFormat extends StObject
  
  trait _KeyType extends StObject
  
  trait _PointInTimeRecoveryStatus extends StObject
  
  trait _ProjectionType extends StObject
  
  trait _ReplicaStatus extends StObject
  
  trait _ReturnConsumedCapacity extends StObject
  
  trait _ReturnItemCollectionMetrics extends StObject
  
  trait _ReturnValue extends StObject
  
  trait _ReturnValuesOnConditionCheckFailure extends StObject
  
  trait _S3SseAlgorithm extends StObject
  
  trait _SSEStatus extends StObject
  
  trait _SSEType extends StObject
  
  trait _ScalarAttributeType extends StObject
  
  trait _Select extends StObject
  
  trait _StreamViewType extends StObject
  
  trait _TableClass extends StObject
  
  trait _TableStatus extends StObject
  
  trait _TimeToLiveStatus extends StObject
  
  trait _binaryType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.bufferMod.global.Buffer
    - typings.awsSdk.libDynamodbDocumentClientMod.File
    - typings.awsSdk.libDynamodbDocumentClientMod.Blob
    - js.typedarray.ArrayBuffer
    - js.typedarray.DataView
    - js.typedarray.Int8Array
    - js.typedarray.Uint8Array
    - js.typedarray.Uint8ClampedArray
    - js.typedarray.Int16Array
    - js.typedarray.Uint16Array
    - js.typedarray.Int32Array
    - js.typedarray.Uint32Array
    - js.typedarray.Float32Array
    - js.typedarray.Float64Array
    - typings.node.streamMod.Stream
  */
  type binaryType = _binaryType | Buffer | js.typedarray.ArrayBuffer | js.typedarray.DataView | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | Stream
}

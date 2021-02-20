package typings.awsSdk.documentClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.Binary_
import typings.awsSdk.awsSdkStrings.Number_
import typings.awsSdk.awsSdkStrings.String_
import typings.awsSdk.documentClientMod.DocumentClient.BatchGetItemInput
import typings.awsSdk.documentClientMod.DocumentClient.BatchGetItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.BatchWriteItemInput
import typings.awsSdk.documentClientMod.DocumentClient.BatchWriteItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.CreateSetOptions
import typings.awsSdk.documentClientMod.DocumentClient.DeleteItemInput
import typings.awsSdk.documentClientMod.DocumentClient.DeleteItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk.documentClientMod.DocumentClient.DynamoDbSet
import typings.awsSdk.documentClientMod.DocumentClient.GetItemInput
import typings.awsSdk.documentClientMod.DocumentClient.GetItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.PutItemInput
import typings.awsSdk.documentClientMod.DocumentClient.PutItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.QueryInput
import typings.awsSdk.documentClientMod.DocumentClient.QueryOutput
import typings.awsSdk.documentClientMod.DocumentClient.ScanInput
import typings.awsSdk.documentClientMod.DocumentClient.ScanOutput
import typings.awsSdk.documentClientMod.DocumentClient.TransactGetItemsInput
import typings.awsSdk.documentClientMod.DocumentClient.TransactGetItemsOutput
import typings.awsSdk.documentClientMod.DocumentClient.TransactWriteItemsInput
import typings.awsSdk.documentClientMod.DocumentClient.TransactWriteItemsOutput
import typings.awsSdk.documentClientMod.DocumentClient.UpdateItemInput
import typings.awsSdk.documentClientMod.DocumentClient.UpdateItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.binaryType
import typings.awsSdk.dynamodbMod.ClientConfiguration
import typings.awsSdk.dynamodbMod.^
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.node.Buffer
import typings.node.streamMod.Stream
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/dynamodb/document_client", "DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
class DocumentClient () extends StObject {
  def this(options: DocumentClientOptions with ClientConfiguration) = this()
  
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
    * Synchronous write operation that groups up to 10 action requests
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
  
  @js.native
  trait ArchivalSummary extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason. If you wish to restore this backup to the same table name, you will need to delete the original table.
      */
    var ArchivalBackupArn: js.UndefOr[BackupArn] = js.native
    
    /**
      * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
      */
    var ArchivalDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The reason DynamoDB archived the table. Currently, the only possible value is:    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The table was archived due to the table's AWS KMS key being inaccessible for more than seven days. An On-Demand backup was created at the archival time.  
      */
    var ArchivalReason: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ArchivalReason] = js.native
  }
  object ArchivalSummary {
    
    @scala.inline
    def apply(): ArchivalSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchivalSummary]
    }
    
    @scala.inline
    implicit class ArchivalSummaryMutableBuilder[Self <: ArchivalSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchivalBackupArn(value: BackupArn): Self = StObject.set(x, "ArchivalBackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivalBackupArnUndefined: Self = StObject.set(x, "ArchivalBackupArn", js.undefined)
      
      @scala.inline
      def setArchivalDateTime(value: Date): Self = StObject.set(x, "ArchivalDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivalDateTimeUndefined: Self = StObject.set(x, "ArchivalDateTime", js.undefined)
      
      @scala.inline
      def setArchivalReason(value: ArchivalReason): Self = StObject.set(x, "ArchivalReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivalReasonUndefined: Self = StObject.set(x, "ArchivalReason", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADD
    - typings.awsSdk.awsSdkStrings.PUT
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = _AttributeAction | java.lang.String
  
  @js.native
  trait AttributeDefinition extends StObject {
    
    /**
      * A name for the attribute.
      */
    var AttributeName: KeySchemaAttributeName = js.native
    
    /**
      * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
      */
    var AttributeType: ScalarAttributeType = js.native
  }
  object AttributeDefinition {
    
    @scala.inline
    def apply(AttributeName: KeySchemaAttributeName, AttributeType: ScalarAttributeType): AttributeDefinition = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDefinition]
    }
    
    @scala.inline
    implicit class AttributeDefinitionMutableBuilder[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: KeySchemaAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeType(value: ScalarAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    }
  }
  
  type AttributeDefinitions = js.Array[AttributeDefinition]
  
  type AttributeMap = StringDictionary[AttributeValue]
  
  type AttributeName = java.lang.String
  
  type AttributeNameList = js.Array[AttributeName]
  
  type AttributeUpdates = StringDictionary[AttributeValueUpdate]
  
  type AttributeValue = js.Any
  
  type AttributeValueList = js.Array[AttributeValue]
  
  @js.native
  trait AttributeValueUpdate extends StObject {
    
    /**
      * Specifies how to perform the update. Valid values are PUT (default), DELETE, and ADD. The behavior depends on whether the specified primary key already exists in the table.  If an item with the specified Key is found in the table:     PUT - Adds the specified attribute to the item. If the attribute already exists, it is replaced by the new value.     DELETE - If no value is specified, the attribute and its value are removed from the item. The data type of the specified value must match the existing value's data type. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specified [a,c], then the final attribute value would be [b]. Specifying an empty set is an error.    ADD - If the attribute does not already exist, then the attribute and its values are added to the item. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then the Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.   If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. In addition, if you use ADD to update an existing item, and intend to increment or decrement an attribute value which does not yet exist, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update does not yet have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway, even though it currently does not exist. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set, and if the Value is also a set, then the Value is added to the existing set. (This is a set operation, not mathematical addition.) For example, if the attribute value was the set [1,2], and the ADD action specified [3], then the final attribute value would be [1,2,3]. An error occurs if an Add action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings. The same holds true for number sets and binary sets.   This action is only valid for an existing attribute whose data type is number or is a set. Do not use ADD for any other data types.    If no item with the specified Key is found:     PUT - DynamoDB creates a new item with the specified primary key, and then adds the attribute.     DELETE - Nothing happens; there is no attribute to delete.    ADD - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for the attribute value. The only data types allowed are number and number set; no other data types can be specified.  
      */
    var Action: js.UndefOr[AttributeAction] = js.native
    
    /**
      * Represents the data for an attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide. 
      */
    var Value: js.UndefOr[AttributeValue] = js.native
  }
  object AttributeValueUpdate {
    
    @scala.inline
    def apply(): AttributeValueUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeValueUpdate]
    }
    
    @scala.inline
    implicit class AttributeValueUpdateMutableBuilder[Self <: AttributeValueUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: AttributeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  @js.native
  trait AutoScalingPolicyDescription extends StObject {
    
    /**
      * The name of the scaling policy.
      */
    var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.native
    
    /**
      * Represents a target tracking scaling policy configuration.
      */
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.native
  }
  object AutoScalingPolicyDescription {
    
    @scala.inline
    def apply(): AutoScalingPolicyDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingPolicyDescription]
    }
    
    @scala.inline
    implicit class AutoScalingPolicyDescriptionMutableBuilder[Self <: AutoScalingPolicyDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyName(value: AutoScalingPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
  
  type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]
  
  type AutoScalingPolicyName = java.lang.String
  
  @js.native
  trait AutoScalingPolicyUpdate extends StObject {
    
    /**
      * The name of the scaling policy.
      */
    var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.native
    
    /**
      * Represents a target tracking scaling policy configuration.
      */
    var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = js.native
  }
  object AutoScalingPolicyUpdate {
    
    @scala.inline
    def apply(
      TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    ): AutoScalingPolicyUpdate = {
      val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingPolicyUpdate]
    }
    
    @scala.inline
    implicit class AutoScalingPolicyUpdateMutableBuilder[Self <: AutoScalingPolicyUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyName(value: AutoScalingPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    }
  }
  
  type AutoScalingRoleArn = java.lang.String
  
  @js.native
  trait AutoScalingSettingsDescription extends StObject {
    
    /**
      * Disabled auto scaling for this global table or global secondary index.
      */
    var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.native
    
    /**
      * Role ARN used for configuring the auto scaling policy.
      */
    var AutoScalingRoleArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.String] = js.native
    
    /**
      * The maximum capacity units that a global table or global secondary index should be scaled up to.
      */
    var MaximumUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * The minimum capacity units that a global table or global secondary index should be scaled down to.
      */
    var MinimumUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * Information about the scaling policies.
      */
    var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.native
  }
  object AutoScalingSettingsDescription {
    
    @scala.inline
    def apply(): AutoScalingSettingsDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingSettingsDescription]
    }
    
    @scala.inline
    implicit class AutoScalingSettingsDescriptionMutableBuilder[Self <: AutoScalingSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoScalingDisabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
      
      @scala.inline
      def setAutoScalingRoleArn(value: typings.awsSdk.documentClientMod.DocumentClient.String): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
      
      @scala.inline
      def setMaximumUnits(value: PositiveLongObject): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
      
      @scala.inline
      def setMinimumUnits(value: PositiveLongObject): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
      
      @scala.inline
      def setScalingPolicies(value: AutoScalingPolicyDescriptionList): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
      
      @scala.inline
      def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AutoScalingSettingsUpdate extends StObject {
    
    /**
      * Disabled auto scaling for this global table or global secondary index.
      */
    var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.native
    
    /**
      * Role ARN used for configuring auto scaling policy.
      */
    var AutoScalingRoleArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.AutoScalingRoleArn] = js.native
    
    /**
      * The maximum capacity units that a global table or global secondary index should be scaled up to.
      */
    var MaximumUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * The minimum capacity units that a global table or global secondary index should be scaled down to.
      */
    var MinimumUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * The scaling policy to apply for scaling target global table or global secondary index capacity units.
      */
    var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.native
  }
  object AutoScalingSettingsUpdate {
    
    @scala.inline
    def apply(): AutoScalingSettingsUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingSettingsUpdate]
    }
    
    @scala.inline
    implicit class AutoScalingSettingsUpdateMutableBuilder[Self <: AutoScalingSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoScalingDisabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
      
      @scala.inline
      def setAutoScalingRoleArn(value: AutoScalingRoleArn): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
      
      @scala.inline
      def setMaximumUnits(value: PositiveLongObject): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
      
      @scala.inline
      def setMinimumUnits(value: PositiveLongObject): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
      
      @scala.inline
      def setScalingPolicyUpdate(value: AutoScalingPolicyUpdate): Self = StObject.set(x, "ScalingPolicyUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPolicyUpdateUndefined: Self = StObject.set(x, "ScalingPolicyUpdate", js.undefined)
    }
  }
  
  @js.native
  trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends StObject {
    
    /**
      * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
      */
    var DisableScaleIn: js.UndefOr[BooleanObject] = js.native
    
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application auto scaling scales out your scalable target immediately. 
      */
    var ScaleInCooldown: js.UndefOr[IntegerObject] = js.native
    
    /**
      * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
      */
    var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.native
    
    /**
      * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
      */
    var TargetValue: typings.awsSdk.documentClientMod.DocumentClient.Double = js.native
  }
  object AutoScalingTargetTrackingScalingPolicyConfigurationDescription {
    
    @scala.inline
    def apply(TargetValue: typings.awsSdk.documentClientMod.DocumentClient.Double): AutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
    }
    
    @scala.inline
    implicit class AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMutableBuilder[Self <: AutoScalingTargetTrackingScalingPolicyConfigurationDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableScaleIn(value: BooleanObject): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
      
      @scala.inline
      def setScaleInCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
      
      @scala.inline
      def setScaleOutCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
      
      @scala.inline
      def setTargetValue(value: typings.awsSdk.documentClientMod.DocumentClient.Double): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends StObject {
    
    /**
      * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
      */
    var DisableScaleIn: js.UndefOr[BooleanObject] = js.native
    
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application auto scaling scales out your scalable target immediately. 
      */
    var ScaleInCooldown: js.UndefOr[IntegerObject] = js.native
    
    /**
      * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
      */
    var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.native
    
    /**
      * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
      */
    var TargetValue: typings.awsSdk.documentClientMod.DocumentClient.Double = js.native
  }
  object AutoScalingTargetTrackingScalingPolicyConfigurationUpdate {
    
    @scala.inline
    def apply(TargetValue: typings.awsSdk.documentClientMod.DocumentClient.Double): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
    }
    
    @scala.inline
    implicit class AutoScalingTargetTrackingScalingPolicyConfigurationUpdateMutableBuilder[Self <: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableScaleIn(value: BooleanObject): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
      
      @scala.inline
      def setScaleInCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
      
      @scala.inline
      def setScaleOutCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
      
      @scala.inline
      def setTargetValue(value: typings.awsSdk.documentClientMod.DocumentClient.Double): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Backfilling = Boolean
  
  type BackupArn = java.lang.String
  
  type BackupCreationDateTime = typings.std.Date
  
  @js.native
  trait BackupDescription extends StObject {
    
    /**
      * Contains the details of the backup created for the table. 
      */
    var BackupDetails: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupDetails] = js.native
    
    /**
      * Contains the details of the table when the backup was created. 
      */
    var SourceTableDetails: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SourceTableDetails] = js.native
    
    /**
      * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
      */
    var SourceTableFeatureDetails: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SourceTableFeatureDetails] = js.native
  }
  object BackupDescription {
    
    @scala.inline
    def apply(): BackupDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupDescription]
    }
    
    @scala.inline
    implicit class BackupDescriptionMutableBuilder[Self <: BackupDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
      
      @scala.inline
      def setSourceTableDetails(value: SourceTableDetails): Self = StObject.set(x, "SourceTableDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableDetailsUndefined: Self = StObject.set(x, "SourceTableDetails", js.undefined)
      
      @scala.inline
      def setSourceTableFeatureDetails(value: SourceTableFeatureDetails): Self = StObject.set(x, "SourceTableFeatureDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableFeatureDetailsUndefined: Self = StObject.set(x, "SourceTableFeatureDetails", js.undefined)
    }
  }
  
  @js.native
  trait BackupDetails extends StObject {
    
    /**
      * ARN associated with the backup.
      */
    var BackupArn: typings.awsSdk.documentClientMod.DocumentClient.BackupArn = js.native
    
    /**
      * Time at which the backup was created. This is the request time of the backup. 
      */
    var BackupCreationDateTime: typings.awsSdk.documentClientMod.DocumentClient.BackupCreationDateTime = js.native
    
    /**
      * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
      */
    var BackupExpiryDateTime: js.UndefOr[Date] = js.native
    
    /**
      * Name of the requested backup.
      */
    var BackupName: typings.awsSdk.documentClientMod.DocumentClient.BackupName = js.native
    
    /**
      * Size of the backup in bytes.
      */
    var BackupSizeBytes: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupSizeBytes] = js.native
    
    /**
      * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
      */
    var BackupStatus: typings.awsSdk.documentClientMod.DocumentClient.BackupStatus = js.native
    
    /**
      * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
      */
    var BackupType: typings.awsSdk.documentClientMod.DocumentClient.BackupType = js.native
  }
  object BackupDetails {
    
    @scala.inline
    def apply(
      BackupArn: BackupArn,
      BackupCreationDateTime: BackupCreationDateTime,
      BackupName: BackupName,
      BackupStatus: BackupStatus,
      BackupType: BackupType
    ): BackupDetails = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupDetails]
    }
    
    @scala.inline
    implicit class BackupDetailsMutableBuilder[Self <: BackupDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupCreationDateTime(value: BackupCreationDateTime): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTime(value: Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
      
      @scala.inline
      def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupSizeBytes(value: BackupSizeBytes): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
      
      @scala.inline
      def setBackupStatus(value: BackupStatus): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait BackupSummary extends StObject {
    
    /**
      * ARN associated with the backup.
      */
    var BackupArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupArn] = js.native
    
    /**
      * Time at which the backup was created.
      */
    var BackupCreationDateTime: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupCreationDateTime] = js.native
    
    /**
      * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
      */
    var BackupExpiryDateTime: js.UndefOr[Date] = js.native
    
    /**
      * Name of the specified backup.
      */
    var BackupName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupName] = js.native
    
    /**
      * Size of the backup in bytes.
      */
    var BackupSizeBytes: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupSizeBytes] = js.native
    
    /**
      * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
      */
    var BackupStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupStatus] = js.native
    
    /**
      * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
      */
    var BackupType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupType] = js.native
    
    /**
      * ARN associated with the table.
      */
    var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
    
    /**
      * Unique identifier for the table.
      */
    var TableId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableId] = js.native
    
    /**
      * Name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  }
  object BackupSummary {
    
    @scala.inline
    def apply(): BackupSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupSummary]
    }
    
    @scala.inline
    implicit class BackupSummaryMutableBuilder[Self <: BackupSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
      
      @scala.inline
      def setBackupCreationDateTime(value: BackupCreationDateTime): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupCreationDateTimeUndefined: Self = StObject.set(x, "BackupCreationDateTime", js.undefined)
      
      @scala.inline
      def setBackupExpiryDateTime(value: Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
      
      @scala.inline
      def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupNameUndefined: Self = StObject.set(x, "BackupName", js.undefined)
      
      @scala.inline
      def setBackupSizeBytes(value: BackupSizeBytes): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
      
      @scala.inline
      def setBackupStatus(value: BackupStatus): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupStatusUndefined: Self = StObject.set(x, "BackupStatus", js.undefined)
      
      @scala.inline
      def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
      
      @scala.inline
      def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      @scala.inline
      def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
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
  
  @js.native
  trait BatchGetItemInput extends StObject {
    
    /**
      * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from that table. Each table name can be used only once per BatchGetItem request. Each element in the map of items to retrieve consists of the following:    ConsistentRead - If true, a strongly consistent read is used; if false (the default), an eventually consistent read is used.    ExpressionAttributeNames - One or more substitution tokens for attribute names in the ProjectionExpression parameter. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information about expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    Keys - An array of primary key attribute values that define specific items in the table. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide the partition key value. For a composite key, you must provide both the partition key value and the sort key value.    ProjectionExpression - A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.    AttributesToGet - This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.   
      */
    var RequestItems: BatchGetRequestMap = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
  }
  object BatchGetItemInput {
    
    @scala.inline
    def apply(RequestItems: BatchGetRequestMap): BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetItemInput]
    }
    
    @scala.inline
    implicit class BatchGetItemInputMutableBuilder[Self <: BatchGetItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestItems(value: BatchGetRequestMap): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    }
  }
  
  @js.native
  trait BatchGetItemOutput extends StObject {
    
    /**
      * The read capacity units consumed by the entire BatchGetItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
    
    /**
      * A map of table name to a list of items. Each object in Responses consists of a table name, along with a map of attribute data consisting of the data type and attribute value.
      */
    var Responses: js.UndefOr[BatchGetResponseMap] = js.native
    
    /**
      * A map of tables and their respective keys that were not processed with the current response. The UnprocessedKeys value is in the same form as RequestItems, so the value can be provided directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each element consists of:    Keys - An array of primary key attribute values that define specific items in the table.    ProjectionExpression - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.    ConsistentRead - The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.   If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
      */
    var UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.native
  }
  object BatchGetItemOutput {
    
    @scala.inline
    def apply(): BatchGetItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchGetItemOutput]
    }
    
    @scala.inline
    implicit class BatchGetItemOutputMutableBuilder[Self <: BatchGetItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
      
      @scala.inline
      def setResponses(value: BatchGetResponseMap): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      @scala.inline
      def setUnprocessedKeys(value: BatchGetRequestMap): Self = StObject.set(x, "UnprocessedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedKeysUndefined: Self = StObject.set(x, "UnprocessedKeys", js.undefined)
    }
  }
  
  type BatchGetRequestMap = StringDictionary[KeysAndAttributes]
  
  type BatchGetResponseMap = StringDictionary[ItemList]
  
  @js.native
  trait BatchWriteItemInput extends StObject {
    
    /**
      * A map of one or more table names and, for each table, a list of operations to be performed (DeleteRequest or PutRequest). Each element in the map consists of the following:    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values are rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.    
      */
    var RequestItems: BatchWriteItemRequestMap = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnItemCollectionMetrics] = js.native
  }
  object BatchWriteItemInput {
    
    @scala.inline
    def apply(RequestItems: BatchWriteItemRequestMap): BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchWriteItemInput]
    }
    
    @scala.inline
    implicit class BatchWriteItemInputMutableBuilder[Self <: BatchWriteItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestItems(value: BatchWriteItemRequestMap): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    }
  }
  
  @js.native
  trait BatchWriteItemOutput extends StObject {
    
    /**
      * The capacity units consumed by the entire BatchWriteItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
    
    /**
      * A list of tables that were processed by BatchWriteItem and, for each table, information about any item collections that were affected by individual DeleteItem or PutItem operations. Each entry consists of the following subelements:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item.    SizeEstimateRangeGB - An estimate of item collection size, expressed in GB. This is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on the table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.native
    
    /**
      * A map of tables and requests against those tables that were not processed. The UnprocessedItems value is in the same form as RequestItems, so you can provide this value directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each UnprocessedItems entry consists of a table name and, for that table, a list of operations to perform (DeleteRequest or PutRequest).    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.     If there are no unprocessed items remaining, the response contains an empty UnprocessedItems map.
      */
    var UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap] = js.native
  }
  object BatchWriteItemOutput {
    
    @scala.inline
    def apply(): BatchWriteItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchWriteItemOutput]
    }
    
    @scala.inline
    implicit class BatchWriteItemOutputMutableBuilder[Self <: BatchWriteItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
      
      @scala.inline
      def setItemCollectionMetrics(value: ItemCollectionMetricsPerTable): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
      
      @scala.inline
      def setUnprocessedItems(value: BatchWriteItemRequestMap): Self = StObject.set(x, "UnprocessedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedItemsUndefined: Self = StObject.set(x, "UnprocessedItems", js.undefined)
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
  
  @js.native
  trait BillingModeSummary extends StObject {
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingMode] = js.native
    
    /**
      * Represents the time when PAY_PER_REQUEST was last set as the read/write capacity mode.
      */
    var LastUpdateToPayPerRequestDateTime: js.UndefOr[Date] = js.native
  }
  object BillingModeSummary {
    
    @scala.inline
    def apply(): BillingModeSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingModeSummary]
    }
    
    @scala.inline
    implicit class BillingModeSummaryMutableBuilder[Self <: BillingModeSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      @scala.inline
      def setLastUpdateToPayPerRequestDateTime(value: Date): Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdateToPayPerRequestDateTimeUndefined: Self = StObject.set(x, "LastUpdateToPayPerRequestDateTime", js.undefined)
    }
  }
  
  type BinaryAttributeValue = Buffer | Uint8Array | typings.awsSdk.documentClientMod.DocumentClient.Blob | java.lang.String
  
  @js.native
  trait BinarySet extends DynamoDbSet {
    
    var `type`: Binary_ = js.native
    
    var values: js.Array[binaryType] = js.native
  }
  object BinarySet {
    
    @scala.inline
    def apply(`type`: Binary_, values: js.Array[binaryType]): BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinarySet]
    }
    
    @scala.inline
    implicit class BinarySetMutableBuilder[Self <: BinarySet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Binary_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[binaryType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: binaryType*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  
  //<!--auto-generated start-->
  @js.native
  trait Blob extends StObject
  
  type BooleanAttributeValue = Boolean
  
  type BooleanObject = Boolean
  
  @js.native
  trait Capacity extends StObject {
    
    /**
      * The total number of capacity units consumed on a table or an index.
      */
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
    
    /**
      * The total number of read capacity units consumed on a table or an index.
      */
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
    
    /**
      * The total number of write capacity units consumed on a table or an index.
      */
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  }
  object Capacity {
    
    @scala.inline
    def apply(): Capacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capacity]
    }
    
    @scala.inline
    implicit class CapacityMutableBuilder[Self <: Capacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
      
      @scala.inline
      def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  type ClientRequestToken = java.lang.String
  
  type ClientToken = java.lang.String
  
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
  
  @js.native
  trait Condition extends StObject {
    
    /**
      * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
      */
    var AttributeValueList: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.AttributeValueList] = js.native
    
    /**
      * A comparator for evaluating attributes. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}    For usage examples of AttributeValueList and ComparisonOperator, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
      */
    var ComparisonOperator: typings.awsSdk.documentClientMod.DocumentClient.ComparisonOperator = js.native
  }
  object Condition {
    
    @scala.inline
    def apply(ComparisonOperator: ComparisonOperator): Condition = {
      val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeValueList(value: AttributeValueList): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
      
      @scala.inline
      def setAttributeValueListVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value :_*))
      
      @scala.inline
      def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConditionCheck extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed.
      */
    var ConditionExpression: typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * The primary key of the item to be checked. Each element consists of an attribute name and a value for that attribute.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.native
    
    /**
      * Name of the table for the check item request.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object ConditionCheck {
    
    @scala.inline
    def apply(ConditionExpression: ConditionExpression, Key: Key, TableName: TableName): ConditionCheck = {
      val __obj = js.Dynamic.literal(ConditionExpression = ConditionExpression.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionCheck]
    }
    
    @scala.inline
    implicit class ConditionCheckMutableBuilder[Self <: ConditionCheck] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait ConsumedCapacity extends StObject {
    
    /**
      * The total number of capacity units consumed by the operation.
      */
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
    
    /**
      * The amount of throughput consumed on each global index affected by the operation.
      */
    var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.native
    
    /**
      * The amount of throughput consumed on each local index affected by the operation.
      */
    var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.native
    
    /**
      * The total number of read capacity units consumed by the operation.
      */
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
    
    /**
      * The amount of throughput consumed on the table affected by the operation.
      */
    var Table: js.UndefOr[Capacity] = js.native
    
    /**
      * The name of the table that was affected by the operation.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
    
    /**
      * The total number of write capacity units consumed by the operation.
      */
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  }
  object ConsumedCapacity {
    
    @scala.inline
    def apply(): ConsumedCapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumedCapacity]
    }
    
    @scala.inline
    implicit class ConsumedCapacityMutableBuilder[Self <: ConsumedCapacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setTable(value: Capacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      @scala.inline
      def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]
  
  type ConsumedCapacityUnits = scala.Double
  
  @js.native
  trait ContinuousBackupsDescription extends StObject {
    
    /**
      *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
      */
    var ContinuousBackupsStatus: typings.awsSdk.documentClientMod.DocumentClient.ContinuousBackupsStatus = js.native
    
    /**
      * The description of the point in time recovery settings applied to the table.
      */
    var PointInTimeRecoveryDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoveryDescription] = js.native
  }
  object ContinuousBackupsDescription {
    
    @scala.inline
    def apply(ContinuousBackupsStatus: ContinuousBackupsStatus): ContinuousBackupsDescription = {
      val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContinuousBackupsDescription]
    }
    
    @scala.inline
    implicit class ContinuousBackupsDescriptionMutableBuilder[Self <: ContinuousBackupsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuousBackupsStatus(value: ContinuousBackupsStatus): Self = StObject.set(x, "ContinuousBackupsStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecoveryDescription(value: PointInTimeRecoveryDescription): Self = StObject.set(x, "PointInTimeRecoveryDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecoveryDescriptionUndefined: Self = StObject.set(x, "PointInTimeRecoveryDescription", js.undefined)
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
  
  @js.native
  trait ContributorInsightsSummary extends StObject {
    
    /**
      * Describes the current status for contributor insights for the given table and index, if applicable.
      */
    var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
    
    /**
      * Name of the index associated with the summary, if any.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * Name of the table associated with the summary.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  }
  object ContributorInsightsSummary {
    
    @scala.inline
    def apply(): ContributorInsightsSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContributorInsightsSummary]
    }
    
    @scala.inline
    implicit class ContributorInsightsSummaryMutableBuilder[Self <: ContributorInsightsSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  @js.native
  trait ConverterOptions extends StObject {
    
    /**
      * An optional flag indicating that the document client should cast
      * empty strings, buffers, and sets to NULL shapes
      */
    var convertEmptyValues: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to return numbers as a NumberValue object instead of
      * converting them to native JavaScript numbers. This allows for the
      * safe round-trip transport of numbers of arbitrary size.
      */
    var wrapNumbers: js.UndefOr[Boolean] = js.native
  }
  object ConverterOptions {
    
    @scala.inline
    def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    @scala.inline
    implicit class ConverterOptionsMutableBuilder[Self <: ConverterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvertEmptyValues(value: Boolean): Self = StObject.set(x, "convertEmptyValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertEmptyValuesUndefined: Self = StObject.set(x, "convertEmptyValues", js.undefined)
      
      @scala.inline
      def setWrapNumbers(value: Boolean): Self = StObject.set(x, "wrapNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapNumbersUndefined: Self = StObject.set(x, "wrapNumbers", js.undefined)
    }
  }
  
  @js.native
  trait CreateBackupInput extends StObject {
    
    /**
      * Specified name for the backup.
      */
    var BackupName: typings.awsSdk.documentClientMod.DocumentClient.BackupName = js.native
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object CreateBackupInput {
    
    @scala.inline
    def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBackupInput]
    }
    
    @scala.inline
    implicit class CreateBackupInputMutableBuilder[Self <: CreateBackupInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateBackupOutput extends StObject {
    
    /**
      * Contains the details of the backup created for the table.
      */
    var BackupDetails: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupDetails] = js.native
  }
  object CreateBackupOutput {
    
    @scala.inline
    def apply(): CreateBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBackupOutput]
    }
    
    @scala.inline
    implicit class CreateBackupOutputMutableBuilder[Self <: CreateBackupOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupDetails(value: BackupDetails): Self = StObject.set(x, "BackupDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDetailsUndefined: Self = StObject.set(x, "BackupDetails", js.undefined)
    }
  }
  
  @js.native
  trait CreateGlobalSecondaryIndexAction extends StObject {
    
    /**
      * The name of the global secondary index to be created.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      * The key schema for the global secondary index.
      */
    var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
    
    /**
      * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
      */
    var Projection: typings.awsSdk.documentClientMod.DocumentClient.Projection = js.native
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
  }
  object CreateGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): CreateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class CreateGlobalSecondaryIndexActionMutableBuilder[Self <: CreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  @js.native
  trait CreateGlobalTableInput extends StObject {
    
    /**
      * The global table name.
      */
    var GlobalTableName: TableName = js.native
    
    /**
      * The Regions where the global table needs to be created.
      */
    var ReplicationGroup: ReplicaList = js.native
  }
  object CreateGlobalTableInput {
    
    @scala.inline
    def apply(GlobalTableName: TableName, ReplicationGroup: ReplicaList): CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateGlobalTableInput]
    }
    
    @scala.inline
    implicit class CreateGlobalTableInputMutableBuilder[Self <: CreateGlobalTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroup(value: ReplicaList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CreateGlobalTableOutput extends StObject {
    
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.GlobalTableDescription] = js.native
  }
  object CreateGlobalTableOutput {
    
    @scala.inline
    def apply(): CreateGlobalTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateGlobalTableOutput]
    }
    
    @scala.inline
    implicit class CreateGlobalTableOutputMutableBuilder[Self <: CreateGlobalTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
  
  @js.native
  trait CreateReplicaAction extends StObject {
    
    /**
      * The Region of the replica to be added.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
  }
  object CreateReplicaAction {
    
    @scala.inline
    def apply(RegionName: RegionName): CreateReplicaAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateReplicaAction]
    }
    
    @scala.inline
    implicit class CreateReplicaActionMutableBuilder[Self <: CreateReplicaAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateReplicationGroupMemberAction extends StObject {
    
    /**
      * Replica-specific global secondary index settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.native
    
    /**
      * The AWS KMS customer master key (CMK) that should be used for AWS KMS encryption in the new replica. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KMSMasterKeyId] = js.native
    
    /**
      * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
    
    /**
      * The Region where the new replica will be created.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
  }
  object CreateReplicationGroupMemberAction {
    
    @scala.inline
    def apply(RegionName: RegionName): CreateReplicationGroupMemberAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateReplicationGroupMemberAction]
    }
    
    @scala.inline
    implicit class CreateReplicationGroupMemberActionMutableBuilder[Self <: CreateReplicationGroupMemberAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      @scala.inline
      def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateSetOptions extends StObject {
    
    /**
      * Set to true if you want to validate the type of each element in the set. Defaults to false.
      */
    var validate: js.UndefOr[Boolean] = js.native
  }
  object CreateSetOptions {
    
    @scala.inline
    def apply(): CreateSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSetOptions]
    }
    
    @scala.inline
    implicit class CreateSetOptionsMutableBuilder[Self <: CreateSetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait CreateTableInput extends StObject {
    
    /**
      * An array of attributes that describe the key schema for the table and indexes.
      */
    var AttributeDefinitions: typings.awsSdk.documentClientMod.DocumentClient.AttributeDefinitions = js.native
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingMode] = js.native
    
    /**
      * One or more global secondary indexes (the maximum is 20) to be created on the table. Each global secondary index in the array includes the following:    IndexName - The name of the global secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the global secondary index.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units.  
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.native
    
    /**
      * Specifies the attributes that make up the primary key for a table or an index. The attributes in KeySchema must also be defined in the AttributeDefinitions array. For more information, see Data Model in the Amazon DynamoDB Developer Guide. Each KeySchemaElement in the array is composed of:    AttributeName - The name of this key attribute.    KeyType - The role that the key attribute will assume:    HASH - partition key    RANGE - sort key      The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from the DynamoDB usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.  For a simple primary key (partition key), you must provide exactly one element with a KeyType of HASH. For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order: The first element must have a KeyType of HASH, and the second element must have a KeyType of RANGE. For more information, see Working with Tables in the Amazon DynamoDB Developer Guide.
      */
    var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
    
    /**
      * One or more local secondary indexes (the maximum is 5) to be created on the table. Each index is scoped to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local secondary index is unconstrained. Each local secondary index in the array includes the following:    IndexName - The name of the local secondary index. Must be unique only for this table.     KeySchema - Specifies the key schema for the local secondary index. The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.    
      */
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList] = js.native
    
    /**
      * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the UpdateTable operation.  If you set BillingMode as PROVISIONED, you must specify this property. If you set BillingMode as PAY_PER_REQUEST, you cannot specify this property. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
    
    /**
      * Represents the settings used to enable server-side encryption.
      */
    var SSESpecification: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SSESpecification] = js.native
    
    /**
      * The settings for DynamoDB Streams on the table. These settings consist of:    StreamEnabled - Indicates whether DynamoDB Streams is to be enabled (true) or disabled (false).    StreamViewType - When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.    
      */
    var StreamSpecification: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.StreamSpecification] = js.native
    
    /**
      * The name of the table to create.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
    
    /**
      * A list of key-value pairs to label the table. For more information, see Tagging for DynamoDB.
      */
    var Tags: js.UndefOr[TagList] = js.native
  }
  object CreateTableInput {
    
    @scala.inline
    def apply(AttributeDefinitions: AttributeDefinitions, KeySchema: KeySchema, TableName: TableName): CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTableInput]
    }
    
    @scala.inline
    implicit class CreateTableInputMutableBuilder[Self <: CreateTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      @scala.inline
      def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
      
      @scala.inline
      def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CreateTableOutput extends StObject {
    
    /**
      * Represents the properties of the table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
  }
  object CreateTableOutput {
    
    @scala.inline
    def apply(): CreateTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTableOutput]
    }
    
    @scala.inline
    implicit class CreateTableOutputMutableBuilder[Self <: CreateTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  type Date = typings.std.Date
  
  @js.native
  trait Delete extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional delete to succeed.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that attribute.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.native
    
    /**
      * Name of the table in which the item to be deleted resides.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object Delete {
    
    @scala.inline
    def apply(Key: Key, TableName: TableName): Delete = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteBackupInput extends StObject {
    
    /**
      * The ARN associated with the backup.
      */
    var BackupArn: typings.awsSdk.documentClientMod.DocumentClient.BackupArn = js.native
  }
  object DeleteBackupInput {
    
    @scala.inline
    def apply(BackupArn: BackupArn): DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBackupInput]
    }
    
    @scala.inline
    implicit class DeleteBackupInputMutableBuilder[Self <: DeleteBackupInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteBackupOutput extends StObject {
    
    /**
      * Contains the description of the backup created for the table.
      */
    var BackupDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupDescription] = js.native
  }
  object DeleteBackupOutput {
    
    @scala.inline
    def apply(): DeleteBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteBackupOutput]
    }
    
    @scala.inline
    implicit class DeleteBackupOutputMutableBuilder[Self <: DeleteBackupOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupDescription(value: BackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
    }
  }
  
  @js.native
  trait DeleteGlobalSecondaryIndexAction extends StObject {
    
    /**
      * The name of the global secondary index to be deleted.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
  }
  object DeleteGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class DeleteGlobalSecondaryIndexActionMutableBuilder[Self <: DeleteGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteItemInput extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional DeleteItem to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information about condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionalOperator] = js.native
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * A map of attribute names to AttributeValue objects, representing the primary key of the item to delete. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnItemCollectionMetrics] = js.native
    
    /**
      * Use ReturnValues if you want to get the item attributes as they appeared before they were deleted. For DeleteItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - The content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, DeleteItem does not recognize any values other than NONE or ALL_OLD. 
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.native
    
    /**
      * The name of the table from which to delete the item.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object DeleteItemInput {
    
    @scala.inline
    def apply(Key: Key, TableName: TableName): DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteItemInput]
    }
    
    @scala.inline
    implicit class DeleteItemInputMutableBuilder[Self <: DeleteItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      @scala.inline
      def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      @scala.inline
      def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      @scala.inline
      def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteItemOutput extends StObject {
    
    /**
      * A map of attribute names to AttributeValue objects, representing the item as it appeared before the DeleteItem operation. This map appears in the response only if ReturnValues was specified as ALL_OLD in the request.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.native
    
    /**
      * The capacity units consumed by the DeleteItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Mode in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
    
    /**
      * Information about item collections, if any, that were affected by the DeleteItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics] = js.native
  }
  object DeleteItemOutput {
    
    @scala.inline
    def apply(): DeleteItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteItemOutput]
    }
    
    @scala.inline
    implicit class DeleteItemOutputMutableBuilder[Self <: DeleteItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  @js.native
  trait DeleteReplicaAction extends StObject {
    
    /**
      * The Region of the replica to be removed.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
  }
  object DeleteReplicaAction {
    
    @scala.inline
    def apply(RegionName: RegionName): DeleteReplicaAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteReplicaAction]
    }
    
    @scala.inline
    implicit class DeleteReplicaActionMutableBuilder[Self <: DeleteReplicaAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteReplicationGroupMemberAction extends StObject {
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
  }
  object DeleteReplicationGroupMemberAction {
    
    @scala.inline
    def apply(RegionName: RegionName): DeleteReplicationGroupMemberAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteReplicationGroupMemberAction]
    }
    
    @scala.inline
    implicit class DeleteReplicationGroupMemberActionMutableBuilder[Self <: DeleteReplicationGroupMemberAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteRequest extends StObject {
    
    /**
      * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
  }
  object DeleteRequest {
    
    @scala.inline
    def apply(Key: Key): DeleteRequest = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRequest]
    }
    
    @scala.inline
    implicit class DeleteRequestMutableBuilder[Self <: DeleteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteTableInput extends StObject {
    
    /**
      * The name of the table to delete.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object DeleteTableInput {
    
    @scala.inline
    def apply(TableName: TableName): DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteTableInput]
    }
    
    @scala.inline
    implicit class DeleteTableInputMutableBuilder[Self <: DeleteTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteTableOutput extends StObject {
    
    /**
      * Represents the properties of a table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
  }
  object DeleteTableOutput {
    
    @scala.inline
    def apply(): DeleteTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTableOutput]
    }
    
    @scala.inline
    implicit class DeleteTableOutputMutableBuilder[Self <: DeleteTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  @js.native
  trait DescribeBackupInput extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated with the backup.
      */
    var BackupArn: typings.awsSdk.documentClientMod.DocumentClient.BackupArn = js.native
  }
  object DescribeBackupInput {
    
    @scala.inline
    def apply(BackupArn: BackupArn): DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeBackupInput]
    }
    
    @scala.inline
    implicit class DescribeBackupInputMutableBuilder[Self <: DescribeBackupInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeBackupOutput extends StObject {
    
    /**
      * Contains the description of the backup created for the table.
      */
    var BackupDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupDescription] = js.native
  }
  object DescribeBackupOutput {
    
    @scala.inline
    def apply(): DescribeBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeBackupOutput]
    }
    
    @scala.inline
    implicit class DescribeBackupOutputMutableBuilder[Self <: DescribeBackupOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupDescription(value: BackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
    }
  }
  
  @js.native
  trait DescribeContinuousBackupsInput extends StObject {
    
    /**
      * Name of the table for which the customer wants to check the continuous backups and point in time recovery settings.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object DescribeContinuousBackupsInput {
    
    @scala.inline
    def apply(TableName: TableName): DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeContinuousBackupsInput]
    }
    
    @scala.inline
    implicit class DescribeContinuousBackupsInputMutableBuilder[Self <: DescribeContinuousBackupsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeContinuousBackupsOutput extends StObject {
    
    /**
      * Represents the continuous backups and point in time recovery settings on the table.
      */
    var ContinuousBackupsDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContinuousBackupsDescription] = js.native
  }
  object DescribeContinuousBackupsOutput {
    
    @scala.inline
    def apply(): DescribeContinuousBackupsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeContinuousBackupsOutput]
    }
    
    @scala.inline
    implicit class DescribeContinuousBackupsOutputMutableBuilder[Self <: DescribeContinuousBackupsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
    }
  }
  
  @js.native
  trait DescribeContributorInsightsInput extends StObject {
    
    /**
      * The name of the global secondary index to describe, if applicable.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The name of the table to describe.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object DescribeContributorInsightsInput {
    
    @scala.inline
    def apply(TableName: TableName): DescribeContributorInsightsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeContributorInsightsInput]
    }
    
    @scala.inline
    implicit class DescribeContributorInsightsInputMutableBuilder[Self <: DescribeContributorInsightsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeContributorInsightsOutput extends StObject {
    
    /**
      * List of names of the associated Alpine rules.
      */
    var ContributorInsightsRuleList: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsRuleList] = js.native
    
    /**
      * Current Status contributor insights.
      */
    var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
    
    /**
      * Returns information about the last failure that encountered. The most common exceptions for a FAILED status are:   LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.   AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient permissions.   AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient permissions.   InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.  
      */
    var FailureException: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.FailureException] = js.native
    
    /**
      * The name of the global secondary index being described.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * Timestamp of the last time the status was changed.
      */
    var LastUpdateDateTime: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.LastUpdateDateTime] = js.native
    
    /**
      * The name of the table being described.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  }
  object DescribeContributorInsightsOutput {
    
    @scala.inline
    def apply(): DescribeContributorInsightsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeContributorInsightsOutput]
    }
    
    @scala.inline
    implicit class DescribeContributorInsightsOutputMutableBuilder[Self <: DescribeContributorInsightsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContributorInsightsRuleList(value: ContributorInsightsRuleList): Self = StObject.set(x, "ContributorInsightsRuleList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorInsightsRuleListUndefined: Self = StObject.set(x, "ContributorInsightsRuleList", js.undefined)
      
      @scala.inline
      def setContributorInsightsRuleListVarargs(value: ContributorInsightsRule*): Self = StObject.set(x, "ContributorInsightsRuleList", js.Array(value :_*))
      
      @scala.inline
      def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
      
      @scala.inline
      def setFailureException(value: FailureException): Self = StObject.set(x, "FailureException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureExceptionUndefined: Self = StObject.set(x, "FailureException", js.undefined)
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setLastUpdateDateTime(value: LastUpdateDateTime): Self = StObject.set(x, "LastUpdateDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "LastUpdateDateTime", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  @js.native
  trait DescribeEndpointsRequest extends StObject
  
  @js.native
  trait DescribeEndpointsResponse extends StObject {
    
    /**
      * List of endpoints.
      */
    var Endpoints: typings.awsSdk.documentClientMod.DocumentClient.Endpoints = js.native
  }
  object DescribeEndpointsResponse {
    
    @scala.inline
    def apply(Endpoints: Endpoints): DescribeEndpointsResponse = {
      val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
    
    @scala.inline
    implicit class DescribeEndpointsResponseMutableBuilder[Self <: DescribeEndpointsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DescribeExportInput extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated with the export.
      */
    var ExportArn: typings.awsSdk.documentClientMod.DocumentClient.ExportArn = js.native
  }
  object DescribeExportInput {
    
    @scala.inline
    def apply(ExportArn: ExportArn): DescribeExportInput = {
      val __obj = js.Dynamic.literal(ExportArn = ExportArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeExportInput]
    }
    
    @scala.inline
    implicit class DescribeExportInputMutableBuilder[Self <: DescribeExportInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeExportOutput extends StObject {
    
    /**
      * Represents the properties of the export.
      */
    var ExportDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportDescription] = js.native
  }
  object DescribeExportOutput {
    
    @scala.inline
    def apply(): DescribeExportOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeExportOutput]
    }
    
    @scala.inline
    implicit class DescribeExportOutputMutableBuilder[Self <: DescribeExportOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
    }
  }
  
  @js.native
  trait DescribeGlobalTableInput extends StObject {
    
    /**
      * The name of the global table.
      */
    var GlobalTableName: TableName = js.native
  }
  object DescribeGlobalTableInput {
    
    @scala.inline
    def apply(GlobalTableName: TableName): DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableInput]
    }
    
    @scala.inline
    implicit class DescribeGlobalTableInputMutableBuilder[Self <: DescribeGlobalTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeGlobalTableOutput extends StObject {
    
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.GlobalTableDescription] = js.native
  }
  object DescribeGlobalTableOutput {
    
    @scala.inline
    def apply(): DescribeGlobalTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeGlobalTableOutput]
    }
    
    @scala.inline
    implicit class DescribeGlobalTableOutputMutableBuilder[Self <: DescribeGlobalTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
  
  @js.native
  trait DescribeGlobalTableSettingsInput extends StObject {
    
    /**
      * The name of the global table to describe.
      */
    var GlobalTableName: TableName = js.native
  }
  object DescribeGlobalTableSettingsInput {
    
    @scala.inline
    def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
    }
    
    @scala.inline
    implicit class DescribeGlobalTableSettingsInputMutableBuilder[Self <: DescribeGlobalTableSettingsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeGlobalTableSettingsOutput extends StObject {
    
    /**
      * The name of the global table.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.native
    
    /**
      * The Region-specific settings for the global table.
      */
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.native
  }
  object DescribeGlobalTableSettingsOutput {
    
    @scala.inline
    def apply(): DescribeGlobalTableSettingsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
    }
    
    @scala.inline
    implicit class DescribeGlobalTableSettingsOutputMutableBuilder[Self <: DescribeGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      @scala.inline
      def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
      
      @scala.inline
      def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DescribeLimitsInput extends StObject
  
  @js.native
  trait DescribeLimitsOutput extends StObject {
    
    /**
      * The maximum total read capacity units that your account allows you to provision across all of your tables in this Region.
      */
    var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * The maximum total write capacity units that your account allows you to provision across all of your tables in this Region.
      */
    var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this Region, including the read capacity units provisioned for its global secondary indexes (GSIs).
      */
    var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this Region, including the write capacity units provisioned for its global secondary indexes (GSIs).
      */
    var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  }
  object DescribeLimitsOutput {
    
    @scala.inline
    def apply(): DescribeLimitsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeLimitsOutput]
    }
    
    @scala.inline
    implicit class DescribeLimitsOutputMutableBuilder[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountMaxReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "AccountMaxReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setAccountMaxWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "AccountMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxWriteCapacityUnits", js.undefined)
      
      @scala.inline
      def setTableMaxReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "TableMaxReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setTableMaxWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "TableMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxWriteCapacityUnits", js.undefined)
    }
  }
  
  @js.native
  trait DescribeTableInput extends StObject {
    
    /**
      * The name of the table to describe.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object DescribeTableInput {
    
    @scala.inline
    def apply(TableName: TableName): DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTableInput]
    }
    
    @scala.inline
    implicit class DescribeTableInputMutableBuilder[Self <: DescribeTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeTableOutput extends StObject {
    
    /**
      * The properties of the table.
      */
    var Table: js.UndefOr[TableDescription] = js.native
  }
  object DescribeTableOutput {
    
    @scala.inline
    def apply(): DescribeTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeTableOutput]
    }
    
    @scala.inline
    implicit class DescribeTableOutputMutableBuilder[Self <: DescribeTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTable(value: TableDescription): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
  
  @js.native
  trait DescribeTableReplicaAutoScalingInput extends StObject {
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object DescribeTableReplicaAutoScalingInput {
    
    @scala.inline
    def apply(TableName: TableName): DescribeTableReplicaAutoScalingInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTableReplicaAutoScalingInput]
    }
    
    @scala.inline
    implicit class DescribeTableReplicaAutoScalingInputMutableBuilder[Self <: DescribeTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeTableReplicaAutoScalingOutput extends StObject {
    
    /**
      * Represents the auto scaling properties of the table.
      */
    var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableAutoScalingDescription] = js.native
  }
  object DescribeTableReplicaAutoScalingOutput {
    
    @scala.inline
    def apply(): DescribeTableReplicaAutoScalingOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
    }
    
    @scala.inline
    implicit class DescribeTableReplicaAutoScalingOutputMutableBuilder[Self <: DescribeTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
    }
  }
  
  @js.native
  trait DescribeTimeToLiveInput extends StObject {
    
    /**
      * The name of the table to be described.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object DescribeTimeToLiveInput {
    
    @scala.inline
    def apply(TableName: TableName): DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTimeToLiveInput]
    }
    
    @scala.inline
    implicit class DescribeTimeToLiveInputMutableBuilder[Self <: DescribeTimeToLiveInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeTimeToLiveOutput extends StObject {
    
    /**
      * 
      */
    var TimeToLiveDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeToLiveDescription] = js.native
  }
  object DescribeTimeToLiveOutput {
    
    @scala.inline
    def apply(): DescribeTimeToLiveOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeTimeToLiveOutput]
    }
    
    @scala.inline
    implicit class DescribeTimeToLiveOutputMutableBuilder[Self <: DescribeTimeToLiveOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
  
  @js.native
  trait DocumentClientOptions extends ConverterOptions {
    
    /**
      * An optional map of parameters to bind to every request sent by this service object.
      */
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * An optional pre-configured instance of the AWS.DynamoDB service object to use for requests. The object may bound parameters used by the document client.
      */
    var service: js.UndefOr[^] = js.native
  }
  object DocumentClientOptions {
    
    @scala.inline
    def apply(): DocumentClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentClientOptions]
    }
    
    @scala.inline
    implicit class DocumentClientOptionsMutableBuilder[Self <: DocumentClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setService(value: ^): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
  
  type Double = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.documentClientMod.DocumentClient.StringSet
    - typings.awsSdk.documentClientMod.DocumentClient.NumberSet
    - typings.awsSdk.documentClientMod.DocumentClient.BinarySet
  */
  trait DynamoDbSet extends StObject
  object DynamoDbSet {
    
    @scala.inline
    def BinarySet(`type`: Binary_, values: js.Array[binaryType]): typings.awsSdk.documentClientMod.DocumentClient.BinarySet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.BinarySet]
    }
    
    @scala.inline
    def NumberSet(`type`: Number_, values: js.Array[scala.Double]): typings.awsSdk.documentClientMod.DocumentClient.NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.NumberSet]
    }
    
    @scala.inline
    def StringSet(`type`: String_, values: js.Array[java.lang.String]): typings.awsSdk.documentClientMod.DocumentClient.StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdk.documentClientMod.DocumentClient.StringSet]
    }
  }
  
  @js.native
  trait Endpoint extends StObject {
    
    /**
      * IP address of the endpoint.
      */
    var Address: typings.awsSdk.documentClientMod.DocumentClient.String = js.native
    
    /**
      * Endpoint cache time to live (TTL) value.
      */
    var CachePeriodInMinutes: Long = js.native
  }
  object Endpoint {
    
    @scala.inline
    def apply(Address: typings.awsSdk.documentClientMod.DocumentClient.String, CachePeriodInMinutes: Long): Endpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: typings.awsSdk.documentClientMod.DocumentClient.String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachePeriodInMinutes(value: Long): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
    }
  }
  
  type Endpoints = js.Array[Endpoint]
  
  type ExceptionDescription = java.lang.String
  
  type ExceptionName = java.lang.String
  
  type ExpectedAttributeMap = StringDictionary[ExpectedAttributeValue]
  
  @js.native
  trait ExpectedAttributeValue extends StObject {
    
    /**
      * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values. For information on specifying data types in JSON, see JSON Data Format in the Amazon DynamoDB Developer Guide.
      */
    var AttributeValueList: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.AttributeValueList] = js.native
    
    /**
      * A comparator for evaluating attributes in the AttributeValueList. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}   
      */
    var ComparisonOperator: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ComparisonOperator] = js.native
    
    /**
      * Causes DynamoDB to evaluate the value before attempting a conditional operation:   If Exists is true, DynamoDB will check to see if that attribute value already exists in the table. If it is found, then the operation succeeds. If it is not found, the operation fails with a ConditionCheckFailedException.   If Exists is false, DynamoDB assumes that the attribute value does not exist in the table. If in fact the value does not exist, then the assumption is valid and the operation succeeds. If the value is found, despite the assumption that it does not exist, the operation fails with a ConditionCheckFailedException.   The default setting for Exists is true. If you supply a Value all by itself, DynamoDB assumes the attribute exists: You don't have to set Exists to true, because it is implied. DynamoDB returns a ValidationException if:    Exists is true but there is no Value to check. (You expect a value to exist, but don't specify what that value is.)    Exists is false but you also provide a Value. (You cannot expect an attribute to have a value, while also expecting it not to exist.)  
      */
    var Exists: js.UndefOr[BooleanObject] = js.native
    
    /**
      * Represents the data for the expected attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see Data Types in the Amazon DynamoDB Developer Guide.
      */
    var Value: js.UndefOr[AttributeValue] = js.native
  }
  object ExpectedAttributeValue {
    
    @scala.inline
    def apply(): ExpectedAttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectedAttributeValue]
    }
    
    @scala.inline
    implicit class ExpectedAttributeValueMutableBuilder[Self <: ExpectedAttributeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeValueList(value: AttributeValueList): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
      
      @scala.inline
      def setAttributeValueListVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value :_*))
      
      @scala.inline
      def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
      
      @scala.inline
      def setExists(value: BooleanObject): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "Exists", js.undefined)
      
      @scala.inline
      def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type ExportArn = java.lang.String
  
  @js.native
  trait ExportDescription extends StObject {
    
    /**
      * The billable size of the table export.
      */
    var BilledSizeBytes: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BilledSizeBytes] = js.native
    
    /**
      * The client token that was provided for the export task. A client token makes calls to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call.
      */
    var ClientToken: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ClientToken] = js.native
    
    /**
      * The time at which the export task completed.
      */
    var EndTime: js.UndefOr[ExportEndTime] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the table export.
      */
    var ExportArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportArn] = js.native
    
    /**
      * The format of the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
      */
    var ExportFormat: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportFormat] = js.native
    
    /**
      * The name of the manifest file for the export task.
      */
    var ExportManifest: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportManifest] = js.native
    
    /**
      * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
      */
    var ExportStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportStatus] = js.native
    
    /**
      * Point in time from which table data was exported.
      */
    var ExportTime: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportTime] = js.native
    
    /**
      * Status code for the result of the failed export.
      */
    var FailureCode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.FailureCode] = js.native
    
    /**
      * Export failure reason description.
      */
    var FailureMessage: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.FailureMessage] = js.native
    
    /**
      * The number of items exported.
      */
    var ItemCount: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCount] = js.native
    
    /**
      * The name of the Amazon S3 bucket containing the export.
      */
    var S3Bucket: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3Bucket] = js.native
    
    /**
      * The ID of the AWS account that owns the bucket containing the export.
      */
    var S3BucketOwner: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3BucketOwner] = js.native
    
    /**
      * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
      */
    var S3Prefix: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3Prefix] = js.native
    
    /**
      * Type of encryption used on the bucket where export data is stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with AWS KMS managed keys  
      */
    var S3SseAlgorithm: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3SseAlgorithm] = js.native
    
    /**
      * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
      */
    var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3SseKmsKeyId] = js.native
    
    /**
      * The time at which the export task began.
      */
    var StartTime: js.UndefOr[ExportStartTime] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the table that was exported.
      */
    var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
    
    /**
      * Unique ID of the table that was exported.
      */
    var TableId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableId] = js.native
  }
  object ExportDescription {
    
    @scala.inline
    def apply(): ExportDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportDescription]
    }
    
    @scala.inline
    implicit class ExportDescriptionMutableBuilder[Self <: ExportDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBilledSizeBytes(value: BilledSizeBytes): Self = StObject.set(x, "BilledSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBilledSizeBytesUndefined: Self = StObject.set(x, "BilledSizeBytes", js.undefined)
      
      @scala.inline
      def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
      
      @scala.inline
      def setEndTime(value: ExportEndTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      @scala.inline
      def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
      
      @scala.inline
      def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
      
      @scala.inline
      def setExportManifest(value: ExportManifest): Self = StObject.set(x, "ExportManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportManifestUndefined: Self = StObject.set(x, "ExportManifest", js.undefined)
      
      @scala.inline
      def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
      
      @scala.inline
      def setExportTime(value: ExportTime): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
      
      @scala.inline
      def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
      
      @scala.inline
      def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
      
      @scala.inline
      def setItemCount(value: ItemCount): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
      
      @scala.inline
      def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
      
      @scala.inline
      def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
      
      @scala.inline
      def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
      
      @scala.inline
      def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
      
      @scala.inline
      def setStartTime(value: ExportStartTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      @scala.inline
      def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      @scala.inline
      def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    }
  }
  
  type ExportEndTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DYNAMODB_JSON
    - typings.awsSdk.awsSdkStrings.ION
    - java.lang.String
  */
  type ExportFormat = _ExportFormat | java.lang.String
  
  type ExportManifest = java.lang.String
  
  type ExportNextToken = java.lang.String
  
  type ExportStartTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ExportStatus = _ExportStatus | java.lang.String
  
  type ExportSummaries = js.Array[ExportSummary]
  
  @js.native
  trait ExportSummary extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the export.
      */
    var ExportArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportArn] = js.native
    
    /**
      * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
      */
    var ExportStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportStatus] = js.native
  }
  object ExportSummary {
    
    @scala.inline
    def apply(): ExportSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSummary]
    }
    
    @scala.inline
    implicit class ExportSummaryMutableBuilder[Self <: ExportSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
      
      @scala.inline
      def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
    }
  }
  
  @js.native
  trait ExportTableToPointInTimeInput extends StObject {
    
    /**
      * Providing a ClientToken makes the call to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call. A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
      */
    var ClientToken: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ClientToken] = js.native
    
    /**
      * The format for the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
      */
    var ExportFormat: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportFormat] = js.native
    
    /**
      * Time in the past from which to export table data. The table export will be a snapshot of the table's state at this point in time.
      */
    var ExportTime: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportTime] = js.native
    
    /**
      * The name of the Amazon S3 bucket to export the snapshot to.
      */
    var S3Bucket: typings.awsSdk.documentClientMod.DocumentClient.S3Bucket = js.native
    
    /**
      * The ID of the AWS account that owns the bucket the export will be stored in.
      */
    var S3BucketOwner: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3BucketOwner] = js.native
    
    /**
      * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
      */
    var S3Prefix: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3Prefix] = js.native
    
    /**
      * Type of encryption used on the bucket where export data will be stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with AWS KMS managed keys  
      */
    var S3SseAlgorithm: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3SseAlgorithm] = js.native
    
    /**
      * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
      */
    var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.S3SseKmsKeyId] = js.native
    
    /**
      * The Amazon Resource Name (ARN) associated with the table to export.
      */
    var TableArn: typings.awsSdk.documentClientMod.DocumentClient.TableArn = js.native
  }
  object ExportTableToPointInTimeInput {
    
    @scala.inline
    def apply(S3Bucket: S3Bucket, TableArn: TableArn): ExportTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any], TableArn = TableArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportTableToPointInTimeInput]
    }
    
    @scala.inline
    implicit class ExportTableToPointInTimeInputMutableBuilder[Self <: ExportTableToPointInTimeInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
      
      @scala.inline
      def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
      
      @scala.inline
      def setExportTime(value: ExportTime): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
      
      @scala.inline
      def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
      
      @scala.inline
      def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
      
      @scala.inline
      def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
      
      @scala.inline
      def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
      
      @scala.inline
      def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExportTableToPointInTimeOutput extends StObject {
    
    /**
      * Contains a description of the table export.
      */
    var ExportDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportDescription] = js.native
  }
  object ExportTableToPointInTimeOutput {
    
    @scala.inline
    def apply(): ExportTableToPointInTimeOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportTableToPointInTimeOutput]
    }
    
    @scala.inline
    implicit class ExportTableToPointInTimeOutputMutableBuilder[Self <: ExportTableToPointInTimeOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
    }
  }
  
  type ExportTime = typings.std.Date
  
  type ExpressionAttributeNameMap = StringDictionary[AttributeName]
  
  type ExpressionAttributeNameVariable = java.lang.String
  
  type ExpressionAttributeValueMap = StringDictionary[AttributeValue]
  
  type ExpressionAttributeValueVariable = java.lang.String
  
  type FailureCode = java.lang.String
  
  @js.native
  trait FailureException extends StObject {
    
    /**
      * Description of the failure.
      */
    var ExceptionDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExceptionDescription] = js.native
    
    /**
      * Exception name.
      */
    var ExceptionName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExceptionName] = js.native
  }
  object FailureException {
    
    @scala.inline
    def apply(): FailureException = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailureException]
    }
    
    @scala.inline
    implicit class FailureExceptionMutableBuilder[Self <: FailureException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExceptionDescription(value: ExceptionDescription): Self = StObject.set(x, "ExceptionDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionDescriptionUndefined: Self = StObject.set(x, "ExceptionDescription", js.undefined)
      
      @scala.inline
      def setExceptionName(value: ExceptionName): Self = StObject.set(x, "ExceptionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionNameUndefined: Self = StObject.set(x, "ExceptionName", js.undefined)
    }
  }
  
  type FailureMessage = java.lang.String
  
  type FilterConditionMap = StringDictionary[Condition]
  
  @js.native
  trait Get extends StObject {
    
    /**
      * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * A map of attribute names to AttributeValue objects that specifies the primary key of the item to retrieve.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
    
    /**
      * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes of the specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProjectionExpression] = js.native
    
    /**
      * The name of the table from which to retrieve the specified item.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object Get {
    
    @scala.inline
    def apply(Key: Key, TableName: TableName): Get = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetItemInput extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.native
    
    /**
      * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsistentRead] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * A map of attribute names to AttributeValue objects, representing the primary key of the item to retrieve. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
    
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result. For more information, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProjectionExpression] = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * The name of the table containing the requested item.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object GetItemInput {
    
    @scala.inline
    def apply(Key: Key, TableName: TableName): GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetItemInput]
    }
    
    @scala.inline
    implicit class GetItemInputMutableBuilder[Self <: GetItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetItemOutput extends StObject {
    
    /**
      * The capacity units consumed by the GetItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
    
    /**
      * A map of attribute names to AttributeValue objects, as specified by ProjectionExpression.
      */
    var Item: js.UndefOr[AttributeMap] = js.native
  }
  object GetItemOutput {
    
    @scala.inline
    def apply(): GetItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetItemOutput]
    }
    
    @scala.inline
    implicit class GetItemOutputMutableBuilder[Self <: GetItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    }
  }
  
  @js.native
  trait GlobalSecondaryIndex extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: typings.awsSdk.documentClientMod.DocumentClient.Projection = js.native
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
  }
  object GlobalSecondaryIndex {
    
    @scala.inline
    def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): GlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalSecondaryIndex]
    }
    
    @scala.inline
    implicit class GlobalSecondaryIndexMutableBuilder[Self <: GlobalSecondaryIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  @js.native
  trait GlobalSecondaryIndexAutoScalingUpdate extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  }
  object GlobalSecondaryIndexAutoScalingUpdate {
    
    @scala.inline
    def apply(): GlobalSecondaryIndexAutoScalingUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexAutoScalingUpdate]
    }
    
    @scala.inline
    implicit class GlobalSecondaryIndexAutoScalingUpdateMutableBuilder[Self <: GlobalSecondaryIndexAutoScalingUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[GlobalSecondaryIndexAutoScalingUpdate]
  
  @js.native
  trait GlobalSecondaryIndexDescription extends StObject {
    
    /**
      * Indicates whether the index is currently backfilling. Backfilling is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and Backfilling is false. You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false.   For indexes that were created during a CreateTable operation, the Backfilling attribute does not appear in the DescribeTable output. 
      */
    var Backfilling: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Backfilling] = js.native
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the index.
      */
    var IndexArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.String] = js.native
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var IndexSizeBytes: js.UndefOr[Long] = js.native
    
    /**
      * The current state of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
      */
    var IndexStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexStatus] = js.native
    
    /**
      * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.native
    
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Projection] = js.native
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.native
  }
  object GlobalSecondaryIndexDescription {
    
    @scala.inline
    def apply(): GlobalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexDescription]
    }
    
    @scala.inline
    implicit class GlobalSecondaryIndexDescriptionMutableBuilder[Self <: GlobalSecondaryIndexDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackfilling(value: Backfilling): Self = StObject.set(x, "Backfilling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfillingUndefined: Self = StObject.set(x, "Backfilling", js.undefined)
      
      @scala.inline
      def setIndexArn(value: typings.awsSdk.documentClientMod.DocumentClient.String): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setIndexSizeBytes(value: Long): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
      
      @scala.inline
      def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      @scala.inline
      def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]
  
  @js.native
  trait GlobalSecondaryIndexInfo extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Projection] = js.native
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. 
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
  }
  object GlobalSecondaryIndexInfo {
    
    @scala.inline
    def apply(): GlobalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexInfo]
    }
    
    @scala.inline
    implicit class GlobalSecondaryIndexInfoMutableBuilder[Self <: GlobalSecondaryIndexInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]
  
  @js.native
  trait GlobalSecondaryIndexUpdate extends StObject {
    
    /**
      * The parameters required for creating a global secondary index on an existing table:    IndexName      KeySchema      AttributeDefinitions      Projection      ProvisionedThroughput    
      */
    var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.native
    
    /**
      * The name of an existing global secondary index to be removed.
      */
    var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.native
    
    /**
      * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.
      */
    var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.native
  }
  object GlobalSecondaryIndexUpdate {
    
    @scala.inline
    def apply(): GlobalSecondaryIndexUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexUpdate]
    }
    
    @scala.inline
    implicit class GlobalSecondaryIndexUpdateMutableBuilder[Self <: GlobalSecondaryIndexUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: CreateGlobalSecondaryIndexAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      @scala.inline
      def setDelete(value: DeleteGlobalSecondaryIndexAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      @scala.inline
      def setUpdate(value: UpdateGlobalSecondaryIndexAction): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
  
  type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]
  
  type GlobalSecondaryIndexes = js.Array[GlobalSecondaryIndexInfo]
  
  @js.native
  trait GlobalTable extends StObject {
    
    /**
      * The global table name.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.native
    
    /**
      * The Regions where the global table has replicas.
      */
    var ReplicationGroup: js.UndefOr[ReplicaList] = js.native
  }
  object GlobalTable {
    
    @scala.inline
    def apply(): GlobalTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTable]
    }
    
    @scala.inline
    implicit class GlobalTableMutableBuilder[Self <: GlobalTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      @scala.inline
      def setReplicationGroup(value: ReplicaList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      @scala.inline
      def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
  
  type GlobalTableArnString = java.lang.String
  
  @js.native
  trait GlobalTableDescription extends StObject {
    
    /**
      * The creation time of the global table.
      */
    var CreationDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The unique identifier of the global table.
      */
    var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.native
    
    /**
      * The global table name.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.native
    
    /**
      * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
      */
    var GlobalTableStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.GlobalTableStatus] = js.native
    
    /**
      * The Regions where the global table has replicas.
      */
    var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.native
  }
  object GlobalTableDescription {
    
    @scala.inline
    def apply(): GlobalTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableDescription]
    }
    
    @scala.inline
    implicit class GlobalTableDescriptionMutableBuilder[Self <: GlobalTableDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      @scala.inline
      def setGlobalTableArn(value: GlobalTableArnString): Self = StObject.set(x, "GlobalTableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableArnUndefined: Self = StObject.set(x, "GlobalTableArn", js.undefined)
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      @scala.inline
      def setGlobalTableStatus(value: GlobalTableStatus): Self = StObject.set(x, "GlobalTableStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableStatusUndefined: Self = StObject.set(x, "GlobalTableStatus", js.undefined)
      
      @scala.inline
      def setReplicationGroup(value: ReplicaDescriptionList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      @scala.inline
      def setReplicationGroupVarargs(value: ReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      * Auto scaling settings for managing a global secondary index's write capacity units.
      */
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  }
  object GlobalTableGlobalSecondaryIndexSettingsUpdate {
    
    @scala.inline
    def apply(IndexName: IndexName): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
    }
    
    @scala.inline
    implicit class GlobalTableGlobalSecondaryIndexSettingsUpdateMutableBuilder[Self <: GlobalTableGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityUnits", js.undefined)
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
  
  type IndexName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = _IndexStatus | java.lang.String
  
  type Integer = scala.Double
  
  type IntegerObject = scala.Double
  
  type ItemCollectionKeyAttributeMap = StringDictionary[AttributeValue]
  
  @js.native
  trait ItemCollectionMetrics extends StObject {
    
    /**
      * The partition key value of the item collection. This value is the same as the partition key value of the item.
      */
    var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.native
    
    /**
      * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
      */
    var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.native
  }
  object ItemCollectionMetrics {
    
    @scala.inline
    def apply(): ItemCollectionMetrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionMetrics]
    }
    
    @scala.inline
    implicit class ItemCollectionMetricsMutableBuilder[Self <: ItemCollectionMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemCollectionKey(value: ItemCollectionKeyAttributeMap): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
      
      @scala.inline
      def setSizeEstimateRangeGB(value: ItemCollectionSizeEstimateRange): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
      
      @scala.inline
      def setSizeEstimateRangeGBVarargs(value: ItemCollectionSizeEstimateBound*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value :_*))
    }
  }
  
  type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]
  
  type ItemCollectionMetricsPerTable = StringDictionary[ItemCollectionMetricsMultiple]
  
  type ItemCollectionSizeEstimateBound = scala.Double
  
  type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]
  
  type ItemCount = scala.Double
  
  type ItemList = js.Array[AttributeMap]
  
  @js.native
  trait ItemResponse extends StObject {
    
    /**
      * Map of attribute data consisting of the data type and attribute value.
      */
    var Item: js.UndefOr[AttributeMap] = js.native
  }
  object ItemResponse {
    
    @scala.inline
    def apply(): ItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemResponse]
    }
    
    @scala.inline
    implicit class ItemResponseMutableBuilder[Self <: ItemResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
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
  
  @js.native
  trait KeySchemaElement extends StObject {
    
    /**
      * The name of a key attribute.
      */
    var AttributeName: KeySchemaAttributeName = js.native
    
    /**
      * The role that this key attribute will assume:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeyType: typings.awsSdk.documentClientMod.DocumentClient.KeyType = js.native
  }
  object KeySchemaElement {
    
    @scala.inline
    def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], KeyType = KeyType.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeySchemaElement]
    }
    
    @scala.inline
    implicit class KeySchemaElementMutableBuilder[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: KeySchemaAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HASH
    - typings.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = _KeyType | java.lang.String
  
  @js.native
  trait KeysAndAttributes extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.native
    
    /**
      * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsistentRead] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * The primary key attribute values that define the items and the attributes associated with the items.
      */
    var Keys: KeyList = js.native
    
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the ProjectionExpression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProjectionExpression] = js.native
  }
  object KeysAndAttributes {
    
    @scala.inline
    def apply(Keys: KeyList): KeysAndAttributes = {
      val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeysAndAttributes]
    }
    
    @scala.inline
    implicit class KeysAndAttributesMutableBuilder[Self <: KeysAndAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setKeys(value: KeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: Key*): Self = StObject.set(x, "Keys", js.Array(value :_*))
      
      @scala.inline
      def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    }
  }
  
  type LastUpdateDateTime = typings.std.Date
  
  type ListAttributeValue = js.Array[AttributeValue]
  
  @js.native
  trait ListBackupsInput extends StObject {
    
    /**
      * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
      */
    var BackupType: js.UndefOr[BackupTypeFilter] = js.native
    
    /**
      *  LastEvaluatedBackupArn is the Amazon Resource Name (ARN) of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
      */
    var ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.native
    
    /**
      * Maximum number of backups to return at once.
      */
    var Limit: js.UndefOr[BackupsInputLimit] = js.native
    
    /**
      * The backups from the table specified by TableName are listed. 
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
    
    /**
      * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
      */
    var TimeRangeLowerBound: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeRangeLowerBound] = js.native
    
    /**
      * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
      */
    var TimeRangeUpperBound: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeRangeUpperBound] = js.native
  }
  object ListBackupsInput {
    
    @scala.inline
    def apply(): ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBackupsInput]
    }
    
    @scala.inline
    implicit class ListBackupsInputMutableBuilder[Self <: ListBackupsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupType(value: BackupTypeFilter): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
      
      @scala.inline
      def setExclusiveStartBackupArn(value: BackupArn): Self = StObject.set(x, "ExclusiveStartBackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartBackupArnUndefined: Self = StObject.set(x, "ExclusiveStartBackupArn", js.undefined)
      
      @scala.inline
      def setLimit(value: BackupsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      @scala.inline
      def setTimeRangeLowerBound(value: TimeRangeLowerBound): Self = StObject.set(x, "TimeRangeLowerBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeRangeLowerBoundUndefined: Self = StObject.set(x, "TimeRangeLowerBound", js.undefined)
      
      @scala.inline
      def setTimeRangeUpperBound(value: TimeRangeUpperBound): Self = StObject.set(x, "TimeRangeUpperBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeRangeUpperBoundUndefined: Self = StObject.set(x, "TimeRangeUpperBound", js.undefined)
    }
  }
  
  @js.native
  trait ListBackupsOutput extends StObject {
    
    /**
      * List of BackupSummary objects.
      */
    var BackupSummaries: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BackupSummaries] = js.native
    
    /**
      *  The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results.   If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there are no more results to be retrieved.   If LastEvaluatedBackupArn is not empty, this may or may not indicate that there is more data to be returned. All results are guaranteed to have been returned if and only if no value for LastEvaluatedBackupArn is returned. 
      */
    var LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.native
  }
  object ListBackupsOutput {
    
    @scala.inline
    def apply(): ListBackupsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBackupsOutput]
    }
    
    @scala.inline
    implicit class ListBackupsOutputMutableBuilder[Self <: ListBackupsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupSummaries(value: BackupSummaries): Self = StObject.set(x, "BackupSummaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupSummariesUndefined: Self = StObject.set(x, "BackupSummaries", js.undefined)
      
      @scala.inline
      def setBackupSummariesVarargs(value: BackupSummary*): Self = StObject.set(x, "BackupSummaries", js.Array(value :_*))
      
      @scala.inline
      def setLastEvaluatedBackupArn(value: BackupArn): Self = StObject.set(x, "LastEvaluatedBackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedBackupArnUndefined: Self = StObject.set(x, "LastEvaluatedBackupArn", js.undefined)
    }
  }
  
  @js.native
  trait ListContributorInsightsInput extends StObject {
    
    /**
      * Maximum number of results to return per page.
      */
    var MaxResults: js.UndefOr[ListContributorInsightsLimit] = js.native
    
    /**
      * A token to for the desired page, if there is one.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.native
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  }
  object ListContributorInsightsInput {
    
    @scala.inline
    def apply(): ListContributorInsightsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListContributorInsightsInput]
    }
    
    @scala.inline
    implicit class ListContributorInsightsInputMutableBuilder[Self <: ListContributorInsightsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: ListContributorInsightsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  type ListContributorInsightsLimit = scala.Double
  
  @js.native
  trait ListContributorInsightsOutput extends StObject {
    
    /**
      * A list of ContributorInsightsSummary.
      */
    var ContributorInsightsSummaries: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsSummaries] = js.native
    
    /**
      * A token to go to the next page if there is one.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.native
  }
  object ListContributorInsightsOutput {
    
    @scala.inline
    def apply(): ListContributorInsightsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListContributorInsightsOutput]
    }
    
    @scala.inline
    implicit class ListContributorInsightsOutputMutableBuilder[Self <: ListContributorInsightsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContributorInsightsSummaries(value: ContributorInsightsSummaries): Self = StObject.set(x, "ContributorInsightsSummaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorInsightsSummariesUndefined: Self = StObject.set(x, "ContributorInsightsSummaries", js.undefined)
      
      @scala.inline
      def setContributorInsightsSummariesVarargs(value: ContributorInsightsSummary*): Self = StObject.set(x, "ContributorInsightsSummaries", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait ListExportsInput extends StObject {
    
    /**
      * Maximum number of results to return per page.
      */
    var MaxResults: js.UndefOr[ListExportsMaxLimit] = js.native
    
    /**
      * An optional string that, if supplied, must be copied from the output of a previous call to ListExports. When provided in this manner, the API fetches the next page of results.
      */
    var NextToken: js.UndefOr[ExportNextToken] = js.native
    
    /**
      * The Amazon Resource Name (ARN) associated with the exported table.
      */
    var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
  }
  object ListExportsInput {
    
    @scala.inline
    def apply(): ListExportsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListExportsInput]
    }
    
    @scala.inline
    implicit class ListExportsInputMutableBuilder[Self <: ListExportsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: ListExportsMaxLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: ExportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    }
  }
  
  type ListExportsMaxLimit = scala.Double
  
  @js.native
  trait ListExportsOutput extends StObject {
    
    /**
      * A list of ExportSummary objects.
      */
    var ExportSummaries: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ExportSummaries] = js.native
    
    /**
      * If this value is returned, there are additional results to be displayed. To retrieve them, call ListExports again, with NextToken set to this value.
      */
    var NextToken: js.UndefOr[ExportNextToken] = js.native
  }
  object ListExportsOutput {
    
    @scala.inline
    def apply(): ListExportsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListExportsOutput]
    }
    
    @scala.inline
    implicit class ListExportsOutputMutableBuilder[Self <: ListExportsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportSummaries(value: ExportSummaries): Self = StObject.set(x, "ExportSummaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportSummariesUndefined: Self = StObject.set(x, "ExportSummaries", js.undefined)
      
      @scala.inline
      def setExportSummariesVarargs(value: ExportSummary*): Self = StObject.set(x, "ExportSummaries", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: ExportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait ListGlobalTablesInput extends StObject {
    
    /**
      * The first global table name that this operation will evaluate.
      */
    var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.native
    
    /**
      * The maximum number of table names to return, if the parameter is not specified DynamoDB defaults to 100. If the number of global tables DynamoDB finds reaches this limit, it stops the operation and returns the table names collected up to that point, with a table name in the LastEvaluatedGlobalTableName to apply in a subsequent operation to the ExclusiveStartGlobalTableName parameter.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.native
    
    /**
      * Lists the global tables in a specific Region.
      */
    var RegionName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RegionName] = js.native
  }
  object ListGlobalTablesInput {
    
    @scala.inline
    def apply(): ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGlobalTablesInput]
    }
    
    @scala.inline
    implicit class ListGlobalTablesInputMutableBuilder[Self <: ListGlobalTablesInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusiveStartGlobalTableName(value: TableName): Self = StObject.set(x, "ExclusiveStartGlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartGlobalTableNameUndefined: Self = StObject.set(x, "ExclusiveStartGlobalTableName", js.undefined)
      
      @scala.inline
      def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    }
  }
  
  @js.native
  trait ListGlobalTablesOutput extends StObject {
    
    /**
      * List of global table names.
      */
    var GlobalTables: js.UndefOr[GlobalTableList] = js.native
    
    /**
      * Last evaluated global table name.
      */
    var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.native
  }
  object ListGlobalTablesOutput {
    
    @scala.inline
    def apply(): ListGlobalTablesOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGlobalTablesOutput]
    }
    
    @scala.inline
    implicit class ListGlobalTablesOutputMutableBuilder[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTables(value: GlobalTableList): Self = StObject.set(x, "GlobalTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTablesUndefined: Self = StObject.set(x, "GlobalTables", js.undefined)
      
      @scala.inline
      def setGlobalTablesVarargs(value: GlobalTable*): Self = StObject.set(x, "GlobalTables", js.Array(value :_*))
      
      @scala.inline
      def setLastEvaluatedGlobalTableName(value: TableName): Self = StObject.set(x, "LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedGlobalTableNameUndefined: Self = StObject.set(x, "LastEvaluatedGlobalTableName", js.undefined)
    }
  }
  
  @js.native
  trait ListTablesInput extends StObject {
    
    /**
      * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
      */
    var ExclusiveStartTableName: js.UndefOr[TableName] = js.native
    
    /**
      * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
      */
    var Limit: js.UndefOr[ListTablesInputLimit] = js.native
  }
  object ListTablesInput {
    
    @scala.inline
    def apply(): ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTablesInput]
    }
    
    @scala.inline
    implicit class ListTablesInputMutableBuilder[Self <: ListTablesInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusiveStartTableName(value: TableName): Self = StObject.set(x, "ExclusiveStartTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartTableNameUndefined: Self = StObject.set(x, "ExclusiveStartTableName", js.undefined)
      
      @scala.inline
      def setLimit(value: ListTablesInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    }
  }
  
  type ListTablesInputLimit = scala.Double
  
  @js.native
  trait ListTablesOutput extends StObject {
    
    /**
      * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
      */
    var LastEvaluatedTableName: js.UndefOr[TableName] = js.native
    
    /**
      * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
      */
    var TableNames: js.UndefOr[TableNameList] = js.native
  }
  object ListTablesOutput {
    
    @scala.inline
    def apply(): ListTablesOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTablesOutput]
    }
    
    @scala.inline
    implicit class ListTablesOutputMutableBuilder[Self <: ListTablesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastEvaluatedTableName(value: TableName): Self = StObject.set(x, "LastEvaluatedTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedTableNameUndefined: Self = StObject.set(x, "LastEvaluatedTableName", js.undefined)
      
      @scala.inline
      def setTableNames(value: TableNameList): Self = StObject.set(x, "TableNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNamesUndefined: Self = StObject.set(x, "TableNames", js.undefined)
      
      @scala.inline
      def setTableNamesVarargs(value: TableName*): Self = StObject.set(x, "TableNames", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ListTagsOfResourceInput extends StObject {
    
    /**
      * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.native
    
    /**
      * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString = js.native
  }
  object ListTagsOfResourceInput {
    
    @scala.inline
    def apply(ResourceArn: ResourceArnString): ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsOfResourceInput]
    }
    
    @scala.inline
    implicit class ListTagsOfResourceInputMutableBuilder[Self <: ListTagsOfResourceInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListTagsOfResourceOutput extends StObject {
    
    /**
      * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.native
    
    /**
      * The tags currently associated with the Amazon DynamoDB resource.
      */
    var Tags: js.UndefOr[TagList] = js.native
  }
  object ListTagsOfResourceOutput {
    
    @scala.inline
    def apply(): ListTagsOfResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTagsOfResourceOutput]
    }
    
    @scala.inline
    implicit class ListTagsOfResourceOutputMutableBuilder[Self <: ListTagsOfResourceOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LocalSecondaryIndex extends StObject {
    
    /**
      * The name of the local secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
    
    /**
      * Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: typings.awsSdk.documentClientMod.DocumentClient.Projection = js.native
  }
  object LocalSecondaryIndex {
    
    @scala.inline
    def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): LocalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalSecondaryIndex]
    }
    
    @scala.inline
    implicit class LocalSecondaryIndexMutableBuilder[Self <: LocalSecondaryIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalSecondaryIndexDescription extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the index.
      */
    var IndexArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.String] = js.native
    
    /**
      * Represents the name of the local secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var IndexSizeBytes: js.UndefOr[Long] = js.native
    
    /**
      * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.native
    
    /**
      * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Projection] = js.native
  }
  object LocalSecondaryIndexDescription {
    
    @scala.inline
    def apply(): LocalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalSecondaryIndexDescription]
    }
    
    @scala.inline
    implicit class LocalSecondaryIndexDescriptionMutableBuilder[Self <: LocalSecondaryIndexDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexArn(value: typings.awsSdk.documentClientMod.DocumentClient.String): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setIndexSizeBytes(value: Long): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
      
      @scala.inline
      def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
    }
  }
  
  type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]
  
  @js.native
  trait LocalSecondaryIndexInfo extends StObject {
    
    /**
      * Represents the name of the local secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
      */
    var KeySchema: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
    
    /**
      * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
      */
    var Projection: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Projection] = js.native
  }
  object LocalSecondaryIndexInfo {
    
    @scala.inline
    def apply(): LocalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalSecondaryIndexInfo]
    }
    
    @scala.inline
    implicit class LocalSecondaryIndexInfoMutableBuilder[Self <: LocalSecondaryIndexInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
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
  
  @js.native
  trait NumberSet extends DynamoDbSet {
    
    var `type`: Number_ = js.native
    
    var values: js.Array[scala.Double] = js.native
  }
  object NumberSet {
    
    @scala.inline
    def apply(`type`: Number_, values: js.Array[scala.Double]): NumberSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberSet]
    }
    
    @scala.inline
    implicit class NumberSetMutableBuilder[Self <: NumberSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Number_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[scala.Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: scala.Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  
  @js.native
  trait PointInTimeRecoveryDescription extends StObject {
    
    /**
      * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days. 
      */
    var EarliestRestorableDateTime: js.UndefOr[Date] = js.native
    
    /**
      *  LatestRestorableDateTime is typically 5 minutes before the current time. 
      */
    var LatestRestorableDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
      */
    var PointInTimeRecoveryStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoveryStatus] = js.native
  }
  object PointInTimeRecoveryDescription {
    
    @scala.inline
    def apply(): PointInTimeRecoveryDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointInTimeRecoveryDescription]
    }
    
    @scala.inline
    implicit class PointInTimeRecoveryDescriptionMutableBuilder[Self <: PointInTimeRecoveryDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEarliestRestorableDateTime(value: Date): Self = StObject.set(x, "EarliestRestorableDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEarliestRestorableDateTimeUndefined: Self = StObject.set(x, "EarliestRestorableDateTime", js.undefined)
      
      @scala.inline
      def setLatestRestorableDateTime(value: Date): Self = StObject.set(x, "LatestRestorableDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestRestorableDateTimeUndefined: Self = StObject.set(x, "LatestRestorableDateTime", js.undefined)
      
      @scala.inline
      def setPointInTimeRecoveryStatus(value: PointInTimeRecoveryStatus): Self = StObject.set(x, "PointInTimeRecoveryStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointInTimeRecoveryStatusUndefined: Self = StObject.set(x, "PointInTimeRecoveryStatus", js.undefined)
    }
  }
  
  @js.native
  trait PointInTimeRecoverySpecification extends StObject {
    
    /**
      * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
      */
    var PointInTimeRecoveryEnabled: BooleanObject = js.native
  }
  object PointInTimeRecoverySpecification {
    
    @scala.inline
    def apply(PointInTimeRecoveryEnabled: BooleanObject): PointInTimeRecoverySpecification = {
      val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointInTimeRecoverySpecification]
    }
    
    @scala.inline
    implicit class PointInTimeRecoverySpecificationMutableBuilder[Self <: PointInTimeRecoverySpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointInTimeRecoveryEnabled(value: BooleanObject): Self = StObject.set(x, "PointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait Projection extends StObject {
    
    /**
      * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
      */
    var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.native
    
    /**
      * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - In addition to the attributes described in KEYS_ONLY, the secondary index will include other non-key attributes that you specify.    ALL - All of the table attributes are projected into the index.  
      */
    var ProjectionType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProjectionType] = js.native
  }
  object Projection {
    
    @scala.inline
    def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonKeyAttributes(value: NonKeyAttributeNameList): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      @scala.inline
      def setNonKeyAttributesVarargs(value: NonKeyAttributeName*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setProjectionType(value: ProjectionType): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
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
  
  @js.native
  trait ProvisionedThroughput extends StObject {
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
      */
    var ReadCapacityUnits: PositiveLongObject = js.native
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
      */
    var WriteCapacityUnits: PositiveLongObject = js.native
  }
  object ProvisionedThroughput {
    
    @scala.inline
    def apply(ReadCapacityUnits: PositiveLongObject, WriteCapacityUnits: PositiveLongObject): ProvisionedThroughput = {
      val __obj = js.Dynamic.literal(ReadCapacityUnits = ReadCapacityUnits.asInstanceOf[js.Any], WriteCapacityUnits = WriteCapacityUnits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisionedThroughput]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputMutableBuilder[Self <: ProvisionedThroughput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProvisionedThroughputDescription extends StObject {
    
    /**
      * The date and time of the last provisioned throughput decrease for this table.
      */
    var LastDecreaseDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The date and time of the last provisioned throughput increase for this table.
      */
    var LastIncreaseDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
      */
    var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
      */
    var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  }
  object ProvisionedThroughputDescription {
    
    @scala.inline
    def apply(): ProvisionedThroughputDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputDescription]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputDescriptionMutableBuilder[Self <: ProvisionedThroughputDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastDecreaseDateTime(value: Date): Self = StObject.set(x, "LastDecreaseDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDecreaseDateTimeUndefined: Self = StObject.set(x, "LastDecreaseDateTime", js.undefined)
      
      @scala.inline
      def setLastIncreaseDateTime(value: Date): Self = StObject.set(x, "LastIncreaseDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIncreaseDateTimeUndefined: Self = StObject.set(x, "LastIncreaseDateTime", js.undefined)
      
      @scala.inline
      def setNumberOfDecreasesToday(value: PositiveLongObject): Self = StObject.set(x, "NumberOfDecreasesToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfDecreasesTodayUndefined: Self = StObject.set(x, "NumberOfDecreasesToday", js.undefined)
      
      @scala.inline
      def setReadCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setWriteCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
    }
  }
  
  @js.native
  trait ProvisionedThroughputOverride extends StObject {
    
    /**
      * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
      */
    var ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  }
  object ProvisionedThroughputOverride {
    
    @scala.inline
    def apply(): ProvisionedThroughputOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputOverride]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputOverrideMutableBuilder[Self <: ProvisionedThroughputOverride] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    }
  }
  
  @js.native
  trait Put extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * A map of attribute name to attribute values, representing the primary key of the item to be written by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema. 
      */
    var Item: PutItemInputAttributeMap = js.native
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.native
    
    /**
      * Name of the table in which to write the item.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object Put {
    
    @scala.inline
    def apply(Item: PutItemInputAttributeMap, TableName: TableName): Put = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Put]
    }
    
    @scala.inline
    implicit class PutMutableBuilder[Self <: Put] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PutItemInput extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional PutItem operation to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information on condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionalOperator] = js.native
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item. You must provide all of the attributes for the primary key. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide both values for both the partition key and the sort key. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition. Empty String and Binary attribute values are allowed. Attribute values of type String and Binary must have a length greater than zero if the attribute is used as a key attribute for a table or index. For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide. Each element in the Item map is an AttributeValue object.
      */
    var Item: PutItemInputAttributeMap = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnItemCollectionMetrics] = js.native
    
    /**
      * Use ReturnValues if you want to get the item attributes as they appeared before they were updated with the PutItem request. For PutItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - If PutItem overwrote an attribute name-value pair, then the content of the old item is returned.    The ReturnValues parameter is used by several DynamoDB operations; however, PutItem does not recognize any values other than NONE or ALL_OLD. 
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.native
    
    /**
      * The name of the table to contain the item.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object PutItemInput {
    
    @scala.inline
    def apply(Item: PutItemInputAttributeMap, TableName: TableName): PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutItemInput]
    }
    
    @scala.inline
    implicit class PutItemInputMutableBuilder[Self <: PutItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      @scala.inline
      def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      @scala.inline
      def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      @scala.inline
      def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  type PutItemInputAttributeMap = StringDictionary[AttributeValue]
  
  @js.native
  trait PutItemOutput extends StObject {
    
    /**
      * The attribute values as they appeared before the PutItem operation, but only if ReturnValues is specified as ALL_OLD in the request. Each element consists of an attribute name and an attribute value.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.native
    
    /**
      * The capacity units consumed by the PutItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
    
    /**
      * Information about item collections, if any, that were affected by the PutItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics] = js.native
  }
  object PutItemOutput {
    
    @scala.inline
    def apply(): PutItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutItemOutput]
    }
    
    @scala.inline
    implicit class PutItemOutputMutableBuilder[Self <: PutItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  @js.native
  trait PutRequest extends StObject {
    
    /**
      * A map of attribute name to attribute values, representing the primary key of an item to be processed by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema.
      */
    var Item: PutItemInputAttributeMap = js.native
  }
  object PutRequest {
    
    @scala.inline
    def apply(Item: PutItemInputAttributeMap): PutRequest = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRequest]
    }
    
    @scala.inline
    implicit class PutRequestMutableBuilder[Self <: PutRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryInput extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.native
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionalOperator] = js.native
    
    /**
      * Determines the read consistency model: If set to true, then the operation uses strongly consistent reads; otherwise, the operation uses eventually consistent reads. Strongly consistent reads are not supported on global secondary indexes. If you query a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsistentRead] = js.native
    
    /**
      * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number, or Binary. No set data types are allowed.
      */
    var ExclusiveStartKey: js.UndefOr[Key] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * A string that contains conditions that DynamoDB applies after the Query operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned. A FilterExpression does not allow key attributes. You cannot define a filter expression based on a partition key or a sort key.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
      */
    var FilterExpression: js.UndefOr[ConditionExpression] = js.native
    
    /**
      * The name of an index to query. This index can be any local secondary index or global secondary index on the table. Note that if you use the IndexName parameter, you must also provide TableName. 
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The condition that specifies the key values for items to be retrieved by the Query action. The condition must perform an equality test on a single partition key value. The condition can optionally perform one of several comparison tests on a single sort key value. This allows Query to retrieve one item with a given partition key value and sort key value, or several items that have the same partition key value but different sort key values. The partition key equality test is required, and must be specified in the following format:  partitionKeyName = :partitionkeyval  If you also want to provide a condition for the sort key, it must be combined using AND with the condition for the sort key. Following is an example, using the = comparison operator for the sort key:  partitionKeyName = :partitionkeyval AND sortKeyName = :sortkeyval  Valid comparisons for the sort key condition are as follows:    sortKeyName = :sortkeyval - true if the sort key value is equal to :sortkeyval.    sortKeyName &lt; :sortkeyval - true if the sort key value is less than :sortkeyval.    sortKeyName &lt;= :sortkeyval - true if the sort key value is less than or equal to :sortkeyval.    sortKeyName &gt; :sortkeyval - true if the sort key value is greater than :sortkeyval.    sortKeyName &gt;=  :sortkeyval - true if the sort key value is greater than or equal to :sortkeyval.    sortKeyName BETWEEN :sortkeyval1 AND :sortkeyval2 - true if the sort key value is greater than or equal to :sortkeyval1, and less than or equal to :sortkeyval2.    begins_with ( sortKeyName, :sortkeyval ) - true if the sort key value begins with a particular operand. (You cannot use this function with a sort key that is of type Number.) Note that the function name begins_with is case-sensitive.   Use the ExpressionAttributeValues parameter to replace tokens such as :partitionval and :sortval with actual values at runtime. You can optionally use the ExpressionAttributeNames parameter to replace the names of the partition key and sort key with placeholder tokens. This option might be necessary if an attribute name conflicts with a DynamoDB reserved word. For example, the following KeyConditionExpression parameter causes an error because Size is a reserved word:    Size = :myval    To work around this, define a placeholder (such a #S) to represent the attribute name Size. KeyConditionExpression then is as follows:    #S = :myval    For a list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide. For more information on ExpressionAttributeNames and ExpressionAttributeValues, see Using Placeholders for Attribute Names and Values in the Amazon DynamoDB Developer Guide.
      */
    var KeyConditionExpression: js.UndefOr[KeyExpression] = js.native
    
    /**
      * This is a legacy parameter. Use KeyConditionExpression instead. For more information, see KeyConditions in the Amazon DynamoDB Developer Guide.
      */
    var KeyConditions: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeyConditions] = js.native
    
    /**
      * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Query and Scan in the Amazon DynamoDB Developer Guide.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.native
    
    /**
      * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProjectionExpression] = js.native
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see QueryFilter in the Amazon DynamoDB Developer Guide.
      */
    var QueryFilter: js.UndefOr[FilterConditionMap] = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * Specifies the order for index traversal: If true (default), the traversal is performed in ascending order; if false, the traversal is performed in descending order.  Items with the same partition key value are stored in sorted order by sort key. If the sort key data type is Number, the results are stored in numeric order. For type String, the results are stored in order of UTF-8 bytes. For type Binary, DynamoDB treats each byte of the binary data as unsigned. If ScanIndexForward is true, DynamoDB returns the results in the order in which they are stored (by sort key value). This is the default behavior. If ScanIndexForward is false, DynamoDB reads the results in reverse order by sort key value, and then returns the results to the client.
      */
    var ScanIndexForward: js.UndefOr[BooleanObject] = js.native
    
    /**
      * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation will read only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
      */
    var Select: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Select] = js.native
    
    /**
      * The name of the table containing the requested items.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object QueryInput {
    
    @scala.inline
    def apply(TableName: TableName): QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryInput]
    }
    
    @scala.inline
    implicit class QueryInputMutableBuilder[Self <: QueryInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      @scala.inline
      def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      @scala.inline
      def setExclusiveStartKey(value: Key): Self = StObject.set(x, "ExclusiveStartKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartKeyUndefined: Self = StObject.set(x, "ExclusiveStartKey", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setFilterExpression(value: ConditionExpression): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setKeyConditionExpression(value: KeyExpression): Self = StObject.set(x, "KeyConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyConditionExpressionUndefined: Self = StObject.set(x, "KeyConditionExpression", js.undefined)
      
      @scala.inline
      def setKeyConditions(value: KeyConditions): Self = StObject.set(x, "KeyConditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyConditionsUndefined: Self = StObject.set(x, "KeyConditions", js.undefined)
      
      @scala.inline
      def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      @scala.inline
      def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      @scala.inline
      def setQueryFilter(value: FilterConditionMap): Self = StObject.set(x, "QueryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryFilterUndefined: Self = StObject.set(x, "QueryFilter", js.undefined)
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setScanIndexForward(value: BooleanObject): Self = StObject.set(x, "ScanIndexForward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanIndexForwardUndefined: Self = StObject.set(x, "ScanIndexForward", js.undefined)
      
      @scala.inline
      def setSelect(value: Select): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryOutput extends StObject {
    
    /**
      * The capacity units consumed by the Query operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
    
    /**
      * The number of items in the response. If you used a QueryFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count and ScannedCount are the same.
      */
    var Count: js.UndefOr[Integer] = js.native
    
    /**
      * An array of item attributes that match the query criteria. Each element in this array consists of an attribute name and the value for that attribute.
      */
    var Items: js.UndefOr[ItemList] = js.native
    
    /**
      * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
      */
    var LastEvaluatedKey: js.UndefOr[Key] = js.native
    
    /**
      * The number of items evaluated, before any QueryFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Query operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
      */
    var ScannedCount: js.UndefOr[Integer] = js.native
  }
  object QueryOutput {
    
    @scala.inline
    def apply(): QueryOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOutput]
    }
    
    @scala.inline
    implicit class QueryOutputMutableBuilder[Self <: QueryOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      @scala.inline
      def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value :_*))
      
      @scala.inline
      def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      @scala.inline
      def setScannedCount(value: Integer): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
    }
  }
  
  type RegionName = java.lang.String
  
  @js.native
  trait Replica extends StObject {
    
    /**
      * The Region where the replica needs to be created.
      */
    var RegionName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RegionName] = js.native
  }
  object Replica {
    
    @scala.inline
    def apply(): Replica = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replica]
    }
    
    @scala.inline
    implicit class ReplicaMutableBuilder[Self <: Replica] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    }
  }
  
  @js.native
  trait ReplicaAutoScalingDescription extends StObject {
    
    /**
      * Replica-specific global secondary index auto scaling settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingDescriptionList] = js.native
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RegionName] = js.native
    
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
      */
    var ReplicaStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatus] = js.native
  }
  object ReplicaAutoScalingDescription {
    
    @scala.inline
    def apply(): ReplicaAutoScalingDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaAutoScalingDescription]
    }
    
    @scala.inline
    implicit class ReplicaAutoScalingDescriptionMutableBuilder[Self <: ReplicaAutoScalingDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexAutoScalingDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    }
  }
  
  type ReplicaAutoScalingDescriptionList = js.Array[ReplicaAutoScalingDescription]
  
  @js.native
  trait ReplicaAutoScalingUpdate extends StObject {
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
    
    /**
      * Represents the auto scaling settings of global secondary indexes that will be modified.
      */
    var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList] = js.native
    
    var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  }
  object ReplicaAutoScalingUpdate {
    
    @scala.inline
    def apply(RegionName: RegionName): ReplicaAutoScalingUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaAutoScalingUpdate]
    }
    
    @scala.inline
    implicit class ReplicaAutoScalingUpdateMutableBuilder[Self <: ReplicaAutoScalingUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexUpdates(value: ReplicaGlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexUpdatesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.Array(value :_*))
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", js.undefined)
    }
  }
  
  type ReplicaAutoScalingUpdateList = js.Array[ReplicaAutoScalingUpdate]
  
  @js.native
  trait ReplicaDescription extends StObject {
    
    /**
      * Replica-specific global secondary index settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexDescriptionList] = js.native
    
    /**
      * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KMSMasterKeyId] = js.native
    
    /**
      * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
    
    /**
      * The name of the Region.
      */
    var RegionName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RegionName] = js.native
    
    /**
      * The time at which the replica was first detected as inaccessible. To determine cause of inaccessibility check the ReplicaStatus property.
      */
    var ReplicaInaccessibleDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.    REGION_DISABLED - The replica is inaccessible because the AWS Region has been disabled.  If the AWS Region remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.     INACCESSIBLE_ENCRYPTION_CREDENTIALS  - The AWS KMS key used to encrypt the table is inaccessible.  If the AWS KMS key remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.   
      */
    var ReplicaStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatus] = js.native
    
    /**
      * Detailed information about the replica status.
      */
    var ReplicaStatusDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatusDescription] = js.native
    
    /**
      * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
      */
    var ReplicaStatusPercentProgress: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatusPercentProgress] = js.native
  }
  object ReplicaDescription {
    
    @scala.inline
    def apply(): ReplicaDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaDescription]
    }
    
    @scala.inline
    implicit class ReplicaDescriptionMutableBuilder[Self <: ReplicaDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      @scala.inline
      def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
      
      @scala.inline
      def setReplicaInaccessibleDateTime(value: Date): Self = StObject.set(x, "ReplicaInaccessibleDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaInaccessibleDateTimeUndefined: Self = StObject.set(x, "ReplicaInaccessibleDateTime", js.undefined)
      
      @scala.inline
      def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaStatusDescription(value: ReplicaStatusDescription): Self = StObject.set(x, "ReplicaStatusDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaStatusDescriptionUndefined: Self = StObject.set(x, "ReplicaStatusDescription", js.undefined)
      
      @scala.inline
      def setReplicaStatusPercentProgress(value: ReplicaStatusPercentProgress): Self = StObject.set(x, "ReplicaStatusPercentProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaStatusPercentProgressUndefined: Self = StObject.set(x, "ReplicaStatusPercentProgress", js.undefined)
      
      @scala.inline
      def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    }
  }
  
  type ReplicaDescriptionList = js.Array[ReplicaDescription]
  
  @js.native
  trait ReplicaGlobalSecondaryIndex extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
  }
  object ReplicaGlobalSecondaryIndex {
    
    @scala.inline
    def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndex]
    }
    
    @scala.inline
    implicit class ReplicaGlobalSecondaryIndexMutableBuilder[Self <: ReplicaGlobalSecondaryIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    }
  }
  
  @js.native
  trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The current state of the replica global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
      */
    var IndexStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexStatus] = js.native
    
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  }
  object ReplicaGlobalSecondaryIndexAutoScalingDescription {
    
    @scala.inline
    def apply(): ReplicaGlobalSecondaryIndexAutoScalingDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingDescription]
    }
    
    @scala.inline
    implicit class ReplicaGlobalSecondaryIndexAutoScalingDescriptionMutableBuilder[Self <: ReplicaGlobalSecondaryIndexAutoScalingDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  
  @js.native
  trait ReplicaGlobalSecondaryIndexAutoScalingUpdate extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    var ProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  }
  object ReplicaGlobalSecondaryIndexAutoScalingUpdate {
    
    @scala.inline
    def apply(): ReplicaGlobalSecondaryIndexAutoScalingUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
    }
    
    @scala.inline
    implicit class ReplicaGlobalSecondaryIndexAutoScalingUpdateMutableBuilder[Self <: ReplicaGlobalSecondaryIndexAutoScalingUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingUpdate", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  
  @js.native
  trait ReplicaGlobalSecondaryIndexDescription extends StObject {
    
    /**
      * The name of the global secondary index.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * If not described, uses the source table GSI's read capacity settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
  }
  object ReplicaGlobalSecondaryIndexDescription {
    
    @scala.inline
    def apply(): ReplicaGlobalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexDescription]
    }
    
    @scala.inline
    implicit class ReplicaGlobalSecondaryIndexDescriptionMutableBuilder[Self <: ReplicaGlobalSecondaryIndexDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[ReplicaGlobalSecondaryIndexDescription]
  
  type ReplicaGlobalSecondaryIndexList = js.Array[ReplicaGlobalSecondaryIndex]
  
  @js.native
  trait ReplicaGlobalSecondaryIndexSettingsDescription extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
      */
    var IndexStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexStatus] = js.native
    
    /**
      * Auto scaling settings for a global secondary index replica's read capacity units.
      */
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * Auto scaling settings for a global secondary index replica's write capacity units.
      */
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  }
  object ReplicaGlobalSecondaryIndexSettingsDescription {
    
    @scala.inline
    def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsDescription = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
    }
    
    @scala.inline
    implicit class ReplicaGlobalSecondaryIndexSettingsDescriptionMutableBuilder[Self <: ReplicaGlobalSecondaryIndexSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityUnits", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  
  @js.native
  trait ReplicaGlobalSecondaryIndexSettingsUpdate extends StObject {
    
    /**
      * The name of the global secondary index. The name must be unique among all other indexes on this table.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      * Auto scaling settings for managing a global secondary index replica's read capacity units.
      */
    var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  }
  object ReplicaGlobalSecondaryIndexSettingsUpdate {
    
    @scala.inline
    def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
    }
    
    @scala.inline
    implicit class ReplicaGlobalSecondaryIndexSettingsUpdateMutableBuilder[Self <: ReplicaGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
      
      @scala.inline
      def setProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
    }
  }
  
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  
  type ReplicaList = js.Array[Replica]
  
  @js.native
  trait ReplicaSettingsDescription extends StObject {
    
    /**
      * The Region name of the replica.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
    
    /**
      * The read/write capacity mode of the replica.
      */
    var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.native
    
    /**
      * Replica global secondary index settings for the global table.
      */
    var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.native
    
    /**
      * Auto scaling settings for a global table replica's read capacity units.
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
    
    /**
      * Auto scaling settings for a global table replica's write capacity units.
      */
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
      */
    var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
    
    /**
      * The current state of the Region:    CREATING - The Region is being created.    UPDATING - The Region is being updated.    DELETING - The Region is being deleted.    ACTIVE - The Region is ready for use.  
      */
    var ReplicaStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatus] = js.native
  }
  object ReplicaSettingsDescription {
    
    @scala.inline
    def apply(RegionName: RegionName): ReplicaSettingsDescription = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsDescription]
    }
    
    @scala.inline
    implicit class ReplicaSettingsDescriptionMutableBuilder[Self <: ReplicaSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaBillingModeSummary(value: BillingModeSummary): Self = StObject.set(x, "ReplicaBillingModeSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaBillingModeSummaryUndefined: Self = StObject.set(x, "ReplicaBillingModeSummary", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettings(value: ReplicaGlobalSecondaryIndexSettingsDescriptionList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", js.undefined)
      
      @scala.inline
      def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    }
  }
  
  type ReplicaSettingsDescriptionList = js.Array[ReplicaSettingsDescription]
  
  @js.native
  trait ReplicaSettingsUpdate extends StObject {
    
    /**
      * The Region of the replica to be added.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
    
    /**
      * Represents the settings of a global secondary index for a global table that will be modified.
      */
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.native
    
    /**
      * Auto scaling settings for managing a global table replica's read capacity units.
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    
    /**
      * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  }
  object ReplicaSettingsUpdate {
    
    @scala.inline
    def apply(RegionName: RegionName): ReplicaSettingsUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsUpdate]
    }
    
    @scala.inline
    implicit class ReplicaSettingsUpdateMutableBuilder[Self <: ReplicaSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdate(value: ReplicaGlobalSecondaryIndexSettingsUpdateList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
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
  
  @js.native
  trait ReplicaUpdate extends StObject {
    
    /**
      * The parameters required for creating a replica on an existing global table.
      */
    var Create: js.UndefOr[CreateReplicaAction] = js.native
    
    /**
      * The name of the existing replica to be removed.
      */
    var Delete: js.UndefOr[DeleteReplicaAction] = js.native
  }
  object ReplicaUpdate {
    
    @scala.inline
    def apply(): ReplicaUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaUpdate]
    }
    
    @scala.inline
    implicit class ReplicaUpdateMutableBuilder[Self <: ReplicaUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: CreateReplicaAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      @scala.inline
      def setDelete(value: DeleteReplicaAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    }
  }
  
  type ReplicaUpdateList = js.Array[ReplicaUpdate]
  
  @js.native
  trait ReplicationGroupUpdate extends StObject {
    
    /**
      * The parameters required for creating a replica for the table.
      */
    var Create: js.UndefOr[CreateReplicationGroupMemberAction] = js.native
    
    /**
      * The parameters required for deleting a replica for the table.
      */
    var Delete: js.UndefOr[DeleteReplicationGroupMemberAction] = js.native
    
    /**
      * The parameters required for updating a replica for the table.
      */
    var Update: js.UndefOr[UpdateReplicationGroupMemberAction] = js.native
  }
  object ReplicationGroupUpdate {
    
    @scala.inline
    def apply(): ReplicationGroupUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationGroupUpdate]
    }
    
    @scala.inline
    implicit class ReplicationGroupUpdateMutableBuilder[Self <: ReplicationGroupUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: CreateReplicationGroupMemberAction): Self = StObject.set(x, "Create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      @scala.inline
      def setDelete(value: DeleteReplicationGroupMemberAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      @scala.inline
      def setUpdate(value: UpdateReplicationGroupMemberAction): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
  
  type ReplicationGroupUpdateList = js.Array[ReplicationGroupUpdate]
  
  type ResourceArnString = java.lang.String
  
  type RestoreInProgress = Boolean
  
  @js.native
  trait RestoreSummary extends StObject {
    
    /**
      * Point in time or source backup time.
      */
    var RestoreDateTime: Date = js.native
    
    /**
      * Indicates if a restore is in progress or not.
      */
    var RestoreInProgress: typings.awsSdk.documentClientMod.DocumentClient.RestoreInProgress = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the backup from which the table was restored.
      */
    var SourceBackupArn: js.UndefOr[BackupArn] = js.native
    
    /**
      * The ARN of the source table of the backup that is being restored.
      */
    var SourceTableArn: js.UndefOr[TableArn] = js.native
  }
  object RestoreSummary {
    
    @scala.inline
    def apply(RestoreDateTime: Date, RestoreInProgress: RestoreInProgress): RestoreSummary = {
      val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreSummary]
    }
    
    @scala.inline
    implicit class RestoreSummaryMutableBuilder[Self <: RestoreSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestoreDateTime(value: Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreInProgress(value: RestoreInProgress): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceBackupArn(value: BackupArn): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
      
      @scala.inline
      def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
    }
  }
  
  @js.native
  trait RestoreTableFromBackupInput extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated with the backup.
      */
    var BackupArn: typings.awsSdk.documentClientMod.DocumentClient.BackupArn = js.native
    
    /**
      * The billing mode of the restored table.
      */
    var BillingModeOverride: js.UndefOr[BillingMode] = js.native
    
    /**
      * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.native
    
    /**
      * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.native
    
    /**
      * Provisioned throughput settings for the restored table.
      */
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.native
    
    /**
      * The new server-side encryption settings for the restored table.
      */
    var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
    
    /**
      * The name of the new table to which the backup must be restored.
      */
    var TargetTableName: TableName = js.native
  }
  object RestoreTableFromBackupInput {
    
    @scala.inline
    def apply(BackupArn: BackupArn, TargetTableName: TableName): RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableFromBackupInput]
    }
    
    @scala.inline
    implicit class RestoreTableFromBackupInputMutableBuilder[Self <: RestoreTableFromBackupInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeOverride(value: BillingMode): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      @scala.inline
      def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
      
      @scala.inline
      def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RestoreTableFromBackupOutput extends StObject {
    
    /**
      * The description of the table created from an existing backup.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
  }
  object RestoreTableFromBackupOutput {
    
    @scala.inline
    def apply(): RestoreTableFromBackupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestoreTableFromBackupOutput]
    }
    
    @scala.inline
    implicit class RestoreTableFromBackupOutputMutableBuilder[Self <: RestoreTableFromBackupOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  @js.native
  trait RestoreTableToPointInTimeInput extends StObject {
    
    /**
      * The billing mode of the restored table.
      */
    var BillingModeOverride: js.UndefOr[BillingMode] = js.native
    
    /**
      * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.native
    
    /**
      * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
      */
    var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.native
    
    /**
      * Provisioned throughput settings for the restored table.
      */
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.native
    
    /**
      * Time in the past to restore the table to.
      */
    var RestoreDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The new server-side encryption settings for the restored table.
      */
    var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
    
    /**
      * The DynamoDB table that will be restored. This value is an Amazon Resource Name (ARN).
      */
    var SourceTableArn: js.UndefOr[TableArn] = js.native
    
    /**
      * Name of the source table that is being restored.
      */
    var SourceTableName: js.UndefOr[TableName] = js.native
    
    /**
      * The name of the new table to which it must be restored to.
      */
    var TargetTableName: TableName = js.native
    
    /**
      * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
      */
    var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.native
  }
  object RestoreTableToPointInTimeInput {
    
    @scala.inline
    def apply(TargetTableName: TableName): RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableToPointInTimeInput]
    }
    
    @scala.inline
    implicit class RestoreTableToPointInTimeInputMutableBuilder[Self <: RestoreTableToPointInTimeInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingModeOverride(value: BillingMode): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      @scala.inline
      def setRestoreDateTime(value: Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
      
      @scala.inline
      def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
      
      @scala.inline
      def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
      
      @scala.inline
      def setSourceTableName(value: TableName): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTableNameUndefined: Self = StObject.set(x, "SourceTableName", js.undefined)
      
      @scala.inline
      def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLatestRestorableTime(value: BooleanObject): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
    }
  }
  
  @js.native
  trait RestoreTableToPointInTimeOutput extends StObject {
    
    /**
      * Represents the properties of a table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
  }
  object RestoreTableToPointInTimeOutput {
    
    @scala.inline
    def apply(): RestoreTableToPointInTimeOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
    }
    
    @scala.inline
    implicit class RestoreTableToPointInTimeOutputMutableBuilder[Self <: RestoreTableToPointInTimeOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
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
  
  type S3Prefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AES256
    - typings.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type S3SseAlgorithm = _S3SseAlgorithm | java.lang.String
  
  type S3SseKmsKeyId = java.lang.String
  
  @js.native
  trait SSEDescription extends StObject {
    
    /**
      * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible for more than seven days from this date.
      */
    var InaccessibleEncryptionDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
      */
    var KMSMasterKeyArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KMSMasterKeyArn] = js.native
    
    /**
      * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
      */
    var SSEType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SSEType] = js.native
    
    /**
      * Represents the current state of server-side encryption. The only supported values are:    ENABLED - Server-side encryption is enabled.    UPDATING - Server-side encryption is being updated.  
      */
    var Status: js.UndefOr[SSEStatus] = js.native
  }
  object SSEDescription {
    
    @scala.inline
    def apply(): SSEDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSEDescription]
    }
    
    @scala.inline
    implicit class SSEDescriptionMutableBuilder[Self <: SSEDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInaccessibleEncryptionDateTime(value: Date): Self = StObject.set(x, "InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInaccessibleEncryptionDateTimeUndefined: Self = StObject.set(x, "InaccessibleEncryptionDateTime", js.undefined)
      
      @scala.inline
      def setKMSMasterKeyArn(value: KMSMasterKeyArn): Self = StObject.set(x, "KMSMasterKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyArnUndefined: Self = StObject.set(x, "KMSMasterKeyArn", js.undefined)
      
      @scala.inline
      def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
      
      @scala.inline
      def setStatus(value: SSEStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type SSEEnabled = Boolean
  
  @js.native
  trait SSESpecification extends StObject {
    
    /**
      * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true), server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
      */
    var Enabled: js.UndefOr[SSEEnabled] = js.native
    
    /**
      * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB customer master key alias/aws/dynamodb.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KMSMasterKeyId] = js.native
    
    /**
      * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
      */
    var SSEType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SSEType] = js.native
  }
  object SSESpecification {
    
    @scala.inline
    def apply(): SSESpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSESpecification]
    }
    
    @scala.inline
    implicit class SSESpecificationMutableBuilder[Self <: SSESpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: SSEEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      @scala.inline
      def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      @scala.inline
      def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
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
  
  @js.native
  trait ScanInput extends StObject {
    
    /**
      * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
      */
    var AttributesToGet: js.UndefOr[AttributeNameList] = js.native
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionalOperator] = js.native
    
    /**
      * A Boolean value that determines the read consistency model during the scan:   If ConsistentRead is false, then the data returned from Scan might not contain the results from other recently completed write operations (PutItem, UpdateItem, or DeleteItem).   If ConsistentRead is true, then all of the write operations that completed before the Scan began are guaranteed to be contained in the Scan response.   The default setting for ConsistentRead is false. The ConsistentRead parameter is not supported on global secondary indexes. If you scan a global secondary index with ConsistentRead set to true, you will receive a ValidationException.
      */
    var ConsistentRead: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsistentRead] = js.native
    
    /**
      * The primary key of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedKey in the previous operation. The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are allowed. In a parallel scan, a Scan request that includes ExclusiveStartKey must specify the same segment whose previous Scan returned the corresponding value of LastEvaluatedKey.
      */
    var ExclusiveStartKey: js.UndefOr[Key] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * A string that contains conditions that DynamoDB applies after the Scan operation, but before the data is returned to you. Items that do not satisfy the FilterExpression criteria are not returned.  A FilterExpression is applied after the items have already been read; the process of filtering does not consume any additional read capacity units.  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
      */
    var FilterExpression: js.UndefOr[ConditionExpression] = js.native
    
    /**
      * The name of a secondary index to scan. This index can be any local secondary index or global secondary index. Note that if you use the IndexName parameter, you must also provide TableName.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes the number of items up to the limit while processing the results, it stops the operation and returns the matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent operation, so that you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit, and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For more information, see Working with Queries in the Amazon DynamoDB Developer Guide.
      */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.native
    
    /**
      * A string that identifies one or more attributes to retrieve from the specified table or index. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ProjectionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProjectionExpression] = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * This is a legacy parameter. Use FilterExpression instead. For more information, see ScanFilter in the Amazon DynamoDB Developer Guide.
      */
    var ScanFilter: js.UndefOr[FilterConditionMap] = js.native
    
    /**
      * For a parallel Scan request, Segment identifies an individual segment to be scanned by an application worker. Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four application threads to scan a table or an index, then the first thread specifies a Segment value of 0, the second thread specifies 1, and so on. The value of LastEvaluatedKey returned from a parallel Scan request must be used as ExclusiveStartKey with the same segment ID in a subsequent Scan operation. The value for Segment must be greater than or equal to 0, and less than the value provided for TotalSegments. If you provide Segment, you must also provide TotalSegments.
      */
    var Segment: js.UndefOr[ScanSegment] = js.native
    
    /**
      * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes, the count of matching items, or in the case of an index, some or all of the attributes projected into the index.    ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item from the parent table. If the index is configured to project all item attributes, then all of the data can be obtained from the local secondary index, and no fetching is required.    ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that have been projected into the index. If the index is configured to project all attributes, this return value is equivalent to specifying ALL_ATTRIBUTES.    COUNT - Returns the number of matching items, rather than the matching items themselves.    SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This return value is equivalent to specifying AttributesToGet without specifying any value for Select. If you query or scan a local secondary index and request only attributes that are projected into that index, the operation reads only the index and not the table. If any of the requested attributes are not projected into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra fetching incurs additional throughput cost and latency. If you query or scan a global secondary index, you can only request attributes that are projected into the index. Global secondary index queries cannot fetch attributes from the parent table.   If neither Select nor AttributesToGet are specified, DynamoDB defaults to ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing an index. You cannot use both Select and AttributesToGet together in a single request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is equivalent to specifying AttributesToGet without any value for Select.)  If you use the ProjectionExpression parameter, then the value for Select can only be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error. 
      */
    var Select: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Select] = js.native
    
    /**
      * The name of the table containing the requested items; or, if you provide IndexName, the name of the table to which that index belongs.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
    
    /**
      * For a parallel Scan request, TotalSegments represents the total number of segments into which the Scan operation will be divided. The value of TotalSegments corresponds to the number of application workers that will perform the parallel scan. For example, if you want to use four application threads to scan a table or an index, specify a TotalSegments value of 4. The value for TotalSegments must be greater than or equal to 1, and less than or equal to 1000000. If you specify a TotalSegments value of 1, the Scan operation will be sequential rather than parallel. If you specify TotalSegments, you must also specify Segment.
      */
    var TotalSegments: js.UndefOr[ScanTotalSegments] = js.native
  }
  object ScanInput {
    
    @scala.inline
    def apply(TableName: TableName): ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanInput]
    }
    
    @scala.inline
    implicit class ScanInputMutableBuilder[Self <: ScanInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      @scala.inline
      def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      @scala.inline
      def setExclusiveStartKey(value: Key): Self = StObject.set(x, "ExclusiveStartKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveStartKeyUndefined: Self = StObject.set(x, "ExclusiveStartKey", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setFilterExpression(value: ConditionExpression): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      @scala.inline
      def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setScanFilter(value: FilterConditionMap): Self = StObject.set(x, "ScanFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanFilterUndefined: Self = StObject.set(x, "ScanFilter", js.undefined)
      
      @scala.inline
      def setSegment(value: ScanSegment): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentUndefined: Self = StObject.set(x, "Segment", js.undefined)
      
      @scala.inline
      def setSelect(value: Select): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSegments(value: ScanTotalSegments): Self = StObject.set(x, "TotalSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSegmentsUndefined: Self = StObject.set(x, "TotalSegments", js.undefined)
    }
  }
  
  @js.native
  trait ScanOutput extends StObject {
    
    /**
      * The capacity units consumed by the Scan operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
    
    /**
      * The number of items in the response. If you set ScanFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count is the same as ScannedCount.
      */
    var Count: js.UndefOr[Integer] = js.native
    
    /**
      * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.
      */
    var Items: js.UndefOr[ItemList] = js.native
    
    /**
      * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
      */
    var LastEvaluatedKey: js.UndefOr[Key] = js.native
    
    /**
      * The number of items evaluated, before any ScanFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Scan operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
      */
    var ScannedCount: js.UndefOr[Integer] = js.native
  }
  object ScanOutput {
    
    @scala.inline
    def apply(): ScanOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanOutput]
    }
    
    @scala.inline
    implicit class ScanOutputMutableBuilder[Self <: ScanOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      @scala.inline
      def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value :_*))
      
      @scala.inline
      def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
      
      @scala.inline
      def setScannedCount(value: Integer): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
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
  
  @js.native
  trait SourceTableDetails extends StObject {
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingMode] = js.native
    
    /**
      * Number of items in the table. Note that this is an approximate value. 
      */
    var ItemCount: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCount] = js.native
    
    /**
      * Schema of the table. 
      */
    var KeySchema: typings.awsSdk.documentClientMod.DocumentClient.KeySchema = js.native
    
    /**
      * Read IOPs and Write IOPS on the table when the backup was created.
      */
    var ProvisionedThroughput: typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput = js.native
    
    /**
      * ARN of the table for which backup was created. 
      */
    var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
    
    /**
      * Time when the source table was created. 
      */
    var TableCreationDateTime: typings.awsSdk.documentClientMod.DocumentClient.TableCreationDateTime = js.native
    
    /**
      * Unique identifier for the table for which the backup was created. 
      */
    var TableId: typings.awsSdk.documentClientMod.DocumentClient.TableId = js.native
    
    /**
      * The name of the table for which the backup was created. 
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
    
    /**
      * Size of the table in bytes. Note that this is an approximate value.
      */
    var TableSizeBytes: js.UndefOr[Long] = js.native
  }
  object SourceTableDetails {
    
    @scala.inline
    def apply(
      KeySchema: KeySchema,
      ProvisionedThroughput: ProvisionedThroughput,
      TableCreationDateTime: TableCreationDateTime,
      TableId: TableId,
      TableName: TableName
    ): SourceTableDetails = {
      val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceTableDetails]
    }
    
    @scala.inline
    implicit class SourceTableDetailsMutableBuilder[Self <: SourceTableDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      @scala.inline
      def setItemCount(value: ItemCount): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      @scala.inline
      def setTableCreationDateTime(value: TableCreationDateTime): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSizeBytes(value: Long): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
    }
  }
  
  @js.native
  trait SourceTableFeatureDetails extends StObject {
    
    /**
      * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection, and ProvisionedThroughput for the GSIs on the table at the time of backup. 
      */
    var GlobalSecondaryIndexes: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexes] = js.native
    
    /**
      * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
      */
    var LocalSecondaryIndexes: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexes] = js.native
    
    /**
      * The description of the server-side encryption status on the table when the backup was created.
      */
    var SSEDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SSEDescription] = js.native
    
    /**
      * Stream settings on the table when the backup was created.
      */
    var StreamDescription: js.UndefOr[StreamSpecification] = js.native
    
    /**
      * Time to Live settings on the table when the backup was created.
      */
    var TimeToLiveDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeToLiveDescription] = js.native
  }
  object SourceTableFeatureDetails {
    
    @scala.inline
    def apply(): SourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceTableFeatureDetails]
    }
    
    @scala.inline
    implicit class SourceTableFeatureDetailsMutableBuilder[Self <: SourceTableFeatureDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexes): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: LocalSecondaryIndexes): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamDescription(value: StreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      @scala.inline
      def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
  
  type StreamArn = java.lang.String
  
  type StreamEnabled = Boolean
  
  @js.native
  trait StreamSpecification extends StObject {
    
    /**
      * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
      */
    var StreamEnabled: typings.awsSdk.documentClientMod.DocumentClient.StreamEnabled = js.native
    
    /**
      *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
      */
    var StreamViewType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.StreamViewType] = js.native
  }
  object StreamSpecification {
    
    @scala.inline
    def apply(StreamEnabled: StreamEnabled): StreamSpecification = {
      val __obj = js.Dynamic.literal(StreamEnabled = StreamEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSpecification]
    }
    
    @scala.inline
    implicit class StreamSpecificationMutableBuilder[Self <: StreamSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStreamEnabled(value: StreamEnabled): Self = StObject.set(x, "StreamEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamViewType(value: StreamViewType): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
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
  
  @js.native
  trait StringSet extends DynamoDbSet {
    
    var `type`: String_ = js.native
    
    var values: js.Array[java.lang.String] = js.native
  }
  object StringSet {
    
    @scala.inline
    def apply(`type`: String_, values: js.Array[java.lang.String]): StringSet = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringSet]
    }
    
    @scala.inline
    implicit class StringSetMutableBuilder[Self <: StringSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[java.lang.String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: java.lang.String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  
  type TableArn = java.lang.String
  
  @js.native
  trait TableAutoScalingDescription extends StObject {
    
    /**
      * Represents replicas of the global table.
      */
    var Replicas: js.UndefOr[ReplicaAutoScalingDescriptionList] = js.native
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
    
    /**
      * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
      */
    var TableStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableStatus] = js.native
  }
  object TableAutoScalingDescription {
    
    @scala.inline
    def apply(): TableAutoScalingDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableAutoScalingDescription]
    }
    
    @scala.inline
    implicit class TableAutoScalingDescriptionMutableBuilder[Self <: TableAutoScalingDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicas(value: ReplicaAutoScalingDescriptionList): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
      
      @scala.inline
      def setReplicasVarargs(value: ReplicaAutoScalingDescription*): Self = StObject.set(x, "Replicas", js.Array(value :_*))
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      @scala.inline
      def setTableStatus(value: TableStatus): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
    }
  }
  
  type TableCreationDateTime = typings.std.Date
  
  @js.native
  trait TableDescription extends StObject {
    
    /**
      * Contains information about the table archive.
      */
    var ArchivalSummary: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ArchivalSummary] = js.native
    
    /**
      * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
      */
    var AttributeDefinitions: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.AttributeDefinitions] = js.native
    
    /**
      * Contains the details for the read/write capacity mode.
      */
    var BillingModeSummary: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingModeSummary] = js.native
    
    /**
      * The date and time when the table was created, in UNIX epoch time format.
      */
    var CreationDateTime: js.UndefOr[Date] = js.native
    
    /**
      * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table. It is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)   You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - In addition to the attributes described in KEYS_ONLY, the secondary index will include other non-key attributes that you specify.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
      */
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.native
    
    /**
      * Represents the version of global tables in use, if the table is replicated across AWS Regions.
      */
    var GlobalTableVersion: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.String] = js.native
    
    /**
      * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var ItemCount: js.UndefOr[Long] = js.native
    
    /**
      * The primary key structure for the table. Each KeySchemaElement consists of:    AttributeName - The name of the attribute.    KeyType - The role of the attribute:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.    For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
      */
    var KeySchema: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
      */
    var LatestStreamArn: js.UndefOr[StreamArn] = js.native
    
    /**
      * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   AWS customer ID   Table name    StreamLabel   
      */
    var LatestStreamLabel: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.String] = js.native
    
    /**
      * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:    IndexName - The name of the local secondary index.    KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.    ItemCount - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.   If the table is in the DELETING state, no information about indexes will be returned.
      */
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.native
    
    /**
      * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.native
    
    /**
      * Represents replicas of the table.
      */
    var Replicas: js.UndefOr[ReplicaDescriptionList] = js.native
    
    /**
      * Contains details for the restore.
      */
    var RestoreSummary: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RestoreSummary] = js.native
    
    /**
      * The description of the server-side encryption status on the specified table.
      */
    var SSEDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SSEDescription] = js.native
    
    /**
      * The current DynamoDB Streams configuration for the table.
      */
    var StreamSpecification: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.StreamSpecification] = js.native
    
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the table.
      */
    var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.String] = js.native
    
    /**
      * Unique identifier for the table for which the backup was created. 
      */
    var TableId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableId] = js.native
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
    
    /**
      * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
      */
    var TableSizeBytes: js.UndefOr[Long] = js.native
    
    /**
      * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The AWS KMS key used to encrypt the table in inaccessible. Table operations may fail due to failure to use the AWS KMS key. DynamoDB will initiate the table archival process when a table's AWS KMS key remains inaccessible for more than seven days.     ARCHIVING - The table is being archived. Operations are not allowed until archival is complete.     ARCHIVED - The table has been archived. See the ArchivalReason for more information.   
      */
    var TableStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableStatus] = js.native
  }
  object TableDescription {
    
    @scala.inline
    def apply(): TableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableDescription]
    }
    
    @scala.inline
    implicit class TableDescriptionMutableBuilder[Self <: TableDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchivalSummary(value: ArchivalSummary): Self = StObject.set(x, "ArchivalSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivalSummaryUndefined: Self = StObject.set(x, "ArchivalSummary", js.undefined)
      
      @scala.inline
      def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      @scala.inline
      def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setBillingModeSummary(value: BillingModeSummary): Self = StObject.set(x, "BillingModeSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeSummaryUndefined: Self = StObject.set(x, "BillingModeSummary", js.undefined)
      
      @scala.inline
      def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setGlobalTableVersion(value: typings.awsSdk.documentClientMod.DocumentClient.String): Self = StObject.set(x, "GlobalTableVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableVersionUndefined: Self = StObject.set(x, "GlobalTableVersion", js.undefined)
      
      @scala.inline
      def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setLatestStreamArn(value: StreamArn): Self = StObject.set(x, "LatestStreamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestStreamArnUndefined: Self = StObject.set(x, "LatestStreamArn", js.undefined)
      
      @scala.inline
      def setLatestStreamLabel(value: typings.awsSdk.documentClientMod.DocumentClient.String): Self = StObject.set(x, "LatestStreamLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestStreamLabelUndefined: Self = StObject.set(x, "LatestStreamLabel", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexes(value: LocalSecondaryIndexDescriptionList): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexDescription*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      @scala.inline
      def setReplicas(value: ReplicaDescriptionList): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
      
      @scala.inline
      def setReplicasVarargs(value: ReplicaDescription*): Self = StObject.set(x, "Replicas", js.Array(value :_*))
      
      @scala.inline
      def setRestoreSummary(value: RestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
      
      @scala.inline
      def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      @scala.inline
      def setTableArn(value: typings.awsSdk.documentClientMod.DocumentClient.String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      @scala.inline
      def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      @scala.inline
      def setTableSizeBytes(value: Long): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
      
      @scala.inline
      def setTableStatus(value: TableStatus): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
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
  
  @js.native
  trait Tag extends StObject {
    
    /**
      * The key of the tag. Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value. 
      */
    var Key: TagKeyString = js.native
    
    /**
      * The value of the tag. Tag values are case-sensitive and can be null.
      */
    var Value: TagValueString = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(Key: TagKeyString, Value: TagValueString): Tag = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: TagKeyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TagValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type TagKeyList = js.Array[TagKeyString]
  
  type TagKeyString = java.lang.String
  
  type TagList = js.Array[Tag]
  
  @js.native
  trait TagResourceInput extends StObject {
    
    /**
      * Identifies the Amazon DynamoDB resource to which tags should be added. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString = js.native
    
    /**
      * The tags to be assigned to the Amazon DynamoDB resource.
      */
    var Tags: TagList = js.native
  }
  object TagResourceInput {
    
    @scala.inline
    def apply(ResourceArn: ResourceArnString, Tags: TagList): TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagResourceInput]
    }
    
    @scala.inline
    implicit class TagResourceInputMutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
  
  type TagValueString = java.lang.String
  
  type TimeRangeLowerBound = typings.std.Date
  
  type TimeRangeUpperBound = typings.std.Date
  
  type TimeToLiveAttributeName = java.lang.String
  
  @js.native
  trait TimeToLiveDescription extends StObject {
    
    /**
      *  The name of the TTL attribute for items in the table.
      */
    var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.native
    
    /**
      *  The TTL status for the table.
      */
    var TimeToLiveStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeToLiveStatus] = js.native
  }
  object TimeToLiveDescription {
    
    @scala.inline
    def apply(): TimeToLiveDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeToLiveDescription]
    }
    
    @scala.inline
    implicit class TimeToLiveDescriptionMutableBuilder[Self <: TimeToLiveDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: TimeToLiveAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
      
      @scala.inline
      def setTimeToLiveStatus(value: TimeToLiveStatus): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
    }
  }
  
  type TimeToLiveEnabled = Boolean
  
  @js.native
  trait TimeToLiveSpecification extends StObject {
    
    /**
      * The name of the TTL attribute used to store the expiration time for items in the table.
      */
    var AttributeName: TimeToLiveAttributeName = js.native
    
    /**
      * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
      */
    var Enabled: TimeToLiveEnabled = js.native
  }
  object TimeToLiveSpecification {
    
    @scala.inline
    def apply(AttributeName: TimeToLiveAttributeName, Enabled: TimeToLiveEnabled): TimeToLiveSpecification = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeToLiveSpecification]
    }
    
    @scala.inline
    implicit class TimeToLiveSpecificationMutableBuilder[Self <: TimeToLiveSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: TimeToLiveAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: TimeToLiveEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait TransactGetItem extends StObject {
    
    /**
      * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
      */
    var Get: typings.awsSdk.documentClientMod.DocumentClient.Get = js.native
  }
  object TransactGetItem {
    
    @scala.inline
    def apply(Get: Get): TransactGetItem = {
      val __obj = js.Dynamic.literal(Get = Get.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactGetItem]
    }
    
    @scala.inline
    implicit class TransactGetItemMutableBuilder[Self <: TransactGetItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Get): Self = StObject.set(x, "Get", value.asInstanceOf[js.Any])
    }
  }
  
  type TransactGetItemList = js.Array[TransactGetItem]
  
  @js.native
  trait TransactGetItemsInput extends StObject {
    
    /**
      * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
      */
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * An ordered array of up to 25 TransactGetItem objects, each of which contains a Get structure.
      */
    var TransactItems: TransactGetItemList = js.native
  }
  object TransactGetItemsInput {
    
    @scala.inline
    def apply(TransactItems: TransactGetItemList): TransactGetItemsInput = {
      val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactGetItemsInput]
    }
    
    @scala.inline
    implicit class TransactGetItemsInputMutableBuilder[Self <: TransactGetItemsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setTransactItems(value: TransactGetItemList): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactItemsVarargs(value: TransactGetItem*): Self = StObject.set(x, "TransactItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransactGetItemsOutput extends StObject {
    
    /**
      * If the ReturnConsumedCapacity value was TOTAL, this is an array of ConsumedCapacity objects, one for each table addressed by TransactGetItem objects in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity units consumed by the TransactGetItems call in that table.
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
    
    /**
      * An ordered array of up to 25 ItemResponse objects, each of which corresponds to the TransactGetItem object in the same position in the TransactItems array. Each ItemResponse object contains a Map of the name-value pairs that are the projected attributes of the requested item. If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if the requested item has no projected attributes, the corresponding ItemResponse object is an empty Map. 
      */
    var Responses: js.UndefOr[ItemResponseList] = js.native
  }
  object TransactGetItemsOutput {
    
    @scala.inline
    def apply(): TransactGetItemsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactGetItemsOutput]
    }
    
    @scala.inline
    implicit class TransactGetItemsOutputMutableBuilder[Self <: TransactGetItemsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
      
      @scala.inline
      def setResponses(value: ItemResponseList): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      @scala.inline
      def setResponsesVarargs(value: ItemResponse*): Self = StObject.set(x, "Responses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransactWriteItem extends StObject {
    
    /**
      * A request to perform a check item operation.
      */
    var ConditionCheck: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionCheck] = js.native
    
    /**
      * A request to perform a DeleteItem operation.
      */
    var Delete: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Delete] = js.native
    
    /**
      * A request to perform a PutItem operation.
      */
    var Put: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Put] = js.native
    
    /**
      * A request to perform an UpdateItem operation.
      */
    var Update: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.Update] = js.native
  }
  object TransactWriteItem {
    
    @scala.inline
    def apply(): TransactWriteItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactWriteItem]
    }
    
    @scala.inline
    implicit class TransactWriteItemMutableBuilder[Self <: TransactWriteItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionCheck(value: ConditionCheck): Self = StObject.set(x, "ConditionCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionCheckUndefined: Self = StObject.set(x, "ConditionCheck", js.undefined)
      
      @scala.inline
      def setDelete(value: Delete): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      @scala.inline
      def setPut(value: Put): Self = StObject.set(x, "Put", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutUndefined: Self = StObject.set(x, "Put", js.undefined)
      
      @scala.inline
      def setUpdate(value: Update): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
    }
  }
  
  type TransactWriteItemList = js.Array[TransactWriteItem]
  
  @js.native
  trait TransactWriteItemsInput extends StObject {
    
    /**
      * Providing a ClientRequestToken makes the call to TransactWriteItems idempotent, meaning that multiple identical calls have the same effect as one single call. Although multiple identical calls using the same client request token produce the same result on the server (no side effects), the responses to the calls might not be the same. If the ReturnConsumedCapacity&gt; parameter is set, then the initial TransactWriteItems call returns the amount of write capacity units consumed in making the changes. Subsequent TransactWriteItems calls with the same client token return the number of read capacity units consumed in reading the item. A client request token is valid for 10 minutes after the first request that uses it is completed. After 10 minutes, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 10 minutes, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 10-minute idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
      */
    var ClientRequestToken: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ClientRequestToken] = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections (if any), that were modified during the operation and are returned in the response. If set to NONE (the default), no statistics are returned. 
      */
    var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnItemCollectionMetrics] = js.native
    
    /**
      * An ordered array of up to 25 TransactWriteItem objects, each of which contains a ConditionCheck, Put, Update, or Delete object. These can operate on items in different tables, but the tables must reside in the same AWS account and Region, and no two of them can operate on the same item. 
      */
    var TransactItems: TransactWriteItemList = js.native
  }
  object TransactWriteItemsInput {
    
    @scala.inline
    def apply(TransactItems: TransactWriteItemList): TransactWriteItemsInput = {
      val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactWriteItemsInput]
    }
    
    @scala.inline
    implicit class TransactWriteItemsInputMutableBuilder[Self <: TransactWriteItemsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      @scala.inline
      def setTransactItems(value: TransactWriteItemList): Self = StObject.set(x, "TransactItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactItemsVarargs(value: TransactWriteItem*): Self = StObject.set(x, "TransactItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransactWriteItemsOutput extends StObject {
    
    /**
      * The capacity units consumed by the entire TransactWriteItems operation. The values of the list are ordered according to the ordering of the TransactItems request parameter. 
      */
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
    
    /**
      * A list of tables that were processed by TransactWriteItems and, for each table, information about any item collections that were affected by individual UpdateItem, PutItem, or DeleteItem operations. 
      */
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.native
  }
  object TransactWriteItemsOutput {
    
    @scala.inline
    def apply(): TransactWriteItemsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactWriteItemsOutput]
    }
    
    @scala.inline
    implicit class TransactWriteItemsOutputMutableBuilder[Self <: TransactWriteItemsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
      
      @scala.inline
      def setItemCollectionMetrics(value: ItemCollectionMetricsPerTable): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  @js.native
  trait UntagResourceInput extends StObject {
    
    /**
      * The DynamoDB resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
      */
    var ResourceArn: ResourceArnString = js.native
    
    /**
      * A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from the DynamoDB resource.
      */
    var TagKeys: TagKeyList = js.native
  }
  object UntagResourceInput {
    
    @scala.inline
    def apply(ResourceArn: ResourceArnString, TagKeys: TagKeyList): UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[UntagResourceInput]
    }
    
    @scala.inline
    implicit class UntagResourceInputMutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeysVarargs(value: TagKeyString*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Update extends StObject {
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
    
    /**
      * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
      */
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[
        typings.awsSdk.documentClientMod.DocumentClient.ReturnValuesOnConditionCheckFailure
      ] = js.native
    
    /**
      * Name of the table for the UpdateItem request.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
    
    /**
      * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
      */
    var UpdateExpression: typings.awsSdk.documentClientMod.DocumentClient.UpdateExpression = js.native
  }
  object Update {
    
    @scala.inline
    def apply(Key: Key, TableName: TableName, UpdateExpression: UpdateExpression): Update = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
      __obj.asInstanceOf[Update]
    }
    
    @scala.inline
    implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateContinuousBackupsInput extends StObject {
    
    /**
      * Represents the settings used to enable point in time recovery.
      */
    var PointInTimeRecoverySpecification: typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoverySpecification = js.native
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object UpdateContinuousBackupsInput {
    
    @scala.inline
    def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: TableName): UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateContinuousBackupsInput]
    }
    
    @scala.inline
    implicit class UpdateContinuousBackupsInputMutableBuilder[Self <: UpdateContinuousBackupsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointInTimeRecoverySpecification(value: PointInTimeRecoverySpecification): Self = StObject.set(x, "PointInTimeRecoverySpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateContinuousBackupsOutput extends StObject {
    
    /**
      * Represents the continuous backups and point in time recovery settings on the table.
      */
    var ContinuousBackupsDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContinuousBackupsDescription] = js.native
  }
  object UpdateContinuousBackupsOutput {
    
    @scala.inline
    def apply(): UpdateContinuousBackupsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContinuousBackupsOutput]
    }
    
    @scala.inline
    implicit class UpdateContinuousBackupsOutputMutableBuilder[Self <: UpdateContinuousBackupsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
    }
  }
  
  @js.native
  trait UpdateContributorInsightsInput extends StObject {
    
    /**
      * Represents the contributor insights action.
      */
    var ContributorInsightsAction: typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsAction = js.native
    
    /**
      * The global secondary index name, if applicable.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The name of the table.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object UpdateContributorInsightsInput {
    
    @scala.inline
    def apply(ContributorInsightsAction: ContributorInsightsAction, TableName: TableName): UpdateContributorInsightsInput = {
      val __obj = js.Dynamic.literal(ContributorInsightsAction = ContributorInsightsAction.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateContributorInsightsInput]
    }
    
    @scala.inline
    implicit class UpdateContributorInsightsInputMutableBuilder[Self <: UpdateContributorInsightsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContributorInsightsAction(value: ContributorInsightsAction): Self = StObject.set(x, "ContributorInsightsAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateContributorInsightsOutput extends StObject {
    
    /**
      * The status of contributor insights
      */
    var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
    
    /**
      * The name of the global secondary index, if applicable.
      */
    var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
    
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  }
  object UpdateContributorInsightsOutput {
    
    @scala.inline
    def apply(): UpdateContributorInsightsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContributorInsightsOutput]
    }
    
    @scala.inline
    implicit class UpdateContributorInsightsOutputMutableBuilder[Self <: UpdateContributorInsightsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    }
  }
  
  type UpdateExpression = java.lang.String
  
  @js.native
  trait UpdateGlobalSecondaryIndexAction extends StObject {
    
    /**
      * The name of the global secondary index to be updated.
      */
    var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
    
    /**
      * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
      */
    var ProvisionedThroughput: typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput = js.native
  }
  object UpdateGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(IndexName: IndexName, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class UpdateGlobalSecondaryIndexActionMutableBuilder[Self <: UpdateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateGlobalTableInput extends StObject {
    
    /**
      * The global table name.
      */
    var GlobalTableName: TableName = js.native
    
    /**
      * A list of Regions that should be added or removed from the global table.
      */
    var ReplicaUpdates: ReplicaUpdateList = js.native
  }
  object UpdateGlobalTableInput {
    
    @scala.inline
    def apply(GlobalTableName: TableName, ReplicaUpdates: ReplicaUpdateList): UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableInput]
    }
    
    @scala.inline
    implicit class UpdateGlobalTableInputMutableBuilder[Self <: UpdateGlobalTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaUpdates(value: ReplicaUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaUpdatesVarargs(value: ReplicaUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdateGlobalTableOutput extends StObject {
    
    /**
      * Contains the details of the global table.
      */
    var GlobalTableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.GlobalTableDescription] = js.native
  }
  object UpdateGlobalTableOutput {
    
    @scala.inline
    def apply(): UpdateGlobalTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateGlobalTableOutput]
    }
    
    @scala.inline
    implicit class UpdateGlobalTableOutputMutableBuilder[Self <: UpdateGlobalTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
  
  @js.native
  trait UpdateGlobalTableSettingsInput extends StObject {
    
    /**
      * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
      */
    var GlobalTableBillingMode: js.UndefOr[BillingMode] = js.native
    
    /**
      * Represents the settings of a global secondary index for a global table that will be modified.
      */
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.native
    
    /**
      * The name of the global table
      */
    var GlobalTableName: TableName = js.native
    
    /**
      * Auto scaling settings for managing provisioned write capacity for the global table.
      */
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    
    /**
      * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
      */
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
    
    /**
      * Represents the settings for a global table in a Region that will be modified.
      */
    var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.native
  }
  object UpdateGlobalTableSettingsInput {
    
    @scala.inline
    def apply(GlobalTableName: TableName): UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
    }
    
    @scala.inline
    implicit class UpdateGlobalTableSettingsInputMutableBuilder[Self <: UpdateGlobalTableSettingsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableBillingMode(value: BillingMode): Self = StObject.set(x, "GlobalTableBillingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableBillingModeUndefined: Self = StObject.set(x, "GlobalTableBillingMode", js.undefined)
      
      @scala.inline
      def setGlobalTableGlobalSecondaryIndexSettingsUpdate(value: GlobalTableGlobalSecondaryIndexSettingsUpdateList): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      @scala.inline
      def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", js.undefined)
      
      @scala.inline
      def setReplicaSettingsUpdate(value: ReplicaSettingsUpdateList): Self = StObject.set(x, "ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaSettingsUpdate", js.undefined)
      
      @scala.inline
      def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = StObject.set(x, "ReplicaSettingsUpdate", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdateGlobalTableSettingsOutput extends StObject {
    
    /**
      * The name of the global table.
      */
    var GlobalTableName: js.UndefOr[TableName] = js.native
    
    /**
      * The Region-specific settings for the global table.
      */
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.native
  }
  object UpdateGlobalTableSettingsOutput {
    
    @scala.inline
    def apply(): UpdateGlobalTableSettingsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateGlobalTableSettingsOutput]
    }
    
    @scala.inline
    implicit class UpdateGlobalTableSettingsOutputMutableBuilder[Self <: UpdateGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      @scala.inline
      def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
      
      @scala.inline
      def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdateItemInput extends StObject {
    
    /**
      * This is a legacy parameter. Use UpdateExpression instead. For more information, see AttributeUpdates in the Amazon DynamoDB Developer Guide.
      */
    var AttributeUpdates: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.AttributeUpdates] = js.native
    
    /**
      * A condition that must be satisfied in order for a conditional update to succeed. An expression can contain any of the following:   Functions: attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size  These function names are case-sensitive.   Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN      Logical operators: AND | OR | NOT    For more information about condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
      */
    var ConditionExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionExpression] = js.native
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
      */
    var ConditionalOperator: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConditionalOperator] = js.native
    
    /**
      * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
      */
    var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
    
    /**
      * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide.) To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information about expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
    
    /**
      * One or more values that can be substituted in an expression. Use the : (colon) character in an expression to dereference an attribute value. For example, suppose that you wanted to check whether the value of the ProductStatus attribute was one of the following:   Available | Backordered | Discontinued  You would first need to specify ExpressionAttributeValues as follows:  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }  You could then use these values in an expression, such as this:  ProductStatus IN (:avail, :back, :disc)  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
      */
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
    
    /**
      * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute. For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
      */
    var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
    
    var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
    
    /**
      * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
      */
    var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnItemCollectionMetrics] = js.native
    
    /**
      * Use ReturnValues if you want to get the item attributes as they appear before or after they are updated. For UpdateItem, the valid values are:    NONE - If ReturnValues is not specified, or if its value is NONE, then nothing is returned. (This setting is the default for ReturnValues.)    ALL_OLD - Returns all of the attributes of the item, as they appeared before the UpdateItem operation.    UPDATED_OLD - Returns only the updated attributes, as they appeared before the UpdateItem operation.    ALL_NEW - Returns all of the attributes of the item, as they appear after the UpdateItem operation.    UPDATED_NEW - Returns only the updated attributes, as they appear after the UpdateItem operation.   There is no additional cost associated with requesting a return value aside from the small network and processing overhead of receiving a larger response. No read capacity units are consumed. The values returned are strongly consistent.
      */
    var ReturnValues: js.UndefOr[ReturnValue] = js.native
    
    /**
      * The name of the table containing the item to update.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
    
    /**
      * An expression that defines one or more attributes to be updated, the action to be performed on them, and new values for them. The following action values are available for UpdateExpression.    SET - Adds one or more attributes and values to an item. If any of these attributes already exist, they are replaced by the new values. You can also use SET to add or subtract from an attribute that is of type Number. For example: SET myNum = myNum + :val   SET supports the following functions:    if_not_exists (path, operand) - if the item does not contain an attribute at the specified path, then if_not_exists evaluates to operand; otherwise, it evaluates to path. You can use this function to avoid overwriting an attribute that may already be present in the item.    list_append (operand, operand) - evaluates to a list with a new element added to it. You can append the new element to the start or the end of the list by reversing the order of the operands.   These function names are case-sensitive.    REMOVE - Removes one or more attributes from an item.    ADD - Adds the specified value to the item, if the attribute does not already exist. If the attribute does exist, then the behavior of ADD depends on the data type of the attribute:   If the existing attribute is a number, and if Value is also a number, then Value is mathematically added to the existing attribute. If Value is a negative number, then it is subtracted from the existing attribute.  If you use ADD to increment or decrement a number value for an item that doesn't exist before the update, DynamoDB uses 0 as the initial value. Similarly, if you use ADD for an existing item to increment or decrement an attribute value that doesn't exist before the update, DynamoDB uses 0 as the initial value. For example, suppose that the item you want to update doesn't have an attribute named itemcount, but you decide to ADD the number 3 to this attribute anyway. DynamoDB will create the itemcount attribute, set its initial value to 0, and finally add 3 to it. The result will be a new itemcount attribute in the item, with a value of 3.    If the existing data type is a set and if Value is also a set, then Value is added to the existing set. For example, if the attribute value is the set [1,2], and the ADD action specified [3], then the final attribute value is [1,2,3]. An error occurs if an ADD action is specified for a set attribute and the attribute type specified does not match the existing set type.  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings, the Value must also be a set of strings.    The ADD action only supports Number and set data types. In addition, ADD can only be used on top-level attributes, not nested attributes.     DELETE - Deletes an element from a set. If a set of values is specified, then those values are subtracted from the old set. For example, if the attribute value was the set [a,b,c] and the DELETE action specifies [a,c], then the final attribute value is [b]. Specifying an empty set is an error.  The DELETE action only supports set data types. In addition, DELETE can only be used on top-level attributes, not nested attributes.    You can have many actions in a single expression, such as the following: SET a=:value1, b=:value2 DELETE :value3, :value4, :value5  For more information on update expressions, see Modifying Items and Attributes in the Amazon DynamoDB Developer Guide.
      */
    var UpdateExpression: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.UpdateExpression] = js.native
  }
  object UpdateItemInput {
    
    @scala.inline
    def apply(Key: Key, TableName: TableName): UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateItemInput]
    }
    
    @scala.inline
    implicit class UpdateItemInputMutableBuilder[Self <: UpdateItemInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeUpdates(value: AttributeUpdates): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUpdatesUndefined: Self = StObject.set(x, "AttributeUpdates", js.undefined)
      
      @scala.inline
      def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
      
      @scala.inline
      def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
      
      @scala.inline
      def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      @scala.inline
      def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
      
      @scala.inline
      def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
    }
  }
  
  @js.native
  trait UpdateItemOutput extends StObject {
    
    /**
      * A map of attribute values as they appear before or after the UpdateItem operation, as determined by the ReturnValues parameter. The Attributes map is only present if ReturnValues was specified as something other than NONE in the request. Each element represents one attribute.
      */
    var Attributes: js.UndefOr[AttributeMap] = js.native
    
    /**
      * The capacity units consumed by the UpdateItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
      */
    var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
    
    /**
      * Information about item collections, if any, that were affected by the UpdateItem operation. ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter was specified. If the table does not have any local secondary indexes, this information is not returned in the response. Each ItemCollectionMetrics element consists of:    ItemCollectionKey - The partition key value of the item collection. This is the same as the partition key value of the item itself.    SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.  
      */
    var ItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics] = js.native
  }
  object UpdateItemOutput {
    
    @scala.inline
    def apply(): UpdateItemOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateItemOutput]
    }
    
    @scala.inline
    implicit class UpdateItemOutputMutableBuilder[Self <: UpdateItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setItemCollectionMetrics(value: ItemCollectionMetrics): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    }
  }
  
  @js.native
  trait UpdateReplicationGroupMemberAction extends StObject {
    
    /**
      * Replica-specific global secondary index settings.
      */
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.native
    
    /**
      * The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
      */
    var KMSMasterKeyId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KMSMasterKeyId] = js.native
    
    /**
      * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
      */
    var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
    
    /**
      * The Region where the replica exists.
      */
    var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
  }
  object UpdateReplicationGroupMemberAction {
    
    @scala.inline
    def apply(RegionName: RegionName): UpdateReplicationGroupMemberAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateReplicationGroupMemberAction]
    }
    
    @scala.inline
    implicit class UpdateReplicationGroupMemberActionMutableBuilder[Self <: UpdateReplicationGroupMemberAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
      
      @scala.inline
      def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
      
      @scala.inline
      def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateTableInput extends StObject {
    
    /**
      * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, AttributeDefinitions must include the key element(s) of the new index.
      */
    var AttributeDefinitions: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.AttributeDefinitions] = js.native
    
    /**
      * Controls how you are charged for read and write throughput and how you manage capacity. When switching from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned capacity values are estimated based on the consumed read and write capacity of your table and global secondary indexes over the past 30 minutes.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
      */
    var BillingMode: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.BillingMode] = js.native
    
    /**
      * An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:    Create - add a new global secondary index to the table.    Update - modify the provisioned throughput settings of an existing global secondary index.    Delete - remove a global secondary index from the table.   You can create or delete only one global secondary index per UpdateTable operation. For more information, see Managing Global Secondary Indexes in the Amazon DynamoDB Developer Guide. 
      */
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.native
    
    /**
      * The new provisioned throughput settings for the specified table or index.
      */
    var ProvisionedThroughput: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput] = js.native
    
    /**
      * A list of replica update actions (create, delete, or update) for the table.  This property only applies to Version 2019.11.21 of global tables. 
      */
    var ReplicaUpdates: js.UndefOr[ReplicationGroupUpdateList] = js.native
    
    /**
      * The new server-side encryption settings for the specified table.
      */
    var SSESpecification: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.SSESpecification] = js.native
    
    /**
      * Represents the DynamoDB Streams configuration for the table.  You receive a ResourceInUseException if you try to enable a stream on a table that already has a stream, or if you try to disable a stream on a table that doesn't have a stream. 
      */
    var StreamSpecification: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.StreamSpecification] = js.native
    
    /**
      * The name of the table to be updated.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object UpdateTableInput {
    
    @scala.inline
    def apply(TableName: TableName): UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTableInput]
    }
    
    @scala.inline
    implicit class UpdateTableInputMutableBuilder[Self <: UpdateTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      @scala.inline
      def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexUpdateList): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      @scala.inline
      def setReplicaUpdates(value: ReplicationGroupUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
      
      @scala.inline
      def setReplicaUpdatesVarargs(value: ReplicationGroupUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value :_*))
      
      @scala.inline
      def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
      
      @scala.inline
      def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateTableOutput extends StObject {
    
    /**
      * Represents the properties of the table.
      */
    var TableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
  }
  object UpdateTableOutput {
    
    @scala.inline
    def apply(): UpdateTableOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTableOutput]
    }
    
    @scala.inline
    implicit class UpdateTableOutputMutableBuilder[Self <: UpdateTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
  
  @js.native
  trait UpdateTableReplicaAutoScalingInput extends StObject {
    
    /**
      * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
      */
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexAutoScalingUpdateList] = js.native
    
    var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    
    /**
      * Represents the auto scaling settings of replicas of the table that will be modified.
      */
    var ReplicaUpdates: js.UndefOr[ReplicaAutoScalingUpdateList] = js.native
    
    /**
      * The name of the global table to be updated.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
  }
  object UpdateTableReplicaAutoScalingInput {
    
    @scala.inline
    def apply(TableName: TableName): UpdateTableReplicaAutoScalingInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
    }
    
    @scala.inline
    implicit class UpdateTableReplicaAutoScalingInputMutableBuilder[Self <: UpdateTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
      
      @scala.inline
      def setReplicaUpdates(value: ReplicaAutoScalingUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
      
      @scala.inline
      def setReplicaUpdatesVarargs(value: ReplicaAutoScalingUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value :_*))
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateTableReplicaAutoScalingOutput extends StObject {
    
    /**
      * Returns information about the auto scaling settings of a table with replicas.
      */
    var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableAutoScalingDescription] = js.native
  }
  object UpdateTableReplicaAutoScalingOutput {
    
    @scala.inline
    def apply(): UpdateTableReplicaAutoScalingOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTableReplicaAutoScalingOutput]
    }
    
    @scala.inline
    implicit class UpdateTableReplicaAutoScalingOutputMutableBuilder[Self <: UpdateTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
    }
  }
  
  @js.native
  trait UpdateTimeToLiveInput extends StObject {
    
    /**
      * The name of the table to be configured.
      */
    var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
    
    /**
      * Represents the settings used to enable or disable Time to Live for the specified table.
      */
    var TimeToLiveSpecification: typings.awsSdk.documentClientMod.DocumentClient.TimeToLiveSpecification = js.native
  }
  object UpdateTimeToLiveInput {
    
    @scala.inline
    def apply(TableName: TableName, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTimeToLiveInput]
    }
    
    @scala.inline
    implicit class UpdateTimeToLiveInputMutableBuilder[Self <: UpdateTimeToLiveInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateTimeToLiveOutput extends StObject {
    
    /**
      * Represents the output of an UpdateTimeToLive operation.
      */
    var TimeToLiveSpecification: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeToLiveSpecification] = js.native
  }
  object UpdateTimeToLiveOutput {
    
    @scala.inline
    def apply(): UpdateTimeToLiveOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTimeToLiveOutput]
    }
    
    @scala.inline
    implicit class UpdateTimeToLiveOutputMutableBuilder[Self <: UpdateTimeToLiveOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveSpecificationUndefined: Self = StObject.set(x, "TimeToLiveSpecification", js.undefined)
    }
  }
  
  @js.native
  trait WriteRequest extends StObject {
    
    /**
      * A request to perform a DeleteItem operation.
      */
    var DeleteRequest: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.DeleteRequest] = js.native
    
    /**
      * A request to perform a PutItem operation.
      */
    var PutRequest: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.PutRequest] = js.native
  }
  object WriteRequest {
    
    @scala.inline
    def apply(): WriteRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteRequest]
    }
    
    @scala.inline
    implicit class WriteRequestMutableBuilder[Self <: WriteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteRequest(value: DeleteRequest): Self = StObject.set(x, "DeleteRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteRequestUndefined: Self = StObject.set(x, "DeleteRequest", js.undefined)
      
      @scala.inline
      def setPutRequest(value: PutRequest): Self = StObject.set(x, "PutRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutRequestUndefined: Self = StObject.set(x, "PutRequest", js.undefined)
    }
  }
  
  type WriteRequests = js.Array[WriteRequest]
  
  trait _AttributeAction extends StObject
  
  trait _BackupStatus extends StObject
  
  trait _BackupType extends StObject
  
  trait _BackupTypeFilter extends StObject
  
  trait _BillingMode extends StObject
  
  trait _ComparisonOperator extends StObject
  
  trait _ConditionalOperator extends StObject
  
  trait _ContinuousBackupsStatus extends StObject
  
  trait _ContributorInsightsAction extends StObject
  
  trait _ContributorInsightsStatus extends StObject
  
  trait _ExportFormat extends StObject
  
  trait _ExportStatus extends StObject
  
  trait _GlobalTableStatus extends StObject
  
  trait _IndexStatus extends StObject
  
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
  
  trait _TableStatus extends StObject
  
  trait _TimeToLiveStatus extends StObject
  
  trait _binaryType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.Buffer
    - typings.awsSdk.documentClientMod.File
    - typings.awsSdk.documentClientMod.Blob
    - typings.std.ArrayBuffer
    - typings.std.DataView
    - typings.std.Int8Array
    - typings.std.Uint8Array
    - typings.std.Uint8ClampedArray
    - typings.std.Int16Array
    - typings.std.Uint16Array
    - typings.std.Int32Array
    - typings.std.Uint32Array
    - typings.std.Float32Array
    - typings.std.Float64Array
    - typings.node.streamMod.Stream
  */
  type binaryType = _binaryType | Buffer | ArrayBuffer | DataView | Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | Stream
}

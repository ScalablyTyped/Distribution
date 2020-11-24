package typings.awsSdk.documentClientMod

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
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/dynamodb/document_client", "DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
class DocumentClient_ () extends js.Object {
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

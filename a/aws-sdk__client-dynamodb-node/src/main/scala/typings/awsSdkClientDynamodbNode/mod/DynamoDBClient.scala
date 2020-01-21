package typings.awsSdkClientDynamodbNode.mod

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node", "DynamoDBClient")
@js.native
class DynamoDBClient protected ()
  extends typings.awsSdkClientDynamodbNode.dynamoDBClientMod.DynamoDBClient {
  def this(configuration: DynamoDBConfiguration) = this()
}


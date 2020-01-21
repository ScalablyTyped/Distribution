package typings.awsSdkClientDynamodbBrowser.mod

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser", "DynamoDBClient")
@js.native
class DynamoDBClient protected ()
  extends typings.awsSdkClientDynamodbBrowser.dynamoDBClientMod.DynamoDBClient {
  def this(configuration: DynamoDBConfiguration) = this()
}


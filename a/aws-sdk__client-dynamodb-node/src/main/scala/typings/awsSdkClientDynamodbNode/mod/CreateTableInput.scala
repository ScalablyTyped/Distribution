package typings.awsSdkClientDynamodbNode.mod

import typings.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput
object CreateTableInput {
  
  @scala.inline
  def apply(
    AttributeDefinitions: js.Array[AttributeDefinition] | Iterable[AttributeDefinition],
    KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
    ProvisionedThroughput: ProvisionedThroughput,
    TableName: String
  ): CreateTableInput = {
    val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableInput]
  }
}

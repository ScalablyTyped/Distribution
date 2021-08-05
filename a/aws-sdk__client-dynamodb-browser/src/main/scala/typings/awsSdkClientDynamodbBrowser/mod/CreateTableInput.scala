package typings.awsSdkClientDynamodbBrowser.mod

import typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput
object CreateTableInput {
  
  inline def apply(
    AttributeDefinitions: js.Array[AttributeDefinition] | Iterable[AttributeDefinition],
    KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
    ProvisionedThroughput: ProvisionedThroughput,
    TableName: String
  ): CreateTableInput = {
    val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableInput]
  }
}

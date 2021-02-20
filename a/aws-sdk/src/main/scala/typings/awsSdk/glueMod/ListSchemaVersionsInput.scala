package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemaVersionsInput extends StObject {
  
  /**
    * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
    */
  var MaxResults: js.UndefOr[MaxResultsNumber] = js.native
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.native
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.   SchemaId$SchemaName: The name of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.  
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId = js.native
}
object ListSchemaVersionsInput {
  
  @scala.inline
  def apply(SchemaId: SchemaId): ListSchemaVersionsInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaVersionsInput]
  }
  
  @scala.inline
  implicit class ListSchemaVersionsInputMutableBuilder[Self <: ListSchemaVersionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResultsNumber): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
  }
}

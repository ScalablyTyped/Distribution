package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemasInput extends StObject {
  
  /**
    * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
    */
  var MaxResults: js.UndefOr[MaxResultsNumber] = js.native
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.native
  
  /**
    * A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  var RegistryId: js.UndefOr[typings.awsSdk.glueMod.RegistryId] = js.native
}
object ListSchemasInput {
  
  @scala.inline
  def apply(): ListSchemasInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasInput]
  }
  
  @scala.inline
  implicit class ListSchemasInputMutableBuilder[Self <: ListSchemasInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResultsNumber): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "RegistryId", js.undefined)
  }
}

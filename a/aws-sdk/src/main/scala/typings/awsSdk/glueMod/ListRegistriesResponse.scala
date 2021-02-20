package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegistriesResponse extends StObject {
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.native
  
  /**
    * An array of RegistryDetailedListItem objects containing minimal details of each registry.
    */
  var Registries: js.UndefOr[RegistryListDefinition] = js.native
}
object ListRegistriesResponse {
  
  @scala.inline
  def apply(): ListRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistriesResponse]
  }
  
  @scala.inline
  implicit class ListRegistriesResponseMutableBuilder[Self <: ListRegistriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegistries(value: RegistryListDefinition): Self = StObject.set(x, "Registries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistriesUndefined: Self = StObject.set(x, "Registries", js.undefined)
    
    @scala.inline
    def setRegistriesVarargs(value: RegistryListItem*): Self = StObject.set(x, "Registries", js.Array(value :_*))
  }
}

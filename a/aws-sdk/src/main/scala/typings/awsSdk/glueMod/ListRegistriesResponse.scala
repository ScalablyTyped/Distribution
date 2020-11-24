package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegistriesResponse extends js.Object {
  
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
  implicit class ListRegistriesResponseOps[Self <: ListRegistriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRegistriesVarargs(value: RegistryListItem*): Self = this.set("Registries", js.Array(value :_*))
    
    @scala.inline
    def setRegistries(value: RegistryListDefinition): Self = this.set("Registries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistries: Self = this.set("Registries", js.undefined)
  }
}

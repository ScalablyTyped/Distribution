package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemasInput extends js.Object {
  
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
  implicit class ListSchemasInputOps[Self <: ListSchemasInput] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResultsNumber): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: SchemaRegistryTokenString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("RegistryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("RegistryId", js.undefined)
  }
}

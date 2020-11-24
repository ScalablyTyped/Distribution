package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchemaExtensionsResult extends js.Object {
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListSchemaExtensions to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  
  /**
    * Information about the schema extensions applied to the directory.
    */
  var SchemaExtensionsInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionsInfo] = js.native
}
object ListSchemaExtensionsResult {
  
  @scala.inline
  def apply(): ListSchemaExtensionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemaExtensionsResult]
  }
  
  @scala.inline
  implicit class ListSchemaExtensionsResultOps[Self <: ListSchemaExtensionsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSchemaExtensionsInfoVarargs(value: SchemaExtensionInfo*): Self = this.set("SchemaExtensionsInfo", js.Array(value :_*))
    
    @scala.inline
    def setSchemaExtensionsInfo(value: SchemaExtensionsInfo): Self = this.set("SchemaExtensionsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaExtensionsInfo: Self = this.set("SchemaExtensionsInfo", js.undefined)
  }
}

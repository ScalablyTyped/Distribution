package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExportsInput extends js.Object {
  
  /**
    * Maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[ListExportsMaxLimit] = js.native
  
  /**
    * An optional string that, if supplied, must be copied from the output of a previous call to ListExports. When provided in this manner, the API fetches the next page of results.
    */
  var NextToken: js.UndefOr[ExportNextToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) associated with the exported table.
    */
  var TableArn: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableArn] = js.native
}
object ListExportsInput {
  
  @scala.inline
  def apply(): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsInput]
  }
  
  @scala.inline
  implicit class ListExportsInputOps[Self <: ListExportsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: ListExportsMaxLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: ExportNextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTableArn(value: TableArn): Self = this.set("TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableArn: Self = this.set("TableArn", js.undefined)
  }
}

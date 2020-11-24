package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPrincipalThingsResponse extends js.Object {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The things.
    */
  var things: js.UndefOr[ThingNameList] = js.native
}
object ListPrincipalThingsResponse {
  
  @scala.inline
  def apply(): ListPrincipalThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalThingsResponse]
  }
  
  @scala.inline
  implicit class ListPrincipalThingsResponseOps[Self <: ListPrincipalThingsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setThingsVarargs(value: ThingName*): Self = this.set("things", js.Array(value :_*))
    
    @scala.inline
    def setThings(value: ThingNameList): Self = this.set("things", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThings: Self = this.set("things", js.undefined)
  }
}

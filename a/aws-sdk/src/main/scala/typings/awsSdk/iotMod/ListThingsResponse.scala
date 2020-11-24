package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingsResponse extends js.Object {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The things.
    */
  var things: js.UndefOr[ThingAttributeList] = js.native
}
object ListThingsResponse {
  
  @scala.inline
  def apply(): ListThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsResponse]
  }
  
  @scala.inline
  implicit class ListThingsResponseOps[Self <: ListThingsResponse] (val x: Self) extends AnyVal {
    
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
    def setThingsVarargs(value: ThingAttribute*): Self = this.set("things", js.Array(value :_*))
    
    @scala.inline
    def setThings(value: ThingAttributeList): Self = this.set("things", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThings: Self = this.set("things", js.undefined)
  }
}

package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingPrincipalsResponse extends js.Object {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The principals associated with the thing.
    */
  var principals: js.UndefOr[Principals] = js.native
}
object ListThingPrincipalsResponse {
  
  @scala.inline
  def apply(): ListThingPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingPrincipalsResponse]
  }
  
  @scala.inline
  implicit class ListThingPrincipalsResponseOps[Self <: ListThingPrincipalsResponse] (val x: Self) extends AnyVal {
    
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
    def setPrincipalsVarargs(value: PrincipalArn*): Self = this.set("principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: Principals): Self = this.set("principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
  }
}

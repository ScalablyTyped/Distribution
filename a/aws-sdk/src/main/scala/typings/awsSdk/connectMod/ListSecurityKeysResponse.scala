package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityKeysResponse extends js.Object {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * The security keys.
    */
  var SecurityKeys: js.UndefOr[SecurityKeysList] = js.native
}
object ListSecurityKeysResponse {
  
  @scala.inline
  def apply(): ListSecurityKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityKeysResponse]
  }
  
  @scala.inline
  implicit class ListSecurityKeysResponseOps[Self <: ListSecurityKeysResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSecurityKeysVarargs(value: SecurityKey*): Self = this.set("SecurityKeys", js.Array(value :_*))
    
    @scala.inline
    def setSecurityKeys(value: SecurityKeysList): Self = this.set("SecurityKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityKeys: Self = this.set("SecurityKeys", js.undefined)
  }
}

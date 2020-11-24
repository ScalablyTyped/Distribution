package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPublicKeysResponse extends js.Object {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Contains an array of PublicKey objects.  The returned public keys may have validity time ranges that overlap. 
    */
  var PublicKeyList: js.UndefOr[typings.awsSdk.cloudtrailMod.PublicKeyList] = js.native
}
object ListPublicKeysResponse {
  
  @scala.inline
  def apply(): ListPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysResponse]
  }
  
  @scala.inline
  implicit class ListPublicKeysResponseOps[Self <: ListPublicKeysResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPublicKeyListVarargs(value: PublicKey*): Self = this.set("PublicKeyList", js.Array(value :_*))
    
    @scala.inline
    def setPublicKeyList(value: PublicKeyList): Self = this.set("PublicKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyList: Self = this.set("PublicKeyList", js.undefined)
  }
}

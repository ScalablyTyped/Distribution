package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPublicKeysResult extends StObject {
  
  /**
    * Returns a list of all public keys that have been added to CloudFront for this account.
    */
  var PublicKeyList: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKeyList] = js.native
}
object ListPublicKeysResult {
  
  @scala.inline
  def apply(): ListPublicKeysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysResult]
  }
  
  @scala.inline
  implicit class ListPublicKeysResultMutableBuilder[Self <: ListPublicKeysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKeyList(value: PublicKeyList): Self = StObject.set(x, "PublicKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyListUndefined: Self = StObject.set(x, "PublicKeyList", js.undefined)
  }
}

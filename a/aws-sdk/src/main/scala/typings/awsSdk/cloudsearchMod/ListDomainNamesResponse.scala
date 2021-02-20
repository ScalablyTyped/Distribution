package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainNamesResponse extends StObject {
  
  /**
    * The names of the search domains owned by an account.
    */
  var DomainNames: js.UndefOr[DomainNameMap] = js.native
}
object ListDomainNamesResponse {
  
  @scala.inline
  def apply(): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
  
  @scala.inline
  implicit class ListDomainNamesResponseMutableBuilder[Self <: ListDomainNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainNames(value: DomainNameMap): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNamesUndefined: Self = StObject.set(x, "DomainNames", js.undefined)
  }
}

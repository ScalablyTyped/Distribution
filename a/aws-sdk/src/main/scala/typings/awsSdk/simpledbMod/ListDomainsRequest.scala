package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainsRequest extends StObject {
  
  /**
    * The maximum number of domain names you want returned. The range is 1 to 100. The default setting is 100.
    */
  var MaxNumberOfDomains: js.UndefOr[Integer] = js.native
  
  /**
    * A string informing Amazon SimpleDB where to start the next list of domain names.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListDomainsRequest {
  
  @scala.inline
  def apply(): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsRequest]
  }
  
  @scala.inline
  implicit class ListDomainsRequestMutableBuilder[Self <: ListDomainsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNumberOfDomains(value: Integer): Self = StObject.set(x, "MaxNumberOfDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumberOfDomainsUndefined: Self = StObject.set(x, "MaxNumberOfDomains", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

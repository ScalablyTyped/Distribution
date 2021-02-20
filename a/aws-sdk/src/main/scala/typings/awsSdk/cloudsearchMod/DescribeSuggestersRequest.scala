package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSuggestersRequest extends StObject {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  
  /**
    * The suggesters you want to describe.
    */
  var SuggesterNames: js.UndefOr[StandardNameList] = js.native
}
object DescribeSuggestersRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeSuggestersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSuggestersRequest]
  }
  
  @scala.inline
  implicit class DescribeSuggestersRequestMutableBuilder[Self <: DescribeSuggestersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggesterNames(value: StandardNameList): Self = StObject.set(x, "SuggesterNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggesterNamesUndefined: Self = StObject.set(x, "SuggesterNames", js.undefined)
    
    @scala.inline
    def setSuggesterNamesVarargs(value: StandardName*): Self = StObject.set(x, "SuggesterNames", js.Array(value :_*))
  }
}

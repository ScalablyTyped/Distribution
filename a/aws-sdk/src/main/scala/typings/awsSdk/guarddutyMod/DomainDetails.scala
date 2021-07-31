package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDetails extends StObject {
  
  /**
    * The domain information for the AWS API call.
    */
  var Domain: js.UndefOr[String] = js.undefined
}
object DomainDetails {
  
  @scala.inline
  def apply(): DomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDetails]
  }
  
  @scala.inline
  implicit class DomainDetailsMutableBuilder[Self <: DomainDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}

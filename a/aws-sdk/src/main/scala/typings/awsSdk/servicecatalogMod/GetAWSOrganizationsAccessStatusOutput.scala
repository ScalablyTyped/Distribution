package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAWSOrganizationsAccessStatusOutput extends StObject {
  
  /**
    * The status of the portfolio share feature.
    */
  var AccessStatus: js.UndefOr[typings.awsSdk.servicecatalogMod.AccessStatus] = js.native
}
object GetAWSOrganizationsAccessStatusOutput {
  
  @scala.inline
  def apply(): GetAWSOrganizationsAccessStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
  }
  
  @scala.inline
  implicit class GetAWSOrganizationsAccessStatusOutputMutableBuilder[Self <: GetAWSOrganizationsAccessStatusOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessStatus(value: AccessStatus): Self = StObject.set(x, "AccessStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessStatusUndefined: Self = StObject.set(x, "AccessStatus", js.undefined)
  }
}

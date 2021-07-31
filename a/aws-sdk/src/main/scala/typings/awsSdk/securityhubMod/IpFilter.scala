package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpFilter extends StObject {
  
  /**
    * A finding's CIDR value.
    */
  var Cidr: js.UndefOr[NonEmptyString] = js.undefined
}
object IpFilter {
  
  @scala.inline
  def apply(): IpFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpFilter]
  }
  
  @scala.inline
  implicit class IpFilterMutableBuilder[Self <: IpFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: NonEmptyString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
  }
}

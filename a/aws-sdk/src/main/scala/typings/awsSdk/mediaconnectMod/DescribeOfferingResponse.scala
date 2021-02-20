package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOfferingResponse extends StObject {
  
  var Offering: js.UndefOr[typings.awsSdk.mediaconnectMod.Offering] = js.native
}
object DescribeOfferingResponse {
  
  @scala.inline
  def apply(): DescribeOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOfferingResponse]
  }
  
  @scala.inline
  implicit class DescribeOfferingResponseMutableBuilder[Self <: DescribeOfferingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffering(value: Offering): Self = StObject.set(x, "Offering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingUndefined: Self = StObject.set(x, "Offering", js.undefined)
  }
}

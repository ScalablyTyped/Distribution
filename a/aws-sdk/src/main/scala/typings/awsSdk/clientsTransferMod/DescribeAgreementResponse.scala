package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgreementResponse extends StObject {
  
  /**
    * The details for the specified agreement, returned as a DescribedAgreement object.
    */
  var Agreement: DescribedAgreement
}
object DescribeAgreementResponse {
  
  inline def apply(Agreement: DescribedAgreement): DescribeAgreementResponse = {
    val __obj = js.Dynamic.literal(Agreement = Agreement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgreementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAgreementResponse] (val x: Self) extends AnyVal {
    
    inline def setAgreement(value: DescribedAgreement): Self = StObject.set(x, "Agreement", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditSuppressionResponse extends StObject {
  
  var checkName: js.UndefOr[AuditCheckName] = js.native
  
  /**
    *  The description of the audit suppression. 
    */
  var description: js.UndefOr[AuditDescription] = js.native
  
  /**
    *  The epoch timestamp in seconds at which this suppression expires. 
    */
  var expirationDate: js.UndefOr[Timestamp] = js.native
  
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  
  /**
    *  Indicates whether a suppression should exist indefinitely or not. 
    */
  var suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.native
}
object DescribeAuditSuppressionResponse {
  
  @scala.inline
  def apply(): DescribeAuditSuppressionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditSuppressionResponse]
  }
  
  @scala.inline
  implicit class DescribeAuditSuppressionResponseMutableBuilder[Self <: DescribeAuditSuppressionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckNameUndefined: Self = StObject.set(x, "checkName", js.undefined)
    
    @scala.inline
    def setDescription(value: AuditDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    @scala.inline
    def setSuppressIndefinitely(value: SuppressIndefinitely): Self = StObject.set(x, "suppressIndefinitely", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressIndefinitelyUndefined: Self = StObject.set(x, "suppressIndefinitely", js.undefined)
  }
}

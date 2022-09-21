package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncidentRecordSource extends StObject {
  
  /**
    * The principal that started the incident.
    */
  var createdBy: Arn
  
  /**
    * The service principal that assumed the role specified in createdBy. If no service principal assumed the role this will be left blank.
    */
  var invokedBy: js.UndefOr[ServicePrincipal] = js.undefined
  
  /**
    * The resource that caused the incident to be created.
    */
  var resourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The service that started the incident. This can be manually created from Incident Manager, automatically created using an Amazon CloudWatch alarm, or Amazon EventBridge event.
    */
  var source: IncidentSource
}
object IncidentRecordSource {
  
  inline def apply(createdBy: Arn, source: IncidentSource): IncidentRecordSource = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncidentRecordSource]
  }
  
  extension [Self <: IncidentRecordSource](x: Self) {
    
    inline def setCreatedBy(value: Arn): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setInvokedBy(value: ServicePrincipal): Self = StObject.set(x, "invokedBy", value.asInstanceOf[js.Any])
    
    inline def setInvokedByUndefined: Self = StObject.set(x, "invokedBy", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setSource(value: IncidentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

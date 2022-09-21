package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var arn: ServiceArn
  
  /**
    * The time when the service was created.
    */
  var createdAt: js.Date
  
  /**
    * A description of the service.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time when the service was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The name of the service.
    */
  var name: ResourceName
  
  /**
    * The status of the service.
    */
  var status: ServiceStatus
  
  /**
    * A service status message.
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object ServiceSummary {
  
  inline def apply(
    arn: ServiceArn,
    createdAt: js.Date,
    lastModifiedAt: js.Date,
    name: ResourceName,
    status: ServiceStatus,
    templateName: ResourceName
  ): ServiceSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSummary]
  }
  
  extension [Self <: ServiceSummary](x: Self) {
    
    inline def setArn(value: ServiceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}

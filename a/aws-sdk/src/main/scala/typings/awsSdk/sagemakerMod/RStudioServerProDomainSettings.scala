package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RStudioServerProDomainSettings extends StObject {
  
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
  
  /**
    * The ARN of the execution role for the RStudioServerPro Domain-level app.
    */
  var DomainExecutionRoleArn: RoleArn
  
  /**
    * A URL pointing to an RStudio Connect server.
    */
  var RStudioConnectUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A URL pointing to an RStudio Package Manager server.
    */
  var RStudioPackageManagerUrl: js.UndefOr[String] = js.undefined
}
object RStudioServerProDomainSettings {
  
  inline def apply(DomainExecutionRoleArn: RoleArn): RStudioServerProDomainSettings = {
    val __obj = js.Dynamic.literal(DomainExecutionRoleArn = DomainExecutionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RStudioServerProDomainSettings]
  }
  
  extension [Self <: RStudioServerProDomainSettings](x: Self) {
    
    inline def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
    
    inline def setDomainExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "DomainExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setRStudioConnectUrl(value: String): Self = StObject.set(x, "RStudioConnectUrl", value.asInstanceOf[js.Any])
    
    inline def setRStudioConnectUrlUndefined: Self = StObject.set(x, "RStudioConnectUrl", js.undefined)
    
    inline def setRStudioPackageManagerUrl(value: String): Self = StObject.set(x, "RStudioPackageManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setRStudioPackageManagerUrlUndefined: Self = StObject.set(x, "RStudioPackageManagerUrl", js.undefined)
  }
}

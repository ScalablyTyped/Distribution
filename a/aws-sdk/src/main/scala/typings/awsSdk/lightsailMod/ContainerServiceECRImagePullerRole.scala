package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceECRImagePullerRole extends StObject {
  
  /**
    * A Boolean value that indicates whether the role is activated.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role, if it is activated.
    */
  var principalArn: js.UndefOr[String] = js.undefined
}
object ContainerServiceECRImagePullerRole {
  
  inline def apply(): ContainerServiceECRImagePullerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceECRImagePullerRole]
  }
  
  extension [Self <: ContainerServiceECRImagePullerRole](x: Self) {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setPrincipalArn(value: String): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
  }
}

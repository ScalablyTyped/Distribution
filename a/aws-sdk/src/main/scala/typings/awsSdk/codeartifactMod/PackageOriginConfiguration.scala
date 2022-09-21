package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageOriginConfiguration extends StObject {
  
  /**
    * A PackageOriginRestrictions object that contains information about the upstream and publish package origin configuration for the package.
    */
  var restrictions: js.UndefOr[PackageOriginRestrictions] = js.undefined
}
object PackageOriginConfiguration {
  
  inline def apply(): PackageOriginConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageOriginConfiguration]
  }
  
  extension [Self <: PackageOriginConfiguration](x: Self) {
    
    inline def setRestrictions(value: PackageOriginRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
  }
}

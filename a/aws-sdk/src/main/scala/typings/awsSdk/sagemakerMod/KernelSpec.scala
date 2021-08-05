package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelSpec extends StObject {
  
  /**
    * The display name of the kernel.
    */
  var DisplayName: js.UndefOr[KernelDisplayName] = js.undefined
  
  /**
    * The name of the kernel.
    */
  var Name: KernelName
}
object KernelSpec {
  
  inline def apply(Name: KernelName): KernelSpec = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelSpec]
  }
  
  extension [Self <: KernelSpec](x: Self) {
    
    inline def setDisplayName(value: KernelDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setName(value: KernelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

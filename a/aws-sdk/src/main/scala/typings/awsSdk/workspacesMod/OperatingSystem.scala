package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatingSystem extends StObject {
  
  /**
    * The operating system.
    */
  var Type: js.UndefOr[OperatingSystemType] = js.undefined
}
object OperatingSystem {
  
  inline def apply(): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystem]
  }
  
  extension [Self <: OperatingSystem](x: Self) {
    
    inline def setType(value: OperatingSystemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

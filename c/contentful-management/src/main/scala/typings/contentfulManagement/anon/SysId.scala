package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SysId extends StObject {
  
  var sys: Id
}
object SysId {
  
  inline def apply(sys: Id): SysId = {
    val __obj = js.Dynamic.literal(sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SysId]
  }
  
  extension [Self <: SysId](x: Self) {
    
    inline def setSys(value: Id): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
  }
}

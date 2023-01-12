package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NarrowPhase extends StObject {
  
  var contactPointPool: js.Array[Pool]
  
  var v3pool: Vec3Pool
}
object NarrowPhase {
  
  inline def apply(contactPointPool: js.Array[Pool], v3pool: Vec3Pool): NarrowPhase = {
    val __obj = js.Dynamic.literal(contactPointPool = contactPointPool.asInstanceOf[js.Any], v3pool = v3pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowPhase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NarrowPhase] (val x: Self) extends AnyVal {
    
    inline def setContactPointPool(value: js.Array[Pool]): Self = StObject.set(x, "contactPointPool", value.asInstanceOf[js.Any])
    
    inline def setContactPointPoolVarargs(value: Pool*): Self = StObject.set(x, "contactPointPool", js.Array(value*))
    
    inline def setV3pool(value: Vec3Pool): Self = StObject.set(x, "v3pool", value.asInstanceOf[js.Any])
  }
}

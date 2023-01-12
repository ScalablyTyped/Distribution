package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FalsyOptions extends StObject {
  
  var pool: js.Array[FalsyType]
}
object FalsyOptions {
  
  inline def apply(pool: js.Array[FalsyType]): FalsyOptions = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[FalsyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FalsyOptions] (val x: Self) extends AnyVal {
    
    inline def setPool(value: js.Array[FalsyType]): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolVarargs(value: FalsyType*): Self = StObject.set(x, "pool", js.Array(value*))
  }
}

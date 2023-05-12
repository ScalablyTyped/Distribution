package typings.culori.anon

import typings.culori.culoriInts.`360`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var h: js.Tuple2[typings.culori.culoriInts.`0`, `360`]
}
object `7` {
  
  inline def apply(h: js.Tuple2[typings.culori.culoriInts.`0`, `360`]): `7` = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setH(value: js.Tuple2[typings.culori.culoriInts.`0`, `360`]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
  }
}

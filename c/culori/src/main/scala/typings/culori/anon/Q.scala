package typings.culori.anon

import typings.culori.culoriDoubles.`-0.522`
import typings.culori.culoriDoubles.`-0.595`
import typings.culori.culoriDoubles.`0.522`
import typings.culori.culoriDoubles.`0.595`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Q extends StObject {
  
  var i: js.Tuple2[`-0.595`, `0.595`]
  
  var q: js.Tuple2[`-0.522`, `0.522`]
}
object Q {
  
  inline def apply(i: js.Tuple2[`-0.595`, `0.595`], q: js.Tuple2[`-0.522`, `0.522`]): Q = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Q]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Q] (val x: Self) extends AnyVal {
    
    inline def setI(value: js.Tuple2[`-0.595`, `0.595`]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setQ(value: js.Tuple2[`-0.522`, `0.522`]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}

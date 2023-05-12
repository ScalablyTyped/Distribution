package typings.chevrotainTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var maxLookahead: js.UndefOr[Double] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setMaxLookahead(value: Double): Self = StObject.set(x, "maxLookahead", value.asInstanceOf[js.Any])
    
    inline def setMaxLookaheadUndefined: Self = StObject.set(x, "maxLookahead", js.undefined)
  }
}

package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidePadding extends StObject {
  
  /** Left padding. */
  var left: js.UndefOr[Double] = js.undefined
  
  /** Right padding. */
  var right: js.UndefOr[Double] = js.undefined
}
object SidePadding {
  
  inline def apply(): SidePadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidePadding]
  }
  
  extension [Self <: SidePadding](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}

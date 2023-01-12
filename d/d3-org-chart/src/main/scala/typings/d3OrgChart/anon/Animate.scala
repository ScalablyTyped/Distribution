package typings.d3OrgChart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[Boolean] = js.undefined
}
object Animate {
  
  inline def apply(): Animate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animate] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}

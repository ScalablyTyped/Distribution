package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionOptions extends StObject {
  
  var axis: js.UndefOr[String] = js.undefined
  
  var includeInvisible: js.UndefOr[Boolean] = js.undefined
  
  var intersect: js.UndefOr[Boolean] = js.undefined
}
object InteractionOptions {
  
  inline def apply(): InteractionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionOptions] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setIncludeInvisible(value: Boolean): Self = StObject.set(x, "includeInvisible", value.asInstanceOf[js.Any])
    
    inline def setIncludeInvisibleUndefined: Self = StObject.set(x, "includeInvisible", js.undefined)
    
    inline def setIntersect(value: Boolean): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
    
    inline def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
  }
}

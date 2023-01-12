package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAABBOptions extends StObject {
  
  var lowerBound: js.UndefOr[Vec3] = js.undefined
  
  var upperBound: js.UndefOr[Vec3] = js.undefined
}
object IAABBOptions {
  
  inline def apply(): IAABBOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAABBOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAABBOptions] (val x: Self) extends AnyVal {
    
    inline def setLowerBound(value: Vec3): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setUpperBound(value: Vec3): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}

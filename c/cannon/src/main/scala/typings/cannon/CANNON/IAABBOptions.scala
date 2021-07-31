package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAABBOptions extends StObject {
  
  var lowerBound: js.UndefOr[Vec3] = js.undefined
  
  var upperBound: js.UndefOr[Vec3] = js.undefined
}
object IAABBOptions {
  
  @scala.inline
  def apply(): IAABBOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAABBOptions]
  }
  
  @scala.inline
  implicit class IAABBOptionsMutableBuilder[Self <: IAABBOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowerBound(value: Vec3): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: Vec3): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}

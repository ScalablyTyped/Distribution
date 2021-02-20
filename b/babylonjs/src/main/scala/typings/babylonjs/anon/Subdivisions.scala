package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subdivisions extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
  
  var subdivisionsX: js.UndefOr[Double] = js.native
  
  var subdivisionsY: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Subdivisions {
  
  @scala.inline
  def apply(): Subdivisions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subdivisions]
  }
  
  @scala.inline
  implicit class SubdivisionsMutableBuilder[Self <: Subdivisions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    @scala.inline
    def setSubdivisionsX(value: Double): Self = StObject.set(x, "subdivisionsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsXUndefined: Self = StObject.set(x, "subdivisionsX", js.undefined)
    
    @scala.inline
    def setSubdivisionsY(value: Double): Self = StObject.set(x, "subdivisionsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsYUndefined: Self = StObject.set(x, "subdivisionsY", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

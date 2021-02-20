package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Updatable extends StObject {
  
  var precision: js.UndefOr[H] = js.native
  
  var subdivisions: js.UndefOr[H] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var xmax: Double = js.native
  
  var xmin: Double = js.native
  
  var zmax: Double = js.native
  
  var zmin: Double = js.native
}
object Updatable {
  
  @scala.inline
  def apply(xmax: Double, xmin: Double, zmax: Double, zmin: Double): Updatable = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updatable]
  }
  
  @scala.inline
  implicit class UpdatableMutableBuilder[Self <: Updatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrecision(value: H): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: H): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    @scala.inline
    def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZmax(value: Double): Self = StObject.set(x, "zmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZmin(value: Double): Self = StObject.set(x, "zmin", value.asInstanceOf[js.Any])
  }
}

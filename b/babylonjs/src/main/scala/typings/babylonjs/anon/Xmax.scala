package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xmax extends StObject {
  
  var precision: js.UndefOr[H] = js.undefined
  
  var subdivisions: js.UndefOr[H] = js.undefined
  
  var xmax: Double
  
  var xmin: Double
  
  var zmax: Double
  
  var zmin: Double
}
object Xmax {
  
  inline def apply(xmax: Double, xmin: Double, zmax: Double, zmin: Double): Xmax = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmax]
  }
  
  extension [Self <: Xmax](x: Self) {
    
    inline def setPrecision(value: H): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setSubdivisions(value: H): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    inline def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    inline def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    inline def setZmax(value: Double): Self = StObject.set(x, "zmax", value.asInstanceOf[js.Any])
    
    inline def setZmin(value: Double): Self = StObject.set(x, "zmin", value.asInstanceOf[js.Any])
  }
}

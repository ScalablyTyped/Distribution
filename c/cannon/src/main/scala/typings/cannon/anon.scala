package typings.cannon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BOX extends StObject {
    
    var BOX: Double
    
    var COMPOUND: Double
    
    var CONVEXPOLYHEDRON: Double
    
    var CYLINDER: Double
    
    var HEIGHTFIELD: Double
    
    var PARTICLE: Double
    
    var PLANE: Double
    
    var SPHERE: Double
    
    var TRIMESH: Double
  }
  object BOX {
    
    inline def apply(
      BOX: Double,
      COMPOUND: Double,
      CONVEXPOLYHEDRON: Double,
      CYLINDER: Double,
      HEIGHTFIELD: Double,
      PARTICLE: Double,
      PLANE: Double,
      SPHERE: Double,
      TRIMESH: Double
    ): BOX = {
      val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], COMPOUND = COMPOUND.asInstanceOf[js.Any], CONVEXPOLYHEDRON = CONVEXPOLYHEDRON.asInstanceOf[js.Any], CYLINDER = CYLINDER.asInstanceOf[js.Any], HEIGHTFIELD = HEIGHTFIELD.asInstanceOf[js.Any], PARTICLE = PARTICLE.asInstanceOf[js.Any], PLANE = PLANE.asInstanceOf[js.Any], SPHERE = SPHERE.asInstanceOf[js.Any], TRIMESH = TRIMESH.asInstanceOf[js.Any])
      __obj.asInstanceOf[BOX]
    }
    
    extension [Self <: BOX](x: Self) {
      
      inline def setBOX(value: Double): Self = StObject.set(x, "BOX", value.asInstanceOf[js.Any])
      
      inline def setCOMPOUND(value: Double): Self = StObject.set(x, "COMPOUND", value.asInstanceOf[js.Any])
      
      inline def setCONVEXPOLYHEDRON(value: Double): Self = StObject.set(x, "CONVEXPOLYHEDRON", value.asInstanceOf[js.Any])
      
      inline def setCYLINDER(value: Double): Self = StObject.set(x, "CYLINDER", value.asInstanceOf[js.Any])
      
      inline def setHEIGHTFIELD(value: Double): Self = StObject.set(x, "HEIGHTFIELD", value.asInstanceOf[js.Any])
      
      inline def setPARTICLE(value: Double): Self = StObject.set(x, "PARTICLE", value.asInstanceOf[js.Any])
      
      inline def setPLANE(value: Double): Self = StObject.set(x, "PLANE", value.asInstanceOf[js.Any])
      
      inline def setSPHERE(value: Double): Self = StObject.set(x, "SPHERE", value.asInstanceOf[js.Any])
      
      inline def setTRIMESH(value: Double): Self = StObject.set(x, "TRIMESH", value.asInstanceOf[js.Any])
    }
  }
  
  trait Broadphaser extends StObject {
    
    var broadphaser: Double
    
    var integrate: Double
    
    var makeContactConstraints: Double
    
    var narrowphase: Double
    
    var solve: Double
  }
  object Broadphaser {
    
    inline def apply(
      broadphaser: Double,
      integrate: Double,
      makeContactConstraints: Double,
      narrowphase: Double,
      solve: Double
    ): Broadphaser = {
      val __obj = js.Dynamic.literal(broadphaser = broadphaser.asInstanceOf[js.Any], integrate = integrate.asInstanceOf[js.Any], makeContactConstraints = makeContactConstraints.asInstanceOf[js.Any], narrowphase = narrowphase.asInstanceOf[js.Any], solve = solve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Broadphaser]
    }
    
    extension [Self <: Broadphaser](x: Self) {
      
      inline def setBroadphaser(value: Double): Self = StObject.set(x, "broadphaser", value.asInstanceOf[js.Any])
      
      inline def setIntegrate(value: Double): Self = StObject.set(x, "integrate", value.asInstanceOf[js.Any])
      
      inline def setMakeContactConstraints(value: Double): Self = StObject.set(x, "makeContactConstraints", value.asInstanceOf[js.Any])
      
      inline def setNarrowphase(value: Double): Self = StObject.set(x, "narrowphase", value.asInstanceOf[js.Any])
      
      inline def setSolve(value: Double): Self = StObject.set(x, "solve", value.asInstanceOf[js.Any])
    }
  }
  
  trait Keys extends StObject {
    
    var keys: js.Array[Any]
  }
  object Keys {
    
    inline def apply(keys: js.Array[Any]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    extension [Self <: Keys](x: Self) {
      
      inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
}

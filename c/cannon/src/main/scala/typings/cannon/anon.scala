package typings.cannon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BOX extends StObject {
    
    var BOX: Double = js.native
    
    var COMPOUND: Double = js.native
    
    var CONVEXPOLYHEDRON: Double = js.native
    
    var CYLINDER: Double = js.native
    
    var HEIGHTFIELD: Double = js.native
    
    var PARTICLE: Double = js.native
    
    var PLANE: Double = js.native
    
    var SPHERE: Double = js.native
  }
  object BOX {
    
    @scala.inline
    def apply(
      BOX: Double,
      COMPOUND: Double,
      CONVEXPOLYHEDRON: Double,
      CYLINDER: Double,
      HEIGHTFIELD: Double,
      PARTICLE: Double,
      PLANE: Double,
      SPHERE: Double
    ): BOX = {
      val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], COMPOUND = COMPOUND.asInstanceOf[js.Any], CONVEXPOLYHEDRON = CONVEXPOLYHEDRON.asInstanceOf[js.Any], CYLINDER = CYLINDER.asInstanceOf[js.Any], HEIGHTFIELD = HEIGHTFIELD.asInstanceOf[js.Any], PARTICLE = PARTICLE.asInstanceOf[js.Any], PLANE = PLANE.asInstanceOf[js.Any], SPHERE = SPHERE.asInstanceOf[js.Any])
      __obj.asInstanceOf[BOX]
    }
    
    @scala.inline
    implicit class BOXMutableBuilder[Self <: BOX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBOX(value: Double): Self = StObject.set(x, "BOX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOMPOUND(value: Double): Self = StObject.set(x, "COMPOUND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONVEXPOLYHEDRON(value: Double): Self = StObject.set(x, "CONVEXPOLYHEDRON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCYLINDER(value: Double): Self = StObject.set(x, "CYLINDER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEIGHTFIELD(value: Double): Self = StObject.set(x, "HEIGHTFIELD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPARTICLE(value: Double): Self = StObject.set(x, "PARTICLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPLANE(value: Double): Self = StObject.set(x, "PLANE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPHERE(value: Double): Self = StObject.set(x, "SPHERE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Broadphaser extends StObject {
    
    var broadphaser: Double = js.native
    
    var integrate: Double = js.native
    
    var makeContactConstraints: Double = js.native
    
    var narrowphase: Double = js.native
    
    var solve: Double = js.native
  }
  object Broadphaser {
    
    @scala.inline
    def apply(
      broadphaser: Double,
      integrate: Double,
      makeContactConstraints: Double,
      narrowphase: Double,
      solve: Double
    ): Broadphaser = {
      val __obj = js.Dynamic.literal(broadphaser = broadphaser.asInstanceOf[js.Any], integrate = integrate.asInstanceOf[js.Any], makeContactConstraints = makeContactConstraints.asInstanceOf[js.Any], narrowphase = narrowphase.asInstanceOf[js.Any], solve = solve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Broadphaser]
    }
    
    @scala.inline
    implicit class BroadphaserMutableBuilder[Self <: Broadphaser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadphaser(value: Double): Self = StObject.set(x, "broadphaser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrate(value: Double): Self = StObject.set(x, "integrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMakeContactConstraints(value: Double): Self = StObject.set(x, "makeContactConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrowphase(value: Double): Self = StObject.set(x, "narrowphase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolve(value: Double): Self = StObject.set(x, "solve", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Keys extends StObject {
    
    var keys: js.Array[_] = js.native
  }
  object Keys {
    
    @scala.inline
    def apply(keys: js.Array[_]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    @scala.inline
    implicit class KeysMutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: js.Array[_]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
    }
  }
}

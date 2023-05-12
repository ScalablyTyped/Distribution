package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PhysicsMaterialMod {
  
  @js.native
  sealed trait PhysicsMaterialCombineMode extends StObject
  @JSImport("babylonjs/Physics/v2/physicsMaterial", "PhysicsMaterialCombineMode")
  @js.native
  object PhysicsMaterialCombineMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PhysicsMaterialCombineMode & Double] = js.native
    
    @js.native
    sealed trait ARITHMETIC_MEAN
      extends StObject
         with PhysicsMaterialCombineMode
    /* 3 */ val ARITHMETIC_MEAN: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.ARITHMETIC_MEAN & Double = js.native
    
    /**
      * The final value will be the geometric mean of the two values:
      * sqrt( valueA *  valueB )
      */
    @js.native
    sealed trait GEOMETRIC_MEAN
      extends StObject
         with PhysicsMaterialCombineMode
    /* 0 */ val GEOMETRIC_MEAN: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.GEOMETRIC_MEAN & Double = js.native
    
    @js.native
    sealed trait MAXIMUM
      extends StObject
         with PhysicsMaterialCombineMode
    /* 2 */ val MAXIMUM: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.MAXIMUM & Double = js.native
    
    /**
      * The final value will be the smaller of the two:
      * min( valueA , valueB )
      */
    @js.native
    sealed trait MINIMUM
      extends StObject
         with PhysicsMaterialCombineMode
    /* 1 */ val MINIMUM: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.MINIMUM & Double = js.native
    
    /**
      * The final value will be the product of the two values:
      * valueA * valueB
      */
    @js.native
    sealed trait MULTIPLY
      extends StObject
         with PhysicsMaterialCombineMode
    /* 4 */ val MULTIPLY: typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterialCombineMode.MULTIPLY & Double = js.native
  }
  
  trait PhysicsMaterial extends StObject {
    
    /**
      * Sets the friction used by this material
      *
      * The friction determines how much an object will slow down when it is in contact with another object.
      * This is important for simulating realistic physics, such as when an object slides across a surface.
      *
      * If not provided, a default value of 0.5 will be used.
      */
    var friction: js.UndefOr[Double] = js.undefined
    
    /**
      * Describes how two different friction values should be combined. See PhysicsMaterialCombineMode for
      * more details.
      *
      * If not provided, will use PhysicsMaterialCombineMode.MINIMUM
      */
    var frictionCombine: js.UndefOr[PhysicsMaterialCombineMode] = js.undefined
    
    /**
      * Sets the restitution of the physics material.
      *
      * The restitution is a factor which describes, the amount of energy that is retained after a collision,
      * which should be a number between 0 and 1..
      *
      * A restitution of 0 means that no energy is retained and the objects will not bounce off each other,
      * while a restitution of 1 means that all energy is retained and the objects will bounce.
      *
      * Note, though, due that due to the simulation implementation, an object with a restitution of 1 may
      * still lose energy over time.
      *
      * If not provided, a default value of 0 will be used.
      */
    var restitution: js.UndefOr[Double] = js.undefined
    
    /**
      * Describes how two different restitution values should be combined. See PhysicsMaterialCombineMode for
      * more details.
      *
      * If not provided, will use PhysicsMaterialCombineMode.MAXIMUM
      */
    var restitutionCombine: js.UndefOr[PhysicsMaterialCombineMode] = js.undefined
    
    /**
      * Sets the static friction used by this material.
      *
      * Static friction is the friction that must be overcome before a pair of objects can start sliding
      * relative to each other; for physically-realistic behaviour, it should be at least as high as the
      * normal friction value. If not provided, the friction value will be used
      */
    var staticFriction: js.UndefOr[Double] = js.undefined
  }
  object PhysicsMaterial {
    
    inline def apply(): PhysicsMaterial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicsMaterial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsMaterial] (val x: Self) extends AnyVal {
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionCombine(value: PhysicsMaterialCombineMode): Self = StObject.set(x, "frictionCombine", value.asInstanceOf[js.Any])
      
      inline def setFrictionCombineUndefined: Self = StObject.set(x, "frictionCombine", js.undefined)
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
      
      inline def setRestitutionCombine(value: PhysicsMaterialCombineMode): Self = StObject.set(x, "restitutionCombine", value.asInstanceOf[js.Any])
      
      inline def setRestitutionCombineUndefined: Self = StObject.set(x, "restitutionCombine", js.undefined)
      
      inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
      
      inline def setStaticFriction(value: Double): Self = StObject.set(x, "staticFriction", value.asInstanceOf[js.Any])
      
      inline def setStaticFrictionUndefined: Self = StObject.set(x, "staticFriction", js.undefined)
    }
  }
}

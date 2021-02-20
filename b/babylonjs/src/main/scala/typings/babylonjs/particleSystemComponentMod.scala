package typings.babylonjs

import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particleSystemComponentMod {
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /**
        * Create an effect to use with particle systems.
        * Please note that some parameters like animation sheets or not being billboard are not supported in this configuration, except if you pass
        * the particle system for which you want to create a custom effect in the last parameter
        * @param fragmentName defines the base name of the effect (The name of file without .fragment.fx)
        * @param uniformsNames defines a list of attribute names
        * @param samplers defines an array of string used to represent textures
        * @param defines defines the string containing the defines to use to compile the shaders
        * @param fallbacks defines the list of potential fallbacks to use if shader conmpilation fails
        * @param onCompiled defines a function to call when the effect creation is successful
        * @param onError defines a function to call when the effect creation has failed
        * @param particleSystem the particle system you want to create the effect for
        * @returns the new Effect
        */
      def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
    }
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    @js.native
    trait Mesh extends StObject {
      
      /**
        * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
        * @returns an array of IParticleSystem
        */
      def getEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
      
      /**
        * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
        * @returns an array of IParticleSystem
        */
      def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
    }
    object Mesh {
      
      @scala.inline
      def apply(
        getEmittedParticleSystems: () => js.Array[IParticleSystem],
        getHierarchyEmittedParticleSystems: () => js.Array[IParticleSystem]
      ): Mesh = {
        val __obj = js.Dynamic.literal(getEmittedParticleSystems = js.Any.fromFunction0(getEmittedParticleSystems), getHierarchyEmittedParticleSystems = js.Any.fromFunction0(getHierarchyEmittedParticleSystems))
        __obj.asInstanceOf[Mesh]
      }
      
      @scala.inline
      implicit class MeshMutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = StObject.set(x, "getEmittedParticleSystems", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetHierarchyEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = StObject.set(x, "getHierarchyEmittedParticleSystems", js.Any.fromFunction0(value))
      }
    }
  }
}

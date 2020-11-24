package typings.babylonjs.particlesIndexMod

import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Particles/index", "babylonjs/Engines/engine")
@js.native
object babylonjsEnginesEngineAugmentingMod extends js.Object {
  
  @js.native
  trait Engine extends js.Object {
    
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

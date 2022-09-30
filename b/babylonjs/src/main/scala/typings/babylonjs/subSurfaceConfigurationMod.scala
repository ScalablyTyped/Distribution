package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.prePassEffectConfigurationMod.PrePassEffectConfiguration
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subSurfaceScatteringPostProcessMod.SubSurfaceScatteringPostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subSurfaceConfigurationMod {
  
  @JSImport("babylonjs/Rendering/subSurfaceConfiguration", "SubSurfaceConfiguration")
  @js.native
  open class SubSurfaceConfiguration protected ()
    extends StObject
       with PrePassEffectConfiguration {
    /**
      * Builds a subsurface configuration object
      * @param scene The scene
      */
    def this(scene: Scene) = this()
    
    /**
      * Performs sampling of a Normalized Burley diffusion profile in polar coordinates.
      * 'u' is the random number (the value of the CDF): [0, 1).
      * rcp(s) = 1 / ShapeParam = ScatteringDistance.
      * Returns the sampled radial distance, s.t. (u = 0 -> r = 0) and (u = 1 -> r = Inf).
      * @param u
      * @param rcpS
      */
    /* private */ var _sampleBurleyDiffusionProfile: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _ssDiffusionD: Any = js.native
    
    /* private */ var _ssDiffusionS: Any = js.native
    
    /* private */ var _ssFilterRadii: Any = js.native
    
    /**
      * Adds a new diffusion profile.
      * Useful for more realistic subsurface scattering on diverse materials.
      * @param color The color of the diffusion profile. Should be the average color of the material.
      * @returns The index of the diffusion profile for the material subsurface configuration
      */
    def addDiffusionProfile(color: Color3): Double = js.native
    
    /**
      * Deletes all diffusion profiles.
      * Note that in order to render subsurface scattering, you should have at least 1 diffusion profile.
      */
    def clearAllDiffusionProfiles(): Unit = js.native
    
    /**
      * Creates the sss post process
      * @returns The created post process
      */
    @JSName("createPostProcess")
    def createPostProcess_MSubSurfaceConfiguration(): SubSurfaceScatteringPostProcess = js.native
    
    /**
      * Disposes this object
      */
    @JSName("dispose")
    def dispose_MSubSurfaceConfiguration(): Unit = js.native
    
    /**
      * Is the effect enabled
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * @internal
      * https://zero-radiance.github.io/post/sampling-diffusion/
      *
      * Importance sample the normalized diffuse reflectance profile for the computed value of 's'.
      * ------------------------------------------------------------------------------------
      * R[r, phi, s]   = s * (Exp[-r * s] + Exp[-r * s / 3]) / (8 * Pi * r)
      * PDF[r, phi, s] = r * R[r, phi, s]
      * CDF[r, s]      = 1 - 1/4 * Exp[-r * s] - 3/4 * Exp[-r * s / 3]
      * ------------------------------------------------------------------------------------
      * We importance sample the color channel with the widest scattering distance.
      */
    def getDiffusionProfileParameters(color: Color3): Double = js.native
    
    /**
      * Defines the ratio real world => scene units.
      * Used for subsurface scattering
      */
    var metersPerUnit: Double = js.native
    
    /**
      * Name of the effect
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Does the output of this prepass need to go through imageprocessing
      */
    @JSName("needsImageProcessing")
    var needsImageProcessing_SubSurfaceConfiguration: Boolean = js.native
    
    /**
      * Post process to attach for screen space subsurface scattering
      */
    @JSName("postProcess")
    var postProcess_SubSurfaceConfiguration: SubSurfaceScatteringPostProcess = js.native
    
    /**
      * Diffusion profile max color channel value for subsurface scattering
      */
    def ssDiffusionD: js.Array[Double] = js.native
    
    /**
      * Diffusion profile colors for subsurface scattering
      * You can add one diffusion color using `addDiffusionProfile` on `scene.prePassRenderer`
      * See ...
      * Note that you can only store up to 5 of them
      */
    var ssDiffusionProfileColors: js.Array[Color3] = js.native
    
    /**
      * Diffusion profile color for subsurface scattering
      */
    def ssDiffusionS: js.Array[Double] = js.native
    
    /**
      * Diffusion profile filter radius for subsurface scattering
      */
    def ssFilterRadii: js.Array[Double] = js.native
    
    /**
      * Textures required in the MRT
      */
    /* CompleteClass */
    var texturesRequired: js.Array[Double] = js.native
  }
  /* static members */
  object SubSurfaceConfiguration {
    
    @JSImport("babylonjs/Rendering/subSurfaceConfiguration", "SubSurfaceConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

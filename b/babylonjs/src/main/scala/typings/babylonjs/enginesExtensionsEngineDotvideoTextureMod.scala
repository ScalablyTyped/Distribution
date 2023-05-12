package typings.babylonjs

import typings.babylonjs.materialsTexturesExternalTextureMod.ExternalTexture
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotvideoTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /**
        * Update a video texture
        * @param texture defines the texture to update
        * @param video defines the video element to use
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit = js.native
      def updateVideoTexture(texture: Nullable[InternalTexture], video: Nullable[ExternalTexture], invertY: Boolean): Unit = js.native
    }
  }
}

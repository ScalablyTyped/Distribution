package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.mathVectorMod.Vector4
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bakedVertexAnimationManagerMod {
  
  @JSImport("babylonjs/BakedVertexAnimation/bakedVertexAnimationManager", "BakedVertexAnimationManager")
  @js.native
  /**
    * Creates a new BakedVertexAnimationManager
    * @param scene defines the current scene
    */
  open class BakedVertexAnimationManager ()
    extends StObject
       with IBakedVertexAnimationManager {
    def this(scene: Nullable[Scene]) = this()
    
    /* private */ var _isEnabled: Any = js.native
    
    /** @hidden */
    def _markSubMeshesAsAttributesDirty(): Unit = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _texture: Any = js.native
    
    /**
      * Binds to the effect.
      * @param effect The effect to bind to.
      * @param useInstances True when it's an instance.
      */
    def bind(effect: Effect): Unit = js.native
    
    /**
      * Makes a duplicate of the current instance into another one.
      * @param vatMap define the instance where to copy the info
      */
    def copyTo(vatMap: BakedVertexAnimationManager): Unit = js.native
    
    /**
      * Parses a vertex animation setting from a serialized object.
      * @param source - Serialized object.
      * @param scene Defines the scene we are parsing for
      * @param rootUrl Defines the rootUrl to load from
      */
    def parse(source: Any, scene: Scene, rootUrl: String): Unit = js.native
    
    /**
      * Serializes this vertex animation instance
      * @returns - An object with the serialized instance.
      */
    def serialize(): Any = js.native
    
    /**
      * Sets animation parameters.
      * @param startFrame The first frame of the animation.
      * @param endFrame The last frame of the animation.
      * @param offset The offset when starting the animation.
      * @param speedFramesPerSecond The frame rate.
      */
    def setAnimationParameters(startFrame: Double, endFrame: Double): Unit = js.native
    def setAnimationParameters(startFrame: Double, endFrame: Double, offset: Double): Unit = js.native
    def setAnimationParameters(startFrame: Double, endFrame: Double, offset: Unit, speedFramesPerSecond: Double): Unit = js.native
  }
  
  @js.native
  trait IBakedVertexAnimationManager extends StObject {
    
    /**
      * The animation parameters for the mesh. See setAnimationParameters()
      */
    var animationParameters: Vector4 = js.native
    
    /**
      * Binds to the effect.
      * @param effect The effect to bind to.
      * @param useInstances True when it's an instance.
      */
    def bind(effect: Effect, useInstances: Boolean): Unit = js.native
    
    /**
      * Disposes the resources of the manager.
      * @param forceDisposeTextures - Forces the disposal of all textures.
      */
    def dispose(): Unit = js.native
    def dispose(forceDisposeTextures: Boolean): Unit = js.native
    
    /**
      * Get the current class name useful for serialization or dynamic coding.
      * @returns "BakedVertexAnimationManager"
      */
    def getClassName(): String = js.native
    
    /**
      * Gets or sets a boolean indicating if the edgesRenderer is active
      */
    var isEnabled: Boolean = js.native
    
    /**
      * Sets animation parameters.
      * @param startFrame The first frame of the animation.
      * @param endFrame The last frame of the animation.
      * @param offset The offset when starting the animation.
      * @param speedFramesPerSecond The frame rate.
      */
    def setAnimationParameters(startFrame: Double, endFrame: Double, offset: Double, speedFramesPerSecond: Double): Unit = js.native
    
    /**
      * The vertex animation texture
      */
    var texture: Nullable[BaseTexture] = js.native
    
    /**
      * The time counter, to pick the correct animation frame.
      */
    var time: Double = js.native
  }
}

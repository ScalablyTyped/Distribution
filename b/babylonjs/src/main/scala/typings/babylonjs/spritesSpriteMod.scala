package typings.babylonjs

import typings.babylonjs.actionsActionManagerMod.ActionManager
import typings.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable
import typings.babylonjs.animationsAnimationMod.Animation
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.spritesSpriteManagerMod.ISpriteManager
import typings.babylonjs.spritesSpriteManagerMod.SpriteManager
import typings.babylonjs.spritesThinSpriteMod.ThinSprite
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spritesSpriteMod {
  
  @JSImport("babylonjs/Sprites/sprite", "Sprite")
  @js.native
  open class Sprite protected ()
    extends ThinSprite
       with IAnimatable {
    /**
      * Creates a new Sprite
      * @param name defines the name
      * @param manager defines the manager
      */
    def this(/** defines the name */
    name: String, manager: ISpriteManager) = this()
    
    /* private */ var _endAnimation: Any = js.native
    
    /* private */ var _manager: Any = js.native
    
    /* private */ var _onAnimationEnd: Any = js.native
    
    /**
      * Gets or sets the associated action manager
      */
    var actionManager: Nullable[ActionManager] = js.native
    
    /**
      * Array of animations
      */
    /* CompleteClass */
    var animations: Nullable[js.Array[Animation]] = js.native
    
    /** Gets or sets the main color */
    @JSName("color")
    var color_Sprite: Color4 = js.native
    
    def delay_=(value: Double): Unit = js.native
    
    /** Release associated resources */
    def dispose(): Unit = js.native
    
    /** Gets or sets a boolean indicating that this sprite should be disposed after animation ends */
    var disposeWhenFinishedAnimating: Boolean = js.native
    
    def fromIndex_=(value: Double): Unit = js.native
    
    /**
      * Returns the string "Sprite"
      * @returns "Sprite"
      */
    def getClassName(): String = js.native
    
    /** Gets or sets a boolean indicating if the sprite can be picked */
    var isPickable: Boolean = js.native
    
    def loopAnimation_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the manager of this sprite
      */
    def manager: ISpriteManager = js.native
    
    /** defines the name */
    var name: String = js.native
    
    /**
      * An event triggered when the control has been disposed
      */
    var onDisposeObservable: Observable[Sprite] = js.native
    
    /**
      * Starts an animation
      * @param from defines the initial key
      * @param to defines the end key
      * @param loop defines if the animation must loop
      * @param delay defines the start delay (in ms)
      * @param onAnimationEnd defines a callback to call when animation ends
      */
    def playAnimation(from: Double, to: Double, loop: Boolean, delay: Double): Unit = js.native
    
    /** Gets or sets the current world position */
    @JSName("position")
    var position_Sprite: Vector3 = js.native
    
    /**
      * Serializes the sprite to a JSON object
      * @returns the JSON object
      */
    def serialize(): Any = js.native
    
    /**
      * Gets or sets the sprite size
      */
    def size: Double = js.native
    def size_=(value: Double): Unit = js.native
    
    def toIndex_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the unique id of the sprite
      */
    var uniqueId: Double = js.native
    
    /** Gets or sets a boolean indicating that sprite texture alpha will be used for precise picking (false by default) */
    var useAlphaForPicking: Boolean = js.native
  }
  /* static members */
  object Sprite {
    
    @JSImport("babylonjs/Sprites/sprite", "Sprite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a JSON object to create a new sprite
      * @param parsedSprite The JSON object to parse
      * @param manager defines the hosting manager
      * @returns the new sprite
      */
    inline def Parse(parsedSprite: Any, manager: SpriteManager): Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSprite.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[Sprite]
  }
}

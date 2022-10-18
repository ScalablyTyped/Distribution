package typings.blackEngine

import typings.blackEngine.animationAnimationInfoMod.AnimationInfo
import typings.blackEngine.coreComponentMod.Component
import typings.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationAnimationControllerMod {
  
  @JSImport("black-engine/animation/AnimationController", "AnimationController")
  @js.native
  open class AnimationController () extends Component {
    
    def add(name: String, textures: js.Array[Texture]): AnimationInfo = js.native
    def add(name: String, textures: js.Array[Texture], fps: Double): AnimationInfo = js.native
    def add(name: String, textures: js.Array[Texture], fps: Double, loop: Boolean): AnimationInfo = js.native
    def add(name: String, textures: js.Array[Texture], fps: Unit, loop: Boolean): AnimationInfo = js.native
    
    def currentAnimation: AnimationInfo = js.native
    
    def getByName(name: String): AnimationInfo = js.native
    
    /* private */ var mAnimations: Any = js.native
    
    /* private */ var mCurrentAnim: Any = js.native
    
    def pause(): Unit = js.native
    
    def play(name: String): Unit = js.native
    
    def remove(name: String): Unit = js.native
    
    def stop(): Unit = js.native
  }
}

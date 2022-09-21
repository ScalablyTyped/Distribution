package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISpriteManager
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Sprite")
@js.native
open class Sprite protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: String, manager: ISpriteManager) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object Sprite {
  
  @JSGlobal("BABYLON.Sprite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON object to create a new sprite
    * @param parsedSprite The JSON object to parse
    * @param manager defines the hosting manager
    * @returns the new sprite
    */
  inline def Parse(parsedSprite: Any, manager: typings.babylonjs.BABYLON.SpriteManager): typings.babylonjs.BABYLON.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSprite.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Sprite]
}

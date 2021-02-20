package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISpriteManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Sprite")
@js.native
class Sprite protected ()
  extends typings.babylonjs.BABYLON.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: String, manager: ISpriteManager) = this()
}
/* static members */
object Sprite {
  
  /**
    * Parses a JSON object to create a new sprite
    * @param parsedSprite The JSON object to parse
    * @param manager defines the hosting manager
    * @returns the new sprite
    */
  @JSGlobal("BABYLON.Sprite.Parse")
  @js.native
  def Parse(parsedSprite: js.Any, manager: typings.babylonjs.BABYLON.SpriteManager): typings.babylonjs.BABYLON.Sprite = js.native
}

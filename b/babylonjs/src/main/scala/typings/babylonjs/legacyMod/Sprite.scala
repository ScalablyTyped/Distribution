package typings.babylonjs.legacyMod

import typings.babylonjs.spriteManagerMod.ISpriteManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Sprite")
@js.native
open class Sprite protected ()
  extends typings.babylonjs.indexMod.Sprite {
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
  
  @JSImport("babylonjs/Legacy/legacy", "Sprite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON object to create a new sprite
    * @param parsedSprite The JSON object to parse
    * @param manager defines the hosting manager
    * @returns the new sprite
    */
  inline def Parse(parsedSprite: Any, manager: typings.babylonjs.spriteManagerMod.SpriteManager): typings.babylonjs.spriteMod.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSprite.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.spriteMod.Sprite]
}

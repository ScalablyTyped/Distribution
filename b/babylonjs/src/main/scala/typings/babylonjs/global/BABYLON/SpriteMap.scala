package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISpriteJSONAtlas
import typings.babylonjs.BABYLON.ISpriteMapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SpriteMap")
@js.native
open class SpriteMap protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SpriteMap {
  /**
    * Creates a new SpriteMap
    * @param name defines the SpriteMaps Name
    * @param atlasJSON is the JSON file that controls the Sprites Frames and Meta
    * @param spriteSheet is the Texture that the Sprites are on.
    * @param options a basic deployment configuration
    * @param scene The Scene that the map is deployed on
    */
  def this(
    name: String,
    atlasJSON: ISpriteJSONAtlas,
    spriteSheet: typings.babylonjs.BABYLON.Texture,
    options: ISpriteMapOptions,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  
  /**
    * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
    */
  /* CompleteClass */
  var atlasJSON: ISpriteJSONAtlas = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * String name of the SpriteMap.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The parameters to initialize the SpriteMap with.
    */
  /* CompleteClass */
  var options: ISpriteMapOptions = js.native
  
  /**
    * Texture of the SpriteMap.
    */
  /* CompleteClass */
  var spriteSheet: typings.babylonjs.BABYLON.Texture = js.native
}

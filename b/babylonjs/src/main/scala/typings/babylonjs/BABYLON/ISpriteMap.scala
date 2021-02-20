package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteMap extends IDisposable {
  
  /**
    * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
    */
  var atlasJSON: ISpriteJSONAtlas = js.native
  
  /**
    * String name of the SpriteMap.
    */
  var name: String = js.native
  
  /**
    * The parameters to initialize the SpriteMap with.
    */
  var options: ISpriteMapOptions = js.native
  
  /**
    * Texture of the SpriteMap.
    */
  var spriteSheet: Texture = js.native
}
object ISpriteMap {
  
  @scala.inline
  def apply(
    atlasJSON: ISpriteJSONAtlas,
    dispose: () => Unit,
    name: String,
    options: ISpriteMapOptions,
    spriteSheet: Texture
  ): ISpriteMap = {
    val __obj = js.Dynamic.literal(atlasJSON = atlasJSON.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], spriteSheet = spriteSheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteMap]
  }
  
  @scala.inline
  implicit class ISpriteMapMutableBuilder[Self <: ISpriteMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtlasJSON(value: ISpriteJSONAtlas): Self = StObject.set(x, "atlasJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ISpriteMapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteSheet(value: Texture): Self = StObject.set(x, "spriteSheet", value.asInstanceOf[js.Any])
  }
}

package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteJSONSprite extends StObject {
  
  /**
    * string name of the Frame
    */
  var filename: String = js.native
  
  /**
    * ISpriteJSONSpriteFrame basic object of the frame data
    */
  var frame: ISpriteJSONSpriteFrameData = js.native
  
  /**
    * boolean to flag is the frame was rotated.
    */
  var rotated: Boolean = js.native
  
  /**
    * ISpriteJSONSpriteFrame basic object of the source data
    */
  var sourceSize: ISpriteJSONSpriteSourceSize = js.native
  
  /**
    * ISpriteJSONSpriteFrame basic object of the source data
    */
  var spriteSourceSize: ISpriteJSONSpriteFrameData = js.native
  
  /**
    * boolean to flag is the frame was trimmed.
    */
  var trimmed: Boolean = js.native
}
object ISpriteJSONSprite {
  
  @scala.inline
  def apply(
    filename: String,
    frame: ISpriteJSONSpriteFrameData,
    rotated: Boolean,
    sourceSize: ISpriteJSONSpriteSourceSize,
    spriteSourceSize: ISpriteJSONSpriteFrameData,
    trimmed: Boolean
  ): ISpriteJSONSprite = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], rotated = rotated.asInstanceOf[js.Any], sourceSize = sourceSize.asInstanceOf[js.Any], spriteSourceSize = spriteSourceSize.asInstanceOf[js.Any], trimmed = trimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSprite]
  }
  
  @scala.inline
  implicit class ISpriteJSONSpriteMutableBuilder[Self <: ISpriteJSONSprite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: ISpriteJSONSpriteFrameData): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSize(value: ISpriteJSONSpriteSourceSize): Self = StObject.set(x, "sourceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteSourceSize(value: ISpriteJSONSpriteFrameData): Self = StObject.set(x, "spriteSourceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimmed(value: Boolean): Self = StObject.set(x, "trimmed", value.asInstanceOf[js.Any])
  }
}

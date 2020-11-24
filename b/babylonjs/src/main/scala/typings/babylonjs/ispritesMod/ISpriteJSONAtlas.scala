package typings.babylonjs.ispritesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteJSONAtlas extends js.Object {
  
  /**
    * Array of objects that contain the frame data.
    */
  var frames: js.Array[ISpriteJSONSprite] = js.native
  
  /**
    * object basic object containing the sprite meta data.
    */
  var meta: js.UndefOr[js.Object] = js.native
}
object ISpriteJSONAtlas {
  
  @scala.inline
  def apply(frames: js.Array[ISpriteJSONSprite]): ISpriteJSONAtlas = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONAtlas]
  }
  
  @scala.inline
  implicit class ISpriteJSONAtlasOps[Self <: ISpriteJSONAtlas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFramesVarargs(value: ISpriteJSONSprite*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[ISpriteJSONSprite]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
}

package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ispritesMod {
  
  @js.native
  trait ISpriteJSONAtlas extends StObject {
    
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
    implicit class ISpriteJSONAtlasMutableBuilder[Self <: ISpriteJSONAtlas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: js.Array[ISpriteJSONSprite]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: ISpriteJSONSprite*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
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
  
  @js.native
  trait ISpriteJSONSpriteFrameData extends StObject {
    
    /**
      * number of the height of the Frame
      */
    var h: Double = js.native
    
    /**
      * number of the width of the Frame
      */
    var w: Double = js.native
    
    /**
      * number of the x offset of the Frame
      */
    var x: Double = js.native
    
    /**
      * number of the y offset of the Frame
      */
    var y: Double = js.native
  }
  object ISpriteJSONSpriteFrameData {
    
    @scala.inline
    def apply(h: Double, w: Double, x: Double, y: Double): ISpriteJSONSpriteFrameData = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpriteJSONSpriteFrameData]
    }
    
    @scala.inline
    implicit class ISpriteJSONSpriteFrameDataMutableBuilder[Self <: ISpriteJSONSpriteFrameData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpriteJSONSpriteSourceSize extends StObject {
    
    /**
      * number of the original height of the Frame
      */
    var h: Double = js.native
    
    /**
      * number of the original width of the Frame
      */
    var w: Double = js.native
  }
  object ISpriteJSONSpriteSourceSize {
    
    @scala.inline
    def apply(h: Double, w: Double): ISpriteJSONSpriteSourceSize = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpriteJSONSpriteSourceSize]
    }
    
    @scala.inline
    implicit class ISpriteJSONSpriteSourceSizeMutableBuilder[Self <: ISpriteJSONSpriteSourceSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}

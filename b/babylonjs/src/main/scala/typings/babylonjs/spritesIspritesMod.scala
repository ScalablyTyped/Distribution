package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spritesIspritesMod {
  
  trait ISpriteJSONAtlas extends StObject {
    
    /**
      * Array of objects that contain the frame data.
      */
    var frames: js.Array[ISpriteJSONSprite]
    
    /**
      * object basic object containing the sprite meta data.
      */
    var meta: js.UndefOr[js.Object] = js.undefined
  }
  object ISpriteJSONAtlas {
    
    inline def apply(frames: js.Array[ISpriteJSONSprite]): ISpriteJSONAtlas = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpriteJSONAtlas]
    }
    
    extension [Self <: ISpriteJSONAtlas](x: Self) {
      
      inline def setFrames(value: js.Array[ISpriteJSONSprite]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: ISpriteJSONSprite*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait ISpriteJSONSprite extends StObject {
    
    /**
      * string name of the Frame
      */
    var filename: String
    
    /**
      * ISpriteJSONSpriteFrame basic object of the frame data
      */
    var frame: ISpriteJSONSpriteFrameData
    
    /**
      * boolean to flag is the frame was rotated.
      */
    var rotated: Boolean
    
    /**
      * ISpriteJSONSpriteFrame basic object of the source data
      */
    var sourceSize: ISpriteJSONSpriteSourceSize
    
    /**
      * ISpriteJSONSpriteFrame basic object of the source data
      */
    var spriteSourceSize: ISpriteJSONSpriteFrameData
    
    /**
      * boolean to flag is the frame was trimmed.
      */
    var trimmed: Boolean
  }
  object ISpriteJSONSprite {
    
    inline def apply(
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
    
    extension [Self <: ISpriteJSONSprite](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFrame(value: ISpriteJSONSpriteFrameData): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
      
      inline def setSourceSize(value: ISpriteJSONSpriteSourceSize): Self = StObject.set(x, "sourceSize", value.asInstanceOf[js.Any])
      
      inline def setSpriteSourceSize(value: ISpriteJSONSpriteFrameData): Self = StObject.set(x, "spriteSourceSize", value.asInstanceOf[js.Any])
      
      inline def setTrimmed(value: Boolean): Self = StObject.set(x, "trimmed", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpriteJSONSpriteFrameData extends StObject {
    
    /**
      * number of the height of the Frame
      */
    var h: Double
    
    /**
      * number of the width of the Frame
      */
    var w: Double
    
    /**
      * number of the x offset of the Frame
      */
    var x: Double
    
    /**
      * number of the y offset of the Frame
      */
    var y: Double
  }
  object ISpriteJSONSpriteFrameData {
    
    inline def apply(h: Double, w: Double, x: Double, y: Double): ISpriteJSONSpriteFrameData = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpriteJSONSpriteFrameData]
    }
    
    extension [Self <: ISpriteJSONSpriteFrameData](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpriteJSONSpriteSourceSize extends StObject {
    
    /**
      * number of the original height of the Frame
      */
    var h: Double
    
    /**
      * number of the original width of the Frame
      */
    var w: Double
  }
  object ISpriteJSONSpriteSourceSize {
    
    inline def apply(h: Double, w: Double): ISpriteJSONSpriteSourceSize = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpriteJSONSpriteSourceSize]
    }
    
    extension [Self <: ISpriteJSONSpriteSourceSize](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}

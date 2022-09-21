package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameMod {
  
  @JSImport("babylonjs/Materials/Textures/Packer/frame", "TexturePackerFrame")
  @js.native
  open class TexturePackerFrame protected ()
    extends StObject
       with ITexturePackerFrame {
    /**
      * Initializes a texture package frame.
      * @param id The numerical frame identifier
      * @param scale Scalar Vector2 for UV frame
      * @param offset Vector2 for the frame position in UV units.
      * @returns TexturePackerFrame
      */
    def this(id: Double, scale: Vector2, offset: Vector2) = this()
    
    /**
      * The frame ID
      */
    /* CompleteClass */
    var id: Double = js.native
    
    /**
      * The Frames offset
      */
    /* CompleteClass */
    var offset: Vector2 = js.native
    
    /**
      * The frames Scale
      */
    /* CompleteClass */
    var scale: Vector2 = js.native
  }
  
  trait ITexturePackerFrame extends StObject {
    
    /**
      * The frame ID
      */
    var id: Double
    
    /**
      * The Frames offset
      */
    var offset: Vector2
    
    /**
      * The frames Scale
      */
    var scale: Vector2
  }
  object ITexturePackerFrame {
    
    inline def apply(id: Double, offset: Vector2, scale: Vector2): ITexturePackerFrame = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITexturePackerFrame]
    }
    
    extension [Self <: ITexturePackerFrame](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Vector2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Vector2): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
}

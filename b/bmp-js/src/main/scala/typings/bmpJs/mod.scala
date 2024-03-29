package typings.bmpJs

import typings.bmpJs.anon.Blue
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bmp-js", "BmpDecoder")
  @js.native
  open class BmpDecoder protected ()
    extends StObject
       with ImageData {
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, is_with_alpha: Boolean) = this()
    
    /* private */ def bit1(): Unit = js.native
    
    /* private */ def bit15(): Unit = js.native
    
    /* private */ def bit16(): Unit = js.native
    
    /* private */ def bit24(): Unit = js.native
    
    /* private */ def bit32(): Unit = js.native
    
    /* private */ def bit4(): Unit = js.native
    
    /* private */ def bit8(): Unit = js.native
    
    var bitPP: Double = js.native
    
    var bottom_up: Boolean = js.native
    
    var colors: Double = js.native
    
    var compress: Double = js.native
    
    /* CompleteClass */
    override val data: Buffer = js.native
    
    var fileSize: Double = js.native
    
    /**
      * Returns the data buffer - byte array order by ABGR ABGR ABGR,4 bytes per pixel
      */
    def getData(): Buffer = js.native
    
    var headerSize: Double = js.native
    
    /* CompleteClass */
    override val height: Double = js.native
    
    var hr: Double = js.native
    
    var importantColors: Double = js.native
    
    var offset: Double = js.native
    
    var palette: js.Array[Blue] = js.native
    
    /* private */ def parseHeader(): Unit = js.native
    
    /* private */ def parseRGBA(): Unit = js.native
    
    var planes: Double = js.native
    
    /* private */ var pos: Double = js.native
    
    var rawSize: Double = js.native
    
    var reserved: Double = js.native
    
    var vr: Double = js.native
    
    /* CompleteClass */
    override val width: Double = js.native
  }
  
  @JSImport("bmp-js", "decode")
  @js.native
  val decode: Decode_ = js.native
  
  @JSImport("bmp-js", "encode")
  @js.native
  val encode: Encode_ = js.native
  
  type Decode_ = js.Function1[/* bmpData */ Buffer, BmpDecoder]
  
  type Encode_ = js.Function2[/* imgData */ ImageData, /* quality */ js.UndefOr[Double], ImageData]
  
  trait ImageData extends StObject {
    
    val data: Buffer
    
    val height: Double
    
    val width: Double
  }
  object ImageData {
    
    inline def apply(data: Buffer, height: Double, width: Double): ImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

package typings.decodeGif

import typings.std.ArrayLike
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Decode the frames of a gif.
  @param data The gif data. Can be anything array-like such as a `Buffer`, `Array` or `Uint8Array`.
  @example
  ```
  const fs = require("fs");
  const decodeGif = require("decode-gif");
  decodeGif(fs.readFileSync("unicorn.gif"));
  / *
  {
    width: 220,
    height: 165,
    frames: [
    { timeCode: 0, data: [Uint8ClampedArray] },
  	{ timeCode: 10, data: [Uint8ClampedArray] },
  	...
    ]
  }
  *\/
  ```
  */
  @JSImport("decode-gif", JSImport.Namespace)
  @js.native
  def apply(data: ArrayLike[Double]): ResultType = js.native
  
  @js.native
  trait FrameType extends StObject {
    
    /** The frame data. */
    var data: Uint8ClampedArray = js.native
    
    /** The time code in milliseconds that the frame appears at. */
    var timeCode: Double = js.native
  }
  object FrameType {
    
    @scala.inline
    def apply(data: Uint8ClampedArray, timeCode: Double): FrameType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timeCode = timeCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameType]
    }
    
    @scala.inline
    implicit class FrameTypeMutableBuilder[Self <: FrameType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCode(value: Double): Self = StObject.set(x, "timeCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResultType extends StObject {
    
    /** Each frame of the gif. */
    var frames: js.Array[FrameType] = js.native
    
    /** The height of the gif. */
    var height: Double = js.native
    
    /** The width of the gif. */
    var width: Double = js.native
  }
  object ResultType {
    
    @scala.inline
    def apply(frames: js.Array[FrameType], height: Double, width: Double): ResultType = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultType]
    }
    
    @scala.inline
    implicit class ResultTypeMutableBuilder[Self <: ResultType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: js.Array[FrameType]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: FrameType*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

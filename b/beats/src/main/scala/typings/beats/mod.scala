package typings.beats

import typings.std.Float32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(bins: js.Array[Bin]): js.Function2[
    /* frequencies */ Uint8Array | Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    Float32Array
  ] = ^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* frequencies */ Uint8Array | Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    Float32Array
  ]]
  @scala.inline
  def apply(bins: js.Array[Bin], minSeparation: Double): js.Function2[
    /* frequencies */ Uint8Array | Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    Float32Array
  ] = (^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any], minSeparation.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* frequencies */ Uint8Array | Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    Float32Array
  ]]
  
  @JSImport("beats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Bin extends StObject {
    
    var decay: Double
    
    var hi: Double
    
    var lo: Double
    
    var threshold: Double
  }
  object Bin {
    
    @scala.inline
    def apply(decay: Double, hi: Double, lo: Double, threshold: Double): Bin = {
      val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bin]
    }
    
    @scala.inline
    implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHi(value: Double): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLo(value: Double): Self = StObject.set(x, "lo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
}

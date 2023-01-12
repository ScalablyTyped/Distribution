package typings.beats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(bins: js.Array[Bin]): js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
  ] = ^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
  ]]
  inline def apply(bins: js.Array[Bin], minSeparation: Double): js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
  ] = (^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any], minSeparation.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
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
    
    inline def apply(decay: Double, hi: Double, lo: Double, threshold: Double): Bin = {
      val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
      
      inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setHi(value: Double): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
      
      inline def setLo(value: Double): Self = StObject.set(x, "lo", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
}

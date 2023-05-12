package typings.blobshape

import typings.blobshape.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Path = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Path]
  inline def apply(param0: BlobshapeParameters): Path = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  @JSImport("blobshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BlobshapeParameters extends StObject {
    
    var edges: js.UndefOr[Double] = js.undefined
    
    var growth: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[String | Null] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object BlobshapeParameters {
    
    inline def apply(): BlobshapeParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobshapeParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlobshapeParameters] (val x: Self) extends AnyVal {
      
      inline def setEdges(value: Double): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setGrowth(value: Double): Self = StObject.set(x, "growth", value.asInstanceOf[js.Any])
      
      inline def setGrowthUndefined: Self = StObject.set(x, "growth", js.undefined)
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedNull: Self = StObject.set(x, "seed", null)
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

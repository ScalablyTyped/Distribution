package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.MarkDef
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.encoding
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.visual
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/offset.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionOffset(hasBaseChannelMarkDefEncodingModelBandPosition: MarkDef): Offset = ^.asInstanceOf[js.Dynamic].applyDynamic("positionOffset")(hasBaseChannelMarkDefEncodingModelBandPosition.asInstanceOf[js.Any]).asInstanceOf[Offset]
  
  trait Offset extends StObject {
    
    var offset: js.UndefOr[Double | VgValueRef] = js.undefined
    
    var offsetType: js.UndefOr[visual | encoding] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetType(value: visual | encoding): Self = StObject.set(x, "offsetType", value.asInstanceOf[js.Any])
      
      inline def setOffsetTypeUndefined: Self = StObject.set(x, "offsetType", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}

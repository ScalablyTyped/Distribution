package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.specBaseDTsMod.LayoutSizeMixins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var encoding: typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding[String]
  
  var size: LayoutSizeMixins
}
object Size {
  
  inline def apply(encoding: typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding[String], size: LayoutSizeMixins): Size = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setEncoding(value: typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setSize(value: LayoutSizeMixins): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

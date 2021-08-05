package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: Double
  
  var unclampedSize: Double
}
object Size {
  
  inline def apply(size: Double, unclampedSize: Double): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], unclampedSize = unclampedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUnclampedSize(value: Double): Self = StObject.set(x, "unclampedSize", value.asInstanceOf[js.Any])
  }
}

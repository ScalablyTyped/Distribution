package typings.bip38

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compressed extends StObject {
    
    var compressed: Boolean
    
    var privateKey: Buffer
  }
  object Compressed {
    
    inline def apply(compressed: Boolean, privateKey: Buffer): Compressed = {
      val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compressed]
    }
    
    extension [Self <: Compressed](x: Self) {
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
}

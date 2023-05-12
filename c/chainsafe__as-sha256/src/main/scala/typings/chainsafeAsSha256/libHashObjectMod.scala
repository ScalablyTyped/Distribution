package typings.chainsafeAsSha256

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHashObjectMod {
  
  @JSImport("@chainsafe/as-sha256/lib/hashObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byteArrayToHashObject(byteArr: js.typedarray.Uint8Array): HashObject = ^.asInstanceOf[js.Dynamic].applyDynamic("byteArrayToHashObject")(byteArr.asInstanceOf[js.Any]).asInstanceOf[HashObject]
  
  inline def hashObjectToByteArray(obj: HashObject, byteArr: js.typedarray.Uint8Array, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashObjectToByteArray")(obj.asInstanceOf[js.Any], byteArr.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HashObject extends StObject {
    
    var h0: Double
    
    var h1: Double
    
    var h2: Double
    
    var h3: Double
    
    var h4: Double
    
    var h5: Double
    
    var h6: Double
    
    var h7: Double
  }
  object HashObject {
    
    inline def apply(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double, h5: Double, h6: Double, h7: Double): HashObject = {
      val __obj = js.Dynamic.literal(h0 = h0.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], h7 = h7.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashObject] (val x: Self) extends AnyVal {
      
      inline def setH0(value: Double): Self = StObject.set(x, "h0", value.asInstanceOf[js.Any])
      
      inline def setH1(value: Double): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: Double): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: Double): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: Double): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: Double): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: Double): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH7(value: Double): Self = StObject.set(x, "h7", value.asInstanceOf[js.Any])
    }
  }
}

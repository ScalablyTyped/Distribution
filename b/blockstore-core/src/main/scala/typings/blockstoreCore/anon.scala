package typings.blockstoreCore

import typings.blockstoreCore.blockstoreCoreInts.`1`
import typings.blockstoreCore.blockstoreCoreInts.`85`
import typings.multiformats.cidMod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: CID[Any, `85`, Double, `1`]
    
    var value: js.typedarray.Uint8Array
  }
  object Key {
    
    inline def apply(key: CID[Any, `85`, Double, `1`], value: js.typedarray.Uint8Array): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: CID[Any, `85`, Double, `1`]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

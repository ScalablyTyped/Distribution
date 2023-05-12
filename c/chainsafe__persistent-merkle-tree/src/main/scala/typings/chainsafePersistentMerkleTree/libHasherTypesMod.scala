package typings.chainsafePersistentMerkleTree

import typings.chainsafeAsSha256.libHashObjectMod.HashObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHasherTypesMod {
  
  trait Hasher extends StObject {
    
    /**
      * Hash two 32-byte Uint8Arrays
      */
    def digest64(a32Bytes: js.typedarray.Uint8Array, b32Bytes: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    /**
      * Hash two 32-byte HashObjects
      */
    def digest64HashObjects(a: HashObject, b: HashObject): HashObject
  }
  object Hasher {
    
    inline def apply(
      digest64: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      digest64HashObjects: (HashObject, HashObject) => HashObject
    ): Hasher = {
      val __obj = js.Dynamic.literal(digest64 = js.Any.fromFunction2(digest64), digest64HashObjects = js.Any.fromFunction2(digest64HashObjects))
      __obj.asInstanceOf[Hasher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hasher] (val x: Self) extends AnyVal {
      
      inline def setDigest64(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = StObject.set(x, "digest64", js.Any.fromFunction2(value))
      
      inline def setDigest64HashObjects(value: (HashObject, HashObject) => HashObject): Self = StObject.set(x, "digest64HashObjects", js.Any.fromFunction2(value))
    }
  }
}

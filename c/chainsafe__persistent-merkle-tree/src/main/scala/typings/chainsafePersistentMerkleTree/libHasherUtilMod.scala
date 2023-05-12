package typings.chainsafePersistentMerkleTree

import typings.chainsafeAsSha256.libHashObjectMod.HashObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHasherUtilMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/hasher/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hashObjectToUint8Array(obj: HashObject): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashObjectToUint8Array")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def uint8ArrayToHashObject(byteArr: js.typedarray.Uint8Array): HashObject = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8ArrayToHashObject")(byteArr.asInstanceOf[js.Any]).asInstanceOf[HashObject]
}

package typings.chainsafePersistentMerkleTree

import typings.chainsafeAsSha256.libHashObjectMod.HashObject
import typings.chainsafePersistentMerkleTree.libHasherTypesMod.Hasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHasherMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/hasher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hashObjectToUint8Array(obj: HashObject): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashObjectToUint8Array")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/hasher", "hasher")
  @js.native
  def hasher: Hasher = js.native
  inline def hasher_=(x: Hasher): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasher")(x.asInstanceOf[js.Any])
  
  inline def setHasher(newHasher: Hasher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHasher")(newHasher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def uint8ArrayToHashObject(byteArr: js.typedarray.Uint8Array): HashObject = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8ArrayToHashObject")(byteArr.asInstanceOf[js.Any]).asInstanceOf[HashObject]
}

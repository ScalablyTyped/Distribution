package typings.chainsafeAsSha256

import typings.chainsafeAsSha256.libHashObjectMod.HashObject
import typings.chainsafeAsSha256.libSha256Mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chainsafe/as-sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/as-sha256", "SHA256")
  @js.native
  open class SHA256 () extends default
  
  inline def byteArrayToHashObject(byteArr: js.typedarray.Uint8Array): HashObject = ^.asInstanceOf[js.Dynamic].applyDynamic("byteArrayToHashObject")(byteArr.asInstanceOf[js.Any]).asInstanceOf[HashObject]
  
  inline def digest(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def digest2Bytes32(bytes1: js.typedarray.Uint8Array, bytes2: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("digest2Bytes32")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def digest64(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("digest64")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def digest64HashObjects(obj1: HashObject, obj2: HashObject): HashObject = (^.asInstanceOf[js.Dynamic].applyDynamic("digest64HashObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[HashObject]
  
  inline def hashObjectToByteArray(obj: HashObject, byteArr: js.typedarray.Uint8Array, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashObjectToByteArray")(obj.asInstanceOf[js.Any], byteArr.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

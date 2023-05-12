package typings.dagJose

import typings.dagJose.libEncryptionMod.DagJWE
import typings.dagJose.libEncryptionMod.EncodedJWE
import typings.dagJose.libSigningMod.DagJWS
import typings.dagJose.libSigningMod.EncodedJWS
import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dag-jose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dag-jose", "code")
  @js.native
  val code: /* 133 */ Double = js.native
  
  inline def decode(data: ByteView[EncodedJWS | EncodedJWE]): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
  
  inline def encode(obj: String): ByteView[EncodedJWS | EncodedJWE] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[ByteView[EncodedJWS | EncodedJWE]]
  inline def encode(obj: DagJWE): ByteView[EncodedJWS | EncodedJWE] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[ByteView[EncodedJWS | EncodedJWE]]
  inline def encode(obj: DagJWS): ByteView[EncodedJWS | EncodedJWE] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[ByteView[EncodedJWS | EncodedJWE]]
  
  @JSImport("dag-jose", "name")
  @js.native
  val name: /* "dag-jose" */ String = js.native
  
  inline def toGeneral(jose: String): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneral")(jose.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
  inline def toGeneral(jose: DagJWE): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneral")(jose.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
  inline def toGeneral(jose: DagJWS): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneral")(jose.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
}

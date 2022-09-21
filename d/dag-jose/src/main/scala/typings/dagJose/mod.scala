package typings.dagJose

import typings.dagJose.encryptionMod.DagJWE
import typings.dagJose.signingMod.DagJWS
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
  
  inline def decode(
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteView<EncodedJWS | EncodedJWE> */ Any
  ): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
  
  inline def encode(obj: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def encode(obj: DagJWE): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def encode(obj: DagJWS): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("dag-jose", "name")
  @js.native
  val name: /* "dag-jose" */ String = js.native
  
  inline def toGeneral(jose: String): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneral")(jose.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
  inline def toGeneral(jose: DagJWE): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneral")(jose.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
  inline def toGeneral(jose: DagJWS): DagJWS | DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneral")(jose.asInstanceOf[js.Any]).asInstanceOf[DagJWS | DagJWE]
}

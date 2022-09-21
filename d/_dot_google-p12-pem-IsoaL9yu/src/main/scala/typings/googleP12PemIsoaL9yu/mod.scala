package typings.googleP12PemIsoaL9yu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport(".google-p12-pem-IsoaL9yu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPem(filename: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPem")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getPem(filename: String, callback: js.Function2[/* err */ js.Error | Null, /* pem */ String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPem")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.createCert

import typings.pem.mod.CertificateCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[CertificateData] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[CertificateData]]
  inline def apply(opts: String): js.Promise[CertificateData] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CertificateData]]
  inline def apply(opts: Options): js.Promise[CertificateData] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CertificateData]]
  
  @JSImport("create-cert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CertificateData extends StObject {
    
    var caCert: String
    
    var cert: String
    
    var key: String
  }
  object CertificateData {
    
    inline def apply(caCert: String, cert: String, key: String): CertificateData = {
      val __obj = js.Dynamic.literal(caCert = caCert.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateData]
    }
    
    extension [Self <: CertificateData](x: Self) {
      
      inline def setCaCert(value: String): Self = StObject.set(x, "caCert", value.asInstanceOf[js.Any])
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with CertificateCreationOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
}

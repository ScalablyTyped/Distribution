package typings.aws4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws4", "RequestSigner")
  @js.native
  class RequestSigner () extends StObject {
    def this(request: js.Any) = this()
    def this(request: js.Any, credentials: js.Any) = this()
    def this(request: Unit, credentials: js.Any) = this()
    
    def authHeader(): String = js.native
    
    def canonicalHeaders(): String = js.native
    
    def canonicalString(): String = js.native
    
    def createHost(): String = js.native
    
    def credentialString(): String = js.native
    
    var credentials: js.Any = js.native
    
    def defaultCredentials(): js.Any = js.native
    
    def formatPath(): String = js.native
    
    def getDate(): String = js.native
    
    def getDateTime(): String = js.native
    
    var isCodeCommitGit: js.Any = js.native
    
    def isSingleRegion(): Boolean = js.native
    
    def matchHost(): String = js.native
    def matchHost(host: String): String = js.native
    
    def parsePath(): js.Any = js.native
    
    def prepareRequest(): Unit = js.native
    
    var region: js.Any = js.native
    
    var request: js.Any = js.native
    
    var service: js.Any = js.native
    
    def sign(): js.Any = js.native
    
    def signature(): String = js.native
    
    def signedHeaders(): String = js.native
    
    def stringToSign(): String = js.native
  }
  
  @scala.inline
  def sign(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")().asInstanceOf[js.Any]
  @scala.inline
  def sign(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def sign(options: js.Any, credentials: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def sign(options: Unit, credentials: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}

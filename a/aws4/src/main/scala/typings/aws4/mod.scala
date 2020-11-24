package typings.aws4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws4", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def sign(): js.Any = js.native
  def sign(options: js.UndefOr[scala.Nothing], credentials: js.Any): js.Any = js.native
  def sign(options: js.Any): js.Any = js.native
  def sign(options: js.Any, credentials: js.Any): js.Any = js.native
  
  @js.native
  class RequestSigner () extends js.Object {
    def this(request: js.Any) = this()
    def this(request: js.UndefOr[scala.Nothing], credentials: js.Any) = this()
    def this(request: js.Any, credentials: js.Any) = this()
    
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
}

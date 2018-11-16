package typings
package aws4Lib.aws4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws4", "RequestSigner")
@js.native
class RequestSigner () extends js.Object {
  def this(request: js.Any) = this()
  def this(request: js.Any, credentials: js.Any) = this()
  var credentials: js.Any = js.native
  var isCodeCommitGit: js.Any = js.native
  var region: js.Any = js.native
  var request: js.Any = js.native
  var service: js.Any = js.native
  def authHeader(): java.lang.String = js.native
  def canonicalHeaders(): java.lang.String = js.native
  def canonicalString(): java.lang.String = js.native
  def createHost(): java.lang.String = js.native
  def credentialString(): java.lang.String = js.native
  def defaultCredentials(): js.Any = js.native
  def formatPath(): java.lang.String = js.native
  def getDate(): java.lang.String = js.native
  def getDateTime(): java.lang.String = js.native
  def isSingleRegion(): scala.Boolean = js.native
  def matchHost(): java.lang.String = js.native
  def matchHost(host: java.lang.String): java.lang.String = js.native
  def parsePath(): js.Any = js.native
  def prepareRequest(): scala.Unit = js.native
  def sign(): js.Any = js.native
  def signature(): java.lang.String = js.native
  def signedHeaders(): java.lang.String = js.native
  def stringToSign(): java.lang.String = js.native
}


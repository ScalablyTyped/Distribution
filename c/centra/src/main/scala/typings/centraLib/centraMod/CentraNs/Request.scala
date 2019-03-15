package typings
package centraLib.centraMod.CentraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var compressionEnabled: scala.Boolean = js.native
  var coreOptions: nodeLib.httpMod.RequestOptions = js.native
  var data: java.lang.String | nodeLib.Buffer | scala.Null = js.native
  var method: java.lang.String = js.native
  var reqHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var sendDataAs: centraLib.centraLibStrings.form | centraLib.centraLibStrings.json | centraLib.centraLibStrings.buffer | scala.Null = js.native
  var streamEnabled: scala.Boolean = js.native
  var timeoutTime: scala.Double | scala.Null = js.native
  var url: nodeLib.urlMod.URL = js.native
  def body(data: js.Any): this.type = js.native
  @JSName("body")
  def body_buffer(data: js.Any, sendAs: centraLib.centraLibStrings.buffer): this.type = js.native
  @JSName("body")
  def body_form(data: js.Any, sendAs: centraLib.centraLibStrings.form): this.type = js.native
  @JSName("body")
  def body_json(data: js.Any, sendAs: centraLib.centraLibStrings.json): this.type = js.native
  def compress(): this.type = js.native
  def header(headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def header(key: java.lang.String, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option__defaultAgent(key: centraLib.centraLibStrings._defaultAgent, value: nodeLib.httpMod.Agent): this.type = js.native
  @JSName("option")
  def option_agent(key: centraLib.centraLibStrings.agent, value: nodeLib.httpMod.Agent): this.type = js.native
  @JSName("option")
  def option_agent(key: centraLib.centraLibStrings.agent, value: scala.Boolean): this.type = js.native
  @JSName("option")
  def option_auth(key: centraLib.centraLibStrings.auth, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: centraLib.centraLibStrings.defaultPort, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: centraLib.centraLibStrings.defaultPort, value: scala.Double): this.type = js.native
  @JSName("option")
  def option_family(key: centraLib.centraLibStrings.family, value: scala.Double): this.type = js.native
  @JSName("option")
  def option_headers(key: centraLib.centraLibStrings.headers, value: nodeLib.httpMod.OutgoingHttpHeaders): this.type = js.native
  @JSName("option")
  def option_host(key: centraLib.centraLibStrings.host, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_hostname(key: centraLib.centraLibStrings.hostname, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_localAddress(key: centraLib.centraLibStrings.localAddress, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_method(key: centraLib.centraLibStrings.method, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_path(key: centraLib.centraLibStrings.path, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_port(key: centraLib.centraLibStrings.port, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_port(key: centraLib.centraLibStrings.port, value: scala.Double): this.type = js.native
  @JSName("option")
  def option_protocol(key: centraLib.centraLibStrings.protocol, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_setHost(key: centraLib.centraLibStrings.setHost, value: scala.Boolean): this.type = js.native
  @JSName("option")
  def option_socketPath(key: centraLib.centraLibStrings.socketPath, value: java.lang.String): this.type = js.native
  @JSName("option")
  def option_timeout(key: centraLib.centraLibStrings.timeout, value: scala.Double): this.type = js.native
  def path(relativePath: java.lang.String): this.type = js.native
  def query(key: java.lang.String, value: js.Any): this.type = js.native
  def query(params: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def send(): js.Promise[Response] = js.native
  def stream(): this.type = js.native
  def timeout(timeMs: scala.Double): this.type = js.native
}


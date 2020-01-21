package typings.cyberblastWebserver.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@cyberblast/webserver", "WebServer")
@js.native
class WebServer () extends js.Object {
  def this(webConfigFile: String) = this()
  def this(webConfigFile: String, logConfigFile: String) = this()
  def respondError(error: String, context: ServerContext): js.Promise[Unit] = js.native
  def respondError(error: String, context: ServerContext, code: Double): js.Promise[Unit] = js.native
  def respondError(error: String, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
  def respondError(error: Error, context: ServerContext): js.Promise[Unit] = js.native
  def respondError(error: Error, context: ServerContext, code: Double): js.Promise[Unit] = js.native
  def respondError(error: Error, context: ServerContext, code: Double, message: String): js.Promise[Unit] = js.native
  def start(): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
}


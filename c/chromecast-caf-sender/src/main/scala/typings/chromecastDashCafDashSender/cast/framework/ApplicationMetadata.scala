package typings.chromecastDashCafDashSender.cast.framework

import typings.chrome.chrome.cast.Image
import typings.chrome.chrome.cast.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.ApplicationMetadata")
@js.native
class ApplicationMetadata protected () extends js.Object {
  def this(sessionObj: Session) = this()
  var applicationId: String = js.native
  var images: js.Array[Image] = js.native
  var name: String = js.native
  var namespaces: js.Array[String] = js.native
}


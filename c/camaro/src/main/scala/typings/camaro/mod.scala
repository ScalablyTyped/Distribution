package typings.camaro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camaro", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def prettyPrint(xml: String): js.Promise[String] = js.native
  def prettyPrint(xml: String, opts: AnonIndentSize): js.Promise[String] = js.native
  def toJson(xml: String): js.Promise[_] = js.native
  def transform(xml: String, template: js.Object): js.Promise[_] = js.native
}


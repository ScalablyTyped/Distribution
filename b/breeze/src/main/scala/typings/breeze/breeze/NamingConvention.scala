package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.NamingConvention")
@js.native
class NamingConvention protected () extends js.Object {
  def this(config: NamingConventionOptions) = this()
  def clientPropertyNameToServer(clientPropertyName: String): String = js.native
  def clientPropertyNameToServer(clientPropertyName: String, property: IProperty): String = js.native
  def serverPropertyNameToClient(serverPropertyName: String): String = js.native
  def serverPropertyNameToClient(serverPropertyName: String, property: IProperty): String = js.native
  def setAsDefault(): NamingConvention = js.native
}

/* static members */
@JSGlobal("breeze.NamingConvention")
@js.native
object NamingConvention extends js.Object {
  var camelCase: NamingConvention = js.native
  var defaultInstance: NamingConvention = js.native
  var none: NamingConvention = js.native
}


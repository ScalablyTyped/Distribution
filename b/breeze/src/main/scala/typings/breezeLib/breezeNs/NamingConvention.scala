package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.NamingConvention")
@js.native
class NamingConvention protected () extends js.Object {
  def this(config: NamingConventionOptions) = this()
  def clientPropertyNameToServer(clientPropertyName: java.lang.String): java.lang.String = js.native
  def clientPropertyNameToServer(clientPropertyName: java.lang.String, property: IProperty): java.lang.String = js.native
  def serverPropertyNameToClient(serverPropertyName: java.lang.String): java.lang.String = js.native
  def serverPropertyNameToClient(serverPropertyName: java.lang.String, property: IProperty): java.lang.String = js.native
  def setAsDefault(): NamingConvention = js.native
}

/* static members */
@JSGlobal("breeze.NamingConvention")
@js.native
object NamingConvention extends js.Object {
  var camelCase: breezeLib.breezeNs.NamingConvention = js.native
  var defaultInstance: breezeLib.breezeNs.NamingConvention = js.native
  var none: breezeLib.breezeNs.NamingConvention = js.native
}


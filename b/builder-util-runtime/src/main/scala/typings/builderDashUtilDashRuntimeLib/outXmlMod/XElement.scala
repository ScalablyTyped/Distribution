package typings
package builderDashUtilDashRuntimeLib.outXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/xml", "XElement")
@js.native
class XElement protected () extends js.Object {
  def this(name: java.lang.String) = this()
  var attributes: ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null = js.native
  var elements: js.Array[XElement] | scala.Null = js.native
  var isCData: scala.Boolean = js.native
  val name: java.lang.String = js.native
  var value: java.lang.String = js.native
  def attribute(name: java.lang.String): java.lang.String = js.native
  def element(name: java.lang.String): XElement = js.native
  def element(name: java.lang.String, ignoreCase: scala.Boolean): XElement = js.native
  def element(name: java.lang.String, ignoreCase: scala.Boolean, errorIfMissed: java.lang.String): XElement = js.native
  def elementOrNull(name: java.lang.String): XElement | scala.Null = js.native
  def elementOrNull(name: java.lang.String, ignoreCase: scala.Boolean): XElement | scala.Null = js.native
  def elementValueOrEmpty(name: java.lang.String): java.lang.String = js.native
  def elementValueOrEmpty(name: java.lang.String, ignoreCase: scala.Boolean): java.lang.String = js.native
  def getElements(name: java.lang.String): js.Array[XElement] = js.native
  def getElements(name: java.lang.String, ignoreCase: scala.Boolean): js.Array[XElement] = js.native
  def removeAttribute(name: java.lang.String): scala.Unit = js.native
}


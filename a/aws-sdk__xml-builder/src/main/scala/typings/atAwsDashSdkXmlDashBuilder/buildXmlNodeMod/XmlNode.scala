package typings.atAwsDashSdkXmlDashBuilder.buildXmlNodeMod

import typings.atAwsDashSdkXmlDashBuilder.buildStringableMod.Stringable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/xml-builder/build/XmlNode", "XmlNode")
@js.native
class XmlNode protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, children: js.Array[Stringable]) = this()
  var attributes: js.Any = js.native
  val children: js.Array[Stringable] = js.native
  var name: js.Any = js.native
  def addAttribute(name: String, value: js.Any): XmlNode = js.native
  def addChildNode(child: Stringable): XmlNode = js.native
  def removeAttribute(name: String): XmlNode = js.native
}


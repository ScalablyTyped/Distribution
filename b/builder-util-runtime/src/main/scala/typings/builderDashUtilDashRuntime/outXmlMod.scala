package typings.builderDashUtilDashRuntime

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/xml", JSImport.Namespace)
@js.native
object outXmlMod extends js.Object {
  @js.native
  class XElement protected () extends js.Object {
    def this(name: String) = this()
    var attributes: StringDictionary[String] | Null = js.native
    var elements: js.Array[XElement] | Null = js.native
    var isCData: Boolean = js.native
    val name: String = js.native
    var value: String = js.native
    def attribute(name: String): String = js.native
    def element(name: String): XElement = js.native
    def element(name: String, ignoreCase: Boolean): XElement = js.native
    def element(name: String, ignoreCase: Boolean, errorIfMissed: String): XElement = js.native
    def elementOrNull(name: String): XElement | Null = js.native
    def elementOrNull(name: String, ignoreCase: Boolean): XElement | Null = js.native
    def elementValueOrEmpty(name: String): String = js.native
    def elementValueOrEmpty(name: String, ignoreCase: Boolean): String = js.native
    def getElements(name: String): js.Array[XElement] = js.native
    def getElements(name: String, ignoreCase: Boolean): js.Array[XElement] = js.native
    def removeAttribute(name: String): Unit = js.native
  }
  
  def parseXml(data: String): XElement = js.native
}


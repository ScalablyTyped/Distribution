package typings.awsSdkXmlBuilder

import typings.awsSdkXmlBuilder.stringableMod.Stringable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/xml-builder/dist/cjs/XmlNode", JSImport.Namespace)
@js.native
object xmlNodeMod extends js.Object {
  
  @js.native
  class XmlNode protected () extends js.Object {
    def this(name: String) = this()
    def this(name: String, children: js.Array[Stringable]) = this()
    
    def addAttribute(name: String, value: js.Any): XmlNode = js.native
    
    def addChildNode(child: Stringable): XmlNode = js.native
    
    var attributes: js.Any = js.native
    
    val children: js.Array[Stringable] = js.native
    
    var name: js.Any = js.native
    
    def removeAttribute(name: String): XmlNode = js.native
    
    def withName(name: String): XmlNode = js.native
  }
}

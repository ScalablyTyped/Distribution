package typings.awsSdkXmlBuilder

import typings.awsSdkXmlBuilder.stringableMod.Stringable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlNodeMod {
  
  @JSImport("@aws-sdk/xml-builder/dist/cjs/XmlNode", "XmlNode")
  @js.native
  class XmlNode protected () extends StObject {
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

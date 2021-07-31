package typings.awsSdkXmlBuilder

import typings.awsSdkXmlBuilder.stringableMod.Stringable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/xml-builder", "XmlNode")
  @js.native
  class XmlNode protected ()
    extends typings.awsSdkXmlBuilder.xmlNodeMod.XmlNode {
    def this(name: String) = this()
    def this(name: String, children: js.Array[Stringable]) = this()
  }
  
  @JSImport("@aws-sdk/xml-builder", "XmlText")
  @js.native
  class XmlText protected ()
    extends typings.awsSdkXmlBuilder.xmlTextMod.XmlText {
    def this(value: String) = this()
  }
}

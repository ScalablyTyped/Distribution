package typings.awsSdkXmlBuilder

import typings.awsSdkXmlBuilder.stringableMod.Stringable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlNodeMod {
  
  @JSImport("@aws-sdk/xml-builder/dist-types/XmlNode", "XmlNode")
  @js.native
  open class XmlNode protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, children: js.Array[Stringable]) = this()
    
    def addAttribute(name: String, value: Any): XmlNode = js.native
    
    def addChildNode(child: Stringable): XmlNode = js.native
    
    /* private */ var attributes: Any = js.native
    
    val children: js.Array[Stringable] = js.native
    
    /* private */ var name: Any = js.native
    
    def removeAttribute(name: String): XmlNode = js.native
    
    def withName(name: String): XmlNode = js.native
  }
  /* static members */
  object XmlNode {
    
    @JSImport("@aws-sdk/xml-builder/dist-types/XmlNode", "XmlNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def of(name: String): XmlNode = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any]).asInstanceOf[XmlNode]
    inline def of(name: String, childText: String): XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any])).asInstanceOf[XmlNode]
    inline def of(name: String, childText: String, withName: String): XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any], withName.asInstanceOf[js.Any])).asInstanceOf[XmlNode]
    inline def of(name: String, childText: Unit, withName: String): XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any], withName.asInstanceOf[js.Any])).asInstanceOf[XmlNode]
  }
}

package typings.awsSdkXmlBuilder

import typings.awsSdkXmlBuilder.distTypesStringableMod.Stringable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/xml-builder", "XmlNode")
  @js.native
  open class XmlNode protected ()
    extends typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode {
    def this(name: String) = this()
    def this(name: String, children: js.Array[Stringable]) = this()
  }
  /* static members */
  object XmlNode {
    
    @JSImport("@aws-sdk/xml-builder", "XmlNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def of(name: String): typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
    inline def of(name: String, childText: String): typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any])).asInstanceOf[typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
    inline def of(name: String, childText: String, withName: String): typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any], withName.asInstanceOf[js.Any])).asInstanceOf[typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
    inline def of(name: String, childText: Unit, withName: String): typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any], withName.asInstanceOf[js.Any])).asInstanceOf[typings.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
  }
  
  @JSImport("@aws-sdk/xml-builder", "XmlText")
  @js.native
  open class XmlText protected ()
    extends typings.awsSdkXmlBuilder.distTypesXmlTextMod.XmlText {
    def this(value: String) = this()
  }
}

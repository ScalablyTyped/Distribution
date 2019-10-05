package typings.atAwsDashSdkXmlDashBuilder

import typings.atAwsDashSdkXmlDashBuilder.buildStringableMod.Stringable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/xml-builder", JSImport.Namespace)
@js.native
object atAwsDashSdkXmlDashBuilderMod extends js.Object {
  @js.native
  class XmlNode protected ()
    extends typings.atAwsDashSdkXmlDashBuilder.buildXmlNodeMod.XmlNode {
    def this(name: String) = this()
    def this(name: String, children: js.Array[Stringable]) = this()
  }
  
  @js.native
  class XmlText protected ()
    extends typings.atAwsDashSdkXmlDashBuilder.buildXmlTextMod.XmlText {
    def this(value: String) = this()
  }
  
}


package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.shaderProcessingOptionsMod.ProcessingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/Processors/shaderCodeNode", JSImport.Namespace)
@js.native
object shaderCodeNodeMod extends js.Object {
  @js.native
  class ShaderCodeNode () extends js.Object {
    var additionalDefineKey: js.UndefOr[String] = js.native
    var additionalDefineValue: js.UndefOr[String] = js.native
    var children: js.Array[ShaderCodeNode] = js.native
    var line: String = js.native
    def isValid(preprocessors: StringDictionary[String]): Boolean = js.native
    def process(preprocessors: StringDictionary[String], options: ProcessingOptions): String = js.native
  }
  
}


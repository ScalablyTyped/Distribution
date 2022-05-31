package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.shaderProcessingOptionsMod.ProcessingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderCodeNodeMod {
  
  @JSImport("babylonjs/Engines/Processors/shaderCodeNode", "ShaderCodeNode")
  @js.native
  class ShaderCodeNode () extends StObject {
    
    var additionalDefineKey: js.UndefOr[String] = js.native
    
    var additionalDefineValue: js.UndefOr[String] = js.native
    
    var children: js.Array[ShaderCodeNode] = js.native
    
    def isValid(preprocessors: StringDictionary[String]): Boolean = js.native
    
    var line: String = js.native
    
    def process(preprocessors: StringDictionary[String], options: ProcessingOptions): String = js.native
  }
}

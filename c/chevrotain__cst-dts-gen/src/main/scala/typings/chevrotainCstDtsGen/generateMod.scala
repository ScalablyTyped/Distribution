package typings.chevrotainCstDtsGen

import typings.chevrotainCstDtsGen.anon.RequiredGenerateDtsOption
import typings.chevrotainCstDtsGen.modelMod.CstNodeTypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateMod {
  
  @JSImport("@chevrotain/cst-dts-gen/lib/src/generate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def genDts(model: js.Array[CstNodeTypeDefinition], options: RequiredGenerateDtsOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genDts")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}

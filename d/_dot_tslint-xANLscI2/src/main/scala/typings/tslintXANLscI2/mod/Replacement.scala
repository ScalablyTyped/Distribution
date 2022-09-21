package typings.tslintXANLscI2.mod

import typings.tslintXANLscI2.ruleDTsMod.Fix
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".tslint-xANLscI2", "Replacement")
@js.native
open class Replacement protected ()
  extends typings.tslintXANLscI2.ruleDTsMod.Replacement {
  def this(start: Double, length: Double, text: String) = this()
}
/* static members */
object Replacement {
  
  @JSImport(".tslint-xANLscI2", "Replacement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendText(start: Double, text: String): typings.tslintXANLscI2.ruleDTsMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("appendText")(start.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typings.tslintXANLscI2.ruleDTsMod.Replacement]
  
  inline def applyAll(content: String, replacements: js.Array[typings.tslintXANLscI2.ruleDTsMod.Replacement]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAll")(content.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def applyFixes(content: String, fixes: js.Array[Fix]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFixes")(content.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def deleteFromTo(start: Double, end: Double): typings.tslintXANLscI2.ruleDTsMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFromTo")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.tslintXANLscI2.ruleDTsMod.Replacement]
  
  inline def deleteText(start: Double, length: Double): typings.tslintXANLscI2.ruleDTsMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteText")(start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.tslintXANLscI2.ruleDTsMod.Replacement]
  
  inline def replaceFromTo(start: Double, end: Double, text: String): typings.tslintXANLscI2.ruleDTsMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceFromTo")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typings.tslintXANLscI2.ruleDTsMod.Replacement]
  
  inline def replaceNode(node: Node, text: String): typings.tslintXANLscI2.ruleDTsMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typings.tslintXANLscI2.ruleDTsMod.Replacement]
  inline def replaceNode(node: Node, text: String, sourceFile: SourceFile): typings.tslintXANLscI2.ruleDTsMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[typings.tslintXANLscI2.ruleDTsMod.Replacement]
}

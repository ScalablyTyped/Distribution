package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ContinueStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueStatement_
  extends Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var label: Identifier_ = js.native
  
  @JSName("type")
  var type_ContinueStatement_ : ContinueStatement = js.native
}
object ContinueStatement_ {
  
  @scala.inline
  def apply(end: Double, label: Identifier_, loc: SourceLocation, start: Double, `type`: ContinueStatement): ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement_]
  }
  
  @scala.inline
  implicit class ContinueStatement_MutableBuilder[Self <: ContinueStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

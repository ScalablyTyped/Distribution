package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DebuggerStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerStatement_
  extends Node
     with Statement {
  
  @JSName("type")
  var type_DebuggerStatement_ : DebuggerStatement = js.native
}
object DebuggerStatement_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: DebuggerStatement): DebuggerStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerStatement_]
  }
  
  @scala.inline
  implicit class DebuggerStatement_MutableBuilder[Self <: DebuggerStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

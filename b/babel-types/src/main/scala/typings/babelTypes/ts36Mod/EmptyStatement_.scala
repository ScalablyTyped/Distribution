package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyStatement_
  extends Node
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement_ : EmptyStatement = js.native
}
object EmptyStatement_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: EmptyStatement): EmptyStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyStatement_]
  }
  
  @scala.inline
  implicit class EmptyStatement_MutableBuilder[Self <: EmptyStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

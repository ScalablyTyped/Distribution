package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.LabeledStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabeledStatement_
  extends Node
     with Statement {
  
  var body: Statement = js.native
  
  var label: Identifier_ = js.native
  
  @JSName("type")
  var type_LabeledStatement_ : LabeledStatement = js.native
}
object LabeledStatement_ {
  
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    label: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: LabeledStatement
  ): LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledStatement_]
  }
  
  @scala.inline
  implicit class LabeledStatement_MutableBuilder[Self <: LabeledStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LabeledStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

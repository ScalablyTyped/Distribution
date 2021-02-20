package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoExpression_
  extends Node
     with Expression {
  
  var body: BlockStatement_ = js.native
  
  @JSName("type")
  var type_DoExpression_ : DoExpression = js.native
}
object DoExpression_ {
  
  @scala.inline
  def apply(body: BlockStatement_, end: Double, loc: SourceLocation, start: Double, `type`: DoExpression): DoExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoExpression_]
  }
  
  @scala.inline
  implicit class DoExpression_MutableBuilder[Self <: DoExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DoExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

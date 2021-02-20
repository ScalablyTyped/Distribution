package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStatement_
  extends Node
     with Statement {
  
  var body: BlockStatement_ | Statement = js.native
  
  var `object`: Expression = js.native
  
  @JSName("type")
  var type_WithStatement_ : WithStatement = js.native
}
object WithStatement_ {
  
  @scala.inline
  def apply(
    body: BlockStatement_ | Statement,
    end: Double,
    loc: SourceLocation,
    `object`: Expression,
    start: Double,
    `type`: WithStatement
  ): WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement_]
  }
  
  @scala.inline
  implicit class WithStatement_MutableBuilder[Self <: WithStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_ | Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

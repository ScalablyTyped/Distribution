package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockStatement_
  extends Node
     with Block
     with BlockParent
     with Scopable
     with Statement {
  
  var body: js.Array[Statement] = js.native
  
  var directives: js.UndefOr[js.Array[Directive_]] = js.native
  
  @JSName("type")
  var type_BlockStatement_ : BlockStatement = js.native
}
object BlockStatement_ {
  
  @scala.inline
  def apply(body: js.Array[Statement], end: Double, loc: SourceLocation, start: Double, `type`: BlockStatement): BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement_]
  }
  
  @scala.inline
  implicit class BlockStatement_MutableBuilder[Self <: BlockStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[Directive_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: Directive_ *): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setType(value: BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

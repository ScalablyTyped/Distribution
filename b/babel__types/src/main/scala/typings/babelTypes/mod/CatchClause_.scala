package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait CatchClause_
  extends BlockParent
     with BaseNode
     with Scopable {
  
  var body: BlockStatement_ = js.native
  
  var param: Identifier_ | ArrayPattern_ | ObjectPattern_ | Null = js.native
  
  @JSName("type")
  var type_CatchClause_ : CatchClause = js.native
}
object CatchClause_ {
  
  @scala.inline
  def apply(body: BlockStatement_, `type`: CatchClause): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause_]
  }
  
  @scala.inline
  implicit class CatchClause_MutableBuilder[Self <: CatchClause_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: Identifier_ | ArrayPattern_ | ObjectPattern_): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNull: Self = StObject.set(x, "param", null)
    
    @scala.inline
    def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

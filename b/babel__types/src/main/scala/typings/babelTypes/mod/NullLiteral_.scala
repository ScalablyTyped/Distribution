package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NullLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait NullLiteral_
  extends Expression
     with BaseNode
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_NullLiteral_ : NullLiteral = js.native
}
object NullLiteral_ {
  
  @scala.inline
  def apply(`type`: NullLiteral): NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral_]
  }
  
  @scala.inline
  implicit class NullLiteral_MutableBuilder[Self <: NullLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

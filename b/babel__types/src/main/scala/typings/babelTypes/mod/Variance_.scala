package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Variance
import typings.babelTypes.babelTypesStrings.minus
import typings.babelTypes.babelTypesStrings.plus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait Variance_
  extends Flow
     with BaseNode {
  
  var kind: minus | plus = js.native
  
  @JSName("type")
  var type_Variance_ : Variance = js.native
}
object Variance_ {
  
  @scala.inline
  def apply(kind: minus | plus, `type`: Variance): Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variance_]
  }
  
  @scala.inline
  implicit class Variance_MutableBuilder[Self <: Variance_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: minus | plus): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

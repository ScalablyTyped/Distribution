package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.Variance
import typings.babelTypes.babelTypesStrings.minus
import typings.babelTypes.babelTypesStrings.plus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
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
  implicit class Variance_Ops[Self <: Variance_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: minus | plus): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Variance): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

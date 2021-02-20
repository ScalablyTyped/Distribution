package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSTypeQuery_
  extends TSType
     with BaseNode {
  
  var exprName: TSEntityName | TSImportType_ = js.native
  
  @JSName("type")
  var type_TSTypeQuery_ : TSTypeQuery = js.native
}
object TSTypeQuery_ {
  
  @scala.inline
  def apply(exprName: TSEntityName | TSImportType_, `type`: TSTypeQuery): TSTypeQuery_ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeQuery_]
  }
  
  @scala.inline
  implicit class TSTypeQuery_MutableBuilder[Self <: TSTypeQuery_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExprName(value: TSEntityName | TSImportType_): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

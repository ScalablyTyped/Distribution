package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.const
import typings.babelTraverse.babelTraverseStrings.let
import typings.babelTraverse.babelTraverseStrings.var_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.LVal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockHoist extends StObject {
  
  var _blockHoist: js.UndefOr[Double] = js.undefined
  
  var id: LVal
  
  var init: js.UndefOr[Expression] = js.undefined
  
  var kind: js.UndefOr[var_ | let | const] = js.undefined
  
  var unique: js.UndefOr[Boolean] = js.undefined
}
object BlockHoist {
  
  inline def apply(id: LVal): BlockHoist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockHoist]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockHoist] (val x: Self) extends AnyVal {
    
    inline def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setKind(value: var_ | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    inline def set_blockHoist(value: Double): Self = StObject.set(x, "_blockHoist", value.asInstanceOf[js.Any])
    
    inline def set_blockHoistUndefined: Self = StObject.set(x, "_blockHoist", js.undefined)
  }
}

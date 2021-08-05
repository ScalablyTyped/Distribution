package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRawQuery extends StObject {
  
  def ModifyWhere(): IRawQueryModify
  
  /** Change Where clause */
  def ReplaceWhere(): IFieldExpression
}
object IRawQuery {
  
  inline def apply(ModifyWhere: () => IRawQueryModify, ReplaceWhere: () => IFieldExpression): IRawQuery = {
    val __obj = js.Dynamic.literal(ModifyWhere = js.Any.fromFunction0(ModifyWhere), ReplaceWhere = js.Any.fromFunction0(ReplaceWhere))
    __obj.asInstanceOf[IRawQuery]
  }
  
  extension [Self <: IRawQuery](x: Self) {
    
    inline def setModifyWhere(value: () => IRawQueryModify): Self = StObject.set(x, "ModifyWhere", js.Any.fromFunction0(value))
    
    inline def setReplaceWhere(value: () => IFieldExpression): Self = StObject.set(x, "ReplaceWhere", js.Any.fromFunction0(value))
  }
}

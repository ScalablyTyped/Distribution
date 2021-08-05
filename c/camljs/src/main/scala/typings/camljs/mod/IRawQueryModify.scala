package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRawQueryModify extends StObject {
  
  def AppendAnd(): IFieldExpression
  
  def AppendOr(): IFieldExpression
}
object IRawQueryModify {
  
  inline def apply(AppendAnd: () => IFieldExpression, AppendOr: () => IFieldExpression): IRawQueryModify = {
    val __obj = js.Dynamic.literal(AppendAnd = js.Any.fromFunction0(AppendAnd), AppendOr = js.Any.fromFunction0(AppendOr))
    __obj.asInstanceOf[IRawQueryModify]
  }
  
  extension [Self <: IRawQueryModify](x: Self) {
    
    inline def setAppendAnd(value: () => IFieldExpression): Self = StObject.set(x, "AppendAnd", js.Any.fromFunction0(value))
    
    inline def setAppendOr(value: () => IFieldExpression): Self = StObject.set(x, "AppendOr", js.Any.fromFunction0(value))
  }
}

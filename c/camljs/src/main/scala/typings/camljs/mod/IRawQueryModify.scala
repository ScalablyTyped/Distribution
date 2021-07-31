package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRawQueryModify extends StObject {
  
  def AppendAnd(): IFieldExpression
  
  def AppendOr(): IFieldExpression
}
object IRawQueryModify {
  
  @scala.inline
  def apply(AppendAnd: () => IFieldExpression, AppendOr: () => IFieldExpression): IRawQueryModify = {
    val __obj = js.Dynamic.literal(AppendAnd = js.Any.fromFunction0(AppendAnd), AppendOr = js.Any.fromFunction0(AppendOr))
    __obj.asInstanceOf[IRawQueryModify]
  }
  
  @scala.inline
  implicit class IRawQueryModifyMutableBuilder[Self <: IRawQueryModify] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendAnd(value: () => IFieldExpression): Self = StObject.set(x, "AppendAnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAppendOr(value: () => IFieldExpression): Self = StObject.set(x, "AppendOr", js.Any.fromFunction0(value))
  }
}

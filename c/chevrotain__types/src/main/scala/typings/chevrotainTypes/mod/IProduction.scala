package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProduction extends StObject {
  
  def accept(visitor: IGASTVisitor): Unit
}
object IProduction {
  
  inline def apply(accept: IGASTVisitor => Unit): IProduction = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept))
    __obj.asInstanceOf[IProduction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProduction] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: IGASTVisitor => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
  }
}

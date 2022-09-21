package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGASTVisitor extends StObject {
  
  def visit(prod: IProduction): Any
}
object IGASTVisitor {
  
  inline def apply(visit: IProduction => Any): IGASTVisitor = {
    val __obj = js.Dynamic.literal(visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[IGASTVisitor]
  }
  
  extension [Self <: IGASTVisitor](x: Self) {
    
    inline def setVisit(value: IProduction => Any): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
  }
}

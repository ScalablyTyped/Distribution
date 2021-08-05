package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineCommandResult extends StObject {
  
  def defineEventStreamsToLoad(cb: defineEventStreamsToLoadHandler): Unit
}
object DefineCommandResult {
  
  inline def apply(defineEventStreamsToLoad: defineEventStreamsToLoadHandler => Unit): DefineCommandResult = {
    val __obj = js.Dynamic.literal(defineEventStreamsToLoad = js.Any.fromFunction1(defineEventStreamsToLoad))
    __obj.asInstanceOf[DefineCommandResult]
  }
  
  extension [Self <: DefineCommandResult](x: Self) {
    
    inline def setDefineEventStreamsToLoad(value: defineEventStreamsToLoadHandler => Unit): Self = StObject.set(x, "defineEventStreamsToLoad", js.Any.fromFunction1(value))
  }
}

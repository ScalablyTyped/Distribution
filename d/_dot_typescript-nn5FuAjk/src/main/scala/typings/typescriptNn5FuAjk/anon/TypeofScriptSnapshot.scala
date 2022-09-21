package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.ts.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScriptSnapshot extends StObject {
  
  def fromString(text: String): IScriptSnapshot
}
object TypeofScriptSnapshot {
  
  inline def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
    __obj.asInstanceOf[TypeofScriptSnapshot]
  }
  
  extension [Self <: TypeofScriptSnapshot](x: Self) {
    
    inline def setFromString(value: String => IScriptSnapshot): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
  }
}

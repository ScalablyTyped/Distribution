package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.ts.Program
import typings.typescriptNn5FuAjk.ts.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffectedResult[T] extends StObject {
  
  var affected: SourceFile | Program
  
  var result: T
}
object AffectedResult {
  
  inline def apply[T](affected: SourceFile | Program, result: T): AffectedResult[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffectedResult[T]]
  }
  
  extension [Self <: AffectedResult[?], T](x: Self & AffectedResult[T]) {
    
    inline def setAffected(value: SourceFile | Program): Self = StObject.set(x, "affected", value.asInstanceOf[js.Any])
    
    inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}

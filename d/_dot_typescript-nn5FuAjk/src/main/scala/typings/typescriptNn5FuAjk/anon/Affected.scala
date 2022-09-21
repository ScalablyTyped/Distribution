package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Program
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Affected[T] extends StObject {
  
  var affected: SourceFile | Program
  
  var result: T
}
object Affected {
  
  inline def apply[T](affected: SourceFile | Program, result: T): Affected[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affected[T]]
  }
  
  extension [Self <: Affected[?], T](x: Self & Affected[T]) {
    
    inline def setAffected(value: SourceFile | Program): Self = StObject.set(x, "affected", value.asInstanceOf[js.Any])
    
    inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}

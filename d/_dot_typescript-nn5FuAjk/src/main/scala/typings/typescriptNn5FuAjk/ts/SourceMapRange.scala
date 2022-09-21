package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapRange
  extends StObject
     with TextRange {
  
  var source: js.UndefOr[SourceMapSource] = js.undefined
}
object SourceMapRange {
  
  inline def apply(end: Double, pos: Double): SourceMapRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapRange]
  }
  
  extension [Self <: SourceMapRange](x: Self) {
    
    inline def setSource(value: SourceMapSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

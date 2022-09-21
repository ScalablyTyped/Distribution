package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.CreatePackageJsonAutoImportProvider
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.UpdateGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEvent extends StObject {
  
  var durationMs: Double
  
  var kind: UpdateGraph | CreatePackageJsonAutoImportProvider
}
object PerformanceEvent {
  
  inline def apply(durationMs: Double, kind: UpdateGraph | CreatePackageJsonAutoImportProvider): PerformanceEvent = {
    val __obj = js.Dynamic.literal(durationMs = durationMs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEvent]
  }
  
  extension [Self <: PerformanceEvent](x: Self) {
    
    inline def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setKind(value: UpdateGraph | CreatePackageJsonAutoImportProvider): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}

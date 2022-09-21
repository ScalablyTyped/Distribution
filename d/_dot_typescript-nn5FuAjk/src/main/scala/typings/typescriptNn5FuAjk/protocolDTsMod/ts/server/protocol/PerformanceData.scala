package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceData extends StObject {
  
  /**
    * The time spent creating or updating the auto-import program, in milliseconds.
    */
  var createAutoImportProviderProgramDurationMs: js.UndefOr[Double] = js.undefined
  
  /**
    * Time spent updating the program graph, in milliseconds.
    */
  var updateGraphDurationMs: js.UndefOr[Double] = js.undefined
}
object PerformanceData {
  
  inline def apply(): PerformanceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceData]
  }
  
  extension [Self <: PerformanceData](x: Self) {
    
    inline def setCreateAutoImportProviderProgramDurationMs(value: Double): Self = StObject.set(x, "createAutoImportProviderProgramDurationMs", value.asInstanceOf[js.Any])
    
    inline def setCreateAutoImportProviderProgramDurationMsUndefined: Self = StObject.set(x, "createAutoImportProviderProgramDurationMs", js.undefined)
    
    inline def setUpdateGraphDurationMs(value: Double): Self = StObject.set(x, "updateGraphDurationMs", value.asInstanceOf[js.Any])
    
    inline def setUpdateGraphDurationMsUndefined: Self = StObject.set(x, "updateGraphDurationMs", js.undefined)
  }
}

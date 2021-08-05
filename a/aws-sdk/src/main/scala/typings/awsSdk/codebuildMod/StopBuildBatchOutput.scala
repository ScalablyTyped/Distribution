package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBuildBatchOutput extends StObject {
  
  var buildBatch: js.UndefOr[BuildBatch] = js.undefined
}
object StopBuildBatchOutput {
  
  inline def apply(): StopBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBuildBatchOutput]
  }
  
  extension [Self <: StopBuildBatchOutput](x: Self) {
    
    inline def setBuildBatch(value: BuildBatch): Self = StObject.set(x, "buildBatch", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchUndefined: Self = StObject.set(x, "buildBatch", js.undefined)
  }
}

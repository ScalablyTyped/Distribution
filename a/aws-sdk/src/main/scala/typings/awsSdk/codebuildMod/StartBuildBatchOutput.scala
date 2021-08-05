package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBuildBatchOutput extends StObject {
  
  /**
    * A BuildBatch object that contains information about the batch build.
    */
  var buildBatch: js.UndefOr[BuildBatch] = js.undefined
}
object StartBuildBatchOutput {
  
  inline def apply(): StartBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBuildBatchOutput]
  }
  
  extension [Self <: StartBuildBatchOutput](x: Self) {
    
    inline def setBuildBatch(value: BuildBatch): Self = StObject.set(x, "buildBatch", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchUndefined: Self = StObject.set(x, "buildBatch", js.undefined)
  }
}

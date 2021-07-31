package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryBuildBatchOutput extends StObject {
  
  var buildBatch: js.UndefOr[BuildBatch] = js.undefined
}
object RetryBuildBatchOutput {
  
  @scala.inline
  def apply(): RetryBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildBatchOutput]
  }
  
  @scala.inline
  implicit class RetryBuildBatchOutputMutableBuilder[Self <: RetryBuildBatchOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildBatch(value: BuildBatch): Self = StObject.set(x, "buildBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBatchUndefined: Self = StObject.set(x, "buildBatch", js.undefined)
  }
}

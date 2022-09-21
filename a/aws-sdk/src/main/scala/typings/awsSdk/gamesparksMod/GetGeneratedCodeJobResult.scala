package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeneratedCodeJobResult extends StObject {
  
  /**
    * Details about the generated code job.
    */
  var GeneratedCodeJob: js.UndefOr[GeneratedCodeJobDetails] = js.undefined
}
object GetGeneratedCodeJobResult {
  
  inline def apply(): GetGeneratedCodeJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeneratedCodeJobResult]
  }
  
  extension [Self <: GetGeneratedCodeJobResult](x: Self) {
    
    inline def setGeneratedCodeJob(value: GeneratedCodeJobDetails): Self = StObject.set(x, "GeneratedCodeJob", value.asInstanceOf[js.Any])
    
    inline def setGeneratedCodeJobUndefined: Self = StObject.set(x, "GeneratedCodeJob", js.undefined)
  }
}

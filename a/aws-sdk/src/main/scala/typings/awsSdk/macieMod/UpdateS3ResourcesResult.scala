package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateS3ResourcesResult extends StObject {
  
  /**
    * The S3 resources whose classification types can't be updated. An error code and an error message are provided for each failed item. 
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
}
object UpdateS3ResourcesResult {
  
  inline def apply(): UpdateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateS3ResourcesResult]
  }
  
  extension [Self <: UpdateS3ResourcesResult](x: Self) {
    
    inline def setFailedS3Resources(value: FailedS3Resources): Self = StObject.set(x, "failedS3Resources", value.asInstanceOf[js.Any])
    
    inline def setFailedS3ResourcesUndefined: Self = StObject.set(x, "failedS3Resources", js.undefined)
    
    inline def setFailedS3ResourcesVarargs(value: FailedS3Resource*): Self = StObject.set(x, "failedS3Resources", js.Array(value :_*))
  }
}

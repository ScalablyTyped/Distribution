package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCustomEntityTypesRequest extends StObject {
  
  /**
    * A list of names of the custom patterns that you want to retrieve.
    */
  var Names: CustomEntityTypeNames
}
object BatchGetCustomEntityTypesRequest {
  
  inline def apply(Names: CustomEntityTypeNames): BatchGetCustomEntityTypesRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCustomEntityTypesRequest]
  }
  
  extension [Self <: BatchGetCustomEntityTypesRequest](x: Self) {
    
    inline def setNames(value: CustomEntityTypeNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: NameString*): Self = StObject.set(x, "Names", js.Array(value*))
  }
}

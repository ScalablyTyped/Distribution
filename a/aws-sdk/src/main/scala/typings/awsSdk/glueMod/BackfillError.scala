package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackfillError extends StObject {
  
  /**
    * The error code for an error that occurred when registering partition indexes for an existing table.
    */
  var Code: js.UndefOr[BackfillErrorCode] = js.undefined
  
  /**
    * A list of a limited number of partitions in the response.
    */
  var Partitions: js.UndefOr[BackfillErroredPartitionsList] = js.undefined
}
object BackfillError {
  
  inline def apply(): BackfillError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackfillError]
  }
  
  extension [Self <: BackfillError](x: Self) {
    
    inline def setCode(value: BackfillErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setPartitions(value: BackfillErroredPartitionsList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: PartitionValueList*): Self = StObject.set(x, "Partitions", js.Array(value*))
  }
}

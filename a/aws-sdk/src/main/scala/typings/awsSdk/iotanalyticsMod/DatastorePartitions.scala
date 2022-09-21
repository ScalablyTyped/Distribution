package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastorePartitions extends StObject {
  
  /**
    *  A list of partition dimensions in a data store. 
    */
  var partitions: js.UndefOr[Partitions] = js.undefined
}
object DatastorePartitions {
  
  inline def apply(): DatastorePartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastorePartitions]
  }
  
  extension [Self <: DatastorePartitions](x: Self) {
    
    inline def setPartitions(value: Partitions): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: DatastorePartition*): Self = StObject.set(x, "partitions", js.Array(value*))
  }
}

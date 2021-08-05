package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePartitionKey extends StObject {
  
  /**
    * A dimension map that contains the dimension(s) for this partition.
    */
  var Dimensions: DimensionMap
}
object ResponsePartitionKey {
  
  inline def apply(Dimensions: DimensionMap): ResponsePartitionKey = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePartitionKey]
  }
  
  extension [Self <: ResponsePartitionKey](x: Self) {
    
    inline def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
  }
}

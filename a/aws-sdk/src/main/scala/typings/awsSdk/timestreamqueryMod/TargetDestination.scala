package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetDestination extends StObject {
  
  /**
    * Query result destination details for Timestream data source.
    */
  var TimestreamDestination: js.UndefOr[typings.awsSdk.timestreamqueryMod.TimestreamDestination] = js.undefined
}
object TargetDestination {
  
  inline def apply(): TargetDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetDestination]
  }
  
  extension [Self <: TargetDestination](x: Self) {
    
    inline def setTimestreamDestination(value: TimestreamDestination): Self = StObject.set(x, "TimestreamDestination", value.asInstanceOf[js.Any])
    
    inline def setTimestreamDestinationUndefined: Self = StObject.set(x, "TimestreamDestination", js.undefined)
  }
}

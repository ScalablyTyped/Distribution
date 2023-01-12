package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetDestination extends StObject {
  
  /**
    * Query result destination details for Timestream data source.
    */
  var TimestreamDestination: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.TimestreamDestination] = js.undefined
}
object TargetDestination {
  
  inline def apply(): TargetDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetDestination] (val x: Self) extends AnyVal {
    
    inline def setTimestreamDestination(value: TimestreamDestination): Self = StObject.set(x, "TimestreamDestination", value.asInstanceOf[js.Any])
    
    inline def setTimestreamDestinationUndefined: Self = StObject.set(x, "TimestreamDestination", js.undefined)
  }
}

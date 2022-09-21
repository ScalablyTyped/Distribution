package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLiveSourceRequest extends StObject {
  
  /**
    * The identifier for the live source you are working on.
    */
  var LiveSourceName: string
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
}
object DescribeLiveSourceRequest {
  
  inline def apply(LiveSourceName: string, SourceLocationName: string): DescribeLiveSourceRequest = {
    val __obj = js.Dynamic.literal(LiveSourceName = LiveSourceName.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLiveSourceRequest]
  }
  
  extension [Self <: DescribeLiveSourceRequest](x: Self) {
    
    inline def setLiveSourceName(value: string): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}

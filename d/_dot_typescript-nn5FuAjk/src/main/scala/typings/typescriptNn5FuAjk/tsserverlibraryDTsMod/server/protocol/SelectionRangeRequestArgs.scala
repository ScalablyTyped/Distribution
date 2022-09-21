package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionRangeRequestArgs
  extends StObject
     with FileRequestArgs {
  
  var locations: Array[Location]
}
object SelectionRangeRequestArgs {
  
  inline def apply(file: String, locations: Array[Location]): SelectionRangeRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRangeRequestArgs]
  }
  
  extension [Self <: SelectionRangeRequestArgs](x: Self) {
    
    inline def setLocations(value: Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
  }
}

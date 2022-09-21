package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterBacktrackMessage extends StObject {
  
  /**
    * Contains a list of backtracks for the user.
    */
  var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.undefined
  
  /**
    * A pagination token that can be used in a later DescribeDBClusterBacktracks request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBClusterBacktrackMessage {
  
  inline def apply(): DBClusterBacktrackMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterBacktrackMessage]
  }
  
  extension [Self <: DBClusterBacktrackMessage](x: Self) {
    
    inline def setDBClusterBacktracks(value: DBClusterBacktrackList): Self = StObject.set(x, "DBClusterBacktracks", value.asInstanceOf[js.Any])
    
    inline def setDBClusterBacktracksUndefined: Self = StObject.set(x, "DBClusterBacktracks", js.undefined)
    
    inline def setDBClusterBacktracksVarargs(value: DBClusterBacktrack*): Self = StObject.set(x, "DBClusterBacktracks", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}

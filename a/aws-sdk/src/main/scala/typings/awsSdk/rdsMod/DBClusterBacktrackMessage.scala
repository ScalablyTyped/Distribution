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
  
  @scala.inline
  def apply(): DBClusterBacktrackMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterBacktrackMessage]
  }
  
  @scala.inline
  implicit class DBClusterBacktrackMessageMutableBuilder[Self <: DBClusterBacktrackMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterBacktracks(value: DBClusterBacktrackList): Self = StObject.set(x, "DBClusterBacktracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterBacktracksUndefined: Self = StObject.set(x, "DBClusterBacktracks", js.undefined)
    
    @scala.inline
    def setDBClusterBacktracksVarargs(value: DBClusterBacktrack*): Self = StObject.set(x, "DBClusterBacktracks", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}

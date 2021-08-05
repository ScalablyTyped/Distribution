package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionsFilter extends StObject {
  
  /**
    * The type of connections to return. Currently, SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typings.awsSdk.glueMod.ConnectionType] = js.undefined
  
  /**
    * A criteria string that must match the criteria recorded in the connection definition for that connection definition to be returned.
    */
  var MatchCriteria: js.UndefOr[typings.awsSdk.glueMod.MatchCriteria] = js.undefined
}
object GetConnectionsFilter {
  
  inline def apply(): GetConnectionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsFilter]
  }
  
  extension [Self <: GetConnectionsFilter](x: Self) {
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "ConnectionType", js.undefined)
    
    inline def setMatchCriteria(value: MatchCriteria): Self = StObject.set(x, "MatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setMatchCriteriaUndefined: Self = StObject.set(x, "MatchCriteria", js.undefined)
    
    inline def setMatchCriteriaVarargs(value: NameString*): Self = StObject.set(x, "MatchCriteria", js.Array(value :_*))
  }
}

package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterParameterGroupNameMessage extends StObject {
  
  /**
    * The name of a cluster parameter group. Constraints:   Must be from 1 to 255 letters or numbers.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
}
object DBClusterParameterGroupNameMessage {
  
  inline def apply(): DBClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroupNameMessage]
  }
  
  extension [Self <: DBClusterParameterGroupNameMessage](x: Self) {
    
    inline def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "DBClusterParameterGroupName", js.undefined)
  }
}

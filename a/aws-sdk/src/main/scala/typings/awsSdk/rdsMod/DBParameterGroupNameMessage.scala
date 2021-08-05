package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBParameterGroupNameMessage extends StObject {
  
  /**
    * The name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
}
object DBParameterGroupNameMessage {
  
  inline def apply(): DBParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroupNameMessage]
  }
  
  extension [Self <: DBParameterGroupNameMessage](x: Self) {
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
  }
}

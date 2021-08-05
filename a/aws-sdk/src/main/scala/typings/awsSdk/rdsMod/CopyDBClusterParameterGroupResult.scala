package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterParameterGroupResult extends StObject {
  
  var DBClusterParameterGroup: js.UndefOr[typings.awsSdk.rdsMod.DBClusterParameterGroup] = js.undefined
}
object CopyDBClusterParameterGroupResult {
  
  inline def apply(): CopyDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBClusterParameterGroupResult]
  }
  
  extension [Self <: CopyDBClusterParameterGroupResult](x: Self) {
    
    inline def setDBClusterParameterGroup(value: DBClusterParameterGroup): Self = StObject.set(x, "DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupUndefined: Self = StObject.set(x, "DBClusterParameterGroup", js.undefined)
  }
}

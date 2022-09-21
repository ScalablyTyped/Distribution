package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Homogeneous extends StObject {
  
  /**
    *  The target database engine for homogeneous database migration preferences. 
    */
  var targetDatabaseEngine: js.UndefOr[HomogeneousTargetDatabaseEngines] = js.undefined
}
object Homogeneous {
  
  inline def apply(): Homogeneous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Homogeneous]
  }
  
  extension [Self <: Homogeneous](x: Self) {
    
    inline def setTargetDatabaseEngine(value: HomogeneousTargetDatabaseEngines): Self = StObject.set(x, "targetDatabaseEngine", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseEngineUndefined: Self = StObject.set(x, "targetDatabaseEngine", js.undefined)
    
    inline def setTargetDatabaseEngineVarargs(value: HomogeneousTargetDatabaseEngine*): Self = StObject.set(x, "targetDatabaseEngine", js.Array(value*))
  }
}

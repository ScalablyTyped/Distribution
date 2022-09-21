package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heterogeneous extends StObject {
  
  /**
    *  The target database engine for heterogeneous database migration preference. 
    */
  var targetDatabaseEngine: HeterogeneousTargetDatabaseEngines
}
object Heterogeneous {
  
  inline def apply(targetDatabaseEngine: HeterogeneousTargetDatabaseEngines): Heterogeneous = {
    val __obj = js.Dynamic.literal(targetDatabaseEngine = targetDatabaseEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heterogeneous]
  }
  
  extension [Self <: Heterogeneous](x: Self) {
    
    inline def setTargetDatabaseEngine(value: HeterogeneousTargetDatabaseEngines): Self = StObject.set(x, "targetDatabaseEngine", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseEngineVarargs(value: HeterogeneousTargetDatabaseEngine*): Self = StObject.set(x, "targetDatabaseEngine", js.Array(value*))
  }
}

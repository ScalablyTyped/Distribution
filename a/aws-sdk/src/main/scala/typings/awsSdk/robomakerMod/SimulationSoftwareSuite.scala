package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationSoftwareSuite extends StObject {
  
  /**
    * The name of the simulation software suite.
    */
  var name: js.UndefOr[SimulationSoftwareSuiteType] = js.undefined
  
  /**
    * The version of the simulation software suite.
    */
  var version: js.UndefOr[SimulationSoftwareSuiteVersionType] = js.undefined
}
object SimulationSoftwareSuite {
  
  inline def apply(): SimulationSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationSoftwareSuite]
  }
  
  extension [Self <: SimulationSoftwareSuite](x: Self) {
    
    inline def setName(value: SimulationSoftwareSuiteType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: SimulationSoftwareSuiteVersionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

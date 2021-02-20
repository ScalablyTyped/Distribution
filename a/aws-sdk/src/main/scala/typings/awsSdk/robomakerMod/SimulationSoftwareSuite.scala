package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulationSoftwareSuite extends StObject {
  
  /**
    * The name of the simulation software suite.
    */
  var name: js.UndefOr[SimulationSoftwareSuiteType] = js.native
  
  /**
    * The version of the simulation software suite.
    */
  var version: js.UndefOr[SimulationSoftwareSuiteVersionType] = js.native
}
object SimulationSoftwareSuite {
  
  @scala.inline
  def apply(): SimulationSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationSoftwareSuite]
  }
  
  @scala.inline
  implicit class SimulationSoftwareSuiteMutableBuilder[Self <: SimulationSoftwareSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SimulationSoftwareSuiteType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: SimulationSoftwareSuiteVersionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

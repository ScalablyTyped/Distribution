package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationalDatabaseHardware extends StObject {
  
  /**
    * The number of vCPUs for the database.
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The size of the disk for the database.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * The amount of RAM in GB for the database.
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
}
object RelationalDatabaseHardware {
  
  inline def apply(): RelationalDatabaseHardware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseHardware]
  }
  
  extension [Self <: RelationalDatabaseHardware](x: Self) {
    
    inline def setCpuCount(value: integer): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setDiskSizeInGb(value: integer): Self = StObject.set(x, "diskSizeInGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeInGbUndefined: Self = StObject.set(x, "diskSizeInGb", js.undefined)
    
    inline def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    inline def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
  }
}

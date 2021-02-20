package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseHardware extends StObject {
  
  /**
    * The number of vCPUs for the database.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  
  /**
    * The size of the disk for the database.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  
  /**
    * The amount of RAM in GB for the database.
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}
object RelationalDatabaseHardware {
  
  @scala.inline
  def apply(): RelationalDatabaseHardware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseHardware]
  }
  
  @scala.inline
  implicit class RelationalDatabaseHardwareMutableBuilder[Self <: RelationalDatabaseHardware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCount(value: integer): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    @scala.inline
    def setDiskSizeInGb(value: integer): Self = StObject.set(x, "diskSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeInGbUndefined: Self = StObject.set(x, "diskSizeInGb", js.undefined)
    
    @scala.inline
    def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
  }
}

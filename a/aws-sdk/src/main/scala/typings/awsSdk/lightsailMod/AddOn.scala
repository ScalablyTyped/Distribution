package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOn extends StObject {
  
  /**
    * The name of the add-on.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The next daily time an automatic snapshot will be created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  
  /**
    * The daily time when an automatic snapshot is created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  
  /**
    * The status of the add-on.
    */
  var status: js.UndefOr[String] = js.native
}
object AddOn {
  
  @scala.inline
  def apply(): AddOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOn]
  }
  
  @scala.inline
  implicit class AddOnMutableBuilder[Self <: AddOn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextSnapshotTimeOfDay(value: TimeOfDay): Self = StObject.set(x, "nextSnapshotTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSnapshotTimeOfDayUndefined: Self = StObject.set(x, "nextSnapshotTimeOfDay", js.undefined)
    
    @scala.inline
    def setSnapshotTimeOfDay(value: TimeOfDay): Self = StObject.set(x, "snapshotTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTimeOfDayUndefined: Self = StObject.set(x, "snapshotTimeOfDay", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveGroupSettings extends js.Object {
  
  /**
    * A directory and base filename where archive files should be written.
    */
  var Destination: OutputLocationRef = js.native
  
  /**
    * Number of seconds to write to archive file before closing and starting a new one.
    */
  var RolloverInterval: js.UndefOr[integerMin1] = js.native
}
object ArchiveGroupSettings {
  
  @scala.inline
  def apply(Destination: OutputLocationRef): ArchiveGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveGroupSettings]
  }
  
  @scala.inline
  implicit class ArchiveGroupSettingsOps[Self <: ArchiveGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestination(value: OutputLocationRef): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloverInterval(value: integerMin1): Self = this.set("RolloverInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolloverInterval: Self = this.set("RolloverInterval", js.undefined)
  }
}

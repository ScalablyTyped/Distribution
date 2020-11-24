package typings.chromeApps.chrome.system.powerSource

import typings.chromeApps.chrome.double
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerSourceInfo extends js.Object {
  
  /** Whether this power source is connected to the device. */
  var active: Boolean = js.native
  
  /**
    * Maximum power this source is capable of delivering if known.
    * Reported in watts, rounded to two significant digits.
    */
  var maxPower: js.UndefOr[double] = js.native
  
  /**
    * Type of power source
    * @see PowerSourceType
    */
  var `type`: (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PowerSourceType * / any */ String) | PowerSourceType = js.native
}
object PowerSourceInfo {
  
  @scala.inline
  def apply(
    active: Boolean,
    `type`: (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PowerSourceType * / any */ String) | PowerSourceType
  ): PowerSourceInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerSourceInfo]
  }
  
  @scala.inline
  implicit class PowerSourceInfoOps[Self <: PowerSourceInfo] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PowerSourceType * / any */ String) | PowerSourceType
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPower(value: double): Self = this.set("maxPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPower: Self = this.set("maxPower", js.undefined)
  }
}

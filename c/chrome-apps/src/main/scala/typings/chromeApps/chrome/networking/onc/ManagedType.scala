package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedType[T] extends js.Object {
  
  /** The active value currently used by the network configuration manager (e.g. Shill). */
  var Active: js.UndefOr[T] = js.native
  
  /**
    * Whether a DevicePolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var DeviceEditable: js.UndefOr[Boolean] = js.native
  
  /** The property value provided by the device policy. */
  var DevicePolicy: js.UndefOr[T] = js.native
  
  /** The source from which the effective property value was determined. */
  var Effective: js.UndefOr[String] = js.native
  
  /** The value set for all users of the device. Only provided if *DeviceEditiable* is true. */
  var SharedSetting: js.UndefOr[T] = js.native
  
  /**
    * Whether a UserPolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var UserEditable: js.UndefOr[Boolean] = js.native
  
  /** The property value provided by the user policy. */
  var UserPolicy: js.UndefOr[T] = js.native
  
  /** The property value set by the logged in user. Only provided if *UserEditable* is true. */
  var UserSetting: js.UndefOr[T] = js.native
}
object ManagedType {
  
  @scala.inline
  def apply[T](): ManagedType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedType[T]]
  }
  
  @scala.inline
  implicit class ManagedTypeOps[Self <: ManagedType[_], T] (val x: Self with ManagedType[T]) extends AnyVal {
    
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
    def setActive(value: T): Self = this.set("Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("Active", js.undefined)
    
    @scala.inline
    def setDeviceEditable(value: Boolean): Self = this.set("DeviceEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceEditable: Self = this.set("DeviceEditable", js.undefined)
    
    @scala.inline
    def setDevicePolicy(value: T): Self = this.set("DevicePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePolicy: Self = this.set("DevicePolicy", js.undefined)
    
    @scala.inline
    def setEffective(value: String): Self = this.set("Effective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffective: Self = this.set("Effective", js.undefined)
    
    @scala.inline
    def setSharedSetting(value: T): Self = this.set("SharedSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedSetting: Self = this.set("SharedSetting", js.undefined)
    
    @scala.inline
    def setUserEditable(value: Boolean): Self = this.set("UserEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEditable: Self = this.set("UserEditable", js.undefined)
    
    @scala.inline
    def setUserPolicy(value: T): Self = this.set("UserPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPolicy: Self = this.set("UserPolicy", js.undefined)
    
    @scala.inline
    def setUserSetting(value: T): Self = this.set("UserSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSetting: Self = this.set("UserSetting", js.undefined)
  }
}

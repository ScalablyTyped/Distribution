package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedType[T] extends StObject {
  
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
  implicit class ManagedTypeMutableBuilder[Self <: ManagedType[_], T] (val x: Self with ManagedType[T]) extends AnyVal {
    
    @scala.inline
    def setActive(value: T): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setDeviceEditable(value: Boolean): Self = StObject.set(x, "DeviceEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceEditableUndefined: Self = StObject.set(x, "DeviceEditable", js.undefined)
    
    @scala.inline
    def setDevicePolicy(value: T): Self = StObject.set(x, "DevicePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePolicyUndefined: Self = StObject.set(x, "DevicePolicy", js.undefined)
    
    @scala.inline
    def setEffective(value: String): Self = StObject.set(x, "Effective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveUndefined: Self = StObject.set(x, "Effective", js.undefined)
    
    @scala.inline
    def setSharedSetting(value: T): Self = StObject.set(x, "SharedSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedSettingUndefined: Self = StObject.set(x, "SharedSetting", js.undefined)
    
    @scala.inline
    def setUserEditable(value: Boolean): Self = StObject.set(x, "UserEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEditableUndefined: Self = StObject.set(x, "UserEditable", js.undefined)
    
    @scala.inline
    def setUserPolicy(value: T): Self = StObject.set(x, "UserPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPolicyUndefined: Self = StObject.set(x, "UserPolicy", js.undefined)
    
    @scala.inline
    def setUserSetting(value: T): Self = StObject.set(x, "UserSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingUndefined: Self = StObject.set(x, "UserSetting", js.undefined)
  }
}

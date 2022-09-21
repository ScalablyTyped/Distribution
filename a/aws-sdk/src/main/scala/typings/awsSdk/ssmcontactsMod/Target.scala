package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /**
    * Information about the contact channel Incident Manager is engaging.
    */
  var ChannelTargetInfo: js.UndefOr[typings.awsSdk.ssmcontactsMod.ChannelTargetInfo] = js.undefined
  
  /**
    * Information about the contact that Incident Manager is engaging.
    */
  var ContactTargetInfo: js.UndefOr[typings.awsSdk.ssmcontactsMod.ContactTargetInfo] = js.undefined
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setChannelTargetInfo(value: ChannelTargetInfo): Self = StObject.set(x, "ChannelTargetInfo", value.asInstanceOf[js.Any])
    
    inline def setChannelTargetInfoUndefined: Self = StObject.set(x, "ChannelTargetInfo", js.undefined)
    
    inline def setContactTargetInfo(value: ContactTargetInfo): Self = StObject.set(x, "ContactTargetInfo", value.asInstanceOf[js.Any])
    
    inline def setContactTargetInfoUndefined: Self = StObject.set(x, "ContactTargetInfo", js.undefined)
  }
}

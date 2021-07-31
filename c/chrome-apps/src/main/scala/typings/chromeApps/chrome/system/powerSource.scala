package typings.chromeApps.chrome.system

import typings.chromeApps.chrome.double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////
// System Power Source //
/////////////////////////
/**
  * @requires(CrOS Kiosk) Chrome OS kiosk app.
  * @requires Permissions: 'system.powerSource'
  * @description The chrome.system.powerSource API allows Chrome Kiosk Apps to query the state of connected power sources.
  * @since Latest
  */
object powerSource {
  
  @js.native
  sealed trait PowerSourceType extends StObject
  @JSGlobal("chrome.system.powerSource.PowerSourceType")
  @js.native
  object PowerSourceType extends StObject {
    
    /**
      * Dedicated charger. Typically single-purpose and non-USB
      * (e.g. barrel jack plugs)
      */
    @js.native
    sealed trait mains
      extends StObject
         with PowerSourceType
    
    /** Unspecified type. */
    @js.native
    sealed trait unknown
      extends StObject
         with PowerSourceType
    
    /**
      * USB charger, including both low-power Type-A chargers and high-power
      * Type-C chargers using USB Power Delivery.
      */
    @js.native
    sealed trait usb
      extends StObject
         with PowerSourceType
  }
  
  trait PowerSourceInfo extends StObject {
    
    /** Whether this power source is connected to the device. */
    var active: Boolean
    
    /**
      * Maximum power this source is capable of delivering if known.
      * Reported in watts, rounded to two significant digits.
      */
    var maxPower: js.UndefOr[double] = js.undefined
    
    /**
      * Type of power source
      * @see PowerSourceType
      */
    var `type`: (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PowerSourceType * / any */ String) | PowerSourceType
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
    implicit class PowerSourceInfoMutableBuilder[Self <: PowerSourceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPower(value: double): Self = StObject.set(x, "maxPower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPowerUndefined: Self = StObject.set(x, "maxPower", js.undefined)
      
      @scala.inline
      def setType(
        value: (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PowerSourceType * / any */ String) | PowerSourceType
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

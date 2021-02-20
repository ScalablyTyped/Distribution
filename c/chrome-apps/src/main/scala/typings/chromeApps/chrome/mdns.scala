package typings.chromeApps.chrome

import typings.chromeApps.chromeAppsStrings.serviceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.mdns
//////////
// mDNS //
//////////
/**
  * Use the chrome.mdns API to discover services over mDNS.
  * This comprises a subset of the features of the NSD spec:
  * @see[NSD Spec]{@link http://www.w3.org/TR/discovery-api/}
  * @requires Permissions: 'mdns'
  * @since Chrome 31
  */
object mdns {
  
  @js.native
  trait Service extends StObject {
    
    /** The IP address of an mDNS advertised service. */
    var ipAddress: String = js.native
    
    /** Metadata for an mDNS advertised service. */
    var serviceData: js.Array[String] = js.native
    
    /** The host:port pair of an mDNS advertised service. */
    var serviceHostPort: String = js.native
    
    /** The service name of an mDNS advertised service, .. */
    var serviceName: String = js.native
  }
  object Service {
    
    @scala.inline
    def apply(ipAddress: String, serviceData: js.Array[String], serviceHostPort: String, serviceName: String): Service = {
      val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceHostPort = serviceHostPort.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceData(value: js.Array[String]): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceDataVarargs(value: String*): Self = StObject.set(x, "serviceData", js.Array(value :_*))
      
      @scala.inline
      def setServiceHostPort(value: String): Self = StObject.set(x, "serviceHostPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Dictionary
    * [key in ValidServiceTypes]: string
    */
  /* Inlined std.Record<chrome-apps.chrome.mdns.ValidServiceTypes, string> */
  @js.native
  trait ServiceTypes extends StObject {
    
    var serviceType: String = js.native
  }
  object ServiceTypes {
    
    @scala.inline
    def apply(serviceType: String): ServiceTypes = {
      val __obj = js.Dynamic.literal(serviceType = serviceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceTypes]
    }
    
    @scala.inline
    implicit class ServiceTypesMutableBuilder[Self <: ServiceTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Locked to this because it's the only one that can be used.
    *
    * const char kEventFilterServiceTypeKey[] = "serviceType";
    * @see[Source: event_matcher.cc, line 19]{@link https://github.com/chromium/chromium/tree/master/extensions/common/event_matcher.cc}
    */
  type ValidServiceTypes = serviceType
}

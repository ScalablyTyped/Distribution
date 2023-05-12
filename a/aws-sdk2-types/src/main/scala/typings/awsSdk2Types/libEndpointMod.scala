package typings.awsSdk2Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEndpointMod {
  
  @JSImport("aws-sdk2-types/lib/endpoint", "Endpoint")
  @js.native
  open class Endpoint protected () extends StObject {
    /**
      * Constructs a new endpoint given an endpoint URL.
      */
    def this(url: String) = this()
    
    /**
      * The host portion of the endpoint including the port, e.g., example.com:80.
      */
    var host: String = js.native
    
    /**
      * The host portion of the endpoint, e.g., example.com.
      */
    var hostname: String = js.native
    
    /**
      * The full URL of the endpoint.
      */
    var href: String = js.native
    
    /**
      * The port of the endpoint.
      */
    var port: Double = js.native
    
    /**
      * The protocol (http or https) of the endpoint URL.
      */
    var protocol: String = js.native
  }
}

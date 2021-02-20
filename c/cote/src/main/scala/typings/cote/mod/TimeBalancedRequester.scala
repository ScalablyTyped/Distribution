package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "TimeBalancedRequester")
@js.native
class TimeBalancedRequester protected () extends Requester {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: RequesterAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: RequesterAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  
  /**
    * How long to wait for response before neglecting its calculation time,
    * in milliseconds.
    */
  var CALCULATION_TIMEOUT: Double = js.native
  
  /**
    * How many requests to make before exploring a random server for response
    * time improvement.
    */
  var MAX_REQUESTS: Double = js.native
  
  /**
    * How often to check whether a response arrived. Readonly because used in
    * constructor right after being set.
    */
  val SAMPLE_INTERVAL: Double = js.native
}

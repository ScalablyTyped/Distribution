package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "PendingBalancedRequester")
@js.native
class PendingBalancedRequester protected () extends Requester {
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
}

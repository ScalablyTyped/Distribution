package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Subscriber")
@js.native
open class Subscriber protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: SubscriberAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: SubscriberAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  
  /**
    * Subscribes to events emitted from a Publisher.
    *
    * @param type Type. May be wildcarded or namespaced like in EventEmitter2.
    * @param listener Callback. Returns nothing.
    */
  def on[T /* <: Event */](`type`: String, listener: js.Function1[/* event */ T, Unit]): this.type = js.native
  def on[T /* <: Event */](`type`: js.Array[String], listener: js.Function1[/* event */ T, Unit]): this.type = js.native
}

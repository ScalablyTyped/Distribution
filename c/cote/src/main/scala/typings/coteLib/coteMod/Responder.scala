package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cote", "Responder")
@js.native
class Responder protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: ResponderAdvertisement) = this()
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: ResponderAdvertisement, /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions) = this()
  /**
    * Responds to certain requests from a Requester.
    *
    * @param type Type. May be wildcarded or namespaced like in EventEmitter2.
    * @param listener Callback. Should return a result.
    */
  def on[T /* <: Event */](
    `type`: java.lang.String,
    listener: js.Function2[
      /* event */ T, 
      /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def on[T /* <: Event */](
    `type`: js.Array[java.lang.String],
    listener: js.Function2[
      /* event */ T, 
      /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Listens to internal `cote:added` and `cote:removed` events.
    *
    * @param listener Callback.
    */
  @JSName("on")
  def `on_cote:added`(
    `type`: coteLib.coteLibStrings.`cote:added`,
    listener: js.Function1[/* event */ Status, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_cote:removed`(
    `type`: coteLib.coteLibStrings.`cote:removed`,
    listener: js.Function1[/* event */ Status, scala.Unit]
  ): this.type = js.native
}


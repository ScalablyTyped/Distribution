package typings.cote.mod

import typings.cote.coteStrings.coteColonadded
import typings.cote.coteStrings.coteColonremoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cote", "Responder")
@js.native
open class Responder protected () extends Component {
  def this(/**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: ResponderAdvertisement) = this()
  def this(
    /**
    * Configuration which controls the data being advertised for auto-discovery.
    */
  advertisement: ResponderAdvertisement,
    /**
    * Controls the network-layer configuration and environments for components.
    */
  discoveryOptions: DiscoveryOptions
  ) = this()
  
  /**
    * Listens to internal `cote:added` and `cote:removed` events.
    *
    * @param listener Callback.
    */
  def on(`type`: coteColonadded | coteColonremoved, listener: js.Function1[/* event */ Status, Unit]): this.type = js.native
  def on[T /* <: Event */](`type`: String, listener: js.Function1[/* event */ T, js.Promise[Any]]): this.type = js.native
  /**
    * Responds to certain requests from a Requester.
    *
    * @param type Type. May be wildcarded or namespaced like in EventEmitter2.
    * @param listener Callback. Should return a result.
    */
  def on[T /* <: Event */](
    `type`: String,
    listener: js.Function2[
      /* event */ T, 
      /* callback */ js.Function2[/* error */ Any, /* result */ Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  def on[T /* <: Event */](`type`: js.Array[String], listener: js.Function1[/* event */ T, js.Promise[Any]]): this.type = js.native
  def on[T /* <: Event */](
    `type`: js.Array[String],
    listener: js.Function2[
      /* event */ T, 
      /* callback */ js.Function2[/* error */ Any, /* result */ Any, Unit], 
      Unit
    ]
  ): this.type = js.native
}

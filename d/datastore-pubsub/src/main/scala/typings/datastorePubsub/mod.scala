package typings.datastorePubsub

import typings.datastoreCore.mod.BaseDatastore
import typings.interfaceDatastore.mod.Datastore
import typings.interfaceStore.mod.AbortOptions
import typings.libp2pInterfaceDht.mod.SelectFn
import typings.libp2pInterfaceDht.mod.ValidateFn
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.Message
import typings.libp2pInterfacePubsub.mod.PubSub
import typings.libp2pInterfacePubsub.mod.PubSubEvents
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-pubsub", "PubSubDatastore")
  @js.native
  open class PubSubDatastore protected () extends BaseDatastore {
    def this(
      pubsub: PubSub[PubSubEvents],
      datastore: Datastore[
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object
          ],
      peerId: PeerId,
      validator: ValidateFn,
      selector: SelectFn
    ) = this()
    def this(
      pubsub: PubSub[PubSubEvents],
      datastore: Datastore[
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object
          ],
      peerId: PeerId,
      validator: ValidateFn,
      selector: SelectFn,
      subscriptionKeyFn: SubscriptionKeyFn
    ) = this()
    
    /* private */ val _datastore: Any = js.native
    
    /**
      * Get record from local datastore
      */
    def _getLocal(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def _getLocal(key: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* private */ val _handleSubscriptionKeyFn: Any = js.native
    
    /**
      * Verify if the record received through pubsub is valid and better than the one currently stored
      */
    def _isBetter(key: js.typedarray.Uint8Array, `val`: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
    
    /**
      * handles pubsub subscription messages
      */
    def _onMessage(evt: CustomEvent[Message]): js.Promise[Unit] = js.native
    
    /* private */ val _peerId: Any = js.native
    
    /* private */ val _pubsub: Any = js.native
    
    /**
      * Select the best record according to the received select function
      */
    def _selectRecord(key: js.typedarray.Uint8Array, records: js.Array[js.typedarray.Uint8Array]): js.Promise[Boolean] = js.native
    
    /* private */ val _selector: Any = js.native
    
    /**
      * Store the received record if it is better than the current stored
      */
    def _storeIfSubscriptionIsBetter(key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def _storeIfSubscriptionIsBetter(key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[Unit] = js.native
    
    /**
      * add record to datastore
      */
    def _storeRecord(key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def _storeRecord(key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[Unit] = js.native
    
    /**
      * Validate record according to the received validation function
      */
    def _validateRecord(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    /* private */ val _validator: Any = js.native
    
    /**
      * Try to subscribe a topic with Pubsub and returns the local value if available
      */
    def get(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(key: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Publishes a value through pubsub.
      *
      * @param {Uint8Array} key - identifier of the value to be published.
      * @param {Uint8Array} val - value to be propagated.
      * @param {AbortOptions} [options]
      */
    def put(key: js.typedarray.Uint8Array, `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(key: js.typedarray.Uint8Array, `val`: js.typedarray.Uint8Array, options: AbortOptions): js.Promise[Unit] = js.native
    
    /**
      * Unsubscribe topic
      */
    def unsubscribe(key: js.typedarray.Uint8Array): Unit = js.native
  }
  
  type SubscriptionKeyFn = js.Function1[
    /* key */ js.typedarray.Uint8Array, 
    js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array
  ]
}

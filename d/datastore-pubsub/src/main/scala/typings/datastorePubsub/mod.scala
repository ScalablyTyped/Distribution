package typings.datastorePubsub

import typings.datastoreCore.mod.BaseDatastore
import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceDht.mod.SelectFn
import typings.libp2pInterfaceDht.mod.ValidateFn
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
    /**
      * Creates an instance of DatastorePubsub.
      *
      * @param {import('@libp2p/interface-pubsub').PubSub} pubsub - pubsub implementation
      * @param {import('interface-datastore').Datastore} datastore - datastore instance
      * @param {PeerId} peerId - peer-id instance
      * @param {import('@libp2p/interface-dht').ValidateFn} validator - validator function
      * @param {import('@libp2p/interface-dht').SelectFn} selector - selector function
      * @param {SubscriptionKeyFn} [subscriptionKeyFn] - function to manipulate the key topic received before processing it
      * @memberof DatastorePubsub
      */
    def this(
      pubsub: PubSub[PubSubEvents],
      datastore: Datastore,
      peerId: PeerId,
      validator: ValidateFn,
      selector: SelectFn
    ) = this()
    def this(
      pubsub: PubSub[PubSubEvents],
      datastore: Datastore,
      peerId: PeerId,
      validator: ValidateFn,
      selector: SelectFn,
      subscriptionKeyFn: typings.datastorePubsub.distSrcTypesMod.SubscriptionKeyFn
    ) = this()
    
    var _datastore: Datastore = js.native
    
    /**
      * Get record from local datastore
      *
      * @private
      * @param {Uint8Array} key
      * @param {AbortOptions} [options]
      */
    /* private */ var _getLocal: Any = js.native
    
    var _handleSubscriptionKeyFn: js.UndefOr[typings.datastorePubsub.distSrcTypesMod.SubscriptionKeyFn] = js.native
    
    /**
      * Verify if the record received through pubsub is valid and better than the one currently stored
      *
      * @param {Uint8Array} key
      * @param {Uint8Array} val
      */
    def _isBetter(key: js.typedarray.Uint8Array, `val`: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
    
    /**
      * handles pubsub subscription messages
      *
      * @param {CustomEvent<PubSubMessage>} evt
      */
    def _onMessage(evt: CustomEvent[PubSubMessage]): js.Promise[Unit] = js.native
    
    var _peerId: typings.libp2pInterfacePeerId.mod.PeerId = js.native
    
    var _pubsub: PubSub[PubSubEvents] = js.native
    
    /**
      * Select the best record according to the received select function
      *
      * @param {Uint8Array} key
      * @param {Uint8Array[]} records
      */
    def _selectRecord(key: js.typedarray.Uint8Array, records: js.Array[js.typedarray.Uint8Array]): js.Promise[Boolean] = js.native
    
    def _selector(key: js.typedarray.Uint8Array, records: js.Array[js.typedarray.Uint8Array]): Double = js.native
    @JSName("_selector")
    var _selector_Original: SelectFn = js.native
    
    /**
      * Store the received record if it is better than the current stored
      *
      * @param {Uint8Array} key
      * @param {Uint8Array} data
      * @param {AbortOptions} [options]
      */
    def _storeIfSubscriptionIsBetter(key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def _storeIfSubscriptionIsBetter(
      key: js.typedarray.Uint8Array,
      data: js.typedarray.Uint8Array,
      options: typings.libp2pInterfaces.mod.AbortOptions
    ): js.Promise[Unit] = js.native
    
    /**
      * add record to datastore
      *
      * @param {Uint8Array} key
      * @param {Uint8Array} data
      * @param {AbortOptions} [options]
      */
    def _storeRecord(key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def _storeRecord(
      key: js.typedarray.Uint8Array,
      data: js.typedarray.Uint8Array,
      options: typings.libp2pInterfaces.mod.AbortOptions
    ): js.Promise[Unit] = js.native
    
    /**
      * Validate record according to the received validation function
      *
      * @param {Uint8Array} key
      * @param {Uint8Array} value
      */
    def _validateRecord(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    def _validator(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    @JSName("_validator")
    var _validator_Original: ValidateFn = js.native
    
    /**
      * Try to subscribe a topic with Pubsub and returns the local value if available.
      *
      * @param {Uint8Array} key - identifier of the value to be subscribed.
      * @param {AbortOptions} [options]
      */
    def get(key: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(key: js.typedarray.Uint8Array, options: typings.libp2pInterfaces.mod.AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Publishes a value through pubsub.
      *
      * @param {Uint8Array} key - identifier of the value to be published.
      * @param {Uint8Array} val - value to be propagated.
      * @param {AbortOptions} [options]
      */
    def put(key: js.typedarray.Uint8Array, `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(
      key: js.typedarray.Uint8Array,
      `val`: js.typedarray.Uint8Array,
      options: typings.libp2pInterfaces.mod.AbortOptions
    ): js.Promise[Unit] = js.native
    
    /**
      * Unsubscribe topic.
      *
      * @param {Uint8Array} key - identifier of the value to unsubscribe.
      * @returns {void}
      */
    def unsubscribe(key: js.typedarray.Uint8Array): Unit = js.native
  }
  
  type AbortOptions = typings.libp2pInterfaces.mod.AbortOptions
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
  
  type PubSubMessage = Message
  
  type SubscriptionKeyFn = typings.datastorePubsub.distSrcTypesMod.SubscriptionKeyFn
}

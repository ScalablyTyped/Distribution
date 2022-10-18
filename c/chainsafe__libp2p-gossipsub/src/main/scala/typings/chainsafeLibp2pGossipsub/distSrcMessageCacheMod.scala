package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.anon.Count
import typings.chainsafeLibp2pGossipsub.anon.Message
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageId
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.MsgIdToStrFn
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PeerIdStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageCacheMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message-cache", "MessageCache")
  @js.native
  open class MessageCache protected () extends StObject {
    /**
      * Holds history of messages in timebounded history arrays
      */
    def this(
      /**
      * The number of indices in the cache history used for gossiping. That means that a message
      * won't get gossiped anymore when shift got called `gossip` many times after inserting the
      * message in the cache.
      */
    gossip: Double,
      historyCapacity: Double,
      msgIdToStrFn: MsgIdToStrFn
    ) = this()
    
    /**
      * Retrieves a message from the cache by its ID, if it is still present
      */
    def get(msgId: js.typedarray.Uint8Array): js.UndefOr[IMessage] = js.native
    
    /**
      * Retrieves a list of message IDs for a set of topics
      */
    def getGossipIDs(topics: Set[String]): Map[String, js.Array[js.typedarray.Uint8Array]] = js.native
    
    /**
      * Increases the iwant count for the given message by one and returns the message together
      * with the iwant if the message exists.
      */
    def getWithIWantCount(msgIdStr: String, p: String): Count | Null = js.native
    
    /**
      * The number of indices in the cache history used for gossiping. That means that a message
      * won't get gossiped anymore when shift got called `gossip` many times after inserting the
      * message in the cache.
      */
    /* private */ val gossip: Any = js.native
    
    var history: js.Array[js.Array[CacheEntry]] = js.native
    
    def msgIdToStrFn(msgId: js.typedarray.Uint8Array): String = js.native
    @JSName("msgIdToStrFn")
    var msgIdToStrFn_Original: MsgIdToStrFn = js.native
    
    var msgs: Map[String, MessageCacheEntry] = js.native
    
    def observeDuplicate(msgId: MsgIdStr, fromPeerIdStr: PeerIdStr): Unit = js.native
    
    /**
      * Adds a message to the current window and the cache
      * Returns true if the message is not known and is inserted in the cache
      */
    def put(messageId: MessageId, msg: IMessage): Boolean = js.native
    def put(messageId: MessageId, msg: IMessage, validated: Boolean): Boolean = js.native
    
    def remove(msgId: MsgIdStr): MessageCacheEntry | Null = js.native
    
    /**
      * Shifts the current window, discarding messages older than this.history.length of the cache
      */
    def shift(): Unit = js.native
    
    def size: Double = js.native
    
    /**
      * Gets a message with msgId and tags it as validated.
      * This function also returns the known peers that have sent us this message. This is used to
      * prevent us sending redundant messages to peers who have already propagated it.
      */
    def validate(msgId: MsgIdStr): Message | Null = js.native
  }
  
  trait CacheEntry
    extends StObject
       with MessageId {
    
    var topic: TopicStr
  }
  object CacheEntry {
    
    inline def apply(msgId: js.typedarray.Uint8Array, msgIdStr: MsgIdStr, topic: TopicStr): CacheEntry = {
      val __obj = js.Dynamic.literal(msgId = msgId.asInstanceOf[js.Any], msgIdStr = msgIdStr.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheEntry]
    }
    
    extension [Self <: CacheEntry](x: Self) {
      
      inline def setTopic(value: TopicStr): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageCacheEntry extends StObject {
    
    /**
      * For every message and peer the number of times this peer asked for the message
      */
    var iwantCounts: Map[PeerIdStr, Double]
    
    var message: IMessage
    
    /**
      * Tracks peers that sent this message before it has been validated by the app layer
      */
    var originatingPeers: Set[PeerIdStr]
    
    /**
      * Tracks if the message has been validated by the app layer and thus forwarded
      */
    var validated: Boolean
  }
  object MessageCacheEntry {
    
    inline def apply(
      iwantCounts: Map[PeerIdStr, Double],
      message: IMessage,
      originatingPeers: Set[PeerIdStr],
      validated: Boolean
    ): MessageCacheEntry = {
      val __obj = js.Dynamic.literal(iwantCounts = iwantCounts.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originatingPeers = originatingPeers.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageCacheEntry]
    }
    
    extension [Self <: MessageCacheEntry](x: Self) {
      
      inline def setIwantCounts(value: Map[PeerIdStr, Double]): Self = StObject.set(x, "iwantCounts", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: IMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOriginatingPeers(value: Set[PeerIdStr]): Self = StObject.set(x, "originatingPeers", value.asInstanceOf[js.Any])
      
      inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    }
  }
}

package typings.chainsafeLibp2pGossipsub

import typings.denque.mod.^
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcScoreMessageDeliveriesMod {
  
  @js.native
  sealed trait DeliveryRecordStatus extends StObject
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score/message-deliveries", "DeliveryRecordStatus")
  @js.native
  object DeliveryRecordStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeliveryRecordStatus & Double] = js.native
    
    /**
      * we were instructed by the validator to ignore the message
      */
    @js.native
    sealed trait ignored
      extends StObject
         with DeliveryRecordStatus
    /* 3 */ val ignored: typings.chainsafeLibp2pGossipsub.distSrcScoreMessageDeliveriesMod.DeliveryRecordStatus.ignored & Double = js.native
    
    /**
      * we know the message is invalid
      */
    @js.native
    sealed trait invalid
      extends StObject
         with DeliveryRecordStatus
    /* 2 */ val invalid: typings.chainsafeLibp2pGossipsub.distSrcScoreMessageDeliveriesMod.DeliveryRecordStatus.invalid & Double = js.native
    
    /**
      * we don't know (yet) if the message is valid
      */
    @js.native
    sealed trait unknown
      extends StObject
         with DeliveryRecordStatus
    /* 0 */ val unknown: typings.chainsafeLibp2pGossipsub.distSrcScoreMessageDeliveriesMod.DeliveryRecordStatus.unknown & Double = js.native
    
    /**
      * we know the message is valid
      */
    @js.native
    sealed trait valid
      extends StObject
         with DeliveryRecordStatus
    /* 1 */ val valid: typings.chainsafeLibp2pGossipsub.distSrcScoreMessageDeliveriesMod.DeliveryRecordStatus.valid & Double = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/score/message-deliveries", "MessageDeliveries")
  @js.native
  open class MessageDeliveries () extends StObject {
    
    def clear(): Unit = js.native
    
    def ensureRecord(msgIdStr: String): DeliveryRecord = js.native
    
    def gc(): Unit = js.native
    
    var queue: ^[DeliveryQueueEntry] = js.native
    
    /* private */ var records: Any = js.native
  }
  
  trait DeliveryQueueEntry extends StObject {
    
    var expire: Double
    
    var msgId: String
  }
  object DeliveryQueueEntry {
    
    inline def apply(expire: Double, msgId: String): DeliveryQueueEntry = {
      val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryQueueEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeliveryQueueEntry] (val x: Self) extends AnyVal {
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setMsgId(value: String): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeliveryRecord extends StObject {
    
    var firstSeen: Double
    
    var peers: Set[String]
    
    var status: DeliveryRecordStatus
    
    var validated: Double
  }
  object DeliveryRecord {
    
    inline def apply(firstSeen: Double, peers: Set[String], status: DeliveryRecordStatus, validated: Double): DeliveryRecord = {
      val __obj = js.Dynamic.literal(firstSeen = firstSeen.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeliveryRecord] (val x: Self) extends AnyVal {
      
      inline def setFirstSeen(value: Double): Self = StObject.set(x, "firstSeen", value.asInstanceOf[js.Any])
      
      inline def setPeers(value: Set[String]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: DeliveryRecordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValidated(value: Double): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    }
  }
}

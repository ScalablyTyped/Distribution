package typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.backoff
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.control
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.data
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.from
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.key
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.peerID
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.seqno
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.signature
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.signedPeerRecord
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.subscribe
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.topic
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.topicID
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ISubOpts
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC")
@js.native
/**
  * Constructs a new RPC.
  * @param [p] Properties to set
  */
open class RPC ()
  extends StObject
     with IRPC {
  def this(p: IRPC) = this()
  
  /** RPC _control. */
  var _control: js.UndefOr[control] = js.native
  
  /** RPC messages. */
  @JSName("messages")
  var messages_RPC: js.Array[IMessage] = js.native
  
  /** RPC subscriptions. */
  @JSName("subscriptions")
  var subscriptions_RPC: js.Array[ISubOpts] = js.native
  
  /**
    * Converts this RPC to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object RPC {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a ControlGraft. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlGraft")
  @js.native
  /**
    * Constructs a new ControlGraft.
    * @param [p] Properties to set
    */
  open class ControlGraft ()
    extends StObject
       with IControlGraft {
    def this(p: IControlGraft) = this()
    
    /** ControlGraft _topicID. */
    var _topicID: js.UndefOr[topicID] = js.native
    
    /**
      * Converts this ControlGraft to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ControlGraft {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlGraft")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlGraft]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): ControlGraft = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlGraft]
    /**
      * Decodes a ControlGraft message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns ControlGraft
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlGraft]
    inline def decode(r: Reader, l: Double): ControlGraft = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlGraft]
    
    /**
      * Encodes the specified ControlGraft message. Does not implicitly {@link RPC.ControlGraft.verify|verify} messages.
      * @param m ControlGraft message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: IControlGraft): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: IControlGraft, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ControlGraft message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns ControlGraft
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[ControlGraft]
    
    /**
      * Creates a plain object from a ControlGraft message. Also converts values to other types if specified.
      * @param m ControlGraft
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: ControlGraft): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: ControlGraft, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a ControlIHave. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlIHave")
  @js.native
  /**
    * Constructs a new ControlIHave.
    * @param [p] Properties to set
    */
  open class ControlIHave ()
    extends StObject
       with IControlIHave {
    def this(p: IControlIHave) = this()
    
    /** ControlIHave _topicID. */
    var _topicID: js.UndefOr[topicID] = js.native
    
    /** ControlIHave messageIDs. */
    @JSName("messageIDs")
    var messageIDs_ControlIHave: js.Array[js.typedarray.Uint8Array] = js.native
    
    /**
      * Converts this ControlIHave to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ControlIHave {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlIHave")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlIHave]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): ControlIHave = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlIHave]
    /**
      * Decodes a ControlIHave message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns ControlIHave
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlIHave]
    inline def decode(r: Reader, l: Double): ControlIHave = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlIHave]
    
    /**
      * Encodes the specified ControlIHave message. Does not implicitly {@link RPC.ControlIHave.verify|verify} messages.
      * @param m ControlIHave message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: IControlIHave): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: IControlIHave, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ControlIHave message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns ControlIHave
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[ControlIHave]
    
    /**
      * Creates a plain object from a ControlIHave message. Also converts values to other types if specified.
      * @param m ControlIHave
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: ControlIHave): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: ControlIHave, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a ControlIWant. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlIWant")
  @js.native
  /**
    * Constructs a new ControlIWant.
    * @param [p] Properties to set
    */
  open class ControlIWant ()
    extends StObject
       with IControlIWant {
    def this(p: IControlIWant) = this()
    
    /** ControlIWant messageIDs. */
    @JSName("messageIDs")
    var messageIDs_ControlIWant: js.Array[js.typedarray.Uint8Array] = js.native
    
    /**
      * Converts this ControlIWant to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ControlIWant {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlIWant")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlIWant]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): ControlIWant = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlIWant]
    /**
      * Decodes a ControlIWant message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns ControlIWant
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlIWant]
    inline def decode(r: Reader, l: Double): ControlIWant = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlIWant]
    
    /**
      * Encodes the specified ControlIWant message. Does not implicitly {@link RPC.ControlIWant.verify|verify} messages.
      * @param m ControlIWant message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: IControlIWant): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: IControlIWant, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ControlIWant message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns ControlIWant
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[ControlIWant]
    
    /**
      * Creates a plain object from a ControlIWant message. Also converts values to other types if specified.
      * @param m ControlIWant
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: ControlIWant): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: ControlIWant, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a ControlMessage. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlMessage")
  @js.native
  /**
    * Constructs a new ControlMessage.
    * @param [p] Properties to set
    */
  open class ControlMessage ()
    extends StObject
       with IControlMessage {
    def this(p: IControlMessage) = this()
    
    /** ControlMessage graft. */
    @JSName("graft")
    var graft_ControlMessage: js.Array[IControlGraft] = js.native
    
    /** ControlMessage ihave. */
    @JSName("ihave")
    var ihave_ControlMessage: js.Array[IControlIHave] = js.native
    
    /** ControlMessage iwant. */
    @JSName("iwant")
    var iwant_ControlMessage: js.Array[IControlIWant] = js.native
    
    /** ControlMessage prune. */
    @JSName("prune")
    var prune_ControlMessage: js.Array[IControlPrune] = js.native
    
    /**
      * Converts this ControlMessage to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ControlMessage {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlMessage]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): ControlMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlMessage]
    /**
      * Decodes a ControlMessage message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns ControlMessage
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlMessage]
    inline def decode(r: Reader, l: Double): ControlMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlMessage]
    
    /**
      * Encodes the specified ControlMessage message. Does not implicitly {@link RPC.ControlMessage.verify|verify} messages.
      * @param m ControlMessage message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: IControlMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: IControlMessage, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ControlMessage message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns ControlMessage
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[ControlMessage]
    
    /**
      * Creates a plain object from a ControlMessage message. Also converts values to other types if specified.
      * @param m ControlMessage
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: ControlMessage): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: ControlMessage, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a ControlPrune. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlPrune")
  @js.native
  /**
    * Constructs a new ControlPrune.
    * @param [p] Properties to set
    */
  open class ControlPrune ()
    extends StObject
       with IControlPrune {
    def this(p: IControlPrune) = this()
    
    /** ControlPrune _backoff. */
    var _backoff: js.UndefOr[backoff] = js.native
    
    /** ControlPrune _topicID. */
    var _topicID: js.UndefOr[topicID] = js.native
    
    /** ControlPrune peers. */
    @JSName("peers")
    var peers_ControlPrune: js.Array[IPeerInfo] = js.native
    
    /**
      * Converts this ControlPrune to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object ControlPrune {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.ControlPrune")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlPrune]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): ControlPrune = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlPrune]
    /**
      * Decodes a ControlPrune message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns ControlPrune
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[ControlPrune]
    inline def decode(r: Reader, l: Double): ControlPrune = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[ControlPrune]
    
    /**
      * Encodes the specified ControlPrune message. Does not implicitly {@link RPC.ControlPrune.verify|verify} messages.
      * @param m ControlPrune message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: IControlPrune): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: IControlPrune, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ControlPrune message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns ControlPrune
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[ControlPrune]
    
    /**
      * Creates a plain object from a ControlPrune message. Also converts values to other types if specified.
      * @param m ControlPrune
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: ControlPrune): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: ControlPrune, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a Message. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.Message")
  @js.native
  /**
    * Constructs a new Message.
    * @param [p] Properties to set
    */
  open class Message ()
    extends StObject
       with IMessage {
    def this(p: IMessage) = this()
    
    /** Message _data. */
    var _data: js.UndefOr[data] = js.native
    
    /** Message _from. */
    var _from: js.UndefOr[from] = js.native
    
    /** Message _key. */
    var _key: js.UndefOr[key] = js.native
    
    /** Message _seqno. */
    var _seqno: js.UndefOr[seqno] = js.native
    
    /** Message _signature. */
    var _signature: js.UndefOr[signature] = js.native
    
    /**
      * Converts this Message to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Message topic */
    /* CompleteClass */
    var topic: String = js.native
  }
  object Message {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.Message")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[Message]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[Message]
    /**
      * Decodes a Message message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns Message
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[Message]
    inline def decode(r: Reader, l: Double): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[Message]
    
    /**
      * Encodes the specified Message message. Does not implicitly {@link RPC.Message.verify|verify} messages.
      * @param m Message message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: IMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: IMessage, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Message message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns Message
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    /**
      * Creates a plain object from a Message message. Also converts values to other types if specified.
      * @param m Message
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: Message): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: Message, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a PeerInfo. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.PeerInfo")
  @js.native
  /**
    * Constructs a new PeerInfo.
    * @param [p] Properties to set
    */
  open class PeerInfo ()
    extends StObject
       with IPeerInfo {
    def this(p: IPeerInfo) = this()
    
    /** PeerInfo _peerID. */
    var _peerID: js.UndefOr[peerID] = js.native
    
    /** PeerInfo _signedPeerRecord. */
    var _signedPeerRecord: js.UndefOr[signedPeerRecord] = js.native
    
    /**
      * Converts this PeerInfo to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object PeerInfo {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.PeerInfo")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): PeerInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[PeerInfo]
    /**
      * Decodes a PeerInfo message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns PeerInfo
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
    inline def decode(r: Reader, l: Double): PeerInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[PeerInfo]
    
    /**
      * Encodes the specified PeerInfo message. Does not implicitly {@link RPC.PeerInfo.verify|verify} messages.
      * @param m PeerInfo message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: IPeerInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: IPeerInfo, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a PeerInfo message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns PeerInfo
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
    
    /**
      * Creates a plain object from a PeerInfo message. Also converts values to other types if specified.
      * @param m PeerInfo
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: PeerInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: PeerInfo, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  /** Represents a SubOpts. */
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.SubOpts")
  @js.native
  /**
    * Constructs a new SubOpts.
    * @param [p] Properties to set
    */
  open class SubOpts ()
    extends StObject
       with ISubOpts {
    def this(p: ISubOpts) = this()
    
    /** SubOpts _subscribe. */
    var _subscribe: js.UndefOr[subscribe] = js.native
    
    /** SubOpts _topic. */
    var _topic: js.UndefOr[topic] = js.native
    
    /**
      * Converts this SubOpts to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object SubOpts {
    
    @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/rpc", "RPC.SubOpts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(r: js.typedarray.Uint8Array): SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[SubOpts]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): SubOpts = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[SubOpts]
    /**
      * Decodes a SubOpts message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns SubOpts
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(r: Reader): SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[SubOpts]
    inline def decode(r: Reader, l: Double): SubOpts = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[SubOpts]
    
    /**
      * Encodes the specified SubOpts message. Does not implicitly {@link RPC.SubOpts.verify|verify} messages.
      * @param m SubOpts message or plain object to encode
      * @param [w] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(m: ISubOpts): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(m: ISubOpts, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a SubOpts message from a plain object. Also converts values to their respective internal types.
      * @param d Plain object
      * @returns SubOpts
      */
    /* static member */
    inline def fromObject(d: StringDictionary[Any]): SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[SubOpts]
    
    /**
      * Creates a plain object from a SubOpts message. Also converts values to other types if specified.
      * @param m SubOpts
      * @param [o] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(m: SubOpts): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: SubOpts, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
  
  inline def decode(r: js.typedarray.Uint8Array): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[RPC]
  inline def decode(r: js.typedarray.Uint8Array, l: Double): RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[RPC]
  /**
    * Decodes a RPC message from the specified reader or buffer.
    * @param r Reader or buffer to decode from
    * @param [l] Message length if known beforehand
    * @returns RPC
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(r: Reader): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[RPC]
  inline def decode(r: Reader, l: Double): RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[RPC]
  
  /**
    * Encodes the specified RPC message. Does not implicitly {@link RPC.verify|verify} messages.
    * @param m RPC message or plain object to encode
    * @param [w] Writer to encode to
    * @returns Writer
    */
  inline def encode(m: IRPC): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(m: IRPC, w: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(m.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RPC message from a plain object. Also converts values to their respective internal types.
    * @param d Plain object
    * @returns RPC
    */
  inline def fromObject(d: StringDictionary[Any]): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[RPC]
  
  /**
    * Creates a plain object from a RPC message. Also converts values to other types if specified.
    * @param m RPC
    * @param [o] Conversion options
    * @returns Plain object
    */
  inline def toObject(m: RPC): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(m: RPC, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /** Properties of a ControlGraft. */
  trait IControlGraft extends StObject {
    
    /** ControlGraft topicID */
    var topicID: js.UndefOr[String | Null] = js.undefined
  }
  object IControlGraft {
    
    inline def apply(): IControlGraft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlGraft]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControlGraft] (val x: Self) extends AnyVal {
      
      inline def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      inline def setTopicIDNull: Self = StObject.set(x, "topicID", null)
      
      inline def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  /** Properties of a ControlIHave. */
  trait IControlIHave extends StObject {
    
    /** ControlIHave messageIDs */
    var messageIDs: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
    
    /** ControlIHave topicID */
    var topicID: js.UndefOr[String | Null] = js.undefined
  }
  object IControlIHave {
    
    inline def apply(): IControlIHave = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlIHave]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControlIHave] (val x: Self) extends AnyVal {
      
      inline def setMessageIDs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsNull: Self = StObject.set(x, "messageIDs", null)
      
      inline def setMessageIDsUndefined: Self = StObject.set(x, "messageIDs", js.undefined)
      
      inline def setMessageIDsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value*))
      
      inline def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      inline def setTopicIDNull: Self = StObject.set(x, "topicID", null)
      
      inline def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  /** Properties of a ControlIWant. */
  trait IControlIWant extends StObject {
    
    /** ControlIWant messageIDs */
    var messageIDs: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
  }
  object IControlIWant {
    
    inline def apply(): IControlIWant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlIWant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControlIWant] (val x: Self) extends AnyVal {
      
      inline def setMessageIDs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsNull: Self = StObject.set(x, "messageIDs", null)
      
      inline def setMessageIDsUndefined: Self = StObject.set(x, "messageIDs", js.undefined)
      
      inline def setMessageIDsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value*))
    }
  }
  
  /** Properties of a ControlMessage. */
  trait IControlMessage extends StObject {
    
    /** ControlMessage graft */
    var graft: js.UndefOr[js.Array[IControlGraft] | Null] = js.undefined
    
    /** ControlMessage ihave */
    var ihave: js.UndefOr[js.Array[IControlIHave] | Null] = js.undefined
    
    /** ControlMessage iwant */
    var iwant: js.UndefOr[js.Array[IControlIWant] | Null] = js.undefined
    
    /** ControlMessage prune */
    var prune: js.UndefOr[js.Array[IControlPrune] | Null] = js.undefined
  }
  object IControlMessage {
    
    inline def apply(): IControlMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControlMessage] (val x: Self) extends AnyVal {
      
      inline def setGraft(value: js.Array[IControlGraft]): Self = StObject.set(x, "graft", value.asInstanceOf[js.Any])
      
      inline def setGraftNull: Self = StObject.set(x, "graft", null)
      
      inline def setGraftUndefined: Self = StObject.set(x, "graft", js.undefined)
      
      inline def setGraftVarargs(value: IControlGraft*): Self = StObject.set(x, "graft", js.Array(value*))
      
      inline def setIhave(value: js.Array[IControlIHave]): Self = StObject.set(x, "ihave", value.asInstanceOf[js.Any])
      
      inline def setIhaveNull: Self = StObject.set(x, "ihave", null)
      
      inline def setIhaveUndefined: Self = StObject.set(x, "ihave", js.undefined)
      
      inline def setIhaveVarargs(value: IControlIHave*): Self = StObject.set(x, "ihave", js.Array(value*))
      
      inline def setIwant(value: js.Array[IControlIWant]): Self = StObject.set(x, "iwant", value.asInstanceOf[js.Any])
      
      inline def setIwantNull: Self = StObject.set(x, "iwant", null)
      
      inline def setIwantUndefined: Self = StObject.set(x, "iwant", js.undefined)
      
      inline def setIwantVarargs(value: IControlIWant*): Self = StObject.set(x, "iwant", js.Array(value*))
      
      inline def setPrune(value: js.Array[IControlPrune]): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneNull: Self = StObject.set(x, "prune", null)
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setPruneVarargs(value: IControlPrune*): Self = StObject.set(x, "prune", js.Array(value*))
    }
  }
  
  /** Properties of a ControlPrune. */
  trait IControlPrune extends StObject {
    
    /** ControlPrune backoff */
    var backoff: js.UndefOr[Double | Null] = js.undefined
    
    /** ControlPrune peers */
    var peers: js.UndefOr[js.Array[IPeerInfo] | Null] = js.undefined
    
    /** ControlPrune topicID */
    var topicID: js.UndefOr[String | Null] = js.undefined
  }
  object IControlPrune {
    
    inline def apply(): IControlPrune = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlPrune]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IControlPrune] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffNull: Self = StObject.set(x, "backoff", null)
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setPeers(value: js.Array[IPeerInfo]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      inline def setPeersNull: Self = StObject.set(x, "peers", null)
      
      inline def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
      
      inline def setPeersVarargs(value: IPeerInfo*): Self = StObject.set(x, "peers", js.Array(value*))
      
      inline def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      inline def setTopicIDNull: Self = StObject.set(x, "topicID", null)
      
      inline def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  /** Properties of a Message. */
  trait IMessage extends StObject {
    
    /** Message data */
    var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    /** Message from */
    var from: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    /** Message key */
    var key: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    /** Message seqno */
    var seqno: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    /** Message signature */
    var signature: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    /** Message topic */
    var topic: String
  }
  object IMessage {
    
    inline def apply(topic: String): IMessage = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFrom(value: js.typedarray.Uint8Array): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSeqno(value: js.typedarray.Uint8Array): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
      
      inline def setSeqnoNull: Self = StObject.set(x, "seqno", null)
      
      inline def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureNull: Self = StObject.set(x, "signature", null)
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  /** Properties of a PeerInfo. */
  trait IPeerInfo extends StObject {
    
    /** PeerInfo peerID */
    var peerID: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    /** PeerInfo signedPeerRecord */
    var signedPeerRecord: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  }
  object IPeerInfo {
    
    inline def apply(): IPeerInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPeerInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPeerInfo] (val x: Self) extends AnyVal {
      
      inline def setPeerID(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerID", value.asInstanceOf[js.Any])
      
      inline def setPeerIDNull: Self = StObject.set(x, "peerID", null)
      
      inline def setPeerIDUndefined: Self = StObject.set(x, "peerID", js.undefined)
      
      inline def setSignedPeerRecord(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
      
      inline def setSignedPeerRecordNull: Self = StObject.set(x, "signedPeerRecord", null)
      
      inline def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
    }
  }
  
  /** Properties of a SubOpts. */
  trait ISubOpts extends StObject {
    
    /** SubOpts subscribe */
    var subscribe: js.UndefOr[Boolean | Null] = js.undefined
    
    /** SubOpts topic */
    var topic: js.UndefOr[String | Null] = js.undefined
  }
  object ISubOpts {
    
    inline def apply(): ISubOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISubOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISubOpts] (val x: Self) extends AnyVal {
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeNull: Self = StObject.set(x, "subscribe", null)
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicNull: Self = StObject.set(x, "topic", null)
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}

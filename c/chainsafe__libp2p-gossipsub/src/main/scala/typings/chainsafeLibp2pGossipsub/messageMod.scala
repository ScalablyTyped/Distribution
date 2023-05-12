package typings.chainsafeLibp2pGossipsub

import org.scalablytyped.runtime.StringDictionary
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.IRPC
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlGraft
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlIHave
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlIWant
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlMessage
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlPrune
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IPeerInfo
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ISubOpts
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object messageMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC")
  @js.native
  /**
    * Constructs a new RPC.
    * @param [p] Properties to set
    */
  open class RPC ()
    extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC {
    def this(p: IRPC) = this()
  }
  /* static members */
  object RPC {
    
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a ControlGraft. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlGraft")
    @js.native
    /**
      * Constructs a new ControlGraft.
      * @param [p] Properties to set
      */
    open class ControlGraft ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.ControlGraft {
      def this(p: IControlGraft) = this()
    }
    object ControlGraft {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlGraft")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft]
      /**
        * Decodes a ControlGraft message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns ControlGraft
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft]
      
      /**
        * Creates a plain object from a ControlGraft message. Also converts values to other types if specified.
        * @param m ControlGraft
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlGraft, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    /** Represents a ControlIHave. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlIHave")
    @js.native
    /**
      * Constructs a new ControlIHave.
      * @param [p] Properties to set
      */
    open class ControlIHave ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.ControlIHave {
      def this(p: IControlIHave) = this()
    }
    object ControlIHave {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlIHave")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave]
      /**
        * Decodes a ControlIHave message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns ControlIHave
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave]
      
      /**
        * Creates a plain object from a ControlIHave message. Also converts values to other types if specified.
        * @param m ControlIHave
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIHave, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    /** Represents a ControlIWant. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlIWant")
    @js.native
    /**
      * Constructs a new ControlIWant.
      * @param [p] Properties to set
      */
    open class ControlIWant ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.ControlIWant {
      def this(p: IControlIWant) = this()
    }
    object ControlIWant {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlIWant")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant]
      /**
        * Decodes a ControlIWant message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns ControlIWant
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant]
      
      /**
        * Creates a plain object from a ControlIWant message. Also converts values to other types if specified.
        * @param m ControlIWant
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlIWant, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    /** Represents a ControlMessage. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlMessage")
    @js.native
    /**
      * Constructs a new ControlMessage.
      * @param [p] Properties to set
      */
    open class ControlMessage ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.ControlMessage {
      def this(p: IControlMessage) = this()
    }
    object ControlMessage {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlMessage")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage]
      /**
        * Decodes a ControlMessage message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns ControlMessage
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage]
      
      /**
        * Creates a plain object from a ControlMessage message. Also converts values to other types if specified.
        * @param m ControlMessage
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlMessage, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    /** Represents a ControlPrune. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlPrune")
    @js.native
    /**
      * Constructs a new ControlPrune.
      * @param [p] Properties to set
      */
    open class ControlPrune ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.ControlPrune {
      def this(p: IControlPrune) = this()
    }
    object ControlPrune {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.ControlPrune")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune]
      /**
        * Decodes a ControlPrune message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns ControlPrune
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune]
      
      /**
        * Creates a plain object from a ControlPrune message. Also converts values to other types if specified.
        * @param m ControlPrune
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ControlPrune, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    /** Represents a Message. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.Message")
    @js.native
    /**
      * Constructs a new Message.
      * @param [p] Properties to set
      */
    open class Message ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.Message {
      def this(p: IMessage) = this()
    }
    object Message {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.Message")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message]
      /**
        * Decodes a Message message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns Message
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message]
      
      /**
        * Creates a plain object from a Message message. Also converts values to other types if specified.
        * @param m Message
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.Message, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    /** Represents a PeerInfo. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.PeerInfo")
    @js.native
    /**
      * Constructs a new PeerInfo.
      * @param [p] Properties to set
      */
    open class PeerInfo ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.PeerInfo {
      def this(p: IPeerInfo) = this()
    }
    object PeerInfo {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.PeerInfo")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo]
      /**
        * Decodes a PeerInfo message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns PeerInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo]
      
      /**
        * Creates a plain object from a PeerInfo message. Also converts values to other types if specified.
        * @param m PeerInfo
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.PeerInfo, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    /** Represents a SubOpts. */
    @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.SubOpts")
    @js.native
    /**
      * Constructs a new SubOpts.
      * @param [p] Properties to set
      */
    open class SubOpts ()
      extends typings.chainsafeLibp2pGossipsub.distSrcMessageMod.RPC.SubOpts {
      def this(p: ISubOpts) = this()
    }
    object SubOpts {
      
      @JSImport("@chainsafe/libp2p-gossipsub/message", "RPC.SubOpts")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts]
      inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts]
      /**
        * Decodes a SubOpts message from the specified reader or buffer.
        * @param r Reader or buffer to decode from
        * @param [l] Message length if known beforehand
        * @returns SubOpts
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts]
      inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts]
      
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
      inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts]
      
      /**
        * Creates a plain object from a SubOpts message. Also converts values to other types if specified.
        * @param m SubOpts
        * @param [o] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.SubOpts, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    inline def decode(r: js.typedarray.Uint8Array): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC]
    inline def decode(r: js.typedarray.Uint8Array, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC]
    /**
      * Decodes a RPC message from the specified reader or buffer.
      * @param r Reader or buffer to decode from
      * @param [l] Message length if known beforehand
      * @returns RPC
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    inline def decode(r: Reader): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC]
    inline def decode(r: Reader, l: Double): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(r.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC]
    
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
    inline def fromObject(d: StringDictionary[Any]): typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(d.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC]
    
    /**
      * Creates a plain object from a RPC message. Also converts values to other types if specified.
      * @param m RPC
      * @param [o] Conversion options
      * @returns Plain object
      */
    inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(m: typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC, o: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  }
}

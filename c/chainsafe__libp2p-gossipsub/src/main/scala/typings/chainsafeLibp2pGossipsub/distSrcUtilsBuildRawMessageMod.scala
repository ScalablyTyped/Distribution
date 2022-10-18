package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfig
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.TopicStr
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError
import typings.libp2pInterfacePubsub.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsBuildRawMessageMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/buildRawMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/buildRawMessage", "SignPrefix")
  @js.native
  val SignPrefix: js.typedarray.Uint8Array = js.native
  
  inline def buildRawMessage(
    publishConfig: PublishConfig,
    topic: TopicStr,
    originalData: js.typedarray.Uint8Array,
    transformedData: js.typedarray.Uint8Array
  ): js.Promise[RawMessageAndMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRawMessage")(publishConfig.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], originalData.asInstanceOf[js.Any], transformedData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RawMessageAndMessage]]
  
  inline def validateToRawMessage(signaturePolicy: /* "StrictNoSign" */ /* "StrictSign" */ String, msg: IMessage): js.Promise[ValidationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateToRawMessage")(signaturePolicy.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValidationResult]]
  
  trait RawMessageAndMessage extends StObject {
    
    var msg: Message
    
    var raw: IMessage
  }
  object RawMessageAndMessage {
    
    inline def apply(msg: Message, raw: IMessage): RawMessageAndMessage = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawMessageAndMessage]
    }
    
    extension [Self <: RawMessageAndMessage](x: Self) {
      
      inline def setMsg(value: Message): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: IMessage): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chainsafeLibp2pGossipsub.anon.Valid
    - typings.chainsafeLibp2pGossipsub.anon.ErrorValid
  */
  trait ValidationResult extends StObject
  object ValidationResult {
    
    inline def ErrorValid(error: ValidateError): typings.chainsafeLibp2pGossipsub.anon.ErrorValid = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], valid = false)
      __obj.asInstanceOf[typings.chainsafeLibp2pGossipsub.anon.ErrorValid]
    }
    
    inline def Valid(message: Message): typings.chainsafeLibp2pGossipsub.anon.Valid = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], valid = true)
      __obj.asInstanceOf[typings.chainsafeLibp2pGossipsub.anon.Valid]
    }
  }
}

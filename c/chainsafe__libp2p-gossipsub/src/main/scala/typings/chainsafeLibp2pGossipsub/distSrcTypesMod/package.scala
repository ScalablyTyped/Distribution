package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Ignore
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Reject
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.^
import typings.libp2pInterfacePubsub.mod.Message
import typings.libp2pInterfacePubsub.mod.TopicValidatorResult
import typings.libp2pInterfacePubsub.mod.TopicValidatorResult.Accept
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def rejectReasonFromAcceptance(acceptance: Exclude[TopicValidatorResult, Accept]): Ignore | Reject = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectReasonFromAcceptance")(acceptance.asInstanceOf[js.Any]).asInstanceOf[Ignore | Reject]

type FastMsgIdFn = js.Function1[/* msg */ IMessage, String | Double]

type IPStr = String

type MsgIdFn = js.Function1[/* msg */ Message, js.Promise[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]

type MsgIdStr = String

type MsgIdToStrFn = js.Function1[/* msgId */ js.typedarray.Uint8Array, String]

type PeerIdStr = String

type TopicStr = String

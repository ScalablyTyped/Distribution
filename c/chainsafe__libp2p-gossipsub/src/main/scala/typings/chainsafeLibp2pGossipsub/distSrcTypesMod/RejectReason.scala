package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RejectReason extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/types", "RejectReason")
@js.native
object RejectReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RejectReason & String] = js.native
  
  /**
    * The peer that sent the message OR the source from field is blacklisted.
    * Causes messages to be ignored, not penalized, neither do score record creation.
    */
  @js.native
  sealed trait Blacklisted
    extends StObject
       with RejectReason
  /* "blacklisted" */ val Blacklisted: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Blacklisted & String = js.native
  
  /**
    * The message failed the configured validation during decoding.
    * SelfOrigin is considered a ValidationError
    */
  @js.native
  sealed trait Error
    extends StObject
       with RejectReason
  /* "error" */ val Error: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error & String = js.native
  
  /**
    * Custom validator fn reported status IGNORE.
    */
  @js.native
  sealed trait Ignore
    extends StObject
       with RejectReason
  /* "ignore" */ val Ignore: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Ignore & String = js.native
  
  /**
    * Custom validator fn reported status REJECT.
    */
  @js.native
  sealed trait Reject
    extends StObject
       with RejectReason
  /* "reject" */ val Reject: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Reject & String = js.native
}

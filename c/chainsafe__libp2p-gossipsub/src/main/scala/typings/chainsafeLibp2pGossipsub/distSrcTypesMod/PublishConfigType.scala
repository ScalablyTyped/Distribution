package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublishConfigType extends StObject
@JSImport("@chainsafe/libp2p-gossipsub/dist/src/types", "PublishConfigType")
@js.native
object PublishConfigType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublishConfigType & Double] = js.native
  
  @js.native
  sealed trait Anonymous
    extends StObject
       with PublishConfigType
  /* 1 */ val Anonymous: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Anonymous & Double = js.native
  
  @js.native
  sealed trait Signing
    extends StObject
       with PublishConfigType
  /* 0 */ val Signing: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Signing & Double = js.native
}

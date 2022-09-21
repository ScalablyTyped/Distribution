package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestState extends StObject
@JSImport("cesium", "RequestState")
@js.native
object RequestState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestState & Double] = js.native
  
  /**
    * Actual http request has been sent.
    */
  @js.native
  sealed trait ACTIVE
    extends StObject
       with RequestState
  /* 2 */ val ACTIVE: typings.cesium.mod.RequestState.ACTIVE & Double = js.native
  
  /**
    * Request was cancelled, either explicitly or automatically because of low priority.
    */
  @js.native
  sealed trait CANCELLED
    extends StObject
       with RequestState
  /* 4 */ val CANCELLED: typings.cesium.mod.RequestState.CANCELLED & Double = js.native
  
  /**
    * Request failed.
    */
  @js.native
  sealed trait FAILED
    extends StObject
       with RequestState
  /* 5 */ val FAILED: typings.cesium.mod.RequestState.FAILED & Double = js.native
  
  /**
    * Issued but not yet active. Will become active when open slots are available.
    */
  @js.native
  sealed trait ISSUED
    extends StObject
       with RequestState
  /* 1 */ val ISSUED: typings.cesium.mod.RequestState.ISSUED & Double = js.native
  
  /**
    * Request completed successfully.
    */
  @js.native
  sealed trait RECEIVED
    extends StObject
       with RequestState
  /* 3 */ val RECEIVED: typings.cesium.mod.RequestState.RECEIVED & Double = js.native
  
  /**
    * Initial unissued state.
    */
  @js.native
  sealed trait UNISSUED
    extends StObject
       with RequestState
  /* 0 */ val UNISSUED: typings.cesium.mod.RequestState.UNISSUED & Double = js.native
}

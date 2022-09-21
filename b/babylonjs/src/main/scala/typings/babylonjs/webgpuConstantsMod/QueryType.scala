package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryType extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "QueryType")
@js.native
object QueryType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryType & String] = js.native
  
  @js.native
  sealed trait Occlusion
    extends StObject
       with QueryType
  /* "occlusion" */ val Occlusion: typings.babylonjs.webgpuConstantsMod.QueryType.Occlusion & String = js.native
  
  @js.native
  sealed trait Timestamp
    extends StObject
       with QueryType
  /* "timestamp" */ val Timestamp: typings.babylonjs.webgpuConstantsMod.QueryType.Timestamp & String = js.native
}

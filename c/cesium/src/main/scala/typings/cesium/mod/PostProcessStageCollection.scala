package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PostProcessStageCollection")
@js.native
class PostProcessStageCollection () extends StObject {
  
  def add(stage: PostProcessStage): PostProcessStage = js.native
  
  def contains(stage: PostProcessStage): Boolean = js.native
  
  def destroy(): Unit = js.native
  
  val fxaa: PostProcessStage = js.native
  
  def get(index: Double): PostProcessStage = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val length: Double = js.native
  
  val ready: Boolean = js.native
  
  def remove(stage: PostProcessStage): Boolean = js.native
  
  def removeAll(): Unit = js.native
}

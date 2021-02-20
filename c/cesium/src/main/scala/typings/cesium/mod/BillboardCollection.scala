package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BillboardCollection")
@js.native
class BillboardCollection () extends StObject {
  def this(options: typings.cesium.anon.BlendOption) = this()
  
  def add(): Billboard = js.native
  def add(billboard: BillboardOptions): Billboard = js.native
  
  var blendOption: BlendOption = js.native
  
  def contains(): Boolean = js.native
  def contains(billboard: Billboard): Boolean = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def get(index: Double): Billboard = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var length: Double = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  def remove(billboard: Billboard): Boolean = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Unit = js.native
}

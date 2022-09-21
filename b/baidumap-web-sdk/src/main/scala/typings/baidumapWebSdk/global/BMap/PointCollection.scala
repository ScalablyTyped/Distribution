package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.PointCollectionOption
import typings.baidumapWebSdk.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.PointCollection")
@js.native
open class PointCollection protected ()
  extends StObject
     with typings.baidumapWebSdk.BMap.PointCollection {
  def this(points: js.Array[typings.baidumapWebSdk.BMap.Point]) = this()
  def this(points: js.Array[typings.baidumapWebSdk.BMap.Point], opts: PointCollectionOption) = this()
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  override def onclick(event: Type): Unit = js.native
  
  /* CompleteClass */
  override def onmouseout(event: Type): Unit = js.native
  
  /* CompleteClass */
  override def onmouseover(event: Type): Unit = js.native
  
  /* CompleteClass */
  override def setPoints(points: js.Array[typings.baidumapWebSdk.BMap.Point]): Unit = js.native
  
  /* CompleteClass */
  override def setStyles(styles: PointCollectionOption): Unit = js.native
}

package typings.bmapgl.global.BMapGL

import typings.bmapgl.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.Convertor")
@js.native
open class Convertor ()
  extends StObject
     with typings.bmapgl.BMapGL.Convertor {
  
  /* CompleteClass */
  override def translate(
    points: js.Array[typings.bmapgl.BMapGL.Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ Points, Unit]
  ): Unit = js.native
}

package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.LocalCityOptions
import typings.bmapgl.BMapGL.LocalCityResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.LocalCity")
@js.native
open class LocalCity ()
  extends StObject
     with typings.bmapgl.BMapGL.LocalCity {
  def this(opts: LocalCityOptions) = this()
  
  /* CompleteClass */
  override def get(callback: js.Function1[/* result */ LocalCityResult, Unit]): Unit = js.native
}

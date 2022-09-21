package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.LocalCityOptions
import typings.baidumapWebSdk.BMap.LocalCityResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.LocalCity")
@js.native
open class LocalCity ()
  extends StObject
     with typings.baidumapWebSdk.BMap.LocalCity {
  def this(opts: LocalCityOptions) = this()
  
  /* CompleteClass */
  override def get(callback: js.Function1[/* result */ LocalCityResult, Unit]): Unit = js.native
}

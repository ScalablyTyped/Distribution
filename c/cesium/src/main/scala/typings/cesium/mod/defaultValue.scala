package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultValue {
  
  inline def apply[T, D](value: T, defaultValue: D): T | D = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T | D]
  
  @JSImport("cesium", "defaultValue")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cesium", "defaultValue.EMPTY_OBJECT")
  @js.native
  val EMPTY_OBJECT: js.Any = js.native
}

package typings.ckeditorCkeditor5Utils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorities {
  
  @JSImport("@ckeditor/ckeditor5-utils", "priorities")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(priority: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(priority.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def get(priority: PriorityString): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(priority.asInstanceOf[js.Any]).asInstanceOf[Double]
}

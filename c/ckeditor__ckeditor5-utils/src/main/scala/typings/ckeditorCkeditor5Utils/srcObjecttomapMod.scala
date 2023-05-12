package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjecttomapMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/objecttomap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Map[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Map[String, T]]
  inline def default[T](obj: StringDictionary[T]): Map[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any]).asInstanceOf[Map[String, T]]
}

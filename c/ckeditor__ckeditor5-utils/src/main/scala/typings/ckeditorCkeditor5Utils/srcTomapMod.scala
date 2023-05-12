package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTomapMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/tomap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Map[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Map[String, T]]
  inline def default[T](data: js.Iterable[js.Tuple2[String, T]]): Map[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[Map[String, T]]
  inline def default[T](data: StringDictionary[T]): Map[String, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[Map[String, T]]
}

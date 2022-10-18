package typings.bunyanDebugStream

import typings.bunyanDebugStream.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("bunyan-debug-stream/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyColors(message: String, colorList: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyColors")(message.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dateToString(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToString")().asInstanceOf[js.UndefOr[String]]
  inline def dateToString(date: js.Date): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToString")(date.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def lpad(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lpad")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lpad(str: String, count: Double, fill: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lpad")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lpad(str: Double, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lpad")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lpad(str: Double, count: Double, fill: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lpad")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def srcToString(src: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("srcToString")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def srcToString(src: File, basepath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("srcToString")(src.asInstanceOf[js.Any], basepath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def srcToString(src: File, basepath: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("srcToString")(src.asInstanceOf[js.Any], basepath.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def srcToString(src: File, basepath: Unit, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("srcToString")(src.asInstanceOf[js.Any], basepath.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toShortFilename(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toShortFilename")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toShortFilename(filename: String, basepath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toShortFilename")(filename.asInstanceOf[js.Any], basepath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toShortFilename(filename: String, basepath: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toShortFilename")(filename.asInstanceOf[js.Any], basepath.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toShortFilename(filename: String, basepath: Unit, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toShortFilename")(filename.asInstanceOf[js.Any], basepath.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
}

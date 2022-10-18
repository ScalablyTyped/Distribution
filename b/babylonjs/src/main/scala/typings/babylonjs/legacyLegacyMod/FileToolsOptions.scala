package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileToolsOptions {
  
  @JSImport("babylonjs/Legacy/legacy", "FileToolsOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "FileToolsOptions.BaseUrl")
  @js.native
  def BaseUrl: String = js.native
  inline def BaseUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "FileToolsOptions.CorsBehavior")
  @js.native
  def CorsBehavior: String | (js.Function1[/* url */ String | js.Array[String], String]) = js.native
  inline def CorsBehavior_=(x: String | (js.Function1[/* url */ String | js.Array[String], String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorsBehavior")(x.asInstanceOf[js.Any])
  
  inline def DefaultRetryStrategy(url: String, request: typings.babylonjs.miscWebRequestMod.WebRequest, retryIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DefaultRetryStrategy")(url.asInstanceOf[js.Any], request.asInstanceOf[js.Any], retryIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def PreprocessUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("PreprocessUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}

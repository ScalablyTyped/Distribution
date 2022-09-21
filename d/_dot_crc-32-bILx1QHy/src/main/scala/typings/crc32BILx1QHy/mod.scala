package typings.crc32BILx1QHy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport(".crc-32-bILx1QHy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bstr(data: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bstr")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def bstr(data: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bstr")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def buf(data: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def buf(data: js.Array[Double], seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def buf(data: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def buf(data: js.typedarray.Uint8Array, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def str(data: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def str(data: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("str")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport(".crc-32-bILx1QHy", "version")
  @js.native
  val version: String = js.native
}

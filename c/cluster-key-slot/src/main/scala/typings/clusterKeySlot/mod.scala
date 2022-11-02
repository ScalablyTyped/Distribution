package typings.clusterKeySlot

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Convert a string or Buffer into a redis slot hash.
  inline def apply(value: String): Double = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(value: Buffer): Double = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("cluster-key-slot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateMulti(values: js.Array[String | Buffer]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMulti")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
}

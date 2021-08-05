package typings.btoaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(decodedData: String): EncodedData = ^.asInstanceOf[js.Dynamic].apply(decodedData.asInstanceOf[js.Any]).asInstanceOf[EncodedData]
  
  @JSImport("btoa-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type EncodedData = String
}

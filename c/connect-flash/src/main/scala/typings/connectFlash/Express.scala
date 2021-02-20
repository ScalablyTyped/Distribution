package typings.connectFlash

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  @js.native
  trait Request extends StObject {
    
    def flash(): StringDictionary[js.Array[String]] = js.native
    def flash(message: String): js.Array[String] = js.native
    def flash(`type`: String, format: String, args: js.Any*): Double = js.native
    def flash(`type`: String, message: String): Double = js.native
    def flash(`type`: String, message: js.Array[String]): Double = js.native
  }
}

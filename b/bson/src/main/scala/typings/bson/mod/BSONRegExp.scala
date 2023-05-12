package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "BSONRegExp")
@js.native
open class BSONRegExp protected () extends BSONValue {
  /**
    * @param pattern - The regular expression pattern to match
    * @param options - The regular expression options
    */
  def this(pattern: String) = this()
  def this(pattern: String, options: String) = this()
  
  var options: String = js.native
  
  var pattern: String = js.native
}
/* static members */
object BSONRegExp {
  
  @JSImport("bson", "BSONRegExp")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseOptions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")().asInstanceOf[String]
  inline def parseOptions(options: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
}

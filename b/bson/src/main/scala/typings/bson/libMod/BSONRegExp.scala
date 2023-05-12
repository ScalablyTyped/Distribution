package typings.bson.libMod

import typings.bson.libRegexpMod.BSONRegExpExtended
import typings.bson.libRegexpMod.BSONRegExpExtendedLegacy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "BSONRegExp")
@js.native
open class BSONRegExp protected ()
  extends typings.bson.libBsonMod.BSONRegExp {
  /**
    * @param pattern - The regular expression pattern to match
    * @param options - The regular expression options
    */
  def this(pattern: String) = this()
  def this(pattern: String, options: String) = this()
}
/* static members */
object BSONRegExp {
  
  @JSImport("bson/lib", "BSONRegExp")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromExtendedJSON(doc: BSONRegExpExtended): typings.bson.libRegexpMod.BSONRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libRegexpMod.BSONRegExp]
  /** @internal */
  inline def fromExtendedJSON(doc: BSONRegExpExtendedLegacy): typings.bson.libRegexpMod.BSONRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libRegexpMod.BSONRegExp]
  
  inline def parseOptions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")().asInstanceOf[String]
  inline def parseOptions(options: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
}

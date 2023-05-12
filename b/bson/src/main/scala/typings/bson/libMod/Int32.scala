package typings.bson.libMod

import typings.bson.libExtendedJsonMod.EJSONOptions
import typings.bson.libInt32Mod.Int32Extended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "Int32")
@js.native
open class Int32 protected ()
  extends typings.bson.libBsonMod.Int32 {
  def this(value: String) = this()
  /**
    * Create an Int32 type
    *
    * @param value - the number we want to represent as an int32.
    */
  def this(value: scala.Double) = this()
}
/* static members */
object Int32 {
  
  @JSImport("bson/lib", "Int32")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromExtendedJSON(doc: Int32Extended): scala.Double | typings.bson.libInt32Mod.Int32 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | typings.bson.libInt32Mod.Int32]
  inline def fromExtendedJSON(doc: Int32Extended, options: EJSONOptions): scala.Double | typings.bson.libInt32Mod.Int32 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | typings.bson.libInt32Mod.Int32]
}

package typings.bson.libMod

import typings.bson.libDoubleMod.DoubleExtended
import typings.bson.libExtendedJsonMod.EJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "Double")
@js.native
open class Double protected ()
  extends typings.bson.libBsonMod.Double {
  /**
    * Create a Double type
    *
    * @param value - the number we want to represent as a double.
    */
  def this(value: scala.Double) = this()
}
/* static members */
object Double {
  
  @JSImport("bson/lib", "Double")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromExtendedJSON(doc: DoubleExtended): scala.Double | typings.bson.libDoubleMod.Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | typings.bson.libDoubleMod.Double]
  inline def fromExtendedJSON(doc: DoubleExtended, options: EJSONOptions): scala.Double | typings.bson.libDoubleMod.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | typings.bson.libDoubleMod.Double]
}

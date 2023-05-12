package typings.bson.libMod

import typings.bson.libBsonMod.Document
import typings.bson.libCodeMod.CodeExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "Code")
@js.native
open class Code protected ()
  extends typings.bson.libBsonMod.Code {
  /**
    * @param code - a string or function.
    * @param scope - an optional scope for the function.
    */
  def this(code: String) = this()
  def this(code: js.Function) = this()
  def this(code: String, scope: Document) = this()
  def this(code: js.Function, scope: Document) = this()
}
/* static members */
object Code {
  
  @JSImport("bson/lib", "Code")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromExtendedJSON(doc: CodeExtended): typings.bson.libCodeMod.Code = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libCodeMod.Code]
}

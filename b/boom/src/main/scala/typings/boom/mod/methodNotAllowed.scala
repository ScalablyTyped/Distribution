package typings.boom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("boom", "methodNotAllowed")
@js.native
object methodNotAllowed extends js.Object {
  
  /**
    * Returns a 405 Method Not Allowed error
    * @param message optional message.
    * @param data optional additional error data.
    * @param allow optional string or array of strings (to be combined and separated by ', ') which is set to the 'Allow' header.
    * @see {@link https://github.com/hapijs/boom#boommethodnotallowedmessage-data-allow}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: String): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
  def apply[Data](message: String, data: Data, allow: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = js.native
  def apply[Data](message: String, data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  def apply[Data](message: String, data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
}

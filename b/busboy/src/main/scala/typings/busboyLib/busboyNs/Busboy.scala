package typings
package busboyLib.busboyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Busboy
  extends nodeLib.NodeJSNs.WritableStream {
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_field(
    event: busboyLib.busboyLibStrings.field,
    listener: js.Function6[
      /* fieldname */ java.lang.String, 
      /* val */ js.Any, 
      /* fieldnameTruncated */ scala.Boolean, 
      /* valTruncated */ scala.Boolean, 
      /* encoding */ java.lang.String, 
      /* mimetype */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fieldsLimit(event: busboyLib.busboyLibStrings.fieldsLimit, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_file(
    event: busboyLib.busboyLibStrings.file,
    listener: js.Function5[
      /* fieldname */ java.lang.String, 
      /* file */ nodeLib.NodeJSNs.ReadableStream, 
      /* filename */ java.lang.String, 
      /* encoding */ java.lang.String, 
      /* mimetype */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_filesLimit(event: busboyLib.busboyLibStrings.filesLimit, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: busboyLib.busboyLibStrings.finish, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_partsLimit(event: busboyLib.busboyLibStrings.partsLimit, callback: js.Function0[scala.Unit]): this.type = js.native
}


package typings.busboy.busboy

import typings.busboy.busboyStrings.field
import typings.busboy.busboyStrings.fieldsLimit
import typings.busboy.busboyStrings.file
import typings.busboy.busboyStrings.filesLimit
import typings.busboy.busboyStrings.finish
import typings.busboy.busboyStrings.partsLimit
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Busboy extends WritableStream {
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_field(
    event: field,
    listener: js.Function6[
      /* fieldname */ String, 
      /* val */ js.Any, 
      /* fieldnameTruncated */ Boolean, 
      /* valTruncated */ Boolean, 
      /* encoding */ String, 
      /* mimetype */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fieldsLimit(event: fieldsLimit, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_file(
    event: file,
    listener: js.Function5[
      /* fieldname */ String, 
      /* file */ ReadableStream, 
      /* filename */ String, 
      /* encoding */ String, 
      /* mimetype */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_filesLimit(event: filesLimit, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_partsLimit(event: partsLimit, callback: js.Function0[Unit]): this.type = js.native
}


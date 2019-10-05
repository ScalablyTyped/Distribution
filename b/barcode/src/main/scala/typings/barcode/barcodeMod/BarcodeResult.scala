package typings.barcode.barcodeMod

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeResult extends js.Object {
  def getBase64(callback: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit]): Unit
  def getStream(callback: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit]): Unit
  def saveImage(outputfilePath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit
}

object BarcodeResult {
  @scala.inline
  def apply(
    getBase64: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit] => Unit,
    getStream: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit] => Unit,
    saveImage: (String, js.Function1[/* err */ ErrnoException, Unit]) => Unit
  ): BarcodeResult = {
    val __obj = js.Dynamic.literal(getBase64 = js.Any.fromFunction1(getBase64), getStream = js.Any.fromFunction1(getStream), saveImage = js.Any.fromFunction2(saveImage))
  
    __obj.asInstanceOf[BarcodeResult]
  }
}


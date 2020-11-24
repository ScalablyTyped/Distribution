package typings.barcode.mod

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarcodeResult extends js.Object {
  
  def getBase64(callback: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit]): Unit = js.native
  
  def getStream(callback: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit]): Unit = js.native
  
  def saveImage(outputfilePath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
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
  
  @scala.inline
  implicit class BarcodeResultOps[Self <: BarcodeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBase64(value: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit] => Unit): Self = this.set("getBase64", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStream(value: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit] => Unit): Self = this.set("getStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveImage(value: (String, js.Function1[/* err */ ErrnoException, Unit]) => Unit): Self = this.set("saveImage", js.Any.fromFunction2(value))
  }
}

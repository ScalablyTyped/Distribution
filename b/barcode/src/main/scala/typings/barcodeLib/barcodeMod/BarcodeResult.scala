package typings
package barcodeLib.barcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeResult extends js.Object {
  def getBase64(
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* base64String */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit
  def getStream(
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stream */ nodeLib.NodeJSNs.ReadableStream, 
      scala.Unit
    ]
  ): scala.Unit
  def saveImage(
    outputfilePath: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit
}

object BarcodeResult {
  @scala.inline
  def apply(
    getBase64: js.Function1[
      js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* base64String */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ],
    getStream: js.Function1[
      js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* stream */ nodeLib.NodeJSNs.ReadableStream, 
        scala.Unit
      ], 
      scala.Unit
    ],
    saveImage: js.Function2[
      java.lang.String, 
      js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
      scala.Unit
    ]
  ): BarcodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBase64")(getBase64)
    __obj.updateDynamic("getStream")(getStream)
    __obj.updateDynamic("saveImage")(saveImage)
    __obj.asInstanceOf[BarcodeResult]
  }
}


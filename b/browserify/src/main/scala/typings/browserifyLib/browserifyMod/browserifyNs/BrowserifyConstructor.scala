package typings
package browserifyLib.browserifyMod.browserifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserifyConstructor
  extends org.scalablytyped.runtime.Instantiable0[BrowserifyObject]
     with org.scalablytyped.runtime.Instantiable2[
      (/* files */ js.Array[InputFile]) | (/* file */ InputFile), 
      /* opts */ Options, 
      BrowserifyObject
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* files */ js.Array[InputFile]) | (/* file */ InputFile) | (/* opts */ Options), 
      BrowserifyObject
    ] {
  def apply(): BrowserifyObject = js.native
  def apply(file: InputFile): BrowserifyObject = js.native
  def apply(file: InputFile, opts: Options): BrowserifyObject = js.native
  def apply(files: js.Array[InputFile]): BrowserifyObject = js.native
  def apply(files: js.Array[InputFile], opts: Options): BrowserifyObject = js.native
  def apply(opts: Options): BrowserifyObject = js.native
}


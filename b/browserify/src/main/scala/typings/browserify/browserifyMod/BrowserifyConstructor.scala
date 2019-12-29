package typings.browserify.browserifyMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserifyConstructor
  extends Instantiable0[BrowserifyObject]
     with Instantiable1[
      (/* files */ js.Array[InputFile]) | (/* file */ InputFile) | (/* opts */ Options), 
      BrowserifyObject
    ]
     with Instantiable2[
      (/* files */ js.Array[InputFile]) | (/* file */ InputFile), 
      /* opts */ Options, 
      BrowserifyObject
    ] {
  def apply(): BrowserifyObject = js.native
  def apply(files: js.Array[InputFile]): BrowserifyObject = js.native
  def apply(files: js.Array[InputFile], opts: Options): BrowserifyObject = js.native
  def apply(file: InputFile): BrowserifyObject = js.native
  def apply(file: InputFile, opts: Options): BrowserifyObject = js.native
  def apply(opts: Options): BrowserifyObject = js.native
}


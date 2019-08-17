package typings.browserify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserifyMod {
  import typings.node.NodeJSNs.ReadableStream

  // Browserify accepts a filename, an input stream for file inputs, or a FileOptions configuration
  // for each file in a bundle.
  type InputFile = String | ReadableStream | FileOptions
}

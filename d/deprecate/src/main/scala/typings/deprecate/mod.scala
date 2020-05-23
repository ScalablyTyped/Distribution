package typings.deprecate

import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deprecate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Set to false to not output a color. Defaults to '\x1b[31;1m' which is red.
    */
  var color: String = js.native
  /**
    * Set to false to do nothing at all when the deprecate method is called. Useful in tests of the library you're deprecating things within.
    */
  var silence: Boolean = js.native
  /**
    * The stream to which output is written. Defaults to process.stderr
    */
  var stream: WriteStream = js.native
  /**
    * Call deprecate within a function you are deprecating.
    *
    * It will spit out all the messages to the console the first time and only the first time the method is called.
    */
  def apply(methodName: String, message: String*): Unit = js.native
}


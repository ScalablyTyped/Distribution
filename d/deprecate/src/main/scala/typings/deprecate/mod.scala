package typings.deprecate

import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Call deprecate within a function you are deprecating.
    *
    * It will spit out all the messages to the console the first time and only the first time the method is called.
    */
  inline def apply(methodName: String, message: String*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(methodName.asInstanceOf[js.Any]).`++`(message.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("deprecate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set to false to not output a color. Defaults to '\x1b[31;1m' which is red.
    */
  @JSImport("deprecate", "color")
  @js.native
  def color: String = js.native
  inline def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  
  /**
    * Set to false to do nothing at all when the deprecate method is called. Useful in tests of the library you're deprecating things within.
    */
  @JSImport("deprecate", "silence")
  @js.native
  def silence: Boolean = js.native
  inline def silence_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silence")(x.asInstanceOf[js.Any])
  
  /**
    * The stream to which output is written. Defaults to process.stderr
    */
  @JSImport("deprecate", "stream")
  @js.native
  def stream: WriteStream = js.native
  inline def stream_=(x: WriteStream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
}

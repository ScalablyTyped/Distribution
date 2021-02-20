package typings.bufferToStream

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("buffer-to-stream", JSImport.Namespace)
  @js.native
  val ^ : ToStream = js.native
  
  type ToStream = js.Function2[/* buffer */ String | Buffer, /* chunkSize */ js.UndefOr[Double], Readable]
  
  type _To = ToStream
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ToStream = ^
}

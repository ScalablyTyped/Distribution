package typings.cassandraDriver.libTypesMod.types

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultStream extends Readable {
  
  def add(chunk: Buffer): Unit = js.native
  
  var buffer: Buffer = js.native
  
  var paused: Boolean = js.native
}

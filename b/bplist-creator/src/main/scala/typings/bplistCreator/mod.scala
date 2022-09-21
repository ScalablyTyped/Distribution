package typings.bplistCreator

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bplist-creator", JSImport.Namespace)
  @js.native
  val ^ : BPlistCreator = js.native
  
  type BPlistCreator = js.Function1[/* object */ PlistJsObj, Buffer]
  
  type PlistJsObj = js.Array[Any] | (Record[Any, Any])
  
  type _To = BPlistCreator
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BPlistCreator = ^
}

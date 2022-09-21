package typings.bl

import typings.bl.bufferListMod.BufferList
import typings.node.bufferMod.global.Buffer
import typings.readableStream.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bl", JSImport.Namespace)
  @js.native
  open class ^ () extends BufferListStream {
    def this(callbackOrData: String) = this()
    def this(callbackOrData: js.Array[Buffer | typings.bl.bufferListMod.^]) = this()
    def this(callbackOrData: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]) = this()
    def this(callbackOrData: typings.bl.bufferListMod.^) = this()
    def this(callbackOrData: Buffer) = this()
  }
  @JSImport("bl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("bl", "isBufferList")
  @js.native
  def isBufferList: js.Function1[/* other */ Any, Boolean] = js.native
  inline def isBufferList_=(x: js.Function1[/* other */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBufferList")(x.asInstanceOf[js.Any])
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.bl.bufferListMod.^ because Inheritance from two classes. Inlined  */ @js.native
  trait BufferListStream
    extends Duplex
       with BufferList
}

package typings.bl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.bl.bufferListMod.BufferListAcceptedTypes
import typings.bl.bufferListMod.BufferListConstructor
import typings.node.bufferMod.global.Buffer
import typings.readableStream.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BufferListStream is a Node Duplex Stream, so it can be read from
  * and written to like a standard Node stream. You can also pipe()
  * to and from a BufferListStream instance.
  *
  * The constructor takes an optional callback, if supplied, the
  * callback will be called with an error argument followed by a
  * reference to the bl instance, when bl.end() is called
  * (i.e. from a piped stream).
  *
  * This is a convenient method of collecting the entire contents of
  * a stream, particularly when the stream is chunky, such as a network
  * stream.
  *
  * Normally, no arguments are required for the constructor, but you can
  * initialise the list by passing in a single Buffer object or an array
  * of Buffer object.
  *
  * `new` is not strictly required, if you don't instantiate a new object,
  * it will be done automatically for you so you can create a new instance
  * simply with:
  *
  * ```js
  * const { BufferListStream } = require('bl');
  * const bl = BufferListStream();
  *
  * // equivalent to:
  *
  * const { BufferListStream } = require('bl');
  * const bl = new BufferListStream();
  * ```
  *
  * N.B. For backwards compatibility reasons, BufferListStream is the default
  * export when you `require('bl')`:
  *
  * ```js
  * const { BufferListStream } = require('bl')
  *
  * // equivalent to:
  *
  * const BufferListStream = require('bl')
  * ```
  */
object mod extends Shortcut {
  
  @JSImport("bl", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BufferListStreamConstructor = js.native
  
  /**
    * Rexporting BufferList and BufferListStream to fix
    * issue with require/commonjs import and "export = " below.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bl", "BufferList")
  @js.native
  open class BufferList ()
    extends StObject
       with typings.bl.bufferListMod.BufferList {
    def this(initData: BufferListAcceptedTypes) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bl", "BufferListStream")
  @js.native
  open class BufferListStreamCls () extends BufferListStream {
    def this(initData: BufferListStreamInit) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bl", JSImport.Namespace)
  @js.native
  open class Class () extends BufferListStream {
    def this(initData: BufferListStreamInit) = this()
  }
  
  @js.native
  trait BufferListStream
    extends Duplex
       with typings.bl.bufferListMod.BufferList
  
  @js.native
  trait BufferListStreamConstructor
    extends StObject
       with Instantiable0[BufferListStream]
       with Instantiable1[/* initData */ BufferListStreamInit, BufferListStream] {
    
    def apply(): BufferListStream = js.native
    def apply(callback: BufferListStreamInit): BufferListStream = js.native
    
    /**
      * Rexporting BufferList and BufferListStream to fix
      * issue with require/commonjs import and "export = " below.
      */
    def BufferList(): typings.bl.bufferListMod.BufferList = js.native
    def BufferList(initData: BufferListAcceptedTypes): typings.bl.bufferListMod.BufferList = js.native
    
    def BufferListStream(): typings.bl.mod.BufferListStream = js.native
    def BufferListStream(callback: BufferListStreamInit): typings.bl.mod.BufferListStream = js.native
    @JSName("BufferListStream")
    var BufferListStream_Original: BufferListStreamConstructor = js.native
    
    /**
      * Rexporting BufferList and BufferListStream to fix
      * issue with require/commonjs import and "export = " below.
      */
    @JSName("BufferList")
    var BufferList_Original: BufferListConstructor = js.native
    
    /**
      * Determines if the passed object is a BufferList. It will return true
      * if the passed object is an instance of BufferList or BufferListStream
      * and false otherwise.
      *
      * N.B. this won't return true for BufferList or BufferListStream instances
      * created by versions of this library before this static method was added.
      *
      * @param other
      */
    def isBufferList(other: Any): Boolean = js.native
  }
  
  type BufferListStreamInit = (js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]) | BufferListAcceptedTypes
  
  type _To = js.Object & BufferListStreamConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & BufferListStreamConstructor = ^
}

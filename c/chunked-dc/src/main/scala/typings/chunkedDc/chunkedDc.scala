package typings.chunkedDc

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.std.ArrayBuffer
import typings.std.IterableIterator
import typings.std.IteratorResult
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chunkedDc {
  
  /** chunker.ts **/
  @js.native
  trait Chunker
    extends StObject
       with IterableIterator[Uint8Array] {
    
    var hasNext: Boolean = js.native
    
    def next(): IteratorResult[Uint8Array, js.Any] = js.native
  }
  
  @js.native
  trait ChunkerStatic
    extends StObject
       with Instantiable3[/* id */ Double, /* message */ Uint8Array, /* chunkSize */ Double, Chunker]
  
  /** common.ts **/
  trait CommonStatic extends StObject {
    
    var HEADER_LENGTH: Double
  }
  object CommonStatic {
    
    @scala.inline
    def apply(HEADER_LENGTH: Double): CommonStatic = {
      val __obj = js.Dynamic.literal(HEADER_LENGTH = HEADER_LENGTH.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonStatic]
    }
    
    @scala.inline
    implicit class CommonStaticMutableBuilder[Self <: CommonStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHEADER_LENGTH(value: Double): Self = StObject.set(x, "HEADER_LENGTH", value.asInstanceOf[js.Any])
    }
  }
  
  /** unchunker.ts **/
  type MessageListener = js.Function2[/* message */ Uint8Array, /* context */ js.UndefOr[js.Any], Unit]
  
  /** main.ts **/
  trait Standalone extends StObject {
    
    var Chunker: ChunkerStatic
    
    var Unchunker: UnchunkerStatic
  }
  object Standalone {
    
    @scala.inline
    def apply(Chunker: ChunkerStatic, Unchunker: UnchunkerStatic): Standalone = {
      val __obj = js.Dynamic.literal(Chunker = Chunker.asInstanceOf[js.Any], Unchunker = Unchunker.asInstanceOf[js.Any])
      __obj.asInstanceOf[Standalone]
    }
    
    @scala.inline
    implicit class StandaloneMutableBuilder[Self <: Standalone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunker(value: ChunkerStatic): Self = StObject.set(x, "Chunker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnchunker(value: UnchunkerStatic): Self = StObject.set(x, "Unchunker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Unchunker extends StObject {
    
    def add(chunk: ArrayBuffer): Unit = js.native
    def add(chunk: ArrayBuffer, context: js.Any): Unit = js.native
    
    def gc(maxAge: Double): Double = js.native
    
    def onMessage(message: Uint8Array): Unit = js.native
    def onMessage(message: Uint8Array, context: js.Any): Unit = js.native
    @JSName("onMessage")
    var onMessage_Original: MessageListener = js.native
  }
  
  @js.native
  trait UnchunkerStatic
    extends StObject
       with Instantiable0[Unchunker]
}

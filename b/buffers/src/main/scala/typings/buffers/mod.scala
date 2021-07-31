package typings.buffers

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("buffers", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuffersStatics = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("buffers", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with Buffers {
    def this(bufs: js.Array[Buffer]) = this()
    def this(bufs: Buffers) = this()
  }
  
  @js.native
  trait Buffers extends StObject {
    
    var buffers: js.Array[Buffer] = js.native
    
    def copy(dst: Buffer): Double = js.native
    def copy(dst: Buffer, dstStart: Double): Double = js.native
    def copy(dst: Buffer, dstStart: Double, start: Double): Double = js.native
    def copy(dst: Buffer, dstStart: Double, start: Double, end: Double): Double = js.native
    def copy(dst: Buffer, dstStart: Double, start: Unit, end: Double): Double = js.native
    def copy(dst: Buffer, dstStart: Unit, start: Double): Double = js.native
    def copy(dst: Buffer, dstStart: Unit, start: Double, end: Double): Double = js.native
    def copy(dst: Buffer, dstStart: Unit, start: Unit, end: Double): Double = js.native
    
    def get(i: Double): js.Any = js.native
    
    def indexOf(needle: String): Double = js.native
    def indexOf(needle: String, offset: Double): Double = js.native
    def indexOf(needle: Buffer): Double = js.native
    def indexOf(needle: Buffer, offset: Double): Double = js.native
    
    var length: Double = js.native
    
    def push(items: Buffer*): Double = js.native
    
    def set(i: Double, b: js.Any): Unit = js.native
    
    def slice(): Buffer = js.native
    def slice(i: Double): Buffer = js.native
    def slice(i: Double, j: Double): Buffer = js.native
    def slice(i: Unit, j: Double): Buffer = js.native
    
    def splice(i: Double, howMany: Double, items: Buffer*): Buffers = js.native
    def splice(i: Double, howMany: Unit, items: Buffer*): Buffers = js.native
    
    def toBuffer(): Buffer = js.native
    
    def toString(encoding: js.Any): String = js.native
    def toString(encoding: js.Any, start: Double): String = js.native
    def toString(encoding: js.Any, start: Double, end: Double): String = js.native
    def toString(encoding: js.Any, start: Unit, end: Double): String = js.native
    def toString(encoding: Unit, start: Double): String = js.native
    def toString(encoding: Unit, start: Double, end: Double): String = js.native
    def toString(encoding: Unit, start: Unit, end: Double): String = js.native
    
    def unshift(items: Buffer*): Double = js.native
  }
  
  @js.native
  trait BuffersStatics
    extends StObject
       with Instantiable0[Buffers]
       with Instantiable1[(/* bufs */ js.Array[Buffer]) | (/* bufs */ Buffers), Buffers] {
    
    def apply(): Buffers = js.native
    def apply(bufs: js.Array[Buffer]): Buffers = js.native
    def apply(bufs: Buffers): Buffers = js.native
  }
  
  type _To = js.Object & BuffersStatics
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & BuffersStatics = ^
}

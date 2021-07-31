package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("bitwise/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/buffer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def and(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def create(bits: js.Array[Bit]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def nand(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def nor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def not(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def or(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def read(buffer: Buffer): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
    @scala.inline
    def read(buffer: Buffer, offset: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    @scala.inline
    def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    @scala.inline
    def read(buffer: Buffer, offset: Unit, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    @scala.inline
    def readInt(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def readInt(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def readInt(buffer: Buffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def readUInt(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def readUInt(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def readUInt(buffer: Buffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def xnor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def xor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  @scala.inline
  def and(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def create(bits: js.Array[Bit]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def nand(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def nor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def not(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def or(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def read(buffer: Buffer): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  @scala.inline
  def read(buffer: Buffer, offset: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  @scala.inline
  def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  @scala.inline
  def read(buffer: Buffer, offset: Unit, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  
  @scala.inline
  def readInt(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def readInt(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readInt(buffer: Buffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readInt(buffer: Buffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def readUInt(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def readUInt(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readUInt(buffer: Buffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readUInt(buffer: Buffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def xnor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def xor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}

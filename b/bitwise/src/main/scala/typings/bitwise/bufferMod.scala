package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  object default {
    
    @JSImport("bitwise/buffer", "default.and")
    @js.native
    def and(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/buffer", "default.and")
    @js.native
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/buffer", "default.create")
    @js.native
    def create(bits: js.Array[Bit]): Buffer = js.native
    
    @JSImport("bitwise/buffer", "default.modify")
    @js.native
    def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
    @JSImport("bitwise/buffer", "default.modify")
    @js.native
    def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
    
    @JSImport("bitwise/buffer", "default.nand")
    @js.native
    def nand(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/buffer", "default.nand")
    @js.native
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/buffer", "default.nor")
    @js.native
    def nor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/buffer", "default.nor")
    @js.native
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/buffer", "default.not")
    @js.native
    def not(buffer: Buffer): Buffer = js.native
    
    @JSImport("bitwise/buffer", "default.or")
    @js.native
    def or(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/buffer", "default.or")
    @js.native
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/buffer", "default.read")
    @js.native
    def read(buffer: Buffer): js.Array[Bit] = js.native
    @JSImport("bitwise/buffer", "default.read")
    @js.native
    def read(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Array[Bit] = js.native
    @JSImport("bitwise/buffer", "default.read")
    @js.native
    def read(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
    @JSImport("bitwise/buffer", "default.read")
    @js.native
    def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
    
    @JSImport("bitwise/buffer", "default.readInt")
    @js.native
    def readInt(buffer: Buffer): Double = js.native
    @JSImport("bitwise/buffer", "default.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
    @JSImport("bitwise/buffer", "default.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: Double): Double = js.native
    @JSImport("bitwise/buffer", "default.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    
    @JSImport("bitwise/buffer", "default.readUInt")
    @js.native
    def readUInt(buffer: Buffer): Double = js.native
    @JSImport("bitwise/buffer", "default.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
    @JSImport("bitwise/buffer", "default.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: Double): Double = js.native
    @JSImport("bitwise/buffer", "default.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    
    @JSImport("bitwise/buffer", "default.xnor")
    @js.native
    def xnor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/buffer", "default.xnor")
    @js.native
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/buffer", "default.xor")
    @js.native
    def xor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/buffer", "default.xor")
    @js.native
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  }
  
  @JSImport("bitwise/buffer", "and")
  @js.native
  def and(a: Buffer, b: Buffer): Buffer = js.native
  @JSImport("bitwise/buffer", "and")
  @js.native
  def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  
  @JSImport("bitwise/buffer", "create")
  @js.native
  def create(bits: js.Array[Bit]): Buffer = js.native
  
  @JSImport("bitwise/buffer", "modify")
  @js.native
  def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
  @JSImport("bitwise/buffer", "modify")
  @js.native
  def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
  
  @JSImport("bitwise/buffer", "nand")
  @js.native
  def nand(a: Buffer, b: Buffer): Buffer = js.native
  @JSImport("bitwise/buffer", "nand")
  @js.native
  def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  
  @JSImport("bitwise/buffer", "nor")
  @js.native
  def nor(a: Buffer, b: Buffer): Buffer = js.native
  @JSImport("bitwise/buffer", "nor")
  @js.native
  def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  
  @JSImport("bitwise/buffer", "not")
  @js.native
  def not(buffer: Buffer): Buffer = js.native
  
  @JSImport("bitwise/buffer", "or")
  @js.native
  def or(a: Buffer, b: Buffer): Buffer = js.native
  @JSImport("bitwise/buffer", "or")
  @js.native
  def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  
  @JSImport("bitwise/buffer", "read")
  @js.native
  def read(buffer: Buffer): js.Array[Bit] = js.native
  @JSImport("bitwise/buffer", "read")
  @js.native
  def read(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Array[Bit] = js.native
  @JSImport("bitwise/buffer", "read")
  @js.native
  def read(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
  @JSImport("bitwise/buffer", "read")
  @js.native
  def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
  
  @JSImport("bitwise/buffer", "readInt")
  @js.native
  def readInt(buffer: Buffer): Double = js.native
  @JSImport("bitwise/buffer", "readInt")
  @js.native
  def readInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  @JSImport("bitwise/buffer", "readInt")
  @js.native
  def readInt(buffer: Buffer, offset: Double): Double = js.native
  @JSImport("bitwise/buffer", "readInt")
  @js.native
  def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
  
  @JSImport("bitwise/buffer", "readUInt")
  @js.native
  def readUInt(buffer: Buffer): Double = js.native
  @JSImport("bitwise/buffer", "readUInt")
  @js.native
  def readUInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  @JSImport("bitwise/buffer", "readUInt")
  @js.native
  def readUInt(buffer: Buffer, offset: Double): Double = js.native
  @JSImport("bitwise/buffer", "readUInt")
  @js.native
  def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
  
  @JSImport("bitwise/buffer", "xnor")
  @js.native
  def xnor(a: Buffer, b: Buffer): Buffer = js.native
  @JSImport("bitwise/buffer", "xnor")
  @js.native
  def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  
  @JSImport("bitwise/buffer", "xor")
  @js.native
  def xor(a: Buffer, b: Buffer): Buffer = js.native
  @JSImport("bitwise/buffer", "xor")
  @js.native
  def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
}

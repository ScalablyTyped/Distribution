package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Stack
import typings.bitcoinjsLib.scriptSignatureMod.ScriptSignature
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptMod {
  
  @JSImport("bitcoinjs-lib/types/script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compile(chunks: Stack): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(chunks.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def compile(chunks: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(chunks.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def decompile(buffer: js.Array[Double | Buffer]): (js.Array[Double | Buffer]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decompile")(buffer.asInstanceOf[js.Any]).asInstanceOf[(js.Array[Double | Buffer]) | Null]
  @scala.inline
  def decompile(buffer: Buffer): (js.Array[Double | Buffer]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decompile")(buffer.asInstanceOf[js.Any]).asInstanceOf[(js.Array[Double | Buffer]) | Null]
  
  @scala.inline
  def fromASM(asm: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromASM")(asm.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def isCanonicalPubKey(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanonicalPubKey")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isCanonicalScriptSignature(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanonicalScriptSignature")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDefinedHashType(hashType: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedHashType")(hashType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPushOnly(value: Stack): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPushOnly")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object number {
    
    @JSImport("bitcoinjs-lib/types/script", "number")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decode(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def decode(buffer: Buffer, maxLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], minimal.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def decode(buffer: Buffer, maxLength: Unit, minimal: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], minimal.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def encode(_number: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(_number.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  object signature {
    
    @JSImport("bitcoinjs-lib/types/script", "signature")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decode(buffer: Buffer): ScriptSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[ScriptSignature]
    
    @scala.inline
    def encode(signature: Buffer, hashType: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(signature.asInstanceOf[js.Any], hashType.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  @scala.inline
  def toASM(chunks: js.Array[Double | Buffer]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASM")(chunks.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toASM(chunks: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASM")(chunks.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toStack(chunks: js.Array[Double | Buffer]): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStack")(chunks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
  @scala.inline
  def toStack(chunks: Buffer): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStack")(chunks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
  
  type OpCode = Double
}

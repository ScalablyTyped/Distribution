package typings.bip174

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bip174Strings {
  @js.native
  sealed trait Buffer extends js.Object
  
  @js.native
  sealed trait `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket` extends js.Object
  
  @js.native
  sealed trait `Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket` extends js.Object
  
  @js.native
  sealed trait `Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket` extends js.Object
  
  @js.native
  sealed trait number extends js.Object
  
  @js.native
  sealed trait string extends js.Object
  
  @scala.inline
  def Buffer: Buffer = "Buffer".asInstanceOf[Buffer]
  @scala.inline
  def `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`: `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket` = ("{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }").asInstanceOf[`Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`]
  @scala.inline
  def `Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket`: `Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket` = ("{ pubkey: Buffer; signature: Buffer; }").asInstanceOf[`Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket`]
  @scala.inline
  def `Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket`: `Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket` = ("{ script: Buffer; value: number; }").asInstanceOf[`Leftcurlybracket scriptColon BufferSemicolon valueColon numberSemicolon Rightcurlybracket`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}


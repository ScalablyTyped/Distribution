package typings.bip174

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bip174Strings {
  @js.native
  sealed trait Buffer extends js.Object
  
  @js.native
  sealed trait number extends js.Object
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait `{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }` extends js.Object
  
  @js.native
  sealed trait `{ pubkey: Buffer; signature: Buffer; }` extends js.Object
  
  @js.native
  sealed trait `{ script: Buffer; value: number; }` extends js.Object
  
  @scala.inline
  def Buffer: Buffer = "Buffer".asInstanceOf[Buffer]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def `{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }`: `{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }` = "{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }".asInstanceOf[`{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }`]
  @scala.inline
  def `{ pubkey: Buffer; signature: Buffer; }`: `{ pubkey: Buffer; signature: Buffer; }` = "{ pubkey: Buffer; signature: Buffer; }".asInstanceOf[`{ pubkey: Buffer; signature: Buffer; }`]
  @scala.inline
  def `{ script: Buffer; value: number; }`: `{ script: Buffer; value: number; }` = "{ script: Buffer; value: number; }".asInstanceOf[`{ script: Buffer; value: number; }`]
}


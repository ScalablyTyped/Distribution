package typings.bufferhelper

import typings.bufferhelper.mod.encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferhelperStrings {
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait ascii extends encoding
  
  @js.native
  sealed trait base64 extends encoding
  
  @js.native
  sealed trait binary extends encoding
  
  @js.native
  sealed trait hex extends encoding
  
  @js.native
  sealed trait ucs2 extends encoding
  
  @js.native
  sealed trait utf16le extends encoding
  
  @js.native
  sealed trait utf8 extends encoding
}

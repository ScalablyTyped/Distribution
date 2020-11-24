package typings.awsSdkUtilBufferFrom

import typings.awsSdkUtilBufferFrom.mod.StringEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsSdkUtilBufferFromStrings {
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait ascii extends StringEncoding
  
  @js.native
  sealed trait base64 extends StringEncoding
  
  @js.native
  sealed trait binary extends StringEncoding
  
  @js.native
  sealed trait hex extends StringEncoding
  
  @js.native
  sealed trait latin1 extends StringEncoding
  
  @js.native
  sealed trait ucs2 extends StringEncoding
  
  @js.native
  sealed trait utf16le extends StringEncoding
  
  @js.native
  sealed trait utf8 extends StringEncoding
}

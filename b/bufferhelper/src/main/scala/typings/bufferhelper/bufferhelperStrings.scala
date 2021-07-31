package typings.bufferhelper

import typings.bufferhelper.mod.encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferhelperStrings {
  
  @js.native
  sealed trait ascii
    extends StObject
       with encoding
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base64
    extends StObject
       with encoding
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait binary
    extends StObject
       with encoding
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait hex
    extends StObject
       with encoding
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait ucs2
    extends StObject
       with encoding
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  
  @js.native
  sealed trait utf16le
    extends StObject
       with encoding
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @js.native
  sealed trait utf8
    extends StObject
       with encoding
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

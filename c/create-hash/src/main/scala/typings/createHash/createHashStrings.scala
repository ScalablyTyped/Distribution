package typings.createHash

import typings.createHash.mod.algorithm
import typings.createHash.mod.encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHashStrings {
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @scala.inline
  def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
  
  @scala.inline
  def rmd160: rmd160 = "rmd160".asInstanceOf[rmd160]
  
  @scala.inline
  def sha: sha = "sha".asInstanceOf[sha]
  
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @scala.inline
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait base64 extends encoding
  
  @js.native
  sealed trait hex extends encoding
  
  @js.native
  sealed trait md5 extends algorithm
  
  @js.native
  sealed trait ripemd160 extends algorithm
  
  @js.native
  sealed trait rmd160 extends algorithm
  
  @js.native
  sealed trait sha extends algorithm
  
  @js.native
  sealed trait sha1 extends algorithm
  
  @js.native
  sealed trait sha224 extends algorithm
  
  @js.native
  sealed trait sha256 extends algorithm
  
  @js.native
  sealed trait sha384 extends algorithm
  
  @js.native
  sealed trait sha512 extends algorithm
  
  @js.native
  sealed trait utf8 extends encoding
}

package typings.createDashHash

import typings.createDashHash.createDashHashMod.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object createDashHashStrings {
  @js.native
  sealed trait md5 extends Algorithm
  
  @js.native
  sealed trait ripemd160 extends Algorithm
  
  @js.native
  sealed trait rmd160 extends Algorithm
  
  @js.native
  sealed trait sha extends Algorithm
  
  @js.native
  sealed trait sha1 extends Algorithm
  
  @js.native
  sealed trait sha224 extends Algorithm
  
  @js.native
  sealed trait sha256 extends Algorithm
  
  @js.native
  sealed trait sha384 extends Algorithm
  
  @js.native
  sealed trait sha512 extends Algorithm
  
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
}


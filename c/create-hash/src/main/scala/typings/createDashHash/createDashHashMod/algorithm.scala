package typings.createDashHash.createDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.createDashHash.createDashHashStrings.md5
  - typings.createDashHash.createDashHashStrings.rmd160
  - typings.createDashHash.createDashHashStrings.ripemd160
  - typings.createDashHash.createDashHashStrings.sha
  - typings.createDashHash.createDashHashStrings.sha1
  - typings.createDashHash.createDashHashStrings.sha224
  - typings.createDashHash.createDashHashStrings.sha256
  - typings.createDashHash.createDashHashStrings.sha384
  - typings.createDashHash.createDashHashStrings.sha512
*/
trait algorithm extends js.Object

object algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typings.createDashHash.createDashHashStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd160: typings.createDashHash.createDashHashStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def rmd160: typings.createDashHash.createDashHashStrings.rmd160 = this.cast("rmd160")
  @scala.inline
  def sha: typings.createDashHash.createDashHashStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typings.createDashHash.createDashHashStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typings.createDashHash.createDashHashStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typings.createDashHash.createDashHashStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typings.createDashHash.createDashHashStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typings.createDashHash.createDashHashStrings.sha512 = this.cast("sha512")
}


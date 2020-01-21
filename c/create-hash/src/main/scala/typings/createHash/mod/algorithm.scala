package typings.createHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.createHash.createHashStrings.md5
  - typings.createHash.createHashStrings.rmd160
  - typings.createHash.createHashStrings.ripemd160
  - typings.createHash.createHashStrings.sha
  - typings.createHash.createHashStrings.sha1
  - typings.createHash.createHashStrings.sha224
  - typings.createHash.createHashStrings.sha256
  - typings.createHash.createHashStrings.sha384
  - typings.createHash.createHashStrings.sha512
*/
trait algorithm extends js.Object

object algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typings.createHash.createHashStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd160: typings.createHash.createHashStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def rmd160: typings.createHash.createHashStrings.rmd160 = this.cast("rmd160")
  @scala.inline
  def sha: typings.createHash.createHashStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typings.createHash.createHashStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typings.createHash.createHashStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typings.createHash.createHashStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typings.createHash.createHashStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typings.createHash.createHashStrings.sha512 = this.cast("sha512")
}


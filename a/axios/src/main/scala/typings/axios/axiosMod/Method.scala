package typings.axios.axiosMod

import typings.axios.axiosStrings.delete_
import typings.axios.axiosStrings.get_
import typings.axios.axiosStrings.head_
import typings.axios.axiosStrings.options_
import typings.axios.axiosStrings.patch_
import typings.axios.axiosStrings.post_
import typings.axios.axiosStrings.put_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axios.axiosStrings.get_
  - typings.axios.axiosStrings.GET
  - typings.axios.axiosStrings.delete_
  - typings.axios.axiosStrings.DELETE
  - typings.axios.axiosStrings.head_
  - typings.axios.axiosStrings.HEAD
  - typings.axios.axiosStrings.options_
  - typings.axios.axiosStrings.OPTIONS
  - typings.axios.axiosStrings.post_
  - typings.axios.axiosStrings.POST
  - typings.axios.axiosStrings.put_
  - typings.axios.axiosStrings.PUT
  - typings.axios.axiosStrings.patch_
  - typings.axios.axiosStrings.PATCH
*/
trait Method extends js.Object

object Method {
  @scala.inline
  def DELETE: typings.axios.axiosStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.axios.axiosStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.axios.axiosStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.axios.axiosStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.axios.axiosStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.axios.axiosStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.axios.axiosStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def get: get_ = this.cast("get")
  @scala.inline
  def head: head_ = this.cast("head")
  @scala.inline
  def options: options_ = this.cast("options")
  @scala.inline
  def patch: patch_ = this.cast("patch")
  @scala.inline
  def post: post_ = this.cast("post")
  @scala.inline
  def put: put_ = this.cast("put")
}


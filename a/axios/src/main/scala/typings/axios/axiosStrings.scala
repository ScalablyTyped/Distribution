package typings.axios

import typings.axios.axiosMod.Method
import typings.axios.axiosMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object axiosStrings {
  @js.native
  sealed trait DELETE extends Method
  
  @js.native
  sealed trait GET extends Method
  
  @js.native
  sealed trait HEAD extends Method
  
  @js.native
  sealed trait OPTIONS extends Method
  
  @js.native
  sealed trait PATCH extends Method
  
  @js.native
  sealed trait POST extends Method
  
  @js.native
  sealed trait PUT extends Method
  
  @js.native
  sealed trait arraybuffer extends ResponseType
  
  @js.native
  sealed trait blob extends ResponseType
  
  @js.native
  sealed trait delete extends Method
  
  @js.native
  sealed trait document extends ResponseType
  
  @js.native
  sealed trait get extends Method
  
  @js.native
  sealed trait head extends Method
  
  @js.native
  sealed trait json extends ResponseType
  
  @js.native
  sealed trait options extends Method
  
  @js.native
  sealed trait patch extends Method
  
  @js.native
  sealed trait post extends Method
  
  @js.native
  sealed trait put extends Method
  
  @js.native
  sealed trait stream extends ResponseType
  
  @js.native
  sealed trait text extends ResponseType
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def head: head = "head".asInstanceOf[head]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}


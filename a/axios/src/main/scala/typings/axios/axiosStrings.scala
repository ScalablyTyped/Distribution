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
  sealed trait delete_ extends Method
  
  @js.native
  sealed trait document extends ResponseType
  
  @js.native
  sealed trait get_ extends Method
  
  @js.native
  sealed trait head_ extends Method
  
  @js.native
  sealed trait json extends ResponseType
  
  @js.native
  sealed trait options_ extends Method
  
  @js.native
  sealed trait patch_ extends Method
  
  @js.native
  sealed trait post_ extends Method
  
  @js.native
  sealed trait put_ extends Method
  
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
  def delete_ : delete_ = "delete".asInstanceOf[delete_]
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  @scala.inline
  def get_ : get_ = "get".asInstanceOf[get_]
  @scala.inline
  def head_ : head_ = "head".asInstanceOf[head_]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def options_ : options_ = "options".asInstanceOf[options_]
  @scala.inline
  def patch_ : patch_ = "patch".asInstanceOf[patch_]
  @scala.inline
  def post_ : post_ = "post".asInstanceOf[post_]
  @scala.inline
  def put_ : put_ = "put".asInstanceOf[put_]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}


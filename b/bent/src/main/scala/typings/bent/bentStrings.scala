package typings.bent

import typings.bent.mod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bentStrings {
  @js.native
  sealed trait CONNECT extends HttpMethod
  
  @js.native
  sealed trait DELETE extends HttpMethod
  
  @js.native
  sealed trait GET extends HttpMethod
  
  @js.native
  sealed trait HEAD extends HttpMethod
  
  @js.native
  sealed trait OPTIONS extends HttpMethod
  
  @js.native
  sealed trait PATCH extends HttpMethod
  
  @js.native
  sealed trait POST extends HttpMethod
  
  @js.native
  sealed trait PUT extends HttpMethod
  
  @js.native
  sealed trait TRACE extends HttpMethod
  
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait finish extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait pipe extends js.Object
  
  @js.native
  sealed trait readable extends js.Object
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait unpipe extends js.Object
  
  @scala.inline
  def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
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
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
}


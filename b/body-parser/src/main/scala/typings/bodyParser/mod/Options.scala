package typings.bodyParser.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** When set to true, then deflated (compressed) bodies will be inflated; when false, deflated bodies are rejected. Defaults to true. */
  var inflate: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls the maximum request body size. If this is a number,
    * then the value specifies the number of bytes; if it is a string,
    * the value is passed to the bytes library for parsing. Defaults to '100kb'.
    */
  var limit: js.UndefOr[Double | String] = js.native
  
  /**
    * The type option is used to determine what media type the middleware will parse
    */
  var `type`: js.UndefOr[String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _])] = js.native
  
  /**
    * The verify option, if supplied, is called as verify(req, res, buf, encoding),
    * where buf is a Buffer of the raw request body and encoding is the encoding of the request.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInflate(value: Boolean): Self = this.set("inflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInflate: Self = this.set("inflate", js.undefined)
    
    @scala.inline
    def setLimit(value: Double | String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setTypeFunction1(value: /* req */ IncomingMessage => _): Self = this.set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _])): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVerify(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Unit
    ): Self = this.set("verify", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
}

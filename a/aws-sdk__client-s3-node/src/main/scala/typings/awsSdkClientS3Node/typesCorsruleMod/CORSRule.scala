package typings.awsSdkClientS3Node.typesCorsruleMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CORSRule extends js.Object {
  
  /**
    * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
    */
  var AllowedHeaders: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  
  /**
    * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
    */
  var AllowedMethods: js.Array[String] | Iterable[String] = js.native
  
  /**
    * <p>One or more origins you want customers to be able to access the bucket from.</p>
    */
  var AllowedOrigins: js.Array[String] | Iterable[String] = js.native
  
  /**
    * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
    */
  var ExposeHeaders: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  
  /**
    * <p>The time in seconds that your browser is to cache the preflight response for the specified resource.</p>
    */
  var MaxAgeSeconds: js.UndefOr[Double] = js.native
}
object CORSRule {
  
  @scala.inline
  def apply(
    AllowedMethods: js.Array[String] | Iterable[String],
    AllowedOrigins: js.Array[String] | Iterable[String]
  ): CORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
  
  @scala.inline
  implicit class CORSRuleOps[Self <: CORSRule] (val x: Self) extends AnyVal {
    
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
    def setAllowedMethodsVarargs(value: String*): Self = this.set("AllowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethods(value: js.Array[String] | Iterable[String]): Self = this.set("AllowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginsVarargs(value: String*): Self = this.set("AllowedOrigins", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigins(value: js.Array[String] | Iterable[String]): Self = this.set("AllowedOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeadersVarargs(value: String*): Self = this.set("AllowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHeaders(value: js.Array[String] | Iterable[String]): Self = this.set("AllowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHeaders: Self = this.set("AllowedHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = this.set("ExposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: js.Array[String] | Iterable[String]): Self = this.set("ExposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeaders: Self = this.set("ExposeHeaders", js.undefined)
    
    @scala.inline
    def setMaxAgeSeconds(value: Double): Self = this.set("MaxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("MaxAgeSeconds", js.undefined)
  }
}

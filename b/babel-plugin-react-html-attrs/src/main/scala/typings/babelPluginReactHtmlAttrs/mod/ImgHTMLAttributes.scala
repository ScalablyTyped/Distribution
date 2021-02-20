package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings._empty
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`no-referrer`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`unsafe-url`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`use-credentials`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.anonymous
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.async
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.auto
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.eager
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.origin
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var alt: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var crossorigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var decoding: js.UndefOr[async | auto | sync] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var loading: js.UndefOr[
    eager | typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`lazy`
  ] = js.native
  
  var referrerPolicy: js.UndefOr[`no-referrer` | origin | `unsafe-url`] = js.native
  
  var referrerpolicy: js.UndefOr[`no-referrer` | origin | `unsafe-url`] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var srcSet: js.UndefOr[String] = js.native
  
  var srcset: js.UndefOr[String] = js.native
  
  var useMap: js.UndefOr[String] = js.native
  
  var usemap: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ImgHTMLAttributes {
  
  @scala.inline
  def apply[T](): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ImgHTMLAttributesMutableBuilder[Self <: ImgHTMLAttributes[_], T] (val x: Self with ImgHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setDecoding(value: async | auto | sync): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLoading(value: eager | typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: `no-referrer` | origin | `unsafe-url`): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

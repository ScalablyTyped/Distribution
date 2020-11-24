package typings.cssMinimizerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Default cache keys
  */
@js.native
trait DefaultCacheKeys extends js.Object {
  
  var `css-minimizer-webpack-plugin`: String = js.native
  
  var `css-minimizer-webpack-plugin-options`: String = js.native
  
  var cssMinimizer: String = js.native
  
  var hash: String = js.native
  
  var path: String = js.native
}
object DefaultCacheKeys {
  
  @scala.inline
  def apply(
    `css-minimizer-webpack-plugin`: String,
    `css-minimizer-webpack-plugin-options`: String,
    cssMinimizer: String,
    hash: String,
    path: String
  ): DefaultCacheKeys = {
    val __obj = js.Dynamic.literal(cssMinimizer = cssMinimizer.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("css-minimizer-webpack-plugin")(`css-minimizer-webpack-plugin`.asInstanceOf[js.Any])
    __obj.updateDynamic("css-minimizer-webpack-plugin-options")(`css-minimizer-webpack-plugin-options`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCacheKeys]
  }
  
  @scala.inline
  implicit class DefaultCacheKeysOps[Self <: DefaultCacheKeys] (val x: Self) extends AnyVal {
    
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
    def `setCss-minimizer-webpack-plugin`(value: String): Self = this.set("css-minimizer-webpack-plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCss-minimizer-webpack-plugin-options`(value: String): Self = this.set("css-minimizer-webpack-plugin-options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssMinimizer(value: String): Self = this.set("cssMinimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}

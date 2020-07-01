package typings.crittersWebpackPlugin.mod.Critters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The mechanism to use for lazy-loading stylesheets.
  * indicates that a strategy requires JavaScript (falls back to `<noscript>`).
  * - **default:** Move stylesheet links to the end of the document and insert preload meta tags in their place.
  * - **"body":** Move all external stylesheet links to the end of the document.
  * - **"media":** Load stylesheets asynchronously by adding `media="not x"` and removing once loaded. _[JS]_
  * - **"swap":** Convert stylesheet links to preloads that swap to `rel="stylesheet"` once loaded. _[JS]_
  * - **"js":** Inject an asynchronous CSS loader similar to [LoadCSS](https://github.com/filamentgroup/loadCSS) and use it to load stylesheets. _[JS]_
  * - **"js-lazy":** Like `"js"`, but the stylesheet is disabled until fully loaded.
  */
/* Rewritten from type alias, can be one of: 
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.body
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.media
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.swap
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.js_
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`
*/
trait PreloadStrategy extends js.Object

object PreloadStrategy {
  @scala.inline
  def body: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.body = "body".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.body]
  @scala.inline
  def `js-lazy`: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy` = "js-lazy".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`]
  @scala.inline
  def js_ : typings.crittersWebpackPlugin.crittersWebpackPluginStrings.js_ = "js".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.js_]
  @scala.inline
  def media: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.media = "media".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.media]
  @scala.inline
  def swap: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.swap = "swap".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.swap]
}


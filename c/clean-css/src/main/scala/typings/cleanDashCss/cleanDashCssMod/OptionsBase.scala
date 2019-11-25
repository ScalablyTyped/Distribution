package typings.cleanDashCss.cleanDashCssMod

import typings.cleanDashCss.cleanDashCssNumbers.`0`
import typings.cleanDashCss.cleanDashCssNumbers.`1`
import typings.cleanDashCss.cleanDashCssNumbers.`2`
import typings.cleanDashCss.cleanDashCssNumbers.`false`
import typings.cleanDashCss.cleanDashCssStrings.`keep-breaks`
import typings.cleanDashCss.cleanDashCssStrings.beautify
import typings.cleanDashCss.cleanDashCssStrings.ie7
import typings.cleanDashCss.cleanDashCssStrings.ie8
import typings.cleanDashCss.cleanDashCssStrings.ie9
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared options passed when initializing a new instance of CleanCSS that returns either a promise or output
  */
trait OptionsBase extends js.Object {
  /**
    * Controls compatibility mode used; defaults to ie10+ using `'*'`.
    *  Compatibility hash exposes the following properties: `colors`, `properties`, `selectors`, and `units`
    */
  var compatibility: js.UndefOr[
    typings.cleanDashCss.cleanDashCssStrings.`*` | ie9 | ie8 | ie7 | CompatibilityOptions
  ] = js.undefined
  /**
    * Controls a function for handling remote requests; Defaults to the build in `loadRemoteResource` function
    */
  var fetch: js.UndefOr[
    js.Function4[
      /* uri */ String, 
      /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, 
      /* inlineTimeout */ Double, 
      /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Controls output CSS formatting; defaults to `false`.
    *  Format hash exposes the following properties: `breaks`, `breakWith`, `indentBy`, `indentWith`, `spaces`, and `wrapAt`.
    */
  var format: js.UndefOr[beautify | `keep-breaks` | FormatOptions | `false`] = js.undefined
  /**
    * inline option whitelists which @import rules will be processed.  Defaults to `'local'`
    * Accepts the following values:
    *  'local': enables local inlining;
    *  'remote': enables remote inlining;
    *  'none': disables all inlining;
    *  'all': enables all inlining, same as ['local', 'remote'];
    *  '[uri]': enables remote inlining from the specified uri;
    *  '![url]': disables remote inlining from the specified uri;
    */
  var `inline`: js.UndefOr[js.Array[String] | `false`] = js.undefined
  /**
    * Controls extra options for inlining remote @import rules
    */
  var inlineRequest: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.undefined
  /**
    * Controls number of milliseconds after which inlining a remote @import fails; defaults to `5000`;
    */
  var inlineTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Controls optimization level used; defaults to `1`.
    * Level hash exposes `1`, and `2`.
    */
  var level: js.UndefOr[`0` | `1` | `2` | OptimizationsOptions] = js.undefined
  /**
    * Controls URL rebasing; defaults to `true`;
    */
  var rebase: js.UndefOr[Boolean] = js.undefined
  /**
    * controls a directory to which all URLs are rebased, most likely the directory under which the output file
    * will live; defaults to the current directory;
    */
  var rebaseTo: js.UndefOr[String] = js.undefined
  /**
    *  Controls whether an output source map is built; defaults to `false`
    */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  /**
    *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
    */
  var sourceMapInlineSources: js.UndefOr[Boolean] = js.undefined
}

object OptionsBase {
  @scala.inline
  def apply(
    compatibility: typings.cleanDashCss.cleanDashCssStrings.`*` | ie9 | ie8 | ie7 | CompatibilityOptions = null,
    fetch: (/* uri */ String, /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Unit = null,
    format: beautify | `keep-breaks` | FormatOptions | `false` = null,
    `inline`: js.Array[String] | `false` = null,
    inlineRequest: RequestOptions | typings.node.httpsMod.RequestOptions = null,
    inlineTimeout: Int | Double = null,
    level: `0` | `1` | `2` | OptimizationsOptions = null,
    rebase: js.UndefOr[Boolean] = js.undefined,
    rebaseTo: String = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    sourceMapInlineSources: js.UndefOr[Boolean] = js.undefined
  ): OptionsBase = {
    val __obj = js.Dynamic.literal()
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction4(fetch))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inlineRequest != null) __obj.updateDynamic("inlineRequest")(inlineRequest.asInstanceOf[js.Any])
    if (inlineTimeout != null) __obj.updateDynamic("inlineTimeout")(inlineTimeout.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(rebase)) __obj.updateDynamic("rebase")(rebase.asInstanceOf[js.Any])
    if (rebaseTo != null) __obj.updateDynamic("rebaseTo")(rebaseTo.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapInlineSources)) __obj.updateDynamic("sourceMapInlineSources")(sourceMapInlineSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsBase]
  }
}

